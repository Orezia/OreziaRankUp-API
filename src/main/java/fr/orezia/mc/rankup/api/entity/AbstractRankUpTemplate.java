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
 * Abstract entity class for rank-up template.
 *
 * @see CityRankUpTemplate
 * @see PlayerRankUpTemplate
 * @since 1.0
 */
abstract class AbstractRankUpTemplate implements Entity<@NotNull Integer>,
    ConfigurationSerializable {

  private Integer id;
  private @Nullable String previousRankUpId;
  private @Nullable String items;
  private @Nullable String actions;

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
    id((String) requireNonNull(serialization.get("id")));
    previousRankUpId((String) serialization.get("previousRankUpId"));
    items((String) serialization.get("items"));
    actions((String) serialization.get("actions"));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    return Map.of(
        "id", id(),
        "previousRankUpId", previousRankUpId(),
        "items", items(),
        "actions", actions()
    );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(pure = true)
  public @NotNull Integer id() {
    return id;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractRankUpTemplate id(final @NotNull Integer newId) {
    id = newId;
    return this;
  }

  /**
   * Gets the previous rank-up ID.
   *
   * @return the previous rank-up ID
   */
  @PublicApi
  @Contract(pure = true)
  public @Nullable String previousRankUpId() {
    return previousRankUpId;
  }

  /**
   * Sets the previous rank-up ID.
   *
   * @param previousRankUpId the new previous rank-up ID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractRankUpTemplate previousRankUpId(
      final @Nullable String previousRankUpId) {
    this.previousRankUpId = previousRankUpId;
    return this;
  }

  /**
   * Gets items as JSON.
   *
   * @return items as JSON
   */
  @PublicApi
  @Contract(pure = true)
  public @Nullable String items() {
    return items;
  }

  /**
   * Sets items as JSON.
   *
   * @param items new items as JSON
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractRankUpTemplate items(final @Nullable String items) {
    this.items = items;
    return this;
  }

  /**
   * Gets rank-up' actions.
   *
   * @return rank-up' actions
   */
  @PublicApi
  @Contract(pure = true)
  public @Nullable String actions() {
    return actions;
  }

  /**
   * Sets rank-up' actions.
   *
   * @param actions rank-up' actions
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractRankUpTemplate actions(final @Nullable String actions) {
    this.actions = actions;
    return this;
  }


  /**
   * Sets id from {@link String}.
   *
   * @param newId the new id
   */
  @Contract(mutates = "this")
  private void id(final @NotNull String newId) {
    id = Integer.parseInt(newId);
  }

}
