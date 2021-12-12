package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisite;
import fr.orezia.mc.rankup.api.entity.CityRankUp;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data service for {@link CityRankUp city rank-up}.
 *
 * @since 1.0
 */
@PublicApi
public interface CityRankUpDataService {

  // region CityRankUp services

  /**
   * Creates in persistence a {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp the {@link CityRankUp city rank-up} data
   */
  @PublicApi
  @Contract
  void create(final @NotNull CityRankUp cityRankUp);

  /**
   * Checks if a {@link CityRankUp city rank-up} exists with the given id.
   *
   * @param id the id of {@link CityRankUp city rank-up}
   * @return {@code true} if a {@link CityRankUp city rank-up} has been found, {@code false}
   * otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final @NotNull String id);

  /**
   * Gets a {@link CityRankUp city rank-up} from its id.
   *
   * @param id the id of {@link CityRankUp city rank-up}
   * @return the found {@link CityRankUp city rank-up}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull CityRankUp get(final @NotNull String id);

  /**
   * Updates the {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp the {@link CityRankUp city rank-up}
   */
  @PublicApi
  @Contract
  void update(final @NotNull CityRankUp cityRankUp);

  /**
   * Deletes {@link CityRankUp city rank-up}.
   *
   * @param id the {@link CityRankUp city rank-up} id
   */
  @PublicApi
  @Contract
  void delete(final @NotNull String id);

  // endregion

  // region CityPrerequisite services

  /**
   * Adds a {@link CityPrerequisite city prerequisite}.
   *
   * @param cityPrerequisite the {@link CityPrerequisite city prerequisite} to add
   */
  @PublicApi
  @Contract
  void addPrerequisite(final @NotNull CityPrerequisite cityPrerequisite);

  /**
   * Gets all {@link CityPrerequisite city prerequisite} from player ID.
   *
   * @param playerId the player ID
   * @return {@link Set} of all {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull CityPrerequisite> getAllPrerequisite(final @NotNull String playerId);

  /**
   * Checks if a {@link CityPrerequisite city prerequisite} exists with the given id.
   *
   * @param id the id of {@link CityPrerequisite city prerequisite}
   * @param playerId the player ID
   * @return {@code true} if a {@link CityPrerequisite city prerequisite} has been found, {@code
   * false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id, final @NotNull String playerId);

  /**
   * Gets a {@link CityPrerequisite city prerequisite} from its id.
   *
   * @param id       the id of {@link CityPrerequisite city prerequisite}
   * @param playerId the player ID
   * @return the found {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull CityPrerequisite getPrerequisite(final @NotNull String id,
      final @NotNull String playerId);

  /**
   * Updates the {@link CityPrerequisite city prerequisite}.
   *
   * @param cityPrerequisite the {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @Contract
  void updatePrerequisite(final @NotNull CityPrerequisite cityPrerequisite);

  /**
   * Removes {@link CityPrerequisite city prerequisite} from {@link CityRankUp city rank-up}.
   *
   * @param id the ID of {@link CityPrerequisite city prerequisite} to remove
   * @param playerId the player ID
   */
  @PublicApi
  @Contract
  void removePrerequisite(final @NotNull String id, final @NotNull String playerId);

  // endregion

}
