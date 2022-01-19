package com.cdsi.backend.inve.models.dao;

import com.cdsi.backend.inve.models.ArtsccbPK;
import com.cdsi.backend.inve.models.entity.Artsccb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtsccbRepo extends JpaRepository<Artsccb, ArtsccbPK> {

    //METODO QUE NOS PERMITE SABER SI CAJA PERMITE GENERAR GUIA INTERNAS
    @Query("SELECT a FROM Artsccb a WHERE a.artsccbPK.noCia = :cia AND a.artsccbPK.noCaba = :caja AND a.artsccbPK.tipoCaba = :tipo")
    Artsccb getArtsccbXCiaAndCaja(@Param("cia") String cia, @Param("tipo") String tipo, @Param("caja") String caja);
}
