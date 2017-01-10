package com.example.a46406163y.mpc;

import nl.littlerobots.cupboard.tools.provider.CupboardContentProvider;

import static nl.qbusict.cupboard.CupboardFactory.cupboard;

public class CardContentProvide extends CupboardContentProvider {

    public static final String AUTHORITY = BuildConfig.APPLICATION_ID + ".provider";

    static {
        cupboard().register(WOW.class);
    }

    public CardContentProvider() {
        super(AUTHORITY, 1);
    }
}
