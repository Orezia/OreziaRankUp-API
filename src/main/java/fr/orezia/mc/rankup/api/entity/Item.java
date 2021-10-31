package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.IdentifiableWithTechnicalId;
import java.util.Map;
import java.util.UUID;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

@SerializableAs("Item")
 public class Item implements ConfigurationSerializable, IdentifiableWithTechnicalId {

   private int id;
   private @NotNull String rankUpBusinessId;
   private int quantity;
   private @NotNull Material type;
   private @NotNull ItemMeta itemMeta;

   public Item(int id, @NotNull String rankUpBusinessId, int quantity,
       @NotNull Material type,
       @NotNull ItemMeta itemMeta) {
     this.id = id;
     this.rankUpBusinessId = rankUpBusinessId;
     this.quantity = quantity;
     this.type = type;
     this.itemMeta = itemMeta;
   }

   @Override
   public @NotNull
   Map<String, Object> serialize() {
     return null;
   }

   @PublicApi
   public static @NotNull Item deserialize(@NotNull Map<String, Object> data) {
     final int id = (int) data.getOrDefault("id", (int) UUID.randomUUID().getMostSignificantBits());
     final String rankUpBusinessId = (String) data.getOrDefault("rankUpBusinessId",
         "unparsable" + UUID.randomUUID().getMostSignificantBits());
     final int quantity = (int) data.getOrDefault("quantity", 0);
     final Material type = (Material) data.getOrDefault("type", Material.AIR);
     final ItemMeta itemMeta = (ItemMeta) data.get("meta");
     return new Item(id, rankUpBusinessId, quantity, type, itemMeta);
   }

   @Override
   public int id() {
     return id;
   }

   @Override
   public Item id(int id) {
     this.id = id;
     return this;
   }

   public String rankUpBusinessId() {
     return rankUpBusinessId;
   }

   public Item rankUpBusinessId(String rankUpBusinessId) {
     this.rankUpBusinessId = rankUpBusinessId;
     return this;
   }

   public int quantity() {
     return quantity;
   }

   public Item quantity(int quantity) {
     this.quantity = quantity;
     return this;
   }

   public Material type() {
     return type;
   }

   public Item type(Material type) {
     this.type = type;
     return this;
   }

   public ItemMeta itemMeta() {
     return itemMeta;
   }

   public Item itemMeta(ItemMeta itemMeta) {
     this.itemMeta = itemMeta;
     return this;
   }
 }