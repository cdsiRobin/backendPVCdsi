package com.cdsi.backend.inve.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArccdpService;

@RestController
@RequestMapping("/api/arccdp")
public class ArccdpController extends GenericController {
    @Autowired
	private IArccdpService service;
    
    @GetMapping("/listar")
    public ResponseEntity<ResponseRest> listar(@RequestParam String cia){
        try{
            Object obj = this.service.listarDepartamentoXCia(cia);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            return super.getBadRequest(e.getMessage());
        }
    }
}
