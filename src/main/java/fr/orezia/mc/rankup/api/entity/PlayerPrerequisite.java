package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity class for player prerequisite.
 *
 * @see CityPrerequisite
 * @since 1.0
 */
@PublicApi
@SerializableAs("PlayerPrerequisite")
public class PlayerPrerequisite extends AbstractPrerequisite {

  private String playerId;

  /**
   * Default constructor.
   */
  @PublicApi
  public PlayerPrerequisite() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public PlayerPrerequisite(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
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
    serialization.put("playerId", playerId());
    return serialization;
  }

  /**
   * Gets the player UUID.
   *
   * @return the player UUID.
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull String playerId() {
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
  public @This @NotNull PlayerPrerequisite playerId(final @NotNull String playerId) {
    this.playerId = playerId;
    return this;
  }

}
