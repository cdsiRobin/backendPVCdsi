package com.cdsi.backend.inve.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEstadoRepo extends JpaRepository<String,String> {
    @Query(nativeQuery = true,value = "SELECT CONTA.F_ESTADO_DOC(:tipDoc,:estado) FROM DUAL")
    public String nombreEstado(@Param("tipDoc") String tipDoc, @Param("estado") String estado);
}
