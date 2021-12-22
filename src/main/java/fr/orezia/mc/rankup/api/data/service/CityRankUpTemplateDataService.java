package fr.orezia.mc.rankup.api.data.service;


import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisiteTemplate;
import fr.orezia.mc.rankup.api.entity.CityRankUpTemplate;
import java.util.LinkedHashSet;
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
   */
  @PublicApi
  @Contract(mutates = "param1")
  void create(final @NotNull CityRankUpTemplate cityRankUpTemplate);

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
  @NotNull CityRankUpTemplate get(final @NotNull Integer id);

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
   */
  @PublicApi
  @Contract
  void update(final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Renames the {@link CityRankUpTemplate city rank-up template} corresponding to the given ID with
   * the given name.
   *
   * @param id   the id of {@link CityRankUpTemplate city rank-up template}
   * @param name the name to set
   */
  @PublicApi
  @Contract
  void rename(final @NotNull Integer id, final @NotNull String name);

  // endregion

  // region CityPrerequisiteTemplate services

  /**
   * Adds a {@link CityPrerequisiteTemplate city prerequisite template} to {@link CityRankUpTemplate
   * city rank-up template}.
   *
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite template}
   *                                 to add
   */
  @PublicApi
  @Contract
  void addPrerequisiteTemplate(final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

  /**
   * Gets all {@link CityPrerequisiteTemplate city prerequisite template} from {@link
   * CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplateId the parent {@link CityRankUpTemplate city rank-up template} ID
   * @return {@link Set} of all {@link CityPrerequisiteTemplate city prerequisite template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull CityPrerequisiteTemplate> getAllPrerequisiteTemplate(
      final int cityRankUpTemplateId);


  /**
   * Gets all {@link CityPrerequisiteTemplate city prerequisite template} IDs from {@link
   * CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplateId the parent {@link CityRankUpTemplate city rank-up template} ID
   * @return {@link Set} of all {@link CityPrerequisiteTemplate city prerequisite template} IDs
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull String> getAllPrerequisiteTemplateIDs(
      final int cityRankUpTemplateId);


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
  @NotNull CityPrerequisiteTemplate getPrerequisite(final @NotNull String id);

  /**
   * Updates the {@link CityPrerequisiteTemplate city prerequisite template}.
   *
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite
   *                                 template}
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplate(
      final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

  /**
   * Updates the {@link CityPrerequisiteTemplate city prerequisite template} query.
   *
   * @param cityPrerequisiteTemplateId the {@link CityPrerequisiteTemplate city prerequisite
   *                                     template}
   * @param query                        the new query
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateQuery(final @NotNull String cityPrerequisiteTemplateId,
      final @NotNull String query);

  /**
   * Removes {@link CityPrerequisiteTemplate city prerequisite template} from {@link
   * CityRankUpTemplate city rank-up template}.
   *
   * @param id the ID of {@link CityPrerequisiteTemplate city prerequisite template} to remove
   */
  @PublicApi
  @Contract
  void removePrerequisiteTemplate(final @NotNull String id);

  // endregion

}
