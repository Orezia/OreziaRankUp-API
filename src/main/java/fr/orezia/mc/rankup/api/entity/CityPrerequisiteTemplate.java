package fr.orezia.mc.rankup.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Entity class for city prerequisite template.
 *
 * @see PlayerPrerequisiteTemplate
 * @since 1.0
 */
@PublicApi
@SerializableAs("CityPrerequisiteTemplate")
public class CityPrerequisiteTemplate extends AbstractPrerequisiteTemplate {

  /**
   * Default constructor.
   */
  @PublicApi
  public CityPrerequisiteTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  @PublicApi
  public CityPrerequisiteTemplate(
      final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    super(serialization);
  }
}
