package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArfaccRepo;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.ArfaccPK;
import com.cdsi.backend.inve.models.services.IArfaccService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArfaccServiceImple implements IArfaccService {

    @Autowired
    private IArfaccRepo iArfaccRepo;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Arfacc actualizar(ArfaccPK arfaccPK, Arfacc arfacc) throws ServiceException {
       try{
    	  
           Arfacc arfacc1 = this.iArfaccRepo.buscarId(arfaccPK.getNoCia(),arfaccPK.getCentro(),arfaccPK.getTipoDoc(),arfaccPK.getSerie());
           
           if (arfacc1 != null){        	  
              // arfacc1 =  this.objectMapper.convertValue(arfacc,Arfacc.class);
        	   arfacc1.setConsDesde(arfacc.getConsDesde());
        	   log.error(arfacc1.toString());
               return this.iArfaccRepo.save(arfacc1);
           }
           return null;
       }catch (Exception e){
    	   log.error(e.getMessage());
           return null;
       }

    }

    @Override
    public List<Arfacc> buscarCiaAndTipDocAndCentroAndActivo(Arfacc arfacc) throws ServiceException {
        try {
            List<Arfacc> arfaccList = this.iArfaccRepo.buscarCiaAndTipDocAndCentroAndActivo(arfacc.getArfaccPK().getNoCia(),
                    arfacc.getArfaccPK().getTipoDoc(),arfacc.getArfaccPK().getCentro(),arfacc.getActivo());
            return arfaccList;
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCia(int limit, int page,ArfaccPK arfaccPK) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            Page<Arfacc> arfaccPage = this.iArfaccRepo.listarCia(arfaccPK.getNoCia(),pageableRequest);
            return arfaccPage;
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCiaAndActivo(int limit, int page,Arfacc arfacc) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            return this.iArfaccRepo.listarCiaAndActivo(arfacc.getArfaccPK().getNoCia(),arfacc.getActivo(),pageableRequest);
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCiaAndTipoDoc(int limit, int page,Arfacc arfacc) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            return this.iArfaccRepo.listarCiaAndTipoDoc(arfacc.getArfaccPK().getNoCia(),arfacc.getArfaccPK().getTipoDoc(),pageableRequest);
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Page<Arfacc> listPageCiaAndCentro(int limit, int page,Arfacc arfacc) throws ServiceException {
        try{
            Pageable pageableRequest = PageRequest.of(page,limit);
            return this.iArfaccRepo.listarCiaAndCentro(arfacc.getArfaccPK().getNoCia(),arfacc.getArfaccPK().getCentro(),pageableRequest);
        }catch (Exception e){
        	log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arfacc findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacc> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfacc> findByLike(Arfacc arfacc) throws ServiceException {
        return null;
    }

    @Override
    public Arfacc save(Arfacc arfacc) throws ServiceException {
        return null;
    }

    @Override
    public Arfacc delete(Long id) throws ServiceException {
        return null;
    }

	@Override
	public Page<Arfacc> pageCia(int limit, int page, String cia) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
}
