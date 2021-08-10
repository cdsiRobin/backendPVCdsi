package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.services.IArfaccService;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/arfacc")
public class ArfaccController extends GenericController {

    @Autowired
    private IArfaccService iArfaccService;

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody Arfacc arfacc, BindingResult result){

        if (result.hasErrors()){
            return super.getErrorRequest();
        }

        try {
            Object obj = this.iArfaccService.buscarCiaAndTipDocAndCentroAndActivo(arfacc);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            Log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

    @PostMapping
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arfacc arfacc, BindingResult result){
        if (result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArfaccService.save(arfacc);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	Log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<ResponseRest> actualizar(@RequestBody Arfacc arfacc, BindingResult result){
        if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object obj = this.iArfaccService.actualizar(arfacc.getArfaccPK(),arfacc);
            if (obj != null){
                return super.getUpdateRegistroRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
        	Log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }
}
