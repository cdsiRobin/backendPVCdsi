package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.services.ILicenciaService;

@RestController
@RequestMapping("/api/licencia")
public class LicenciaController extends GenericController  {
	
	@Autowired
	private ILicenciaService servi;
	
	@GetMapping("/id")
	public ResponseEntity<ResponseRest> getID(@RequestParam String cia, @RequestParam String ruc) {		
		    try{
	            Object obj = this.servi.buscarId(cia, ruc);
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@GetMapping
	public ResponseEntity<ResponseRest> getCia(@RequestParam String cia) {		
		    try{
	            Object obj = this.servi.buscarCia(cia);
	            if (obj != null){
	                return super.getOKConsultaRequest(obj);
	            }
	            return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		
	}
	
	@PutMapping
	public ResponseEntity<ResponseRest> actualizar(@RequestParam String cia, @RequestParam String ruc, @RequestParam String llave){
		try{
			Object obj = this.servi.actualizar(cia.trim(), ruc.trim(), llave.trim());
			if (obj != null){
				return super.getUpdateRegistroRequest(obj);
			}
			return super.getNotFoundRequest();
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getNotFoundRequest();
		}
	}

}
