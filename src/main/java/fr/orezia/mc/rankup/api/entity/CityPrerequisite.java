package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity class for city prerequisites.
 *
 * @see PlayerPrerequisite
 * @since 1.0
 */
@PublicApi
@SerializableAs("CityPrerequisite")
public class CityPrerequisite extends AbstractPrerequisite {

  /**
   * Default constructor.
   */
  @PublicApi
  public CityPrerequisite() {
    // Nothing to do here
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization the serialization map
   */
  @PublicApi
  public CityPrerequisite(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
    playerId((String) requireNonNull(serialization.get("playerId")));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final @NotNull Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("playerId", playerId());
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
  public @NotNull CityPrerequisite id(final @NotNull String id) {
    this.id = id;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @NotNull String playerId() {
    return playerId;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CityPrerequisite playerId(final @NotNull String playerId) {
    this.playerId = playerId;
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
  public @NotNull CityPrerequisite query(final @NotNull String query) {
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
  public @NotNull CityPrerequisite action(final @Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable String title() {
    return title;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CityPrerequisite title(final @Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable String lore() {
    return lore;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CityPrerequisite lore(final @Nullable String lore) {
    this.lore = lore;
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(pure = true)
  public @Nullable String icon() {
    return icon;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CityPrerequisite icon(final @Nullable String icon) {
    this.icon = icon;
    return this;
  }

}
