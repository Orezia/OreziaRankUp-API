package fr.orezia.mc.rankup.api.entity;


import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import java.util.Set;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity for player rank-ups.
 *
 * @see CityRankUp
 * @since 1.0
 */
@PublicApi
@SerializableAs("PlayerRankUp")
public class PlayerRankUp extends AbstractRankUp<PlayerPrerequisite> {

  private Gender gender;

  /**
   * Default constructor.
   */
  @PublicApi
  public PlayerRankUp() {
    // Nothing to do here
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization the serialization map
   */
  @PublicApi
  public PlayerRankUp(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
    gender = Gender.valueOf((String) requireNonNull(serialization.get("gender")));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("gender", gender().name());
    return serialization;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @NotNull String id() {
    return id;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp id(final @NotNull String id) {
    this.id = id;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public String userName() {
    return userName;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp userName(final String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @NotNull Integer rank() {
    return rank;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp rank(final @NotNull Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @NotNull Integer nextRank() {
    return nextRank;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp nextRank(final @NotNull Integer nextRank) {
    this.nextRank = nextRank;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable String items() {
    return items;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp items(final @Nullable String items) {
    this.items = items;
    return this;
  }

  /**
   * Gets the {@link Gender gender}.
   *
   * @return the {@link Gender gender}
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull Gender gender() {
    return gender;
  }

  /**
   * Sets the {@link Gender gender}.
   *
   * @param gender the {@link Gender gender}
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp gender(final @NotNull Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable Set<@NotNull PlayerPrerequisite> prerequisites() {
    return prerequisites;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull PlayerRankUp prerequisites(final @Nullable Set<@NotNull PlayerPrerequisite> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }

}
