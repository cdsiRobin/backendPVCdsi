package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Arfafl;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.cdsi.backend.inve.models.services.generic.IGenericService;

import java.util.List;

public interface IArfaflService extends IGenericService<Arfafl> {

    List<Arfafl> buscarCiaAndNoFactu(int limit, int page, String cia, String indPvent, String factu) throws ServiceException;
}
