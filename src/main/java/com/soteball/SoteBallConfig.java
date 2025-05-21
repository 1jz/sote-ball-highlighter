package com.soteball;

import net.runelite.client.config.*;

import java.awt.*;

@ConfigGroup("sote ball")
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

    @Range(max = 100)
    @ConfigItem(
            name = "Outline Thickness",
            keyName = "outlineThickness",
            description = "thickness value of outline",
            position = 3
    )
    default int outlineThickness() {
        return 1;
    }

    @Range(max = 100)
    @ConfigItem(
            name = "Outline Feather",
            keyName = "outlineFeather",
            description = "feather value of outline",
            position = 4
    )
    default int outlineFeather() {
        return 1;
    }
}
