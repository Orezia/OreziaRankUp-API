package fr.orezia.mc.rankup.api.dao.factory;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.dao.ItemDao;
import fr.orezia.mc.rankup.api.dao.ItemPageDao;
import fr.orezia.mc.rankup.api.dao.PrerequisiteDao;
import fr.orezia.mc.rankup.api.dao.RankUpDao;
import org.jetbrains.annotations.NotNull;

/**
  * Factory for {@link fr.orezia.mc.core.api.dao.Dao}.
  *
  * @since 1.0
  */
 public interface DaoFactory {

   /**
    * Get {@link RankUpDao} instance.
    *
    * @return The dao instance.
    * @throws IllegalStateException When call from a static initializer
    */
   @PublicApi
   @NotNull RankUpDao getRankUpDao();

   /**
    * Get {@link ItemDao} instance.
    *
    * @return The dao instance.
    * @throws IllegalStateException When call from a static initializer
    */
   @PublicApi
   @NotNull ItemDao getItemStackDao();

   /**
    * Get {@link ItemPageDao} instance.
    *
    * @return The dao instance.
    * @throws IllegalStateException When call from a static initializer
    */
   @PublicApi
   @NotNull ItemPageDao getItemPageDao();

   /**
    * Get the {@link PrerequisiteDao} instance.
    *
    * @return The dao instance.
    * @throws IllegalStateException When call from a static initializer
    */
   @PublicApi
   @NotNull PrerequisiteDao getPrerequisiteDao();

 }