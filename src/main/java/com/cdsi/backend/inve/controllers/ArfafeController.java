package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.entity.ArfafePK;
import com.cdsi.backend.inve.models.services.IArfafeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/arfafe")
public class ArfafeController extends GenericController {

    @Autowired
    private IArfafeService iArfafeService;

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody ArfafePK arfafePK, BindingResult result){
        if(result.hasErrors()){
            return super.getErrorRequest();
        }
        try {
            Object o = this.iArfafeService.buscarId(arfafePK.getNoCia(), arfafePK.getTipoDoc(), arfafePK.getNoFactu());
            if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
            log.error(e.getMessage());
            return super.getErrorRequest();
        }
    }

    @PostMapping
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arfafe arfafe, BindingResult result){
        if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object o = this.iArfafeService.save(arfafe);
            if (o != null){
                return super.getOKRegistroRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
            log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<ResponseRest> actualizar(@RequestBody Arfafe arfafe, BindingResult result){
        if(result.hasErrors()){
            return super.getBadRequest(result);
        }
        try {
            Object o = this.iArfafeService.save(arfafe);
            if (o != null){
                return super.getUpdateRegistroRequest(o);
            }
            return super.getBadIdRequest();
        } catch (Exception e){
            log.error(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
    }
}
