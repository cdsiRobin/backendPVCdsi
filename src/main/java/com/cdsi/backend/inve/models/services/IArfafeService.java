package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;

public interface IArfafeService extends IGenericService<Arfafe> {

    public Arfafe buscarId(String cia, String doc, String factu) throws ServiceException;
    
    public List<Arfafe> listarFacturasPvta(String cia);

    public List<Arfafe> buscarCiaAndIndPvent(int limit, int page, String cia, String indPvent)throws ServiceException;

    List<Arfafe> buscarCiaAndIndPvenAndNoCliente(int limit, int page, String cia, String indPvent, String noCliente) throws ServiceException;

    List<Arfafe> buscarCiaAndIndPventAndNoFactu(int limit, int page, String cia, String indPvent, String factu) throws ServiceException;
    
    // Prueba de listados x cia  1 - todos | 2 - paginacion
    //List<Arfafe> listarXCia(String noCia) throws ServiceException;
    
    //Page<Arfafe> PaginacionXCia(Pageable pag, String noCia) throws ServiceException;
    
}
