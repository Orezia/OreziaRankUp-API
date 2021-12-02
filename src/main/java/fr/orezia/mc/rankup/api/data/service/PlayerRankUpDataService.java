package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityRankUp;
import fr.orezia.mc.rankup.api.entity.PlayerPrerequisite;
import fr.orezia.mc.rankup.api.entity.PlayerRankUp;
import java.util.Optional;
import java.util.Queue;
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
   * @return {@code true} if creation is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean create(final @NotNull PlayerRankUp playerRankUp);

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
  @NotNull Optional<PlayerRankUp> get(final @NotNull String id);

  /**
   * Updates the {@link PlayerRankUp player rank-up}.
   *
   * @param playerRankUp the {@link PlayerRankUp player rank-up}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean update(final @NotNull PlayerRankUp playerRankUp);

  /**
   * Deletes {@link PlayerRankUp player rank-up}.
   *
   * @param id the {@link PlayerRankUp player rank-up} id
   * @return {@code true} if delete is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean delete(final @NotNull String id);

  // endregion

  // region PlayerPrerequisite services

  /**
   * Adds a {@link PlayerPrerequisite player prerequisite} to {@link PlayerRankUp player rank-up}.
   *
   * @param playerRankUp       the {@link PlayerRankUp player rank-up} to update
   * @param playerPrerequisite the {@link PlayerPrerequisite player prerequisite} to add
   * @return {@code true} if prerequisite is added, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean addPrerequisite(final @NotNull PlayerRankUp playerRankUp,
      final @NotNull PlayerPrerequisite playerPrerequisite);

  /**
   * Gets all {@link PlayerPrerequisite player prerequisite} from {@link PlayerRankUp player
   * rank-up}.
   *
   * @param playerRankUp the parent {@link PlayerRankUp player rank-up}
   * @return {@link Set} of all {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull PlayerPrerequisite> getAllPrerequisite(
      final @NotNull PlayerRankUp playerRankUp);

  /**
   * Checks if a {@link PlayerPrerequisite player prerequisite} exists with the given id.
   *
   * @param id the id of {@link PlayerPrerequisite player prerequisite}
   * @return {@code true} if a {@link PlayerPrerequisite player prerequisite} has been found, {@code
   * false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id);

  /**
   * Gets a {@link PlayerPrerequisite player prerequisite} from its id.
   *
   * @param id the id of {@link PlayerPrerequisite player prerequisite}
   * @return the found {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Optional<PlayerPrerequisite> getPrerequisite(final @NotNull String id);

  /**
   * Updates the {@link PlayerPrerequisite player prerequisite}.
   *
   * @param playerPrerequisite the {@link PlayerPrerequisite player prerequisite}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean updatePrerequisite(final @NotNull PlayerPrerequisite playerPrerequisite);

  /**
   * Removes {@link PlayerPrerequisite player prerequisite} from {@link CityRankUp player rank-up}.
   *
   * @param id the ID of {@link PlayerPrerequisite player prerequisite} to remove
   * @return {@code true} if remove is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean removePrerequisite(final @NotNull String id);

  // endregion

}
