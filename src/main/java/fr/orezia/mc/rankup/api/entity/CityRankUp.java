package fr.orezia.mc.rankup.api.entity;


import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * Entity class for city rank-up.
 *
 * @see PlayerRankUp
 * @since 1.0
 */
@PublicApi
@SerializableAs("CityRankUp")
public class CityRankUp extends AbstractRankUp {

  /**
   * Default constructor.
   */
  @PublicApi
  public CityRankUp() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public CityRankUp(
      final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
  }
}
