package com.cdsi.backend.inve.controllers;

import java.util.List;

import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.entity.IdArccmc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.cdsi.backend.inve.models.entity.Arccmc;
import com.cdsi.backend.inve.models.services.IArccmcService;
import com.cdsi.backend.inve.util.RucDniSunat;

@RestController
@RequestMapping("/api/cli")
public class ArccmcController extends GenericController {
	
	@Autowired
	private IArccmcService arccService;

	@DeleteMapping
	public ResponseEntity<ResponseRest> eliminar(@RequestBody IdArccmc idArccmc, BindingResult result){
		if (result.hasErrors()){
			return super.getErrorRequest();
		}
		try{
			Object obj = this.arccService.deleteArccmc(idArccmc);
			if (obj != null){
				return super.getDeleteRegistroRequest(obj);
			}else {
				return super.getNotFoundRequest();
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getErrorRequest();
		}
	}

	@PutMapping
	public ResponseEntity<ResponseRest> actualizar(@RequestBody Arccmc arccmc, BindingResult result){
		if (result.hasErrors()){
			return super.getBadRequest(result);
		}
		try{
			Object obj = this.arccService.updateArccmc(arccmc.getObjIdArc(),arccmc);
			if (obj != null){
				return super.getUpdateRegistroRequest(obj);
			}
			return super.getNotFoundRequest();
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getNotFoundRequest();
		}
	}

	//METODO QUE NOS PERMITE GUARDAR UN CLIENTE
	@PostMapping
	public ResponseEntity<ResponseRest> guardar(@Validated @RequestBody Arccmc arccmc, BindingResult result){
		if (result.hasErrors()){
			return super.getBadRequest(result);
		}
		try{
			Arccmc objArcc = this.arccService.findCiaForCodigo(arccmc.getObjIdArc());
			if (objArcc == null) {
				Object obj = this.arccService.createArccmc(arccmc);
				if (obj != null){
					return super.getOKConsultaRequest(obj);
				}
			}else{
				return super.getNotFoundRequest();
			}

			return super.getErrorRequest();
		}catch (Exception e){
			System.out.println(e.getMessage());
			return super.getErrorRequest();
		}

	}

	//METODO QUE NOS PERMITE TRAER CLIENTE POR CLAVE PRIMARIO
	@PostMapping("/id")
	public ResponseEntity<ResponseRest> getCiaForCod(@RequestBody IdArccmc idArccmc, BindingResult result){
		if (result.hasErrors()){
			return super.getBadRequest(result);
		}
		if ( idArccmc.getCia() == null  && idArccmc.getId() == null){
			return super.getBadRequest(result);
		}
		try {
			Object obj = this.arccService.findCiaForCodigo(idArccmc);
			if (obj == null){
				return super.getNotFoundRequest();
			}
			return super.getOKConsultaRequest(obj);
		}catch (Exception e){
			return super.getErrorRequest();
		}

	}
	
	@PostMapping("/cliente")
	public Arccmc getCliente(@RequestBody IdArccmc idArccmc) {
		return this.arccService.findCiaForCodigo(idArccmc);
	}
	
	@GetMapping("/list/{cia}/{dscri}")
	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
	public List<Arccmc> listaNombreCia(@PathVariable("cia") String cia, @PathVariable("dscri") String dscri) {
		return arccService.findByNombreAndCia(cia, dscri);
	}
	
	//VAMOS A BUSCAR POR RUC A LOS CLIENTES
	@GetMapping("/buscarapi")
	public ResponseEntity<ResponseRest> buscarClienteSunat(@RequestParam String id){
			try{
				RucDniSunat p = new RucDniSunat();
				int cantidad = id.length();
				Object object = null;
				if(cantidad == 11) {
			    	object = p.consultarRuc(id); 	
			    }else {
			    	object = p.consultarDni(id);
			    }									
	           
	           if (object != null){
	               return super.getOKConsultaRequest(object);
	           }
	           return super.getBadIdRequest();
	        }catch (Exception e){
	        	System.out.println(e.getMessage());
	            return super.getBadRequest(e.getMessage());
	        }
		}
		
	//VAMOS A BUSCAR POR RUC A LOS CLIENTES
	@GetMapping("/listRuc")
	public ResponseEntity<ResponseRest> listaCiaAndRuc(@RequestParam String cia, @RequestParam String id){
		try{
			
           Object object = this.arccService.findByCiaAndRuc(cia, id);
           if (object != null){
               return super.getOKConsultaRequest(object);
           }
           return super.getBadIdRequest();
        }catch (Exception e){
        	System.out.println(e.getMessage());
            return super.getBadRequest(e.getMessage());
        }
	}
	
	//METODO QUE ENVIA UNA PAGINACION DE CLIENTES
  	@GetMapping("/list/page/{cia}/{page}")
  	//@Secured({"ROLE_ADMIN", "ROLE_USAR"})
  	public Page<Arccmc> paginacion(@PathVariable("cia") String cia, @PathVariable("page") Integer page){
  		Pageable pageable = PageRequest.of(page, 15);
  		return arccService.findPagByCia(pageable, cia);
  	}

}
