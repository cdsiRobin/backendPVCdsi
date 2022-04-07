package com.cdsi.backend.inve.models.services;

import java.math.BigDecimal;

import com.cdsi.backend.inve.models.entity.BasucCred;

public interface ISPArobttService {
	
	String PaseCxcPven(String cia, String tipo_m, String centro, String pcod_ven, String cli,String tDoc,
			String codDoc, String noDoc, String pMon, String total, String fechaDoc, BigDecimal tc, String fechaVence, 
			String tDocEmp, String docEmp, String pConv, String indFerias);
	
	BasucCred consultaBcred(String cia, String suc);
}
