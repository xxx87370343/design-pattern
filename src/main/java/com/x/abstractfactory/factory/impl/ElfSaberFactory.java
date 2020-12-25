package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.SaberFactory;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.ElfSaber;

public class ElfSaberFactory implements SaberFactory {
    public Saber getSoldier() {
        return new ElfSaber();
    }
}
