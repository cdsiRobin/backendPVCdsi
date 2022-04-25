package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArtstarService;

@RestController
@RequestMapping("api/artstar")
public class ArtstarController extends GenericController {
	
	@Autowired
	private IArtstarService service;
	
	@GetMapping("/list")
	public ResponseEntity<ResponseRest> listar(@RequestParam String cia) {
		
		try {
			Object o = this.service.listar(cia);
    		if(o != null) {
    			return this.getOKConsultaRequest(o);
    		}
    		return super.getBadIdRequest();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return super.getBadRequest(e.getMessage());
		}
	}

}
