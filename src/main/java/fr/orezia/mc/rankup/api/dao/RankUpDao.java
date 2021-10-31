package fr.orezia.mc.rankup.api.dao;

import fr.orezia.mc.core.api.dao.BusinessEntityDao;
import fr.orezia.mc.rankup.api.entity.RankUp;
import org.jetbrains.annotations.NotNull;

/**
  * Dao for {@link RankUp}.
  *
  * @since 1.0
  */
 public interface RankUpDao extends BusinessEntityDao<RankUp, String> {

   /**
    * Check if given name exists.
    *
    * @param name The name to check.
    * @return True if name exists, false otherwise.
    */
   boolean nameExists(final @NotNull String name);

 }