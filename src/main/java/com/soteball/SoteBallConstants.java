package com.soteball;

import com.google.common.collect.ImmutableList;

public interface SoteBallConstants {
    int SOTE_REGION = 13123;

    int DEATH_BALL = 1604;
    int MAGIC_ORB = 1606;
    int RANGE_ORB = 1607;
    int INFERNO_RANGE = 1378;
    int INFERNO_MAGE = 1380;
    int INFERNO_DEATH_BALL = 1375;
    int TOA_RANGE = 2241;
    int TOA_MAGE = 2224;
    int TOA_DEATH_BALL = 2176;

    ImmutableList<Integer> MAGE_IDS = ImmutableList.of(MAGIC_ORB, INFERNO_MAGE, TOA_MAGE);
    ImmutableList<Integer> RANGE_IDS = ImmutableList.of(RANGE_ORB, INFERNO_RANGE, TOA_RANGE);
    ImmutableList<Integer> DEATH_BALL_IDS = ImmutableList.of(DEATH_BALL, INFERNO_DEATH_BALL, TOA_DEATH_BALL);
}
