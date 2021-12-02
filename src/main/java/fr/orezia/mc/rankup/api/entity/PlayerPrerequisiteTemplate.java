package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity for player prerequisite.
 *
 * @see CityPrerequisiteTemplate
 * @since 1.0
 */
@PublicApi
@SerializableAs("PlayerPrerequisiteTemplate")
public class PlayerPrerequisiteTemplate extends AbstractPrerequisiteTemplate {

  /**
   * Default constructor.
   */
  @PublicApi
  public PlayerPrerequisiteTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public PlayerPrerequisiteTemplate(
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
  public @This @NotNull PlayerPrerequisiteTemplate id(final @NotNull String id) {
    this.id = id;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @NotNull String query() {
    return query;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull PlayerPrerequisiteTemplate query(final @NotNull String query) {
    this.query = query;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable String action() {
    return action;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull PlayerPrerequisiteTemplate action(final @Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable String rankUpId() {
    return rankUpId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull PlayerPrerequisiteTemplate rankUpId(final @NotNull String rankUpId) {
    this.rankUpId = rankUpId;
    return this;
  }

}
