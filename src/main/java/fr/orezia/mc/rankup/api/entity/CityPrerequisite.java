package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import java.util.UUID;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity class for city prerequisite.
 *
 * @see PlayerPrerequisite
 * @since 1.0
 */
@PublicApi
@SerializableAs("CityPrerequisite")
public class CityPrerequisite extends AbstractPrerequisite {

  private UUID playerUUID;

  /**
   * Default constructor.
   */
  @PublicApi
  public CityPrerequisite() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public CityPrerequisite(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
    playerUUID((String) requireNonNull(serialization.get("playerUUID")));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final @NotNull Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("playerUUID", playerUUID().toString());
    return serialization;
  }

  /**
   * Gets the player UUID.
   *
   * @return the player UUID.
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull UUID playerUUID() {
    return playerUUID;
  }

  /**
   * Sets the player UUID.
   *
   * @param playerUUID the new player UUID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CityPrerequisite playerUUID(final @NotNull UUID playerUUID) {
    this.playerUUID = playerUUID;
    return this;
  }

  /**
   * Sets the player UUID from string.
   *
   * @param playerUUID the player UUID as string.
   * @see #playerUUID(UUID)
   */
  @Contract(mutates = "this")
  private void playerUUID(final @NotNull String playerUUID) {
    this.playerUUID = UUID.fromString(playerUUID);
  }
}
