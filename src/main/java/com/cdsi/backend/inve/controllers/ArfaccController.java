package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfacc;
import com.cdsi.backend.inve.models.entity.ArfaccPK;
import com.cdsi.backend.inve.models.services.IArfaccService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
            log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }

    }

}
