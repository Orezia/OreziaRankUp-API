package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
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
public class PlayerRankUpTemplate extends AbstractRankUpTemplate{

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
  }
}
