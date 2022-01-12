package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Artsccb;

public interface IArtsccbService {

    //METODO QUE NOS PERMITE SABER SI LA CAJA PERMITE GENERAR GUIA INTERNA
    Artsccb getArtsccbCiaAndCaja(String cia,String tipo, String caja);
}
