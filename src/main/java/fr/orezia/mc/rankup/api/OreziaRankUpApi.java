package fr.orezia.mc.rankup.api;

import fr.orezia.mc.core.api.OreziaPluginApi;
import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.dao.factory.DaoFactory;

/**
 * Entry point of the plugin OreziaRankUp
 *
 * @since 1.0
 */
@PublicApi
public interface OreziaRankUpApi extends OreziaPluginApi {

  @PublicApi
  DaoFactory daoFactory();

}
