package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArfafeService extends IGenericService<Arfafe> {

    public Arfafe buscarId(String cia, String doc, String factu) throws ServiceException;

    List<Arfafe> buscarCiaAndIndPvent(int limit, int page, String cia, String indPvent)throws ServiceException;

    List<Arfafe> buscarCiaAndIndPvenAndNoCliente(int limit, int page, String cia, String indPvent, String noCliente) throws ServiceException;

    List<Arfafe> buscarCiaAndIndPventAndNoFactu(int limit, int page, String cia, String indPvent, String factu) throws ServiceException;
}
