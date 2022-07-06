package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArfacrServi;

@RestController
@RequestMapping("/api/arfacr")
public class ArfacrController extends GenericController {
	
	@Autowired
	private IArfacrServi service;
	
	@GetMapping("/lista")
	public ResponseEntity<ResponseRest> lista(@RequestParam String cia) {
		try {
			Object obj = this.service.lista(cia);
			if (obj != null){
				return super.getOKConsultaRequest(obj);
			}
			return super.getNotFoundRequest();
		}catch (Exception e){
			return super.getErrorRequest();
		}
	}

}
