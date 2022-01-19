package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.dao.IArintdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/arintd")
public class ArintdController extends GenericController {

    @Autowired
    private IArintdRepo service;

    //METODO QUE NOS VA PERMITIR BUSCAR POR CIA Y TRANSACCION
    @GetMapping("/get")
    public ResponseEntity<ResponseRest> obtenerPorCiaAndTransaccion(@RequestParam String cia,@RequestParam String trans){
        try{
            Object obj = this.service.getCiaAndTransac(cia, trans);
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
