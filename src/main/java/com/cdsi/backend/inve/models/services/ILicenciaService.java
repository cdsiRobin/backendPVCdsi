package com.cdsi.backend.inve.models.services;

import com.cdsi.backend.inve.models.entity.Licencia;

public interface ILicenciaService {
   public Licencia buscarId(String cia, String ruc);
   public Licencia buscarCia(String cia);
}
