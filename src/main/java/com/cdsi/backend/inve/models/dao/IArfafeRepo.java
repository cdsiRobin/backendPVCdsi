package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.entity.Arfafe;
import com.cdsi.backend.inve.models.entity.ArfafePK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArfafeRepo extends PagingAndSortingRepository<Arfafe, ArfafePK> {

    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia")
    Page<Arfafe> pageCia(Pageable pageable, @Param("cia") String cia);

    //OBTENER TODAS LAS FACTURAS
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia and a.IND_PVENT = :indPvent")
    Page<Arfafe> buscarCiaAndIndPvent(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent);

    //OBTENER TODAS LAS FACTURAS X Cliente
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia AND a.IND_PVENT = :indPvent AND a.NO_CLIENTE = :cliente")
    Page<Arfafe> buscarCiaAndIndPventAndNoCliente(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent,
                                                  @Param("cliente") String noCliente);

    //OBTENER TODAS LAS FACTURAS - factura en ptovta
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia AND a.IND_PVENT = :indPvent AND a.arfafePK.noFactu = :factu")
    Page<Arfafe> buscarCiaAndIndPventAndNoFactu(Pageable pageable, @Param("cia") String cia, @Param("indPvent") String indPvent,
                                                  @Param("factu") String noFactu);

    //OBTENER FACTURA
    @Query("SELECT a FROM Arfafe a where a.arfafePK.noCia = :cia AND a.arfafePK.tipoDoc = :doc AND a.arfafePK.noFactu = :factu")
    public Arfafe buscarId(@Param("cia") String cia, @Param("doc") String tipoDoc, @Param("factu") String noFactu);


}
