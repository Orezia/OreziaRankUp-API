package fr.orezia.mc.rankup.api.dao;

import fr.orezia.mc.core.api.dao.Dao;
import fr.orezia.mc.rankup.api.entity.Item;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public interface ItemDao extends Dao<Item> {

   List<Item> getByRankUp(final @NotNull String rankUpId);

  Map<String, List<Item>> getAllGroupByRankUp();

  boolean deleteByRankUp(final @NotNull String rankUpId);

 }