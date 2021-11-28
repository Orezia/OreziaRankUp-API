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

  private UUID playerId;

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
    playerId((String) requireNonNull(serialization.get("playerId")));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final @NotNull Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("playerId", playerId().toString());
    return serialization;
  }

  /**
   * Gets the player UUID.
   *
   * @return the player UUID.
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull UUID playerId() {
    return playerId;
  }

  /**
   * Sets the player UUID.
   *
   * @param playerId the new player UUID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CityPrerequisite playerId(final @NotNull UUID playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * Sets the player UUID from string.
   *
   * @param playerId the player UUID as string.
   * @see #playerId(UUID)
   */
  @Contract(mutates = "this")
  private void playerId(final @NotNull String playerId) {
    this.playerId = UUID.fromString(playerId);
  }
}
