package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfacf;
import com.cdsi.backend.inve.models.entity.ArfacfPK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;
import org.springframework.data.domain.Page;

public interface IArfacfService extends IGenericService<Arfacf> {
    public Arfacf buscarId(ArfacfPK arfacfPK) throws ServiceException;
    Page<Arfacf> pagiCia(int limit, int page, String cia) throws ServiceException;
}
