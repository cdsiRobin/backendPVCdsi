package com.cdsi.backend.inve.controllers;

<<<<<<< HEAD
=======
import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.dao.IArintdRepo;
>>>>>>> 1a55db414c34d1e2906eaece4c0c45c4bd525454
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.cdsi.backend.inve.controllers.commons.ResponseRest;
import com.cdsi.backend.inve.controllers.generic.GenericController;
import com.cdsi.backend.inve.models.services.IArintdService;

@RestController
@RequestMapping("/api/arintd")
public class ArintdController extends GenericController {
	
	@Autowired
	private IArintdService servi;
	
	@GetMapping("/id")
	public ResponseEntity<ResponseRest> findArintd(@RequestParam String cia,@RequestParam String trans){
		
		try {
    		//return new ResponseEntity<List<Arfafe>>(this.iArfafeService.buscarCiaAndIndPvent(1, 15, cia, "N"), HttpStatus.OK);
    		Object o = this.servi.getCiaAndTransa(cia, trans);
    		if (o != null){
                return super.getOKConsultaRequest(o);
            }
            return super.getBadIdRequest();
    		
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    		return super.getErrorRequest();
    	}
		
	}
	
=======
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
>>>>>>> 1a55db414c34d1e2906eaece4c0c45c4bd525454

}
