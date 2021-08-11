package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import com.cdsi.backend.inve.models.services.IArinme1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/arinme1")
public class Arinme1Controller extends GenericController {
    @Autowired
    private IArinme1Service arinme1Service;

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody Arinme1PK arinme1PK, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.arinme1Service.buscarId(arinme1PK);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }
    
    @PostMapping
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arinme1 arinme1, BindingResult result){
    	if(result.hasErrors()) {
    		return super.getErrorRequest();
    	}
    	try {
    	    Object obj = this.arinme1Service.buscarId(arinme1.getArinme1PK());
    	    if(obj == null) {
    	    	Object obj2 = this.arinme1Service.save(arinme1);
    	    	if(obj2 != null) {
    	    		return super.getOKRegistroRequest(obj2);
    	    	}
    	    	return super.getBadIdRequest();
    	    	
    	    }else {
    	    	return super.duplicadoRegsitrarRequest(obj);
    	    }
    	}catch(Exception e) {
    		log.error(e.getMessage());
    		return super.getBadRequest(e.getMessage());
    	}
    	
    }
    
    @PutMapping
    public ResponseEntity<ResponseRest> actualizar(@RequestBody Arinme1 arinme1, BindingResult result){
    	if(result.hasErrors()) {
    		return super.getErrorRequest();
    	}
    	try {
    	    Object obj = this.arinme1Service.buscarId(arinme1.getArinme1PK());
    	    if(obj != null) {
    	    	Object obj2 = this.arinme1Service.save(arinme1);
    	    	if(obj2 != null) {
    	    		return super.getUpdateRegistroRequest(obj2);
    	    	}
    	    	return super.getBadIdRequest();
    	    	
    	    }else {
    	    	return super.getDatosNoValidoRequest();
    	    }
    	}catch(Exception e) {
    		log.error(e.getMessage());
    		return super.getBadRequest(e.getMessage());
    	}
    	
    }

    @GetMapping("/pagin")
    public ResponseEntity<ResponseRest> paginByCia(@RequestParam String cia, @RequestParam int limit, @RequestParam int page){
        try {
            Object lst = this.arinme1Service.buscarCia(limit,page,cia);
            if (lst != null){
                return super.getOKConsultaRequest(lst);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

}
