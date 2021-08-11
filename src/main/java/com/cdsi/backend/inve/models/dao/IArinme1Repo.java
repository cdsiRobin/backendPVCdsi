package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArinme1Repo extends PagingAndSortingRepository<Arinme1, Arinme1PK> {

    //BUSCAR POR CODIGO
	@Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia AND a.arinme1PK.bodega = :bodega AND a.arinme1PK.tipoDoc = :tipoDoc AND a.arinme1PK.noDocu = :noDocu")
    Arinme1 buscarId(@Param("cia") String cia,@Param("bodega") String bodega,@Param("tipoDoc") String tipoDoc,@Param("noDocu") String noDocu);

    @Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia")
    Page<Arinme1> buscarCia(@Param("cia") String cia, Pageable pageable);
}
