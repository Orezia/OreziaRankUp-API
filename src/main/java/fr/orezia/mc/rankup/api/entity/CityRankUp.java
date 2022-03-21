package fr.orezia.mc.rankup.api.entity;


import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import java.util.Set;
import org.bukkit.configuration.serialization.SerializableAs;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Entity class for city rank-ups.
 *
 * @see PlayerRankUp
 * @since 1.0
 */
@PublicApi
@SerializableAs("CityRankUp")
public class CityRankUp extends AbstractRankUp<CityPrerequisite> {

  /**
   * Default constructor.
   */
  @PublicApi
  public CityRankUp() {
    // Nothing to do here
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization the serialization map
   */
  @PublicApi
  public CityRankUp(
      final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
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
  public @This @NotNull CityRankUp id(final @NotNull String id) {
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
  public @This @NotNull CityRankUp userName(final String userName) {
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
  public @This @NotNull CityRankUp rank(final @NotNull Integer rank) {
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
  public @This @NotNull CityRankUp nextRank(final @NotNull Integer nextRank) {
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
  public @This @NotNull CityRankUp items(final @Nullable String items) {
    this.items = items;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable Set<@NotNull CityPrerequisite> prerequisites() {
    return prerequisites;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull CityRankUp prerequisites(final @Nullable Set<@NotNull CityPrerequisite> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }

}
