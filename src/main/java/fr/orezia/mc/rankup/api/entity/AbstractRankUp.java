package fr.orezia.mc.rankup.api.entity;

import static fr.orezia.mc.core.api.entity.Cascade.CascadeType.ALL;
import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Cascade;
import fr.orezia.mc.core.api.entity.Entity;
import java.util.List;
import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for rank-up.
 *
 * @param <P> the type of {@link AbstractPrerequisite prerequisites}
 * @see PlayerRankUp
 * @see CityRankUp
 * @since 1.0
 */
abstract class AbstractRankUp<P extends AbstractPrerequisite> implements Entity<@NotNull String>,
    ConfigurationSerializable {

  String id;
  String userName;
  Integer rank;
  Integer nextRank;
  String items;

  @Cascade(ALL)
  List<P> prerequisites;

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
    id = (String) requireNonNull(serialization.get("id"));
    userName = (String) requireNonNull(serialization.get("username"));
    rank = (Integer) requireNonNull(serialization.get("rank"));
    nextRank = (Integer) requireNonNull(serialization.get("nextRank"));
    items = (String) serialization.get("items");
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
        "username", userName,
        "rank", rank,
        "nextRank", nextRank,
        "items", items,
        "prerequisites", prerequisites
    );
  }

  /**
   * Gets the player's username.
   *
   * @return the player's username
   */
  @PublicApi
  @Contract(pure = true)
  public abstract String userName();

  /**
   * Sets the player's username.
   *
   * @param userName the new player's username
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUp userName(final String userName);

  /**
   * Gets the rank.
   *
   * @return the rank
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull Integer rank();

  /**
   * Sets the rank.
   *
   * @param rank the new rank.
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUp rank(final @NotNull Integer rank);

  /**
   * Gets the next rank.
   *
   * @return the next rank
   */
  @PublicApi
  @Contract(pure = true)
  public abstract @NotNull Integer nextRank();

  /**
   * Sets the next rank.
   *
   * @param nextRank the new next rank.
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @This @NotNull AbstractRankUp nextRank(final @NotNull Integer nextRank);

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
  public abstract @This @NotNull AbstractRankUp items(final @Nullable String items);

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
  public abstract @This @NotNull AbstractRankUp prerequisites(
      final @Nullable List<@NotNull P> prerequisites);

}
