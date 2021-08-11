package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;
import org.springframework.data.domain.Page;

public interface IArinme1Service extends IGenericService<Arinme1> {

    //METODOS QUE NOS PERMITE BUSCAR POR ID
    Arinme1 buscarId(Arinme1PK arinme1PK) throws ServiceException;

    //VAMOS A TRAER PAGINADO TODAS LAS TRANSACCIONES POR COMPAÑIA
    Page<Arinme1> buscarCia(int limit, int page,String cia) throws ServiceException;
}
