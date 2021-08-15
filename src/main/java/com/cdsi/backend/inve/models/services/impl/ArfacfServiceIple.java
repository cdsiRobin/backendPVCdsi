package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArfacfRepo;
import com.cdsi.backend.inve.models.entity.Arfacf;
import com.cdsi.backend.inve.models.entity.ArfacfPK;
import com.cdsi.backend.inve.models.services.IArfacfService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArfacfServiceIple implements IArfacfService {
    @Autowired
    private IArfacfRepo arfacfRepo;

    @Override
    public Arfacf buscarId(ArfacfPK arfacfPK) throws ServiceException {
        return this.arfacfRepo.buscarId(arfacfPK.getNoCia(),arfacfPK.getCentro());
    }

    @Override
    public Page<Arfacf> pagiCia(int limit, int page, String cia) throws ServiceException {
        Pageable pageableRequest = PageRequest.of(page,limit);
        Page<Arfacf> arfacfPage = this.arfacfRepo.pageCia(cia,pageableRequest);
        return arfacfPage;
    }

    @Override
    public Arfacf findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacf> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacf> findByLike(Arfacf arfacf) throws ServiceException {
        return null;
    }

    @Override
    public Arfacf save(Arfacf arfacf) throws ServiceException {
        return null;
    }

    @Override
    public Arfacf delete(Long id) throws ServiceException {
        return null;
    }
}
