package com.tokyo.game.tokyo_game.cards;

public abstract class OrdinaryCard extends Card{
    private static final double upgradeCoef = 1.25;
    private long duration;
    private long upgradeLeve;
    private long upgradeCost;
    private long playerDamage;
}
