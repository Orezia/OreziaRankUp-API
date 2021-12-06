package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Entity;
import java.util.Map;
import java.util.Objects;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for prerequisite.
 *
 * @see PlayerPrerequisiteTemplate
 * @see CityPrerequisiteTemplate
 * @see PlayerPrerequisite
 * @see CityPrerequisite
 * @since 1.0
 */
abstract class AbstractPrerequisite implements Entity<@NotNull String>,
    ConfigurationSerializable {

  String id;
  String playerId;
  String query;
  String action;

  /**
   * Default constructor.
   */
  AbstractPrerequisite() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  AbstractPrerequisite(
      final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id = (String) requireNonNull(serialization.get("id"));
    playerId = (String) requireNonNull(serialization.get("playerId"));
    query = (String) requireNonNull(serialization.get("query"));
    action = (String) serialization.get("action");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    return Map.of(
        "id", id,
        "playerId", playerId,
        "query", query,
        "action", action
    );
  }

  /**
   * Gets the player UUID.
   *
   * @return the player UUID.
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull String playerId();

  /**
   * Sets the player UUID.
   *
   * @param playerId the new player UUID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisite playerId(final @NotNull String playerId);

  /**
   * Gets the query.
   *
   * @return the query.
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull String query();

  /**
   * Sets the query.
   *
   * @param query the new query
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisite query(final @NotNull String query);

  /**
   * Gets the action.
   *
   * @return the action
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String action();

  /**
   * Sets the action.
   *
   * @param action the new action
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisite action(final @Nullable String action);

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }

    if (null == o || getClass() != o.getClass()) {
      return false;
    }

    final AbstractPrerequisite that = (AbstractPrerequisite) o;
    return Objects.equals(id, that.id) && Objects.equals(playerId, that.playerId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, playerId);
  }

}
