package fr.orezia.mc.rankup.api.dao;

import fr.orezia.mc.core.api.dao.Dao;
import fr.orezia.mc.rankup.api.entity.ItemPage;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/**
 * Dao for {@link ItemPage}.
 *
 * @since 1.0
 */
public interface ItemPageDao extends Dao<ItemPage> {

  /**
   * Check if step number exists for given rank-up.
   *
   * @param rankUpId   The parent rank-up.
   * @param stepNumber The step number to check.
   * @return True if step number exists, false otherwise.
   */
  boolean numberExists(final @NotNull String rankUpId, final int stepNumber);

  /**
   * Get the next available step number for rank-up.
   *
   * @param rankUpId The rank-up business ID.
   * @return The next available step number.
   */
  int nextNumber(final @NotNull String rankUpId);

  /**
   * Retrieve step by its step number and its rank-up.
   *
   * @param rankUpId   The rank-up business ID.
   * @param stepNumber The step number.
   * @return The optional step found.
   */
  @NotNull Optional<ItemPage> getByNumberAndRankUp(final @NotNull String rankUpId, int stepNumber);

  /**
   * Retrieve all step for given rank-up.
   *
   * @param rankUpId The rank-up business ID.
   * @return List of found step.
   */
  @NotNull List<ItemPage> getByRankUp(final @NotNull String rankUpId);

  /**
   * Save the step in persistance.
   *
   * @param itemPage The step to save.
   * @return True if step has been saved, false otherwise.
   */
  boolean create(@NotNull ItemPage itemPage);

  /**
   * Delete the step identified by its number and rank-up.
   *
   * @param stepNumber The step number.
   * @param rankUpId   The rank-up business ID.
   * @return True if step has been deleted, false otherwise.
   */
  boolean delete(int stepNumber, final @NotNull String rankUpId);

}
