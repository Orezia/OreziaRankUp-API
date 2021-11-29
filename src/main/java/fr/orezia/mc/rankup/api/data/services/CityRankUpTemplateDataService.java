package fr.orezia.mc.rankup.api.data.services;


import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisiteTemplate;
import fr.orezia.mc.rankup.api.entity.CityRankUpTemplate;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data service for {@link CityRankUpTemplate city rank-up
 * template}.
 *
 * @since 1.0
 */
@PublicApi
public interface CityRankUpTemplateDataService {

  // region CityRankUpTemplate services

  /**
   * Creates, in persistence, a {@link CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplate the {@link CityRankUpTemplate city rank-up template} data
   * @return {@code true} if creation is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean create(final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Gets all {@link CityRankUpTemplate city rank-up template}.
   *
   * @return {@link Queue} of all {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Queue<@NotNull CityRankUpTemplate> getAll();

  /**
   * Gets a {@link CityRankUpTemplate city rank-up template} from its id.
   *
   * @param id the id of {@link CityRankUpTemplate city rank-up template}
   * @return the found {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Optional<CityRankUpTemplate> get(final @NotNull String id);

  /**
   * Updates the {@link CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplate the {@link CityRankUpTemplate city rank-up template}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean update(final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Deletes {@link CityRankUpTemplate city rank-up template}.
   *
   * @param id the {@link CityRankUpTemplate city rank-up template} id
   * @return {@code true} if delete is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean delete(final @NotNull String id);

  // endregion

  // region CityPrerequisiteTemplate services

  /**
   * Adds a {@link CityPrerequisiteTemplate city prerequisite template} to {@link CityRankUpTemplate
   * city rank-up template}.
   *
   * @param cityRankUpTemplate       the {@link CityRankUpTemplate city rank-up template} to update
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite template}
   *                                 to add
   * @return {@code true} if prerequisite template is added, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean addPrerequisiteTemplate(final @NotNull CityRankUpTemplate cityRankUpTemplate,
      final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

  /**
   * Gets all {@link CityPrerequisiteTemplate city prerequisite template} from {@link
   * CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplate the parent {@link CityRankUpTemplate city rank-up template}
   * @return {@link Set} of all {@link CityPrerequisiteTemplate city prerequisite template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull CityPrerequisiteTemplate> getAllPrerequisiteTemplate(
      final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Updates the {@link CityPrerequisiteTemplate city prerequisite template}.
   *
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite
   *                                 template}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean updatePrerequisiteTemplate(
      final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

  /**
   * Removes {@link CityPrerequisiteTemplate city prerequisite template} from {@link
   * CityRankUpTemplate city rank-up template}.
   *
   * @param id the ID of {@link CityPrerequisiteTemplate city prerequisite template} to remove
   * @return {@code true} if remove is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean removePrerequisiteTemplate(final @NotNull String id);
  // endregion

}
