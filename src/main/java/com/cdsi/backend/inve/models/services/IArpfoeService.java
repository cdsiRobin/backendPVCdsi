package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArpfoeService extends IGenericService<Arpfoe> {

    public Arpfoe findByArpfoePK() throws ServiceException;

    List<Arpfoe> buscarCiaAndIndPvent(int limit, int page,String cia, String indPvent) throws ServiceException;


}
