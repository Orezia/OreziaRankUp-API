package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
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
abstract class AbstractPrerequisiteTemplate implements ConfigurationSerializable {

  String id;
  Integer rankUpId;
  String query;
  String action;
  String title;
  String lore;
  String icon;

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
    title = (String) serialization.get("title");
    lore = (String) serialization.get("lore");
    icon = (String) serialization.get("icon");
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
        "action", action,
        "title", title,
        "lore", lore,
        "icon", icon
    );
  }

  /**
   * Gets the ID.
   *
   * @return the ID
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull String id();

  /**
   * Sets the ID.
   *
   * @param id the ID to set
   * @return the current instance
   */

  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisiteTemplate id(final @NotNull String id);

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
   * Gets the title.
   *
   * @return the title
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String title();

  /**
   * Sets the title.
   *
   * @param title the new title
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisiteTemplate title(final @Nullable String title);

  /**
   * Gets the lore.
   *
   * @return the lore
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String lore();

  /**
   * Sets the lore.
   *
   * @param lore the new lore
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisiteTemplate lore(final @Nullable String lore);

  /**
   * Gets the icon.
   *
   * @return the icon
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @Nullable String icon();

  /**
   * Sets the icon.
   *
   * @param icon the new icon
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractPrerequisiteTemplate icon(final @Nullable String icon);

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
