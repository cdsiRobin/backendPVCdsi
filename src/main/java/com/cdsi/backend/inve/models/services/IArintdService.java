package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.Arintd;


public interface IArintdService {
  //BUSCAMOS POR CIA Y TRANSACCION
  public Arintd getCiaAndTransa(String cia, String trasac);
  
  //LISTA POR CIA
  public List<Arintd> listaCia(String cia);
  
  public Arintd save(Arintd a);
}
