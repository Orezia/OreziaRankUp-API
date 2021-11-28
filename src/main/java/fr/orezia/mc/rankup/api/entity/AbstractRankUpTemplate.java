package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.IdentifiableWithTechnicalId;
import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
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
abstract class AbstractRankUpTemplate implements IdentifiableWithTechnicalId,
    ConfigurationSerializable {

  private String id;
  private String masculineName;
  private @Nullable String feminineName;
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
    masculineName((String) requireNonNull(serialization.get("masculineName")));
    feminineName((String) serialization.get("feminineName"));
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
        "masculineName", masculineName(),
        "feminineName", feminineName(),
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
  public @NotNull String id() {
    return id;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull AbstractRankUpTemplate id(final @NotNull String newId) {
    id = newId;
    return this;
  }

  /**
   * Gets the masculine name.
   *
   * @return the masculine name
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull String masculineName() {
    return masculineName;
  }

  /**
   * Sets the masculine name.
   *
   * @param masculineName the new masculine name
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull AbstractRankUpTemplate masculineName(final @NotNull String masculineName) {
    this.masculineName = masculineName;
    return this;
  }

  /**
   * Gets the feminine name.
   *
   * @return the feminine name
   */
  @PublicApi
  @Contract(pure = true)
  public @Nullable String feminineName() {
    return feminineName;
  }

  /**
   * Sets the feminine name.
   *
   * @param feminineName the new feminine name
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull AbstractRankUpTemplate feminineName(final @Nullable String feminineName) {
    this.feminineName = feminineName;
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
  public @NotNull AbstractRankUpTemplate previousRankUpId(final @Nullable String previousRankUpId) {
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
  public @NotNull AbstractRankUpTemplate items(final @Nullable String items) {
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
  public @NotNull AbstractRankUpTemplate actions(final @Nullable String actions) {
    this.actions = actions;
    return this;
  }
}
