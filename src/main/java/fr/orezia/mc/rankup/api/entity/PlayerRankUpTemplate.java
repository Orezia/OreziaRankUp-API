package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity for player rank-up template.
 *
 * @see CityRankUpTemplate
 * @since 1.0
 */
@PublicApi
@SerializableAs("PlayerRankUpTemplate")
public class PlayerRankUpTemplate extends AbstractRankUpTemplate {

  private String masculineName;
  private @Nullable String feminineName;

  /**
   * Default constructor.
   */
  @PublicApi
  public PlayerRankUpTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public PlayerRankUpTemplate(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
    masculineName((String) requireNonNull(serialization.get("masculineName")));
    feminineName((String) serialization.get("feminineName"));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("masculineName", masculineName());
    serialization.put("feminineName", feminineName());
    return serialization;
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
  public @This @NotNull AbstractRankUpTemplate masculineName(final @NotNull String masculineName) {
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
  public @This @NotNull AbstractRankUpTemplate feminineName(final @Nullable String feminineName) {
    this.feminineName = feminineName;
    return this;
  }

}
