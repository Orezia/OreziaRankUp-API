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
 * Abstract entity class for prerequisite template.
 *
 * @see PlayerPrerequisiteTemplate
 * @see CityPrerequisiteTemplate
 * @since 1.0
 */
abstract class AbstractPrerequisiteTemplate implements Entity<@NotNull String>,
    ConfigurationSerializable {

  String id;
  Integer rankUpId;
  String query;
  String action;

  /**
   * Default constructor.
   */
  AbstractPrerequisiteTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  AbstractPrerequisiteTemplate(
      final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id = (String) requireNonNull(serialization.get("id"));
    rankUpId = (Integer) requireNonNull(serialization.get("rankUpId"));
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
        "rankUpId", rankUpId,
        "query", query,
        "action", action
    );
  }

  /**
   * Gets the rank-up ID.
   *
   * @return the rank-up ID
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable Integer rankUpId();

  /**
   * Sets the rank-up ID.
   *
   * @param rankUpId the new rank-up ID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisiteTemplate rankUpId(
      final @NotNull Integer rankUpId);

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
  public abstract @This @NotNull AbstractPrerequisiteTemplate query(final @NotNull String query);

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
  public abstract @This @NotNull AbstractPrerequisiteTemplate action(final @Nullable String action);

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

    final AbstractPrerequisiteTemplate that = (AbstractPrerequisiteTemplate) o;
    return Objects.equals(id, that.id) && Objects.equals(rankUpId, that.rankUpId);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, rankUpId);
  }

}
