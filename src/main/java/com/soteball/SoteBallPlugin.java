package com.soteball;

import com.google.inject.Provides;

import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
        name = "Sote Ball Highlighter"
)
public class SoteBallPlugin extends Plugin {
    @Inject
    private Client client;

    @Inject
    private SoteBallConfig config;

    @Inject
    private SoteBallOverlay soteBallOverlay;

    @Inject
    private OverlayManager overlayManager;

    public int currentRegionID = -1;

    @Provides
    SoteBallConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SoteBallConfig.class);
    }

    @Subscribe
    protected void onGameTick(GameTick gameTick) {
        int regionID = WorldPoint.fromLocalInstance(this.client, this.client.getLocalPlayer().getLocalLocation()).getRegionID();
        if (regionID == SoteBallConstants.SOTE_REGION) {
            if (overlayManager.add(soteBallOverlay)){
                log.info("added overlay");
            }
        } else {
            if (overlayManager.remove(soteBallOverlay)) {
                log.info("removed overlay");
            }
        }
        currentRegionID = regionID;
    }
}
