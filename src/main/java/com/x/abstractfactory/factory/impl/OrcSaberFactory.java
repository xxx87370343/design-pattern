package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.SaberFactory;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.OrcSaber;

public class OrcSaberFactory implements SaberFactory {
    public Saber getSoldier() {
        return new OrcSaber();
    }
}
