package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
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
public class CityRankUpTemplate extends AbstractRankUpTemplate  {

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
  }
}
