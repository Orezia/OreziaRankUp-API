package fr.orezia.mc.rankup.api.entity;

import static fr.orezia.mc.core.api.entity.Cascade.CascadeType.ALL;
import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.Cascade;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for rank-ups.
 *
 * @param <P> the type of {@link AbstractPrerequisite prerequisites}
 * @see PlayerRankUp
 * @see CityRankUp
 * @since 1.0
 */
abstract class AbstractRankUp<P extends AbstractPrerequisite> implements ConfigurationSerializable {

  String id;
  String userName;
  Integer rank;
  Integer nextRank;
  String items;

  @Cascade(ALL)
  Set<P> prerequisites;

  /**
   * Default constructor.
   */
  AbstractRankUp() {
    // Nothing to do here
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization the serialization map
   */
  AbstractRankUp(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    id = (String) requireNonNull(serialization.get("id"));
    userName = (String) requireNonNull(serialization.get("username"));
    rank = (Integer) requireNonNull(serialization.get("rank"));
    nextRank = (Integer) requireNonNull(serialization.get("nextRank"));
    items = (String) serialization.get("items");
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
        "username", userName,
        "rank", rank,
        "nextRank", nextRank,
        "items", items,
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
  public abstract @NotNull String id();

  /**
   * Sets the ID.
   *
   * @param id the ID to set
   * @return {@code this}
   */

  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractRankUp<P> id(final @NotNull String id);

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
   * @param userName the player's username to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractRankUp<P> userName(final String userName);

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
   * @param rank the rank to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractRankUp<P> rank(final @NotNull Integer rank);

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
   * @param nextRank the next rank to set
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public abstract @NotNull AbstractRankUp<P> nextRank(final @NotNull Integer nextRank);

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
  public abstract @NotNull AbstractRankUp<P> items(final @Nullable String items);

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
  public abstract @NotNull AbstractRankUp<P> prerequisites(final @Nullable Set<@NotNull P> prerequisites);

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

    final AbstractRankUp<P> that = (AbstractRankUp) o;
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
