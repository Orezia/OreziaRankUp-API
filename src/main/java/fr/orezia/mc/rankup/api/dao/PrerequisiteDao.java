package fr.orezia.mc.rankup.api.dao;

import fr.orezia.mc.core.api.dao.Dao;
import fr.orezia.mc.rankup.api.entity.Prerequisite;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/**
  * Dao for {@link Prerequisite}.
  *
  * @since 1.0
  */
 public interface PrerequisiteDao extends Dao<Prerequisite> {

   /**
    * Check if id exists for given rank-up.
    *
    * @param rankUpId The parent rank-up.
    * @param id       The id to check.
    * @return True if id exists, false otherwise.
    */
   boolean idExists(final @NotNull String rankUpId, final int id);

   /**
    * Get the next available id for rank-up.
    *
    * @param rankUpId The rank-up business ID.
    * @return The next available id.
    */
   int nextId(final @NotNull String rankUpId);

   /**
    * Get all prerequisites, group by rank-up.
    *
    * @return all prerequisites, group by rank-up.
    */
   @NotNull Map<String, List<Prerequisite>> getAllGroupByRankUp();

   /**
    * Retrieve prerequisite by its id and its rank-up.
    *
    * @param rankUpId The rank-up business ID.
    * @param id       The id.
    * @return The optional prerequisite found.
    */
   @NotNull Optional<Prerequisite> getByIdAndRankUp(final @NotNull String rankUpId, int id);

   /**
    * Retrieve all prerequisites for given rank-up.
    *
    * @param rankUpId The rank-up business ID.
    * @return List of found prerequisites.
    */
   @NotNull List<Prerequisite> getByRankUp(final @NotNull String rankUpId);

   /**
    * Save the prerequisite in persistance.
    *
    * @param prerequisite The prerequisite to save.
    * @return True if prerequisite has been saved, false otherwise.
    */
   boolean create(@NotNull Prerequisite prerequisite);

   /**
    * Delete the prerequisite identified by its id and rank-up.
    *
    * @param id       The prerequisite id.
    * @param rankUpId The rank-up business ID.
    * @return True if prerequisite has been deleted, false otherwise.
    */
   boolean delete(int id, final @NotNull String rankUpId);

   /**
    * Delete the prerequisites identified by its  rank-up.
    *
    * @param rankUpId The rank-up business ID.
    * @return True if prerequisites has been deleted, false otherwise.
    */
   boolean deleteByRankUp(final @NotNull String rankUpId);

 }