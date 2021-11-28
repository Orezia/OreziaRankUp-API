package fr.orezia.mc.rankup.api.entity;


import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity for player rank-up.
 *
 * @see CityRankUp
 * @since 1.0
 */
@PublicApi
@SerializableAs("PlayerRankUp")
public class PlayerRankUp extends AbstractRankUp {

  /**
   * Default constructor.
   */
  @PublicApi
  public PlayerRankUp() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public PlayerRankUp(final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
  }
}
