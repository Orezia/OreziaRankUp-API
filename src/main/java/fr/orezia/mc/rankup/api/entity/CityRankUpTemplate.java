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
 * Entity class for city rank-up template.
 *
 * @see PlayerRankUpTemplate
 * @since 1.0
 */
@PublicApi
@SerializableAs("CityRankUpTemplate")
public class CityRankUpTemplate extends AbstractRankUpTemplate {

  private String name;

  /**
   * Default constructor.
   */
  @PublicApi
  public CityRankUpTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public CityRankUpTemplate(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
    name((String) requireNonNull(serialization.get("name")));
  }

  /**
   * Gets rank-up name.
   *
   * @return rank-up name
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull String name() {
    return name;
  }

  /**
   * Sets the rank-up name.
   *
   * @param name the new rank-up name
   * @return {@code this}
   */
  @PublicApi
  @Contract(mutates = "this")
  public @This @NotNull CityRankUpTemplate name(final @NotNull String name) {
    this.name = name;
    return this;
  }
}
