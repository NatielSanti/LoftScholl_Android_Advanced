package ru.natiel.loftcoin.data;

import java.util.Map;

public class CmcCoin extends Coin {

    @Override
    public long id() {
        return 0;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String symbol() {
        return null;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public double change24h() {
        return 0;
    }

    @Override
    public int rank() {
        return 0;
    }

    @Override
    Map<String, AutoValue_Coin_Quote> quote() {
        return null;
    }
}