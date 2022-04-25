package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArcktbService;

@RestController
@RequestMapping("api/arcktb")
public class ArcktbController extends GenericController {
	
	@Autowired
	private IArcktbService service;
	
	@GetMapping("/list")
	public ResponseEntity<ResponseRest> listar(){
		try {
			Object o = service.listar();
			if(o != null) {
				return super.getOKConsultaRequest(o);
			}
			return super.getBadIdRequest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return super.getBadRequest(e.getMessage());
		}
	}

}
