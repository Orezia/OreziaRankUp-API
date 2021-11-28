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
 * Abstract entity class for rank-up.
 *
 * @see PlayerRankUp
 * @see CityRankUp
 * @since 1.0
 */
abstract class AbstractRankUp implements ConfigurationSerializable, IdentifiableWithTechnicalId {

  private String id;
  private String userName;
  private String rank;
  private @Nullable String items;

  /**
   * Default constructor.
   */
  AbstractRankUp() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  AbstractRankUp(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id((String) requireNonNull(serialization.get("id")));
    userName((String) requireNonNull(serialization.get("username")));
    rank((String) requireNonNull(serialization.get("rank")));
    items((String) serialization.get("items"));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    return Map.of(
        "id", id(),
        "username", userName(),
        "rank", rank(),
        "items", items()
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
  public @NotNull AbstractRankUp id(final @NotNull String id) {
    this.id = id;
    return this;
  }

  /**
   * Gets the player's username.
   *
   * @return the player's username
   */
  @PublicApi
  @Contract(pure = true)
  public String userName() {
    return userName;
  }

  /**
   * Sets the player's username.
   *
   * @param userName the new player's username
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull AbstractRankUp userName(final String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Gets the rank.
   *
   * @return the rank.
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull String rank() {
    return rank;
  }

  /**
   * Sets the rank.
   *
   * @param rank the new rank.
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull AbstractRankUp rank(final @NotNull String rank) {
    this.rank = rank;
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
  public @NotNull AbstractRankUp items(final @Nullable String items) {
    this.items = items;
    return this;
  }
}
