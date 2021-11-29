package fr.orezia.mc.rankup.api;

import fr.orezia.mc.core.api.OreziaPluginApi;
import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.data.services.CityRankUpDataService;
import fr.orezia.mc.rankup.api.data.services.CityRankUpTemplateDataService;
import fr.orezia.mc.rankup.api.data.services.PlayerRankUpDataService;
import fr.orezia.mc.rankup.api.data.services.PlayerRankUpTemplateDataService;
import org.jetbrains.annotations.NotNull;

/**
 * Entry point of the plugin OreziaRankUp.
 *
 * @since 1.0
 */
@PublicApi
public interface OreziaRankUpApi extends OreziaPluginApi {

  /**
   * Gets the {@link CityRankUpDataService}.
   *
   * @return the {@link CityRankUpDataService}.
   */
  @PublicApi
  @NotNull CityRankUpDataService getCityRankUpDataService();

  /**
   * Gets the {@link CityRankUpTemplateDataService}.
   *
   * @return the {@link CityRankUpTemplateDataService}.
   */
  @PublicApi
  @NotNull CityRankUpTemplateDataService getCityRankUpTemplateDataService();

  /**
   * Gets the {@link PlayerRankUpDataService}.
   *
   * @return the {@link PlayerRankUpDataService}.
   */
  @PublicApi
  @NotNull PlayerRankUpDataService getPlayerRankUpDataService();

  /**
   * Gets the {@link PlayerRankUpTemplateDataService}.
   *
   * @return the {@link PlayerRankUpTemplateDataService}.
   */
  @PublicApi
  @NotNull PlayerRankUpTemplateDataService getPlayerRankUpTemplateDataService();

}
