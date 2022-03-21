package fr.orezia.mc.rankup.api.entity;

import static fr.orezia.mc.core.api.entity.Cascade.CascadeType.ALL;
import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Cascade;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for rank-up templates.
 *
 * @param <P> the type of {@link AbstractPrerequisiteTemplate prerequisites}
 * @see CityRankUpTemplate
 * @see PlayerRankUpTemplate
 * @since 1.0
 */
abstract class AbstractRankUpTemplate<P extends AbstractPrerequisiteTemplate> implements ConfigurationSerializable {

  Integer id;
  Integer nextId;
  String items;
  String actions;

  @Cascade(ALL)
  Set<P> prerequisites;

  /**
   * Default constructor.
   */
  AbstractRankUpTemplate() {
    // Nothing to do here
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization the serialization map
   */
  AbstractRankUpTemplate(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id = (Integer) requireNonNull(serialization.get("id"));
    nextId = (Integer) serialization.get("nextId");
    items = (String) serialization.get("items");
    actions = (String) serialization.get("actions");
    prerequisites = (Set) requireNonNull(serialization.get("prerequisites"));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    return Map.of(
        "id", id,
        "nextId", nextId,
        "items", items,
        "actions", actions,
        "prerequisites", prerequisites
    );
  }

  /**
   * Gets the ID.
   *
   * @return the ID
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull Integer id();

  /**
   * Sets the ID.
   *
   * @param id the ID to set
   * @return {@code this}
   */

  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate<P> id(final @NotNull Integer id);

  /**
   * Gets the previous rank-up ID.
   *
   * @return the previous rank-up ID
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable Integer nextId();

  /**
   * Sets the next rank-up ID.
   *
   * @param nextId the next rank-up ID to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate<P> nextId(
      final @Nullable Integer nextId);

  /**
   * Gets the items as JSON.
   *
   * @return the items as JSON
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String items();

  /**
   * Sets the items as JSON.
   *
   * @param items the items to set as JSON
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate<P> items(final @Nullable String items);

  /**
   * Gets rank-up' actions.
   *
   * @return rank-up' actions
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String actions();

  /**
   * Sets rank-up' actions.
   *
   * @param actions rank-up' actions
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate<P> actions(final @Nullable String actions);

  /**
   * Gets the {@link P prerequisites}.
   *
   * @return the {@link P prerequisites}
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable Set<@NotNull P> prerequisites();

  /**
   * Sets the {@link P prerequisites}.
   *
   * @param prerequisites the {@link P prerequisites} to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate<P> prerequisites(
      final @Nullable Set<@NotNull P> prerequisites);

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

    final AbstractRankUpTemplate<P> that = (AbstractRankUpTemplate) o;
    return Objects.equals(id, that.id);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

}
