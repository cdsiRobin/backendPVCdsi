package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IArinme1Repo extends PagingAndSortingRepository<Arinme1, Arinme1PK> {

    //BUSCAR POR CODIGO
    @Override
    Optional<Arinme1> findById(Arinme1PK arinme1PK);

    @Query("SELECT a FROM Arinme1 a WHERE a.arinme1PK.noCia = :cia")
    Page<Arinme1> buscarCia(@Param("cia") String cia, Pageable pageable);
}
