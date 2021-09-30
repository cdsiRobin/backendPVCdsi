package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.entity.ArcgtcPK;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.Date;
import java.util.List;

public interface IArcgtcService extends IGenericService<Arcgtc> {
    public Arcgtc buscarClaseAndFecha(ArcgtcPK arcgtcPK) throws ServiceException;
    public List<Arcgtc> listarXFecha(Date fecha) throws ServiceException;
    public List<Arcgtc> listar(int limit, int page) throws ServiceException;
}
