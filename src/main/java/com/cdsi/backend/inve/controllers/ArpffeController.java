package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.ArpffePK;
import com.cdsi.backend.inve.models.services.IArpffeService;
import com.cdsi.backend.inve.models.services.IArpfoeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/arpffe")
public class ArpffeController extends GenericController {

    @Autowired
    private IArpffeService iArpffeService;

    @PostMapping("/id")
    public ResponseEntity<ResponseRest> buscarId(@RequestBody ArpffePK arpffePK, BindingResult result){
        if (result.hasErrors()){
            return super.getErrorRequest();
        }
        try{
            Object obj = this.iArpffeService.buscarId(arpffePK);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            log.error(e.getMessage());
            return super.getErrorRequest();
        }

    }

    @GetMapping("/pagin")
    public ResponseEntity<ResponseRest> pageCia(@RequestParam String cia,@RequestParam int limit, @RequestParam int page){

        try{
            Object obj = this.iArpffeService.pageCia(limit,page,cia);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            log.error(e.getMessage());
            return super.getErrorRequest();
        }

    }

}
