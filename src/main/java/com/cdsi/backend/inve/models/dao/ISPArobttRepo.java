package com.cdsi.backend.inve.models.dao;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arobtt;
import com.cdsi.backend.inve.models.entity.BasucCred;

@Repository
public interface ISPArobttRepo extends CrudRepository<Arobtt, Long>{
	
	@Procedure(name = "cxc_artstrd_pven")
	String paseCxcPven(@Param("PNO_CIA") String cia, @Param("ptipo_m") String tipo_m, @Param("pcentro") String centro,
		@Param("pcod_ven_cob") String pcod_ven, @Param("pno_cliente") String cli,@Param("ptipo_doc") String tDoc,
		@Param("pcod_doc") String codDoc, @Param("pno_docu") String noDoc, @Param("pmoneda_doc") String pMon, 
		@Param("pimporte_doc") String total, @Param("pfecha_doc") String fechaDoc, @Param("ptipo_cambio_doc") BigDecimal tc,
		@Param("pfecha_vence") String fechaVence, @Param("pTIPO_DOC_EMP") String tDocEmp, @Param("pNUM_DOC_EMP") String docEmp,
		@Param("pconvenio") String pConv, @Param("pIND_FERIAS") String indFerias);
	
	@Query("SELECT a FROM BasucCred a WHERE a.basucCredPk.noCia = :cia AND a.basucCredPk.codSuc = :suc")
	BasucCred consultaBcred(@Param("cia") String cia, @Param("suc") String suc);
}
