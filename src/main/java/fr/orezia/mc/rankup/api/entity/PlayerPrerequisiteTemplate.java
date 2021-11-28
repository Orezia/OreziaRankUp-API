package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
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
}
