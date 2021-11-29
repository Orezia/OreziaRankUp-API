package fr.orezia.mc.rankup.api.data.services;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.PlayerPrerequisiteTemplate;
import fr.orezia.mc.rankup.api.entity.PlayerRankUpTemplate;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

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
   * @return {@code true} if creation is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean create(final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Gets all {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @return {@link Queue} of all {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Queue<@NotNull PlayerRankUpTemplate> getAll();

  /**
   * Gets a {@link PlayerRankUpTemplate player rank-up template} from its id.
   *
   * @param id the id of {@link PlayerRankUpTemplate player rank-up template}
   * @return the found {@link PlayerRankUpTemplate player rank-up template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Optional<PlayerRankUpTemplate> get(final @NotNull String id);

  /**
   * Updates the {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate the {@link PlayerRankUpTemplate player rank-up template}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean update(final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Deletes {@link PlayerRankUpTemplate player rank-up template}.
   *
   * @param id the {@link PlayerRankUpTemplate player rank-up template} id
   * @return {@code true} if delete is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean delete(final @NotNull String id);

  // endregion

  // region PlayerPrerequisiteTemplate services

  /**
   * Adds a {@link PlayerPrerequisiteTemplate player prerequisite template} to {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate       the {@link PlayerRankUpTemplate player rank-up template} to
   *                                   update
   * @param playerPrerequisiteTemplate the {@link PlayerPrerequisiteTemplate player prerequisite
   *                                   template} to add
   * @return {@code true} if prerequisite template is added, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean addPrerequisiteTemplate(final @NotNull PlayerRankUpTemplate playerRankUpTemplate,
      final @NotNull PlayerPrerequisiteTemplate playerPrerequisiteTemplate);

  /**
   * Gets all {@link PlayerPrerequisiteTemplate player prerequisite template} from {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param playerRankUpTemplate the parent {@link PlayerRankUpTemplate player rank-up template}
   * @return {@link Set} of all {@link PlayerPrerequisiteTemplate player prerequisite template}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull PlayerPrerequisiteTemplate> getAllPrerequisiteTemplate(
      final @NotNull PlayerRankUpTemplate playerRankUpTemplate);

  /**
   * Updates the {@link PlayerPrerequisiteTemplate player prerequisite template}.
   *
   * @param playerPrerequisiteTemplate the {@link PlayerPrerequisiteTemplate player prerequisite
   *                                   template}
   * @return {@code true} if update is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean updatePrerequisiteTemplate(
      final @NotNull PlayerPrerequisiteTemplate playerPrerequisiteTemplate);

  /**
   * Removes {@link PlayerPrerequisiteTemplate player prerequisite template} from {@link
   * PlayerRankUpTemplate player rank-up template}.
   *
   * @param id the ID of {@link PlayerPrerequisiteTemplate player prerequisite template} to remove
   * @return {@code true} if remove is success, {@code false} otherwise
   */
  @PublicApi
  @Contract
  boolean removePrerequisiteTemplate(final @NotNull String id);
  // endregion

}
