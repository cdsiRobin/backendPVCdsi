package com.cdsi.backend.inve.models.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import com.cdsi.backend.inve.models.entity.Arinmn1;

@Repository
public interface IArinmn1Repo extends JpaRepository<Arinme1, Arinme1PK> {
	
	//BUSCAMOS POR COMPAÑIA,BODEGA,TRANSACCION Y NO_DOCU
	@Query("SELECT a FROM Arinmn1 a WHERE a.arinmn1PK.noCia = :cia AND a.arinmn1PK.bodega = :bodega AND a.arinmn1PK.tipoDoc = :tipoDoc AND a.arinmn1PK.noDocu = :noDocu")
	List<Arinmn1> listaCiaAndBodegaAndTransacAndDocu(@Param("cia") String cia,@Param("bodega") String bodega,
			@Param("tipoDoc") String tipoDoc,@Param("docu") String docu);

}
