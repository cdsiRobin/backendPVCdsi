package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArcgtcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/api/arcgtc")
public class ArcgtcController extends GenericController {
    @Autowired
    private IArcgtcService arcgtcService;

    @GetMapping("/listar")
    public ResponseEntity<ResponseRest> listar(){
        try{
            Object obj = this.arcgtcService.getAll();
            if (obj != null){
                return super.getOKConsultaRequest(obj);
            }
            return super.getBadIdRequest();
        }catch (Exception e){
            return super.getBadRequest(e.getMessage());
        }
    }

    @GetMapping("/id")
     public ResponseEntity<ResponseRest> buscarId(@RequestParam String clase,@RequestParam String fecha){
         
         try{
        	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	 Date f = formato.parse(fecha);
        	 
            Object object = this.arcgtcService.buscarClaseAndFecha(clase,f);
            if (object != null){
                return super.getOKConsultaRequest(object);
            }
            return super.getBadIdRequest();
         }catch (Exception e){
             log.error(e.getMessage());
             return super.getBadRequest(e.getMessage());
         }

     }

     @GetMapping("/fecha")
     public ResponseEntity<ResponseRest> buscarFecha(@RequestParam String fecha){
         try{
        	 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        	 Date f = formato.parse(fecha);
             Object obj = this.arcgtcService.listarXFecha(f);
             if (obj != null){
                 return this.getOKConsultaRequest(obj);
             }
             return this.getBadIdRequest();
         }catch (Exception e){
             return super.getBadRequest(e.getMessage());
         }
     }

     @GetMapping("/page")
     public ResponseEntity<ResponseRest> paginacion(@RequestParam int limit, @RequestParam int page){
         try{
             Object obj = this.arcgtcService.pageArcgtc(limit,page);
             if (obj != null){
                 return super.getOKConsultaRequest(obj);
             }
             return super.getBadIdRequest();
         }catch (Exception e){
             return super.getBadRequest(e.getMessage());
         }
     }

}
