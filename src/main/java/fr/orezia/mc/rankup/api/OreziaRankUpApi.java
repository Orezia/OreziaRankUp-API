package fr.orezia.mc.rankup.api;

import fr.orezia.mc.core.api.annotation.PublicApi;
import org.jetbrains.annotations.NotNull;

/**
 * Entry point of the plugin OreziaRankUp
 *
 * @since 1.0
 */
@PublicApi
public interface OreziaRankUpApi {

  @PublicApi
  @NotNull String pluginName();
}
