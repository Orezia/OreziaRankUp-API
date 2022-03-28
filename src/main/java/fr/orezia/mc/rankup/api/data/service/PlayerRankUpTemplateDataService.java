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
 * Data service for {@link PlayerRankUpTemplate player rank-up templates}.
 *
 * @since 1.0
 */
@PublicApi
public interface PlayerRankUpTemplateDataService {

  // region Player rank-up templates services

  /**
   * Persists the given {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate the {@link PlayerRankUpTemplate player rank-up template} to create
   */
  @PublicApi
  @Contract
  void create(final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Gets the <u>sorted</u> {@link LinkedHashSet set} of all {@link PlayerRankUpTemplate player rank-up templates}.
   *
   * @return <u>the sorted</u> {@link LinkedHashSet set} of all {@link PlayerRankUpTemplate player rank-up templates}
   */
  @PublicApi
  @Contract(value = "-> new", pure = true)
  @NotNull LinkedHashSet<@NotNull PlayerRankUpTemplate> getAll();

  /**
   * Gets the {@link Set set} of all {@link PlayerRankUpTemplate player rank-up template} IDs.
   *
   * @return the {@link Set set} of all {@link PlayerRankUpTemplate player rank-up template} IDs
   */
  @PublicApi
  @Contract(value = "-> new", pure = true)
  @NotNull Set<@NotNull Integer> getAllIds();

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given ID.
   *
   * @param id the {@link PlayerRankUpTemplate player rank-up template} ID
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final int id);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given masculine name.
   *
   * @param masculineName the {@link PlayerRankUpTemplate player rank-up template} masculine name
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean masculineNameExist(final @NotNull String masculineName);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given masculine name, except with
   * the given ID.
   *
   * @param masculineName the {@link PlayerRankUpTemplate player rank-up template} masculine name
   * @param id            the {@link PlayerRankUpTemplate player rank-up template} ID
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean masculineNameExistExceptForId(final @NotNull String masculineName, final int id);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given feminine name.
   *
   * @param feminineName the {@link PlayerRankUpTemplate player rank-up template} feminine name
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean feminineNameExist(final @NotNull String feminineName);

  /**
   * Checks if a {@link PlayerRankUpTemplate player rank-up template} exists with the given feminine name, except with
   * the given ID.
   *
   * @param feminineName the {@link PlayerRankUpTemplate player rank-up template} feminine name
   * @param id           the {@link PlayerRankUpTemplate player rank-up template} ID
   * @return {@code true} if a {@link PlayerRankUpTemplate player rank-up template} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean feminineNameExistExceptForId(final @NotNull String feminineName, final int id);

  /**
   * Gets the {@link PlayerRankUpTemplate player rank-up template} corresponding to the given ID.
   *
   * @param id the {@link PlayerRankUpTemplate player rank-up template} ID
   * @return the found {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull PlayerRankUpTemplate get(final int id);

  /**
   * Gets the very first {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @return the very first {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(value = "-> new", pure = true)
  @NotNull PlayerRankUpTemplate getFirst();

  /**
   * Updates the given {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate the {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract
  void update(final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Updates the actions of the {@link PlayerRankUpTemplate player rank-up template} corresponding to the given ID.
   *
   * @param id      the {@link PlayerRankUpTemplate player rank-up template} ID
   * @param actions the new actions
   */
  @PublicApi
  @Contract
  void updateActions(final int id, final @Nullable String actions);

  /**
   * Renames the {@link PlayerRankUpTemplate player rank-up template} corresponding to the given ID.
   *
   * @param id            the {@link PlayerRankUpTemplate player rank-up template} ID
   * @param masculineName the new masculine name
   * @param feminineName  the new feminine name
   */
  @PublicApi
  @Contract
  void rename(final int id, final @NotNull String masculineName, final @NotNull String feminineName);

  // endregion

  // region Player prerequisite templates services

  /**
   * Persists the given {@link PlayerPrerequisiteTemplate player prerequisite template}.
   *
   * @param playerPrerequisiteTemplate the {@link PlayerPrerequisiteTemplate player prerequisite template}
   */
  @PublicApi
  @Contract
  void addPrerequisiteTemplate(final @NotNull PlayerPrerequisiteTemplate playerPrerequisiteTemplate);

  /**
   * Gets the {@link Set set} of all {@link PlayerPrerequisiteTemplate player prerequisite templates} corresponding to
   * the given {@link PlayerRankUpTemplate player rank-up template} ID.
   *
   * @param playerRankUpTemplateId the {@link PlayerRankUpTemplate player rank-up template} ID
   * @return the {@link Set set} of all {@link PlayerPrerequisiteTemplate player prerequisite template} corresponding to
   * the given {@link PlayerRankUpTemplate player rank-up template} ID
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Set<@NotNull PlayerPrerequisiteTemplate> getAllPrerequisiteTemplates(final int playerRankUpTemplateId);

  /**
   * Gets the {@link Set set} of all {@link PlayerPrerequisiteTemplate player prerequisite template} IDs corresponding
   * to the given {@link PlayerRankUpTemplate player rank-up template} ID.
   *
   * @param playerRankUpTemplateId the {@link PlayerRankUpTemplate player rank-up template} ID
   * @return the {@link Set set} of all {@link PlayerPrerequisiteTemplate player prerequisite template} IDs
   * corresponding to the given {@link PlayerRankUpTemplate player rank-up template} ID
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Set<@NotNull String> getAllPrerequisiteTemplateIds(final int playerRankUpTemplateId);

  /**
   * Checks if a {@link PlayerPrerequisiteTemplate player prerequisite template} exists with the given ID.
   *
   * @param id the {@link PlayerPrerequisiteTemplate player prerequisite template} ID
   * @return {@code true} if a {@link PlayerPrerequisiteTemplate player prerequisite template} matches, {@code false}
   * otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id);

  /**
   * Gets the {@link PlayerPrerequisiteTemplate player prerequisite template} corresponding to the given ID.
   *
   * @param id the {@link PlayerPrerequisiteTemplate player prerequisite template} ID
   * @return the found {@link PlayerPrerequisiteTemplate player prerequisite template}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull PlayerPrerequisiteTemplate getPrerequisite(final @NotNull String id);

  /**
   * Updates the given {@link PlayerPrerequisiteTemplate player prerequisite template}.
   *
   * @param playerPrerequisiteTemplate the {@link PlayerPrerequisiteTemplate player prerequisite template}
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplate(final @NotNull PlayerPrerequisiteTemplate playerPrerequisiteTemplate);

  /**
   * Updates the query of the {@link PlayerPrerequisiteTemplate player prerequisite template} corresponding to the given
   * ID.
   *
   * @param id    the {@link PlayerPrerequisiteTemplate player prerequisite template} ID
   * @param query the new query
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateQuery(final @NotNull String id, final @NotNull String query);

  /**
   * Updates the action of the {@link PlayerPrerequisiteTemplate player prerequisite template} corresponding to the
   * given ID.
   *
   * @param id     the {@link PlayerPrerequisiteTemplate player prerequisite template} ID
   * @param action the new action
   */
  @PublicApi
  @Contract
  void updatePrerequisiteTemplateAction(final @NotNull String id, final @Nullable String action);

  /**
   * Removes the {@link PlayerPrerequisiteTemplate player prerequisite template} corresponding to the given ID.
   *
   * @param id the {@link PlayerPrerequisiteTemplate player prerequisite template} ID
   */
  @PublicApi
  @Contract
  void removePrerequisiteTemplate(final @NotNull String id);

  // endregion

}
