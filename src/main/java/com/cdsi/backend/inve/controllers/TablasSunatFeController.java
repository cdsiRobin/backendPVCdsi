package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.ITablasSunatFeService;

@RestController
@RequestMapping("api/TabSunatFe")
public class TablasSunatFeController extends GenericController {
	
	@Autowired
	private ITablasSunatFeService serv;
	
	@GetMapping("/list")
	public ResponseEntity<ResponseRest> listarArtsopp(@RequestParam String clase){
    	try {
    		Object o = this.serv.listar(clase);
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
