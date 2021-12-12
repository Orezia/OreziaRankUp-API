package fr.orezia.mc.rankup.api.data.service;


import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisiteTemplate;
import fr.orezia.mc.rankup.api.entity.CityRankUpTemplate;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data service for {@link CityRankUpTemplate city rank-up template}.
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
  @Contract(mutates = "param1")
  boolean create(final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Gets all {@link CityRankUpTemplate city rank-up template}.
   *
   * @return {@link LinkedHashSet} of all {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull LinkedHashSet<@NotNull CityRankUpTemplate> getAll();

  /**
   * Gets all {@link CityRankUpTemplate city rank-up template} IDs.
   *
   * @return {@link LinkedHashSet} of all {@link CityRankUpTemplate city rank-up template} IDs
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull Integer> getAllIds();

  /**
   * Checks if a {@link CityRankUpTemplate city rank-up template} exists with the given id.
   *
   * @param id the id of {@link CityRankUpTemplate city rank-up template}
   * @return {@code true} if a {@link CityRankUpTemplate city rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final @NotNull Integer id);

  /**
   * Checks if a {@link CityRankUpTemplate city rank-up template} exists with the given name.
   *
   * @param name the masculine name of {@link CityRankUpTemplate city rank-up template}
   * @return {@code true} if a {@link CityRankUpTemplate city rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean nameExist(final @NotNull String name);

  /**
   * Checks if a {@link CityRankUpTemplate city rank-up template} exists with the given name, except
   * with the given ID.
   *
   * @param name the name of {@link CityRankUpTemplate city rank-up template}
   * @param id   the {@link CityRankUpTemplate city rank-up template} ID to exclude
   * @return {@code true} if a {@link CityRankUpTemplate city rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean nameExistExceptForId(final @NotNull String name, final @NotNull Integer id);

  /**
   * Gets a {@link CityRankUpTemplate city rank-up template} from its id.
   *
   * @param id the id of {@link CityRankUpTemplate city rank-up template}
   * @return the found {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Optional<CityRankUpTemplate> get(final @NotNull Integer id);

  /**
   * Gets the very first {@link CityRankUpTemplate city rank-up template}.
   *
   * @return the very first {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull CityRankUpTemplate getFirst();

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
   * Renames the {@link CityRankUpTemplate city rank-up template} corresponding to the given ID with
   * the given name.
   *
   * @param id   the id of {@link CityRankUpTemplate city rank-up template}
   * @param name the name to set
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean rename(final @NotNull Integer id, final @NotNull String name);

  // endregion

  // region CityPrerequisiteTemplate services

  /**
   * Adds a {@link CityPrerequisiteTemplate city prerequisite template} to {@link CityRankUpTemplate
   * city rank-up template}.
   *
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite template}
   *                                 to add
   * @return {@code true} if prerequisite template is added, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean addPrerequisiteTemplate(final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

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
   * Checks if a {@link CityPrerequisiteTemplate city prerequisite template} exists with the given
   * id.
   *
   * @param id the id of {@link CityPrerequisiteTemplate city prerequisite template}
   * @return {@code true} if a {@link CityPrerequisiteTemplate city prerequisite template} has been
   * found, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id);

  /**
   * Gets a {@link CityPrerequisiteTemplate city prerequisite template} from its id.
   *
   * @param id the id of {@link CityPrerequisiteTemplate city prerequisite template}
   * @return the found {@link CityPrerequisiteTemplate city prerequisite template}
   */
  @PublicApi
  @NotNull Optional<CityPrerequisiteTemplate> getPrerequisite(final @NotNull String id);

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
