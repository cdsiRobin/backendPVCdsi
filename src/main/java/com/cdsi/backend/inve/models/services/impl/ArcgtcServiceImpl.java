package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArcgtcRepo;
import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.entity.ArcgtcPK;
import com.cdsi.backend.inve.models.services.IArcgtcService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ArcgtcServiceImpl implements IArcgtcService {
    @Autowired
    private IArcgtcRepo arcgtcRepo;

    @Override
    public Arcgtc buscarClaseAndFecha(ArcgtcPK arcgtcPK) throws ServiceException {
        Arcgtc arcgtc = this.arcgtcRepo.buscarClaseAndFecha(arcgtcPK.getClaseCambio(),arcgtcPK.getFecha());
        return arcgtc;
    }

    @Override
    public List<Arcgtc> listarXFecha(Date fecha) throws ServiceException {
        try {
            List<Arcgtc> arcgtcs = this.arcgtcRepo.buscarXFecha(fecha);
            return arcgtcs;
        }catch (Exception e){
            log.error(e.getMessage());
            return null;
        }

    }

    @Override
    public Page<Arcgtc> listar(int limit, int page) throws ServiceException {
        try {
            Pageable pageable = PageRequest.of(page, limit);
            return this.arcgtcRepo.listar(pageable);
        }catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arcgtc findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arcgtc> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arcgtc> findByLike(Arcgtc arcgtc) throws ServiceException {
        return null;
    }

    @Override
    public Arcgtc save(Arcgtc arcgtc) throws ServiceException {
        return null;
    }

    @Override
    public Arcgtc delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arcgtc> pageCia(int limit, int page, String cia) throws ServiceException {
        return null;
    }
}
