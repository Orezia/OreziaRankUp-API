package fr.orezia.mc.rankup.api;

import fr.orezia.mc.core.api.OreziaPluginApi;
import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.rankup.api.data.service.CityRankUpDataService;
import fr.orezia.mc.rankup.api.data.service.CityRankUpTemplateDataService;
import fr.orezia.mc.rankup.api.data.service.PlayerRankUpDataService;
import fr.orezia.mc.rankup.api.data.service.PlayerRankUpTemplateDataService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entry point of the {@literal OreziaRankUp} plugin.
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
  @Contract(pure = true)
  @NotNull CityRankUpDataService getCityRankUpDataService();

  /**
   * Gets the {@link CityRankUpTemplateDataService}.
   *
   * @return the {@link CityRankUpTemplateDataService}.
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull CityRankUpTemplateDataService getCityRankUpTemplateDataService();

  /**
   * Gets the {@link PlayerRankUpDataService}.
   *
   * @return the {@link PlayerRankUpDataService}.
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull PlayerRankUpDataService getPlayerRankUpDataService();

  /**
   * Gets the {@link PlayerRankUpTemplateDataService}.
   *
   * @return the {@link PlayerRankUpTemplateDataService}.
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull PlayerRankUpTemplateDataService getPlayerRankUpTemplateDataService();

}
