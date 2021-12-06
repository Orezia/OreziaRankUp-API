package fr.orezia.mc.rankup.api.entity;

import static fr.orezia.mc.core.api.entity.Cascade.CascadeType.ALL;
import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Cascade;
import fr.orezia.mc.core.api.entity.Entity;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for rank-up template.
 *
 * @param <P> the type of {@link AbstractPrerequisiteTemplate prerequisites}
 * @see CityRankUpTemplate
 * @see PlayerRankUpTemplate
 * @since 1.0
 */
abstract class AbstractRankUpTemplate<P extends AbstractPrerequisiteTemplate>
    implements Entity<@NotNull Integer>, ConfigurationSerializable {

  Integer id;
  Integer nextId;
  String items;
  String actions;

  @Cascade(ALL)
  List<P> prerequisites;

  /**
   * Default constructor.
   */
  AbstractRankUpTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  AbstractRankUpTemplate(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id = (Integer) requireNonNull(serialization.get("id"));
    nextId = (Integer) serialization.get("nextId");
    items = (String) serialization.get("items");
    actions = (String) serialization.get("actions");
    prerequisites = (List) requireNonNull(serialization.get("prerequisites"));
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
   * @param nextId the new next rank-up ID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate nextId(
      final @Nullable Integer nextId);

  /**
   * Gets items as JSON.
   *
   * @return items as JSON
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String items();

  /**
   * Sets items as JSON.
   *
   * @param items new items as JSON
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate items(final @Nullable String items);

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
  public abstract @This @NotNull AbstractRankUpTemplate actions(final @Nullable String actions);

  /**
   * Gets the {@link P prerequisites}.
   *
   * @return the {@link P prerequisites}
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable List<@NotNull P> prerequisites();

  /**
   * Sets the {@link P prerequisites}.
   *
   * @param prerequisites the {@link P prerequisites} to set
   * @return the current instance
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUpTemplate prerequisites(
      final @Nullable List<@NotNull P> prerequisites);

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

    final AbstractRankUpTemplate that = (AbstractRankUpTemplate) o;
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
