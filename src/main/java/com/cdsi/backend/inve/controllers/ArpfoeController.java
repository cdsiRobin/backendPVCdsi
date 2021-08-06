package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arpfoe;
import com.cdsi.backend.inve.models.entity.ArpfoePK;
import com.cdsi.backend.inve.models.services.IArpfoeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/arpfoe")
public class ArpfoeController extends GenericController {

    @Autowired
    private IArpfoeService iArpfoeService;

    @PostMapping("/id")
    public ResponseEntity<ResponseRest>buscarId(@RequestBody ArpfoePK arpfoePK, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.iArpfoeService.buscarId(arpfoePK.getNoCia(), arpfoePK.getNoOrden());
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            log.error(e.getMessage());
            return super.getErrorRequest();
        }
    }

    @PostMapping
    public ResponseEntity<ResponseRest> guardar(@RequestBody Arpfoe arpfoe, BindingResult result){
        if (result.hasErrors()){
            return super.getBadRequest(result);
        }

        try {
            Object obj = this.iArpfoeService.save(arpfoe);
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
