package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.SaberFactory;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.GodSaber;

public class GodSaberFactory implements SaberFactory {
    public Saber getSoldier() {
        return new GodSaber();
    }
}
