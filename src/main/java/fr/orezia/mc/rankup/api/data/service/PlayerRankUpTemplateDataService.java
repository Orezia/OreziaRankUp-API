package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.PlayerPrerequisiteTemplate;
import fr.orezia.mc.rankup.api.entity.PlayerRankUpTemplate;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Data service for {@link PlayerRankUpTemplate player rank-up template}.
 *
 * @since 1.0
 */
@PublicApi
public interface PlayerRankUpTemplateDataService {

  // region PlayerRankUpTemplate services

  /**
   * Creates, in persistence, a {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate the {@link PlayerRankUpTemplate player rank-up template} data
   */
  @PublicApi
  @Contract(mutates = "param1")
  void create(final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Gets all {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @return {@link LinkedHashSet} of all {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull LinkedHashSet<@NotNull PlayerRankUpTemplate> getAll();

  /**
   * Gets all {@link PlayerRankUpTemplate player rank-up template} IDs.
   *
   * @return {@link LinkedHashSet} of all {@link PlayerRankUpTemplate player rank-up template} IDs
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull Integer> getAllIds();

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given id.
   *
   * @param id the id of {@link PlayerRankUpTemplate player rank-up template}
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final @NotNull Integer id);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given
   * masculine name.
   *
   * @param masculineName the masculine name of {@link PlayerRankUpTemplate player rank-up
   *                      template}
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean masculineNameExist(final @NotNull String masculineName);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given
   * masculine name, except with the given ID.
   *
   * @param masculineName the masculine name of {@link PlayerRankUpTemplate player rank-up
   *                      template}
   * @param id            the {@link PlayerRankUpTemplate player rank-up template} ID to exclude
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean masculineNameExistExceptForId(final @NotNull String masculineName,
      final @NotNull Integer id);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given feminine
   * name.
   *
   * @param feminineName the feminine name of {@link PlayerRankUpTemplate player rank-up template}
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean feminineNameExist(final @NotNull String feminineName);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given feminine
   * name, except with the given ID.
   *
   * @param feminineName the feminine name of {@link PlayerRankUpTemplate player rank-up template}
   * @param id           the {@link PlayerRankUpTemplate player rank-up template} ID to exclude
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} has been found,
   * {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean feminineNameExistExceptForId(final @NotNull String feminineName,
      final @NotNull Integer id);

  /**
   * Gets a {@link PlayerRankUpTemplate player rank-up template} from its id.
   *
   * @param id the id of {@link PlayerRankUpTemplate player rank-up template}
   * @return the found {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull PlayerRankUpTemplate get(final @NotNull Integer id);

  /**
   * Gets the very first {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @return the very first {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull PlayerRankUpTemplate getFirst();

  /**
   * Updates the {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate the {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract
  void update(final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Updates the actions of {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplateId the {@link PlayerRankUpTemplate player rank-up template} ID
   * @param actions                the new actions
   */
  @PublicApi
  @Contract
  void updateActions(final @NotNull Integer playerRankUpTemplateId, final @Nullable String actions);

  /**
   * Renames the {@link PlayerRankUpTemplate player rank-up template} corresponding to the given ID
   * with the given masculine and feminine names.
   *
   * @param id            the id of {@link PlayerRankUpTemplate player rank-up template}
   * @param masculineName the masculine name to set
   * @param feminineName  the feminine name to set
   */
  @PublicApi
  @Contract
  void rename(final @NotNull Integer id, final @NotNull String masculineName,
      final @NotNull String feminineName);
  // endregion

  // region PlayerPrerequisiteTemplate services

  /**
   * Adds a {@link PlayerPrerequisiteTemplate player prerequisite template} to {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerPrerequisiteTemplate the {@link PlayerPrerequisiteTemplate player prerequisite
   *                                   template} to add
   */
  @PublicApi
  @Contract
  void addPrerequisiteTemplate(
      final @NotNull PlayerPrerequisiteTemplate playerPrerequisiteTemplate);

  /**
   * Gets all {@link PlayerPrerequisiteTemplate player prerequisite template} from {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplateId the parent {@link PlayerRankUpTemplate player rank-up template}
   *                               ID
   * @return {@link Set} of all {@link PlayerPrerequisiteTemplate player prerequisite template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull PlayerPrerequisiteTemplate> getAllPrerequisiteTemplate(
      final int playerRankUpTemplateId);


  /**
   * Gets all {@link PlayerPrerequisiteTemplate player prerequisite template} IDs from {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplateId the parent {@link PlayerRankUpTemplate player rank-up template}
   *                               ID
   * @return {@link Set} of all {@link PlayerPrerequisiteTemplate player prerequisite template} IDs
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull String> getAllPrerequisiteTemplateIDs(
      final int playerRankUpTemplateId);

  /**
   * Checks if a {@link PlayerPrerequisiteTemplate player prerequisite template} exists with the
   * given id.
   *
   * @param id the id of {@link PlayerPrerequisiteTemplate player prerequisite template}
   * @return {@code true} if a {@link PlayerPrerequisiteTemplate player prerequisite template} has
   * been found, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id);

  /**
   * Gets a {@link PlayerPrerequisiteTemplate player prerequisite template} from its id.
   *
   * @param id the id of {@link PlayerPrerequisiteTemplate player prerequisite template}
   * @return the found {@link PlayerPrerequisiteTemplate player prerequisite template}
   */
  @PublicApi
  @NotNull PlayerPrerequisiteTemplate getPrerequisite(final @NotNull String id);

  /**
   * Updates the {@link PlayerPrerequisiteTemplate player prerequisite template}.
   *
   * @param playerPrerequisiteTemplate the {@link PlayerPrerequisiteTemplate player prerequisite
   *                                   template}
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplate(
      final @NotNull PlayerPrerequisiteTemplate playerPrerequisiteTemplate);

  /**
   * Updates the {@link PlayerPrerequisiteTemplate player prerequisite template} query.
   *
   * @param playerPrerequisiteTemplateId the {@link PlayerPrerequisiteTemplate player prerequisite
   *                                     template}
   * @param query                        the new query
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateQuery(final @NotNull String playerPrerequisiteTemplateId,
      final @NotNull String query);

  /**
   * Updates the {@link PlayerPrerequisiteTemplate player prerequisite template} action.
   *
   * @param playerPrerequisiteTemplateId the {@link PlayerPrerequisiteTemplate player prerequisite
   *                                     template}
   * @param action                       the new action, may be {@code null}
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateAction(final @NotNull String playerPrerequisiteTemplateId,
      final @Nullable String action);

  /**
   * Removes {@link PlayerPrerequisiteTemplate player prerequisite template} from {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param id the ID of {@link PlayerPrerequisiteTemplate player prerequisite template} to remove
   */
  @PublicApi
  @Contract
  void removePrerequisiteTemplate(final @NotNull String id);

  // endregion

}
