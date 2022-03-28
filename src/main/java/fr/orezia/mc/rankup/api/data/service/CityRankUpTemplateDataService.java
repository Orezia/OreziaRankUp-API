package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisiteTemplate;
import fr.orezia.mc.rankup.api.entity.CityRankUpTemplate;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Data service for {@link CityRankUpTemplate city rank-up templates}.
 *
 * @since 1.0
 */
@PublicApi
public interface CityRankUpTemplateDataService {

  // region City rank-up templates services

  /**
   * Persists the given {@link CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplate the {@link CityRankUpTemplate city rank-up template} to create
   */
  @PublicApi
  @Contract
  void create(final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Gets the <u>sorted</u> {@link LinkedHashSet set} of all {@link CityRankUpTemplate city rank-up templates}.
   *
   * @return <u>the sorted</u> {@link LinkedHashSet set} of all {@link CityRankUpTemplate city rank-up templates}
   */
  @PublicApi
  @Contract(value = "-> new", pure = true)
  @NotNull LinkedHashSet<@NotNull CityRankUpTemplate> getAll();

  /**
   * Gets the {@link Set set} of all {@link CityRankUpTemplate city rank-up template} IDs.
   *
   * @return the {@link Set set} of all {@link CityRankUpTemplate city rank-up template} IDs
   */
  @PublicApi
  @Contract(value = "-> new", pure = true)
  @NotNull Set<@NotNull Integer> getAllIds();

  /**
   * Checks if a {@link CityRankUpTemplate city rank-up template} exists with the given ID.
   *
   * @param id the {@link CityRankUpTemplate city rank-up template} ID
   * @return {@code true} if a {@link CityRankUpTemplate city rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final int id);

  /**
   * Checks if a {@link CityRankUpTemplate city rank-up template} exists with the given name.
   *
   * @param name the {@link CityRankUpTemplate city rank-up template} name
   * @return {@code true} if a {@link CityRankUpTemplate city rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean nameExist(final @NotNull String name);

  /**
   * Checks if a {@link CityRankUpTemplate city rank-up template} exists with the given name, except with the given ID.
   *
   * @param name the {@link CityRankUpTemplate city rank-up template} name
   * @param id   the {@link CityRankUpTemplate city rank-up template} ID
   * @return {@code true} if a {@link CityRankUpTemplate city rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean nameExistExceptForId(final @NotNull String name, final int id);

  /**
   * Gets the {@link CityRankUpTemplate city rank-up template} corresponding to the given ID.
   *
   * @param id the {@link CityRankUpTemplate city rank-up template} ID
   * @return the found {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull CityRankUpTemplate get(final int id);

  /**
   * Gets the very first {@link CityRankUpTemplate city rank-up template}.
   *
   * @return the very first {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract(value = "-> new", pure = true)
  @NotNull CityRankUpTemplate getFirst();

  /**
   * Updates the given {@link CityRankUpTemplate city rank-up template}.
   *
   * @param cityRankUpTemplate the {@link CityRankUpTemplate city rank-up template}
   */
  @PublicApi
  @Contract
  void update(final @NotNull CityRankUpTemplate cityRankUpTemplate);

  /**
   * Updates the actions of the {@link CityRankUpTemplate city rank-up template} corresponding to the given ID.
   *
   * @param id      the {@link CityRankUpTemplate city rank-up template} ID
   * @param actions the new actions
   */
  @PublicApi
  @Contract
  void updateActions(final int id, final @Nullable String actions);

  /**
   * Renames the {@link CityRankUpTemplate city rank-up template} corresponding to the given ID.
   *
   * @param id   the {@link CityRankUpTemplate city rank-up template} ID
   * @param name the new name
   */
  @PublicApi
  @Contract
  void rename(final int id, final @NotNull String name);

  // endregion

  // region City prerequisite templates services

  /**
   * Persists the given {@link CityPrerequisiteTemplate city prerequisite template}.
   *
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite template}
   */
  @PublicApi
  @Contract
  void addPrerequisiteTemplate(final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

  /**
   * Gets the {@link Set set} of all {@link CityPrerequisiteTemplate city prerequisite templates} corresponding to the
   * given {@link CityRankUpTemplate city rank-up template} ID.
   *
   * @param cityRankUpTemplateId the {@link CityRankUpTemplate city rank-up template} ID
   * @return the {@link Set set} of all {@link CityPrerequisiteTemplate city prerequisite template} corresponding to the
   * given {@link CityRankUpTemplate city rank-up template} ID
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Set<@NotNull CityPrerequisiteTemplate> getAllPrerequisiteTemplates(final int cityRankUpTemplateId);

  /**
   * Gets the {@link Set set} of all {@link CityPrerequisiteTemplate city prerequisite template} IDs corresponding to
   * the given {@link CityRankUpTemplate city rank-up template} ID.
   *
   * @param cityRankUpTemplateId the {@link CityRankUpTemplate city rank-up template} ID
   * @return the {@link Set set} of all {@link CityPrerequisiteTemplate city prerequisite template} IDs corresponding to
   * the given {@link CityRankUpTemplate city rank-up template} ID
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Set<@NotNull String> getAllPrerequisiteTemplateIds(final int cityRankUpTemplateId);

  /**
   * Checks if a {@link CityPrerequisiteTemplate city prerequisite template} exists with the given ID.
   *
   * @param id the {@link CityPrerequisiteTemplate city prerequisite template} ID
   * @return {@code true} if a {@link CityPrerequisiteTemplate city prerequisite template} matches, {@code false}
   * otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id);

  /**
   * Gets the {@link CityPrerequisiteTemplate city prerequisite template} corresponding to the given ID.
   *
   * @param id the {@link CityPrerequisiteTemplate city prerequisite template} ID
   * @return the found {@link CityPrerequisiteTemplate city prerequisite template}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull CityPrerequisiteTemplate getPrerequisite(final @NotNull String id);

  /**
   * Updates the given {@link CityPrerequisiteTemplate city prerequisite template}.
   *
   * @param cityPrerequisiteTemplate the {@link CityPrerequisiteTemplate city prerequisite template}
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplate(final @NotNull CityPrerequisiteTemplate cityPrerequisiteTemplate);

  /**
   * Updates the query of the {@link CityPrerequisiteTemplate city prerequisite template} corresponding to the given
   * ID.
   *
   * @param id    the {@link CityPrerequisiteTemplate city prerequisite template} ID
   * @param query the new query
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateQuery(final @NotNull String id, final @NotNull String query);

  /**
   * Updates the action of the {@link CityPrerequisiteTemplate city prerequisite template} corresponding to the given
   * ID.
   *
   * @param id     the {@link CityPrerequisiteTemplate city prerequisite template} ID
   * @param action the new action
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateAction(final @NotNull String id, final @Nullable String action);

  /**
   * Removes the {@link CityPrerequisiteTemplate city prerequisite template} corresponding to the given ID.
   *
   * @param id the {@link CityPrerequisiteTemplate city prerequisite template} ID
   */
  @PublicApi
  @Contract
  void removePrerequisiteTemplate(final @NotNull String id);

  // endregion

}
