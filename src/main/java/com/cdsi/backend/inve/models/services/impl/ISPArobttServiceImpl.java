package com.cdsi.backend.inve.models.services.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.dao.ISPArobttRepo;
import com.cdsi.backend.inve.models.entity.BasucCred;
import com.cdsi.backend.inve.models.services.ISPArobttService;

@Repository
public class ISPArobttServiceImpl implements ISPArobttService {
	
	@Autowired
	private ISPArobttRepo repo;

	@Override
	public String PaseCxcPven(String cia, String tipo_m, String centro, String pcod_ven, String cli, String tDoc,
			String codDoc, String noDoc, String pMon, String total, String fechaDoc, BigDecimal tc, String fechaVence,
			String tDocEmp, String docEmp, String pConv, String indFerias) {
		return repo.paseCxcPven(cia, tipo_m, centro, pcod_ven, cli, tDoc, codDoc, noDoc, pMon, total, 
				fechaDoc, tc, fechaVence, tDocEmp, docEmp, pConv, indFerias);
	}

	@Override
	public BasucCred consultaBcred(String cia, String suc) {
		return repo.consultaBcred(cia, suc);
	}
	
}
