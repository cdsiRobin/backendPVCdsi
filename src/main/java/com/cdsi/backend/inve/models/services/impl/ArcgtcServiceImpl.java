package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArcgtcRepo;
import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.services.IArcgtcService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ArcgtcServiceImpl implements IArcgtcService {
    @Autowired
    private IArcgtcRepo arcgtcRepo;

    @Override
    public Arcgtc buscarClaseAndFecha(String clase,Date fecha) throws ServiceException {
        Arcgtc arcgtc = this.arcgtcRepo.buscarClaseAndFecha(clase,fecha);
        return arcgtc;
    }

    @Override
    public List<Arcgtc> listarXFecha(Date fecha) throws ServiceException {
        try {
            List<Arcgtc> arcgtcs = this.arcgtcRepo.buscarXFecha(fecha);
            return arcgtcs;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public Page<Arcgtc> pageArcgtc(int limit, int page) throws ServiceException {
        try {
            Pageable pageable = PageRequest.of(page, limit);
            return this.arcgtcRepo.pageArcgtc(pageable);
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Arcgtc findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arcgtc> getAll() throws ServiceException {
       return this.arcgtcRepo.listar();
    }

    @Override
    public List<Arcgtc> findByLike(Arcgtc arcgtc) throws ServiceException {
        return null;
    }

    @Override
    public Arcgtc save(Arcgtc arcgtc) throws ServiceException {
        Arcgtc a = null;
        try {
			a = this.arcgtcRepo.save(arcgtc);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        return a;
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
