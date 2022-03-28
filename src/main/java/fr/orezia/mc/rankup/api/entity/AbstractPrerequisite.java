package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import java.util.Objects;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for prerequisites.
 *
 * @see PlayerPrerequisiteTemplate
 * @see CityPrerequisiteTemplate
 * @see PlayerPrerequisite
 * @see CityPrerequisite
 * @since 1.0
 */
abstract class AbstractPrerequisite implements ConfigurationSerializable {

  String id;
  String playerId;
  String query;
  String action;
  String title;
  String lore;
  String icon;

  /**
   * Default constructor.
   */
  AbstractPrerequisite() {
    // Nothing to do here
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization the serialization map
   */
  AbstractPrerequisite(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id = (String) requireNonNull(serialization.get("id"));
    playerId = (String) requireNonNull(serialization.get("playerId"));
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
  @Contract(value = "-> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    return Map.of(
        "id", id,
        "playerId", playerId,
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
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite id(final @NotNull String id);

  /**
   * Gets the {@link Player player} unique ID.
   *
   * @return the {@link Player player} unique ID.
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull String playerId();

  /**
   * Sets the {@link Player player} unique ID.
   *
   * @param playerId the {@link Player player} unique ID to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite playerId(final @NotNull String playerId);

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
   * @param query the query to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite query(final @NotNull String query);

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
   * @param action the action to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite action(final @Nullable String action);

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
   * @param title the title to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite title(final @Nullable String title);

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
   * @param lore the lore to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite lore(final @Nullable String lore);

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
   * @param icon the icon to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractPrerequisite icon(final @Nullable String icon);

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
