package fr.orezia.mc.rankup.api.data.services;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisite;
import fr.orezia.mc.rankup.api.entity.CityRankUp;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
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
   * @return {@code true} if creation is success, {@code false} otherwise
   */
  @PublicApi
  boolean create(final @NotNull CityRankUp cityRankUp);

  /**
   * Gets all {@link CityRankUp city rank-up}.
   *
   * @return {@link Queue} of all {@link CityRankUp city rank-up}
   */
  @PublicApi
  @NotNull Queue<@NotNull CityRankUp> getAll();

  /**
   * Gets a {@link CityRankUp city rank-up} from its id.
   *
   * @param id the id of {@link CityRankUp city rank-up}
   * @return the found {@link CityRankUp city rank-up}
   */
  @PublicApi
  @NotNull Optional<CityRankUp> get(final @NotNull String id);

  /**
   * Updates the {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp the {@link CityRankUp city rank-up}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  boolean update(final @NotNull CityRankUp cityRankUp);

  /**
   * Deletes {@link CityRankUp city rank-up}.
   *
   * @param id the {@link CityRankUp city rank-up} id
   * @return {@code true} if delete is success, {@code false} otherwise
   */
  @PublicApi
  boolean delete(final @NotNull String id);
  // endregion

  // region CityPrerequisite services

  /**
   * Adds a {@link CityPrerequisite city prerequisite} to {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp       the {@link CityRankUp city rank-up} to update
   * @param cityPrerequisite the {@link CityPrerequisite city prerequisite} to add
   * @return {@code true} if prerequisite is added, {@code false} otherwise
   */
  @PublicApi
  boolean addPrerequisite(final @NotNull CityRankUp cityRankUp,
      final @NotNull CityPrerequisite cityPrerequisite);

  /**
   * Gets all {@link CityPrerequisite city prerequisite} from {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp the parent {@link CityRankUp city rank-up}
   * @return {@link Set} of all {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @NotNull Set<@NotNull CityPrerequisite> getAllPrerequisite(final @NotNull CityRankUp cityRankUp);

  /**
   * Updates the {@link CityPrerequisite city prerequisite}.
   *
   * @param cityPrerequisite the {@link CityPrerequisite city prerequisite}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  boolean updatePrerequisite(final @NotNull CityPrerequisite cityPrerequisite);

  /**
   * Removes {@link CityPrerequisite city prerequisite} from {@link CityRankUp city rank-up}.
   *
   * @param id the ID of {@link CityPrerequisite city prerequisite} to remove
   * @return {@code true} if remove is success, {@code false} otherwise
   */
  @PublicApi
  boolean removePrerequisite(final @NotNull String id);
  // endregion
}
