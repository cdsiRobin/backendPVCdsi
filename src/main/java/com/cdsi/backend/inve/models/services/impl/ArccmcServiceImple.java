package com.cdsi.backend.inve.models.services.impl;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdsi.backend.inve.models.dao.IArccmcDao;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.entity.IdArccmc;
import com.cdsi.backend.inve.models.services.IArccmcService;

@Service
public class ArccmcServiceImple implements IArccmcService  {

	@Autowired
	private IArccmcDao arccDao;

	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	@Transactional
	public Arccmc createArccmc(Arccmc articulo) {
		return arccDao.save(articulo);
	}

	@Override
	@Transactional
	public Arccmc updateArccmc(IdArccmc objIdArc, Arccmc objA) {
		Arccmc newArcc = findCiaForCodigo(objIdArc);
		/***
		newArcc.setActivo(objA.getActivo());
		newArcc.setCelular(objA.getCelular());
		newArcc.setDireccion(objA.getDireccion());
		newArcc.setDocumento(objA.getDocumento());
		newArcc.setEmail(objA.getEmail());
		newArcc.setExtranjero(objA.getExtranjero());
		newArcc.setNombre(objA.getNombre());
		newArcc.setPais(objA.getPais());
		newArcc.setRuc(objA.getRuc());
		newArcc.setTelefono(objA.getTelefono());
		newArcc.setTipo(objA.getTipo());
		newArcc.setWeb(objA.getWeb());
		*/
		newArcc = objectMapper.convertValue(objA,Arccmc.class);
		return arccDao.save(newArcc);
	}

	@Override
	@Transactional
	public Object deleteArccmc(IdArccmc objIdArc) {
		Arccmc arccmc = this.findCiaForCodigo(objIdArc);
		arccmc.setActivo("N");
	  return 	this.arccDao.save(arccmc);
	}

	@Override
	public Arccmc findCiaForCodigo(IdArccmc objIdArc) {
		return arccDao.findCiaForCodigo(objIdArc.getCia(),objIdArc.getId());
	}

	@Override
	public Page<Arccmc> findPagByCia(Pageable pageable, String cia) {
		return arccDao.findPagByCia(pageable, cia);
	}

	@Override
	//@Transactional(readOnly = true)
	public List<Arccmc> findByNombreAndCia(String cia, String dscri) {
		return arccDao.findByNombreAndCia(cia, dscri);
	}

}
