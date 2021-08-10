package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArfafpRepo;
import com.cdsi.backend.inve.models.entity.Arfafp;
import com.cdsi.backend.inve.models.entity.ArfafpPK;
import com.cdsi.backend.inve.models.services.IArfafpService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArfapfServiceImple implements IArfafpService {

    @Autowired
    private IArfafpRepo iArfafpRepo;

    @Override
    public List<Arfafp> findByCiaAndEstado(String cia, String estado) throws ServiceException {
        try {
            List<Arfafp> arfafpList = this.iArfafpRepo.listarCiaAndEstado(cia,estado);
            return arfafpList;
        }catch (Exception e){
        	Log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public Arfafp buscarId(ArfafpPK arfafpPK) throws ServiceException {
        try {
            return this.iArfafpRepo.buscarId(arfafpPK.getNoCia(), arfafpPK.getTipoFpago(), arfafpPK.getCodFpago());
        }catch (Exception e){
        	Log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public Arfafp findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafp> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafp> findByLike(Arfafp arfafp) throws ServiceException {
        return null;
    }

    @Override
    public Arfafp save(Arfafp arfafp) throws ServiceException {
        return null;
    }

    @Override
    public Arfafp delete(Long id) throws ServiceException {
        return null;
    }
}
