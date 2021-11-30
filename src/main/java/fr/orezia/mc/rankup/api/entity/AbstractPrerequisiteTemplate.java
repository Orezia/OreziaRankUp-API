package fr.orezia.mc.rankup.api.entity;

import static java.util.Objects.requireNonNull;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.Map;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract entity class for prerequisite template.
 *
 * @see PlayerPrerequisiteTemplate
 * @see CityPrerequisiteTemplate
 * @since 1.0
 */
abstract class AbstractPrerequisiteTemplate extends AbstractPrerequisite {

  private String rankUpId;

  /**
   * Default constructor.
   */
  AbstractPrerequisiteTemplate() {
  }

  /**
   * Constructor from serialization.
   *
   * @param serialization serialization map
   */
  AbstractPrerequisiteTemplate(
      final @NotNull Map<@NotNull String, @Nullable Object> serialization) {
    rankUpId((String) requireNonNull(serialization.get("rankUpId")));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(value = " -> new", pure = true)
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("rankUpId", rankUpId());
    return serialization;
  }

  /**
   * Gets the rank-up ID.
   *
   * @return the rank-up ID
   */
  @PublicApi
  @Contract(pure = true)
  public @Nullable String rankUpId() {
    return rankUpId;
  }

  /**
   * Sets the rank-up ID.
   *
   * @param rankUpId the new rank-up ID
   * @return {@code this}
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @This @NotNull AbstractPrerequisiteTemplate rankUpId(final @NotNull String rankUpId) {
    this.rankUpId = rankUpId;
    return this;
  }
}