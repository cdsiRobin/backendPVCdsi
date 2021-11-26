package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArfatpService;

@RestController
@RequestMapping("/api/listaprecios")
public class ArfatpController extends GenericController {
	
	@Autowired
	private IArfatpService arfServ;
	
	@GetMapping("/list")
    public ResponseEntity<ResponseRest> listar(@RequestParam("cia") String cia, @RequestParam("pv") String pv){
        try{
            Object obj = this.arfServ.findAll(cia,pv);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            return super.getBadRequest(e.getMessage());
        }
    }

}
