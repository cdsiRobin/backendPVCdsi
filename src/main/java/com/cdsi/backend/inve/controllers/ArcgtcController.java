package com.cdsi.backend.inve.controllers;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.Arcgtc;
import com.cdsi.backend.inve.models.entity.ArcgtcPK;
import com.cdsi.backend.inve.models.services.IArcgtcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/api/arcgtc")
public class ArcgtcController extends GenericController {
    @Autowired
    private IArcgtcService arcgtcService;

     @PostMapping("/id")
     public ResponseEntity<ResponseRest> buscarId(@RequestBody ArcgtcPK arcgtcPK, BindingResult result){
         if (result.hasErrors()){
             return super.getErrorRequest();
         }
         try{
            Object object = this.arcgtcService.buscarClaseAndFecha(arcgtcPK);
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
     public ResponseEntity<ResponseRest> buscarFecha(@RequestParam Date fecha){
         try{
             Object obj = this.arcgtcService.listarXFecha(fecha);
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
             Object obj = this.arcgtcService.listar(limit,page);
             if (obj != null){
                 return super.getOKConsultaRequest(obj);
             }
             return super.getBadIdRequest();
         }catch (Exception e){
             return super.getBadRequest(e.getMessage());
         }
     }

}
