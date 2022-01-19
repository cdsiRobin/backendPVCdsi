package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.entity.Artsccb;
import com.cdsi.backend.inve.models.services.IArtsccbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtsccbServiceImple implements IArtsccbService {

    @Autowired
    private IArtsccbService service;

    @Override
    public Artsccb getArtsccbCiaAndCaja(String cia,String tipo, String caja) {
        return this.service.getArtsccbCiaAndCaja(cia, tipo, caja);
    }
}
