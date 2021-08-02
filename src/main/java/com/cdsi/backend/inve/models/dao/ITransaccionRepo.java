package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.dao.exception.ExceptionRepository;
import com.cdsi.backend.inve.models.entity.Transaccion;

import java.util.List;

public interface ITransaccionRepo  {

    //VAMOS A TRAER LAS TRANSACCIONES DEL USUARIO Y EMPRESA
    List<Transaccion> findByCiaAndUser(String cia , String usuario) throws ExceptionRepository;

}
