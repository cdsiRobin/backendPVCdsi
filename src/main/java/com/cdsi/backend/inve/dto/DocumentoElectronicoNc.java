package com.cdsi.backend.inve.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class DocumentoElectronicoNc {
    private String tipoDoc;
    private String noFactu;
    private String fecha;
    private String tipoRefeFactu;
    private String noRefeFactu;
    private String codTped;
    private String estado;
    private String noCliente;
    private String nombreCli;
    private String moticoNc;
    private String moneda;
    private BigDecimal total;
}
