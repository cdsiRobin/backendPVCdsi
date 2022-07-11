package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.dto.DocumentoDto;
import com.cdsi.backend.inve.models.dao.IArfafeRepo;
import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.services.IArfafeService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ArfafeServiceImple implements IArfafeService {

    @Autowired
    private IArfafeRepo iArfafeRepo;
    
	@Override
	public List<DocumentoDto> listaByCiaAndTipDocAndEstado(String cia, String tipDoc, String estado) {
		List<Arfafe> arfafes = this.iArfafeRepo.listaByCiaTipDocEstado(cia, tipDoc, estado);
		if(!arfafes.isEmpty()) {
		   List<DocumentoDto> documentodtos = new ArrayList<>();
		   for(Arfafe arfafe: arfafes) {
			   DocumentoDto docuDto = new DocumentoDto(arfafe.getArfafePK().getTipoDoc(), arfafe.getArfafePK().getNoFactu(),
					      arfafe.getFECHA(), arfafe.getNO_CLIENTE(), arfafe.getNBR_CLIENTE());
			   documentodtos.add(docuDto);
		   }
		   return documentodtos;
		}
		return null;
	}

    @Override
    public Arfafe buscarId(String cia, String doc, String factu) throws ServiceException {
        try {
            Arfafe arfafe = this.iArfafeRepo.buscarId(cia,doc,factu);
            return arfafe;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Arfafe> buscarCiaAndIndPvent(int limit, int page, String cia, String indPvent) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(limit, page);
            Page<Arfafe> arfafePage = this.iArfafeRepo.buscarCiaAndIndPvent(pageableRequest, cia, indPvent);
            List<Arfafe> arfafeList = arfafePage.getContent();
            return arfafeList;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }
    
    @Override
    public List<Arfafe> listarFacturasPvta(String cia, String pven, String doc, String f1, String f2, String fac){
    	return this.iArfafeRepo.listArfafePventa(cia, pven, doc, f1, f2, fac);
    }

    @Override
    public List<Arfafe> buscarCiaAndIndPvenAndNoCliente(int limit, int page, String cia, String indPvent, String noCliente) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(page, limit);
            Page<Arfafe> arfafePage = this.iArfafeRepo.buscarCiaAndIndPventAndNoCliente(pageableRequest,cia,indPvent,noCliente);
            List<Arfafe> arfafeList = arfafePage.getContent();
            return arfafeList;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Arfafe> buscarCiaAndIndPventAndNoFactu(int limit, int page, String cia, String indPvent, String factu) throws ServiceException {
        try {
            Pageable pageableRequest = PageRequest.of(page, limit);
            Page<Arfafe> arfafePage = this.iArfafeRepo.buscarCiaAndIndPventAndNoFactu(pageableRequest,cia,indPvent,factu);
            List<Arfafe> arfafeList = arfafePage.getContent();
            return arfafeList;
        } catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arfafe findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafe> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arfafe> findByLike(Arfafe arfafe) throws ServiceException {
        return null;
    }

    @Override
    public Arfafe save(Arfafe arfafe) throws ServiceException {
        try{
            Arfafe arfafe1 = this.iArfafeRepo.save(arfafe);
            return arfafe1;
        }catch (Exception e){
            log.error(e.getMessage());
            return null;
        }
    }

    @Override
    public Arfafe delete(Long id) throws ServiceException {
        return null;
    }

    @Override
    public Page<Arfafe> pageCia(int limit, int page, String cia) throws ServiceException {
        Pageable pageableRest = PageRequest.of(page,limit);
        Page<Arfafe> arfafePage = this.iArfafeRepo.pageCia(pageableRest,cia);
        return arfafePage;
    }



}
