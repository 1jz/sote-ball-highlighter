package com.soteball;

import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("example")
public interface SoteBallConfig extends Config {
    @Alpha
    @ConfigItem(
            keyName = "defaultMageColour",
            name = "Mage Colour",
            description = "Default mage projectile outline colour",
            position = 0
    )
    default Color defaultMageColour() {
        return Color.RED;
    }

    @Alpha
    @ConfigItem(
            keyName = "defaultRangeColour",
            name = "Range Colour",
            description = "Default range projectile outline colour",
            position = 1
    )
    default Color defaultRangeColour() {
        return Color.WHITE;
    }

    @Alpha
    @ConfigItem(
            keyName = "defaultDeathBallColour",
            name = "Death Ball Colour",
            description = "Default death ball outline colour",
            position = 2
    )
    default Color defaultDeathBallColour() {
        return Color.YELLOW;
    }
}
