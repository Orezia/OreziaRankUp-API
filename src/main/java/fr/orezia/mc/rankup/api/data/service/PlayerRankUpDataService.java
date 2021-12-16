package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityRankUp;
import fr.orezia.mc.rankup.api.entity.Gender;
import fr.orezia.mc.rankup.api.entity.PlayerPrerequisite;
import fr.orezia.mc.rankup.api.entity.PlayerRankUp;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data service for {@link CityRankUp player rank-up}.
 *
 * @since 1.0
 */
@PublicApi
public interface PlayerRankUpDataService {

  // region PlayerRankUp services

  /**
   * Creates, in persistence, a {@link PlayerRankUp player rank-up}.
   *
   * @param playerRankUp the {@link PlayerRankUp player rank-up} data
   */
  @PublicApi
  @Contract
  void create(final @NotNull PlayerRankUp playerRankUp);

  /**
   * Checks if a {@link PlayerRankUp player rank-up} exists with the given id.
   *
   * @param id the id of {@link PlayerRankUp player rank-up}
   * @return {@code true} if a {@link PlayerRankUp player rank-up} has been found, {@code false}
   * otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final @NotNull String id);

  /**
   * Gets a {@link PlayerRankUp player rank-up} from its id.
   *
   * @param id the id of {@link PlayerRankUp player rank-up}
   * @return the found {@link PlayerRankUp player rank-up}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull PlayerRankUp get(final @NotNull String id);

  /**
   * Updates the {@link PlayerRankUp player rank-up}.
   *
   * @param playerRankUp the {@link PlayerRankUp player rank-up}
   */
  @PublicApi
  @Contract
  void update(final @NotNull PlayerRankUp playerRankUp);

  /**
   * Updates the {@link Gender gender} of the {@link PlayerRankUp player rank-up} corresponding to
   * the given ID.
   *
   * @param id     the {@link PlayerRankUp player rank-up} ID
   * @param gender the {@link Gender gender} to set
   */
  @PublicApi
  @Contract
  void updateGender(final @NotNull String id, final @NotNull Gender gender);

  /**
   * Deletes {@link PlayerRankUp player rank-up}.
   *
   * @param id the {@link PlayerRankUp player rank-up} id
   */
  @PublicApi
  @Contract
  void delete(final @NotNull String id);

  // endregion

  // region PlayerPrerequisite services

  /**
   * Adds a {@link PlayerPrerequisite player prerequisite}.
   *
   * @param playerPrerequisite the {@link PlayerPrerequisite player prerequisite} to add
   */
  @PublicApi
  @Contract
  void addPrerequisite(final @NotNull PlayerPrerequisite playerPrerequisite);

  /**
   * Gets all {@link PlayerPrerequisite player prerequisite} from player ID.
   *
   * @param playerId the player ID
   * @return {@link Set} of all {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull PlayerPrerequisite> getAllPrerequisite(
      final @NotNull String playerId);

  /**
   * Checks if a {@link PlayerPrerequisite player prerequisite} exists with the given id.
   *
   * @param id       the id of {@link PlayerPrerequisite player prerequisite}
   * @param playerId the player ID
   * @return {@code true} if a {@link PlayerPrerequisite player prerequisite} has been found, {@code
   * false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id, final @NotNull String playerId);

  /**
   * Gets a {@link PlayerPrerequisite player prerequisite} from its id.
   *
   * @param id       the id of {@link PlayerPrerequisite player prerequisite}
   * @param playerId the player ID
   * @return the found {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull PlayerPrerequisite getPrerequisite(final @NotNull String id,
      final @NotNull String playerId);

  /**
   * Updates the {@link PlayerPrerequisite player prerequisite}.
   *
   * @param playerPrerequisite the {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract
  void updatePrerequisite(final @NotNull PlayerPrerequisite playerPrerequisite);

  /**
   * Removes {@link PlayerPrerequisite player prerequisite} from {@link CityRankUp player rank-up}.
   *
   * @param id       the ID of {@link PlayerPrerequisite player prerequisite} to remove
   * @param playerId the player ID
   */
  @PublicApi
  @Contract
  void removePrerequisite(final @NotNull String id, final @NotNull String playerId);

  // endregion

}
