package fr.orezia.mc.rankup.api.data.service;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.entity.CityPrerequisite;
import fr.orezia.mc.rankup.api.entity.CityRankUp;
import java.util.Set;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data service for {@link CityRankUp city rank-ups}.
 *
 * @since 1.0
 */
@PublicApi
public interface CityRankUpDataService {

  // region City rank-ups services

  /**
   * Persists the given {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp the {@link CityRankUp city rank-up} to create
   */
  @PublicApi
  @Contract(mutates = "param1")
  void create(final @NotNull CityRankUp cityRankUp);

  /**
   * Checks if a {@link CityRankUp city rank-up} exists with the given ID.
   *
   * @param id the {@link CityRankUp city rank-up} ID
   * @return {@code true} if a {@link CityRankUp city rank-up} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean exist(final @NotNull String id);

  /**
   * Gets the {@link CityRankUp city rank-up} corresponding to the given ID.
   *
   * @param id the {@link CityRankUp city rank-up} ID
   * @return the found {@link CityRankUp city rank-up}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull CityRankUp get(final @NotNull String id);

  /**
   * Updates the given {@link CityRankUp city rank-up}.
   *
   * @param cityRankUp the {@link CityRankUp city rank-up}
   */
  @PublicApi
  @Contract
  void update(final @NotNull CityRankUp cityRankUp);

  /**
   * Updates the userName for the {@link CityRankUp city rank-up} corresponding to the given ID.
   *
   * @param playerId the {@link Player player} unique ID
   * @param userName the userName to set
   */
  @PublicApi
  @Contract
  void updateUserName(String playerId, String userName);

  /**
   * Deletes the {@link CityRankUp city rank-up} corresponding to the given ID.
   *
   * @param id the {@link CityRankUp city rank-up} ID
   */
  @PublicApi
  @Contract
  void delete(final @NotNull String id);

  // endregion

  // region City prerequisites services

  /**
   * Persists the given {@link CityPrerequisite city prerequisite}.
   *
   * @param cityPrerequisite the {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @Contract
  void addPrerequisite(final @NotNull CityPrerequisite cityPrerequisite);

  /**
   * Gets the {@link Set set} of all the {@link CityPrerequisite city prerequisites} corresponding to the given {@link
   * Player player} unique ID.
   *
   * @param playerId the {@link Player player} unique ID
   * @return the {@link Set set} of all matching {@link CityPrerequisite city prerequisites}
   */
  @PublicApi
  @Contract(value = "_ -> new", pure = true)
  @NotNull Set<@NotNull CityPrerequisite> getAllPrerequisites(final @NotNull String playerId);

  /**
   * Checks if a {@link CityPrerequisite city prerequisite} exists with the given ID and {@link Player player} unique
   * ID.
   *
   * @param id       the {@link CityPrerequisite city prerequisite} ID
   * @param playerId the {@link Player player} unique ID
   * @return {@code true} if a {@link CityPrerequisite city prerequisite} matches, {@code false} otherwise
   */
  @PublicApi
  @Contract(pure = true)
  boolean existPrerequisite(final @NotNull String id, final @NotNull String playerId);

  /**
   * Gets the {@link CityPrerequisite city prerequisite} corresponding to the given ID and {@link Player player} unique
   * ID.
   *
   * @param id       the {@link CityPrerequisite city prerequisite} ID
   * @param playerId the {@link Player player} unique ID
   * @return the found {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @Contract(value = "_, _ -> new", pure = true)
  @NotNull CityPrerequisite getPrerequisite(final @NotNull String id, final @NotNull String playerId);

  /**
   * Updates the given {@link CityPrerequisite city prerequisite}.
   *
   * @param cityPrerequisite the {@link CityPrerequisite city prerequisite}
   */
  @PublicApi
  @Contract
  void updatePrerequisite(final @NotNull CityPrerequisite cityPrerequisite);

  /**
   * Deletes the {@link CityPrerequisite city prerequisite} corresponding to the given ID and {@link Player player}
   * unique ID.
   *
   * @param id       the {@link CityPrerequisite city prerequisite} ID
   * @param playerId the {@link Player player} unique ID
   */
  @PublicApi
  @Contract
  void removePrerequisite(final @NotNull String id, final @NotNull String playerId);

  // endregion

}
