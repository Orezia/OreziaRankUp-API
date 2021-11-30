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
 * Entity for player rank-up.
 *
 * @see CityRankUp
 * @since 1.0
 */
@PublicApi
@SerializableAs("PlayerRankUp")
public class PlayerRankUp extends AbstractRankUp {

  private Gender gender;

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
    gender((String) requireNonNull(serialization.get("gender")));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public @NotNull Map<@NotNull String, @Nullable Object> serialize() {
    final Map<@NotNull String, @Nullable Object> serialization = super.serialize();
    serialization.put("gender", gender().name());
    return serialization;
  }

  /**
   * Gets the {@link Gender gender}.
   *
   * @return the {@link Gender gender}
   */
  @PublicApi
  @Contract(pure = true)
  public @NotNull Gender gender() {
    return gender;
  }

  /**
   * Sets the {@link Gender gender}.
   *
   * @param gender the {@link Gender gender}
   * @return {@code this}
   */
  @PublicApi
  public @This @NotNull PlayerRankUp gender(final @NotNull Gender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Sets the gender from {@link String}.
   *
   * @param gender the gender
   */
  private void gender(final @NotNull String gender) {
    gender(Gender.valueOf(gender));
  }
}
