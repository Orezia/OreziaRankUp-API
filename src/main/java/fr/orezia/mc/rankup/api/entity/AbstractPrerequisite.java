package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Entity;
import java.util.Map;
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

  private String id;
  private String query;
  private @Nullable String action;

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
    id((String) requireNonNull(serialization.get("id")));
    query((String) requireNonNull(serialization.get("query")));
    action((String) serialization.get("action"));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    return Map.of(
        "id", id(),
        "query", query(),
        "action", action()
    );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(pure = true)
  public @NotNull String id() {
    return id;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractPrerequisite id(final @NotNull String id) {
    this.id = id;
    return this;
  }

  /**
   * Gets the query.
   *
   * @return the query.
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull String query() {
    return query;
  }

  /**
   * Sets the query.
   *
   * @param query the new query
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractPrerequisite query(final @NotNull String query) {
    this.query = query;
    return this;
  }

  /**
   * Gets the action.
   *
   * @return the action
   */
  @PublicApi
  @Contract(pure = true)
  public @Nullable String action() {
    return action;
  }

  /**
   * Sets the action.
   *
   * @param action the new action
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractPrerequisite action(final @Nullable String action) {
    this.action = action;
    return this;
  }
}