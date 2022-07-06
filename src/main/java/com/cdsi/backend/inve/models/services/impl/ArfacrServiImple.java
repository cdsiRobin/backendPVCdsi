package com.cdsi.backend.inve.models.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdsi.backend.inve.models.dao.IArfacrRepo;
import com.cdsi.backend.inve.models.dao.IArfatcnRepo;
import com.cdsi.backend.inve.models.entity.Arfacr;
import com.cdsi.backend.inve.models.services.IArfacrServi;

@Service
public class ArfacrServiImple implements IArfacrServi {
	
	@Autowired
	private IArfacrRepo arfacrRepo;
	
	@Autowired
	private IArfatcnRepo arfatcnRepo;

	@Override
	public List<Arfacr> lista(String cia) {
		List<String> tipos   = this.arfatcnRepo.listaTipoFromCiaAndIndDetalle(cia, "N");
		//tipos.forEach(tipo -> System.out.println(tipo));
		List<Arfacr> arfacrs = this.arfacrRepo.listaCia(cia);
		
		List<Arfacr> arfacrsn = arfacrs.stream().filter( x -> tipos.contains(x.getTipo()) ).collect(Collectors.toList());
		
		return arfacrsn;
	}

}
