package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArtsccbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/artsccb")
public class ArtsccbController extends GenericController {
    @Autowired
    private IArtsccbService service;

    // metodo que nos permite traer todos los datos de una caja
    @GetMapping("/caja")
    public ResponseEntity<ResponseRest> getArtsccb(@RequestParam String cia, @RequestParam String tipo ,@RequestParam String caja) {
        try{
            Object obj = this.service.getArtsccbCiaAndCaja(cia, tipo, caja);
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return super.getErrorRequest();
        }
    }
}
