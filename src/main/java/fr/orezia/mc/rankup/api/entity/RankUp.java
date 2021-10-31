package fr.orezia.mc.rankup.api.entity;

import static fr.orezia.mc.core.api.entity.Cascade.CascadeType.DELETE;
import static fr.orezia.mc.core.api.entity.Cascade.CascadeType.FETCH;
import static java.util.Objects.nonNull;

import com.google.common.collect.ImmutableList;
import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Cascade;
import fr.orezia.mc.core.api.entity.IdentifiableWithBusinessId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
  * Entity class for rank-up
  *
  * @since 1.0
  */
 @SerializableAs("RankUp")
 public class RankUp implements ConfigurationSerializable, IdentifiableWithBusinessId<String> {

   private @NotNull Type type;
   private @NotNull String businessId;
   @Cascade({ FETCH, DELETE })
   private final @NotNull
   List<Item> items = new ArrayList<>();

   /**
    * Valued constructor.
    *
    * @param businessId The rank-up business ID.
    * @param type       The rank-up type.
    */
   public RankUp(final @NotNull String businessId, final @NotNull Type type) {
     this.businessId = businessId;
     this.type = type;
   }

   /**
    * Copy constructor.
    *
    * @param rankUp The rank-up to copy.
    */
   public RankUp(final @NotNull RankUp rankUp) {
     this.businessId = rankUp.businessId();
     type = rankUp.type;
     items(rankUp.items);
   }

   @Override
   public @NotNull String businessId() {
     return businessId;
   }

   @Override
   public @NotNull IdentifiableWithBusinessId<String> businessId(@NotNull String businessId) {
     this.businessId = businessId;
     return this;
   }

   @PublicApi
   public static @NotNull RankUp deserialize(@NotNull Map<String, Object> data) {
     final String businessId = (String) data.getOrDefault("businessId",
         "unparsable" + UUID.randomUUID().getMostSignificantBits());
     final Type type = Type.valueOf((String) data.getOrDefault("type", Type.UNKNOWN.name()));
     final RankUp rankUp = new RankUp(businessId, type);
     final List<Item> items = (List<Item>) data.getOrDefault("items", Collections.emptyList());
     return rankUp.items(items);
   }

   public @NotNull Type type() {
     return type;
   }

   public @NotNull RankUp type(final @NotNull Type type) {
     this.type = type;
     return this;
   }

   @Override
   public @NotNull Map<String, Object> serialize() {
     final HashMap<String, Object> result = new HashMap<>();
     result.put("businessId", businessId());
     result.put("type", type().name());
     result.put("items", items());
     return result;
   }

   public ImmutableList<Item> items() {
     return ImmutableList.copyOf(items);
   }

   public RankUp items(final @Nullable List<Item> items) {
     this.items.clear();
     if (nonNull(items)) {
       this.items.addAll(items);
     }
     return this;
   }

   public RankUp addItem(final @NotNull Item item) {
     items.add(item);
     return this;
   }

   public enum Type {
     PLAYER("joueur"),
     TOWN("ville"),
     UNKNOWN("inconnu");

     private final String frenchTranslation;

     Type(String frenchTranslation) {
       this.frenchTranslation = frenchTranslation;
     }

     public static @NotNull Optional<Type> fromName(final @NotNull String name) {
       return Arrays.stream(Type.values())
           .filter(type -> name.equalsIgnoreCase(type.name())).findFirst();
     }

     public static @NotNull Optional<Type> fromTranslation(final @NotNull String frenchTranslation) {
       return Arrays.stream(Type.values())
           .filter(type -> frenchTranslation.equalsIgnoreCase(type.frenchTranslation)).findFirst();
     }

     public String frenchTranslation() {
       return frenchTranslation;
     }
   }
 }