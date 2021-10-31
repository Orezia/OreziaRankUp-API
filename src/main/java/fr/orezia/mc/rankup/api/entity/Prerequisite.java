package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;

/**
  * Prerequisite entity.
  *
  * @since 1.0
  */
 @SerializableAs("Prerequisite")
 public class Prerequisite implements ConfigurationSerializable {

   private int id;
   private @NotNull String rankUpBusinessId;

   /**
    * Valued constructor.
    *
    * @param id               The prerequisite ID.
    * @param rankUpBusinessId The rank-up business ID.
    */
   public Prerequisite(int id, final @NotNull String rankUpBusinessId) {
     this.id = id;
     this.rankUpBusinessId = rankUpBusinessId;
   }

   /**
    * Deserialize prerequisite from data map.
    *
    * @param data The data map.
    * @return The deserialized prerequisite.
    */
   @PublicApi
   public static @NotNull Prerequisite deserialize(@NotNull Map<String, Object> data) {
     final int id = (int) data.getOrDefault("id",
         (int) UUID.randomUUID().getMostSignificantBits());
     final String rankUpBusinessId = (String) data.getOrDefault("rankUpBusinessId",
         "unparsable" + UUID.randomUUID().getMostSignificantBits());
     return new Prerequisite(id, rankUpBusinessId);
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public @NotNull Map<String, Object> serialize() {
     final HashMap<String, Object> result = new HashMap<>();

     result.put("id", id);
     result.put("rankUpBusinessId", rankUpBusinessId);

     return result;
   }

   /**
    * Get the prerequisite ID.
    *
    * @return the prerequisite ID.
    */
   public int id() {
     return id;
   }

   /**
    * Set the prerequisite ID.
    *
    * @param id the prerequisite ID.
    * @return this.
    */
   public Prerequisite id(int id) {
     this.id = id;
     return this;
   }

   /**
    * Get the rank-up business ID.
    *
    * @return the rank-up business ID.
    */
   public @NotNull String rankUpBusinessId() {
     return rankUpBusinessId;
   }

   /**
    * Set the rank-up business ID.
    * @param rankUpBusinessId the rank-up business ID.
    * @return this.
    */
   public Prerequisite rankUpBusinessId(final @NotNull String rankUpBusinessId) {
     this.rankUpBusinessId = rankUpBusinessId;
     return this;
   }
 }