package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.Gender;
import fr.orezia.mc.rankup.api.entity.PlayerPrerequisite;
import fr.orezia.mc.rankup.api.entity.PlayerRankUp;
import java.util.Set;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data service for {@link PlayerRankUp player rank-ups}.
 *
 * @since 1.0
 */
@PublicApi
public interface PlayerRankUpDataService {

  // region Player rank-ups services

  /**
   * Persists the given {@link PlayerRankUp player rank-up}.
   *
   * @param playerRankUp the {@link PlayerRankUp player rank-up} to create
   */
  @PublicApi
  @Contract(mutates = "param1")
  void create(final @NotNull PlayerRankUp playerRankUp);

  /**
   * Checks if a {@link PlayerRankUp player rank-up} exists with the given ID.
   *
   * @param id the {@link PlayerRankUp player rank-up} ID
   * @return {@code true} if a {@link PlayerRankUp player rank-up} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final @NotNull String id);

  /**
   * Gets the {@link PlayerRankUp player rank-up} corresponding to the given ID.
   *
   * @param id the {@link PlayerRankUp player rank-up} ID
   * @return the found {@link PlayerRankUp player rank-up}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull PlayerRankUp get(final @NotNull String id);

  /**
   * Updates the given {@link PlayerRankUp player rank-up}.
   *
   * @param playerRankUp the {@link PlayerRankUp player rank-up}
   */
  @PublicApi
  @Contract
  void update(final @NotNull PlayerRankUp playerRankUp);

  /**
   * Updates the {@link Gender gender} of the {@link PlayerRankUp player rank-up} corresponding to the given ID.
   *
   * @param id     the {@link PlayerRankUp player rank-up} ID
   * @param gender the new {@link Gender gender}
   */
  @PublicApi
  @Contract
  void updateGender(final @NotNull String id, final @NotNull Gender gender);

  /**
   * Deletes the {@link PlayerRankUp player rank-up} corresponding to the given ID.
   *
   * @param id the {@link PlayerRankUp player rank-up} ID
   */
  @PublicApi
  @Contract
  void delete(final @NotNull String id);

  // endregion

  // region Player prerequisites services

  /**
   * Persists the given {@link PlayerPrerequisite player prerequisite}.
   *
   * @param playerPrerequisite the {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract
  void addPrerequisite(final @NotNull PlayerPrerequisite playerPrerequisite);

  /**
   * Gets all {@link PlayerPrerequisite player prerequisite} from player ID.
   *
   * @param playerId the player ID
   * @return {@link Set} of all {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull Set<@NotNull PlayerPrerequisite> getAllPrerequisites(final @NotNull String playerId);

  /**
   * Checks if a {@link PlayerPrerequisite player prerequisite} exists with the given ID and {@link Player player}
   * unique ID.
   *
   * @param id       the {@link PlayerPrerequisite player prerequisite} ID
   * @param playerId the {@link Player player} unique ID
   * @return {@code true} if a {@link PlayerPrerequisite player prerequisite} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id, final @NotNull String playerId);

  /**
   * Gets the {@link PlayerPrerequisite player prerequisite} corresponding to the given ID and {@link Player player}
   * unique ID.
   *
   * @param id       the {@link PlayerPrerequisite player prerequisite} ID
   * @param playerId the {@link Player player} unique ID
   * @return the found {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract(value = "_, _ -> new", pure = true)
  @NotNull PlayerPrerequisite getPrerequisite(final @NotNull String id, final @NotNull String playerId);

  /**
   * Updates the given {@link PlayerPrerequisite player prerequisite}.
   *
   * @param playerPrerequisite the {@link PlayerPrerequisite player prerequisite}
   */
  @PublicApi
  @Contract
  void updatePrerequisite(final @NotNull PlayerPrerequisite playerPrerequisite);

  /**
   * Deletes the {@link PlayerPrerequisite player prerequisite} corresponding to the given ID and {@link Player player}
   * unique ID.
   *
   * @param id       the {@link PlayerPrerequisite player prerequisite} ID
   * @param playerId the {@link Player player} unique ID
   */
  @PublicApi
  @Contract
  void removePrerequisite(final @NotNull String id, final @NotNull String playerId);

  // endregion

}
