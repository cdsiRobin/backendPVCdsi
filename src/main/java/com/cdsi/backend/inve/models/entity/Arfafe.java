package com.cdsi.backend.inve.models.entity;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
//import java.util.List;

@Entity
@Table(name = "ARFAFE")
public class Arfafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArfafePK arfafePK;

    private String GRUPO;
    private String NO_CLIENTE;
    private String CENTRO;
    private String BODEGA;
    private String FECHA;
    private String TIPO_CLIENTE;
    private String NBR_CLIENTE;
    private String DIRECCION;
    private BigInteger PLAZO;
    private String NO_VENDEDOR;
    private String TIPO_PRECIO;
    private String MONEDA;
    private BigDecimal TIPO_CAMBIO;
    private BigDecimal PORC_DESC;
    private String NO_ORDEN;
    private String NO_ORDEN_DESC;
    private BigDecimal TOT_LIN;
    private BigDecimal DESCUENTO;
    private BigDecimal SUB_TOTAL;
    private BigDecimal IMPUESTO;
    private BigDecimal IMP_ISC;
    private BigDecimal TOTAL;
    private BigDecimal IMPUESTO_DEV;
    private BigDecimal TOTAL_DEV;
    private String OBSERV;
    private String ESTADO;
    private String COD_FPAGO;
    private String IND_ANU_DEV;
    private String DOC_DEVOL;
    private String NO_DEVOL;
    private Date FECHA_SYS;
    private BigDecimal IGV;
    private String TIPO_DOC_ALMA;
    private String NO_REFE_ALMA;
    private String TIPO_REFE_FACTU;
    private String NO_REFE_FACTU;
    private String NO_GUIA;
    private String TIPO;
    private BigDecimal NO_CONTA;
    private BigDecimal COMISION;
    private BigDecimal SALDO_COMISION;
    private String COD_OPER;
    private BigDecimal NO_CUOTAS;
    private BigDecimal GASTO_ND;
    private BigDecimal GASTO_NC;
    private BigDecimal GASTO_FINAN;
    private BigDecimal TEA;
    private BigDecimal GASTOS;
    private BigDecimal NOTAS_DEB;
    private BigDecimal NOTAS_CRE;
    private BigDecimal IMPUESTO_FINAN;
    private BigDecimal GASTO_DE_FLETES;
    private BigDecimal GASTO_DE_SEGUROS;
    private String IND_PER_GRA_CAP;
    private BigInteger FRE_PAGO_DIAS;
    private String TIPO_NOTA;
    private String DIVISION;
    private String NO_PROYECTO;
    private String CIERRE_COM;
    private String CIERRE_PAG;
    private String CODIGO;
    private String TI_DESPACHO;
    private String ZONA;
    private String TIPO_FACT;
    private String UBI_DIR;
    private Date FECHA_ENTREGA;
    private String MOTIVO_TRASLADO;
    private String CUSER;
    private String CODI_ZONA;
    private String RUC;
    private String NO_LIQ;
    private String IND_DOC;
    private String CODI_PROFE;
    private String NO_CLIENTE_TERCE;
    private String ALM_DESTINO;
    private String MOTIVO_NC;
    private String COD_T_PED;
    private String CONCEPTO;
    private BigDecimal SALDO_NETO;
    private String NO_LIQ_OFI;
    private String NRO_LECTURA;
    private String TIPO_ACTIVO;
    private String NO_LIQ_SUC;
    private String COD_CLAS_PED;
    private String TIPO_FPAGO;
    private BigDecimal P_DSCTO_GLOBAL;
    private String ANO_DOC;
    private BigDecimal VALOR_VENTA;
    private BigDecimal M_DSCTO_GLOBAL;
    private Date FECHA_VENCE;
    private String CODI_DEPA;
    private String CODI_PROV;
    private String CODI_DIST;
    private String NO_DOCU;
    private String NOMBRE_DIGI;
    private String DIRECCION_DIGI;
    private String COD_TIENDA;
    private String COD_DIR_ENTREGA;
    private String NO_SOLIC;
    private String TIPO_DOC_CLI;
    private String NUM_DOC_CLI;
    private String MOTIVO_ANULA;
    private String IMPRIME;
    private String ALMACEN_REF;
    private String TIPO_OBSE;
    private String COD_OBSE;
    private String IND_VTA_ANTICIPADA;
    private String COD_SERVICIO;
    private String MOD_VENTA;
    private BigDecimal TOTAL_BRUTO;
    private BigDecimal FLETE;
    private BigDecimal T_DESCUENTO;
    private String TIPO_NCRED;
    private String IND_IGV;
    private String ALIAS;
    private String IND_PVENT;
    private String COD_CAJA;
    private String CAJERA;
    private String TIPO_DOC_EMP;
    private String NUM_DOC_EMP;
    private String SERIE_LIQ;
    private String NUM_LIQ;
    private String TIPO_DOC_LIQ;
    private String IND_NOTA_CRED;
    private String IND_EXPORTACION;
    private String CENTRO_COSTO;
    private String IND_FERIAS;
    private String IND_PROVINCIA;
    private Date FEC_CREA;
    private String USU_CREA;
    private String USU_MODI;
    private Date FEC_MODI;
    private String CONSUMO;
    private BigDecimal REDONDEO;
    private String CONVENIO;
    private BigDecimal SUB_TOTAL1;
    private String NO_CUPON;
    private BigInteger NO_CUPON_CORREL;
    private String CODI_COLE;
    private String CODI_LOCAL;
    private String IND_FACT_TEXTO;
    private String IMP_FACT_DESC;
    private String TIPO_DOC_REF1;
    private String NO_SOLIC1;
    private String IND_GUIA_TEXTO;
    private String FLAG;
    private String EXCL_AUX;
    private String COD_BCARD;
    private BigDecimal IMPUESTO_FLETE;
    private BigDecimal IMPUESTO_GASTOS_ADM;
    private BigDecimal GASTOS_ADMINISTRATIVOS;
    private String ON_LINE;
    private BigDecimal PESO;
    private BigInteger PIEZAS;
    private String DEPARTAMENTO_DEST;
    private String PROVINCIA_DEST;
    private String DISTRITO_DEST;
    private String TELEFONO_DEST;
    private String MARCA1;
    private String NO_VENDEDOR1;
    private String ESTADO1;
    private String NRO_CONVENIO;
    private String MARCA2;
    private String BODEGAPRO;
    private Date VIG_PREC_INICIO;
    private Date VIG_PREC_FIN;
    private String CONT_NETO;
    private String NO_CLIENTE1;
    private String MARCA3;
    private String IND_FMULTIPLE;
    private String IND_NC_FICTA;
    private String TIPO_REFE_FACTU1;
    private String NO_REFE_FACTU1;
    private String CODI_CAMP;
    private String NO_GUIA_PROM;
    private String NO_GUIA_VENTA;
    private String IND_PROMARG;
    private String IND_NC_FICTA1;
    private String NO_GUIA_CONSIG;
    private String MOT_CONTING;
    private BigDecimal OPER_GRATUITAS;
    private BigDecimal OPER_EXONERADAS;
    private BigDecimal OPER_INAFECTAS;
    private BigDecimal OPER_GRAVADAS;
    private String ESTADO_SUNAT;
    private String TIPO_OPERACION;
    private String SUSTENTO;
    private String COD_DETRAC;
    private BigDecimal PORC_DETRAC;
    private BigDecimal VALOR_REF_DETRAC;
    private String NUM_CUENTA_DETRAC;
    private BigDecimal DETRACCION;
    private String MOT_ANU;
    private String EST_RES_CON;
    private String COD_HASH;
    private String COD_BARRA_SUNAT;

    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "TIPO_DOC", referencedColumnName = "TIPO_DOC", insertable = false, updatable = false),
            @JoinColumn(name = "NO_FACTU", referencedColumnName = "NO_FACTU", insertable = false, updatable = false)})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arfafl> arfaflList;

    public Arfafe() {
    }

    public Arfafe(ArfafePK arfafePK) {
        this.arfafePK = arfafePK;
    }

    public Arfafe(String noCia, String tipoDoc, String noFactu) {
        this.arfafePK = new ArfafePK(noCia,tipoDoc,noFactu);
    }

    public ArfafePK getArfafePK() {
        return arfafePK;
    }

    public void setArfafePK(ArfafePK arfafePK) {
        this.arfafePK = arfafePK;
    }

    public String getGRUPO() {
        return GRUPO;
    }

    public void setGRUPO(String GRUPO) {
        this.GRUPO = GRUPO;
    }

    public String getNO_CLIENTE() {
        return NO_CLIENTE;
    }

    public void setNO_CLIENTE(String NO_CLIENTE) {
        this.NO_CLIENTE = NO_CLIENTE;
    }

    public String getCENTRO() {
        return CENTRO;
    }

    public void setCENTRO(String CENTRO) {
        this.CENTRO = CENTRO;
    }

    public String getBODEGA() {
        return BODEGA;
    }

    public void setBODEGA(String BODEGA) {
        this.BODEGA = BODEGA;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getTIPO_CLIENTE() {
        return TIPO_CLIENTE;
    }

    public void setTIPO_CLIENTE(String TIPO_CLIENTE) {
        this.TIPO_CLIENTE = TIPO_CLIENTE;
    }

    public String getNBR_CLIENTE() {
        return NBR_CLIENTE;
    }

    public void setNBR_CLIENTE(String NBR_CLIENTE) {
        this.NBR_CLIENTE = NBR_CLIENTE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public BigInteger getPLAZO() {
        return PLAZO;
    }

    public void setPLAZO(BigInteger PLAZO) {
        this.PLAZO = PLAZO;
    }

    public String getNO_VENDEDOR() {
        return NO_VENDEDOR;
    }

    public void setNO_VENDEDOR(String NO_VENDEDOR) {
        this.NO_VENDEDOR = NO_VENDEDOR;
    }

    public String getTIPO_PRECIO() {
        return TIPO_PRECIO;
    }

    public void setTIPO_PRECIO(String TIPO_PRECIO) {
        this.TIPO_PRECIO = TIPO_PRECIO;
    }

    public String getMONEDA() {
        return MONEDA;
    }

    public void setMONEDA(String MONEDA) {
        this.MONEDA = MONEDA;
    }

    public BigDecimal getTIPO_CAMBIO() {
        return TIPO_CAMBIO;
    }

    public void setTIPO_CAMBIO(BigDecimal TIPO_CAMBIO) {
        this.TIPO_CAMBIO = TIPO_CAMBIO;
    }

    public BigDecimal getPORC_DESC() {
        return PORC_DESC;
    }

    public void setPORC_DESC(BigDecimal PORC_DESC) {
        this.PORC_DESC = PORC_DESC;
    }

    public String getNO_ORDEN() {
        return NO_ORDEN;
    }

    public void setNO_ORDEN(String NO_ORDEN) {
        this.NO_ORDEN = NO_ORDEN;
    }

    public String getNO_ORDEN_DESC() {
        return NO_ORDEN_DESC;
    }

    public void setNO_ORDEN_DESC(String NO_ORDEN_DESC) {
        this.NO_ORDEN_DESC = NO_ORDEN_DESC;
    }

    public BigDecimal getTOT_LIN() {
        return TOT_LIN;
    }

    public void setTOT_LIN(BigDecimal TOT_LIN) {
        this.TOT_LIN = TOT_LIN;
    }

    public BigDecimal getDESCUENTO() {
        return DESCUENTO;
    }

    public void setDESCUENTO(BigDecimal DESCUENTO) {
        this.DESCUENTO = DESCUENTO;
    }

    public BigDecimal getSUB_TOTAL() {
        return SUB_TOTAL;
    }

    public void setSUB_TOTAL(BigDecimal SUB_TOTAL) {
        this.SUB_TOTAL = SUB_TOTAL;
    }

    public BigDecimal getIMPUESTO() {
        return IMPUESTO;
    }

    public void setIMPUESTO(BigDecimal IMPUESTO) {
        this.IMPUESTO = IMPUESTO;
    }

    public BigDecimal getIMP_ISC() {
        return IMP_ISC;
    }

    public void setIMP_ISC(BigDecimal IMP_ISC) {
        this.IMP_ISC = IMP_ISC;
    }

    public BigDecimal getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(BigDecimal TOTAL) {
        this.TOTAL = TOTAL;
    }

    public BigDecimal getIMPUESTO_DEV() {
        return IMPUESTO_DEV;
    }

    public void setIMPUESTO_DEV(BigDecimal IMPUESTO_DEV) {
        this.IMPUESTO_DEV = IMPUESTO_DEV;
    }

    public BigDecimal getTOTAL_DEV() {
        return TOTAL_DEV;
    }

    public void setTOTAL_DEV(BigDecimal TOTAL_DEV) {
        this.TOTAL_DEV = TOTAL_DEV;
    }

    public String getOBSERV() {
        return OBSERV;
    }

    public void setOBSERV(String OBSERV) {
        this.OBSERV = OBSERV;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getCOD_FPAGO() {
        return COD_FPAGO;
    }

    public void setCOD_FPAGO(String COD_FPAGO) {
        this.COD_FPAGO = COD_FPAGO;
    }

    public String getIND_ANU_DEV() {
        return IND_ANU_DEV;
    }

    public void setIND_ANU_DEV(String IND_ANU_DEV) {
        this.IND_ANU_DEV = IND_ANU_DEV;
    }

    public String getDOC_DEVOL() {
        return DOC_DEVOL;
    }

    public void setDOC_DEVOL(String DOC_DEVOL) {
        this.DOC_DEVOL = DOC_DEVOL;
    }

    public String getNO_DEVOL() {
        return NO_DEVOL;
    }

    public void setNO_DEVOL(String NO_DEVOL) {
        this.NO_DEVOL = NO_DEVOL;
    }

    public Date getFECHA_SYS() {
        return FECHA_SYS;
    }

    public void setFECHA_SYS(Date FECHA_SYS) {
        this.FECHA_SYS = FECHA_SYS;
    }

    public BigDecimal getIGV() {
        return IGV;
    }

    public void setIGV(BigDecimal IGV) {
        this.IGV = IGV;
    }

    public String getTIPO_DOC_ALMA() {
        return TIPO_DOC_ALMA;
    }

    public void setTIPO_DOC_ALMA(String TIPO_DOC_ALMA) {
        this.TIPO_DOC_ALMA = TIPO_DOC_ALMA;
    }

    public String getNO_REFE_ALMA() {
        return NO_REFE_ALMA;
    }

    public void setNO_REFE_ALMA(String NO_REFE_ALMA) {
        this.NO_REFE_ALMA = NO_REFE_ALMA;
    }

    public String getTIPO_REFE_FACTU() {
        return TIPO_REFE_FACTU;
    }

    public void setTIPO_REFE_FACTU(String TIPO_REFE_FACTU) {
        this.TIPO_REFE_FACTU = TIPO_REFE_FACTU;
    }

    public String getNO_REFE_FACTU() {
        return NO_REFE_FACTU;
    }

    public void setNO_REFE_FACTU(String NO_REFE_FACTU) {
        this.NO_REFE_FACTU = NO_REFE_FACTU;
    }

    public String getNO_GUIA() {
        return NO_GUIA;
    }

    public void setNO_GUIA(String NO_GUIA) {
        this.NO_GUIA = NO_GUIA;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public BigDecimal getNO_CONTA() {
        return NO_CONTA;
    }

    public void setNO_CONTA(BigDecimal NO_CONTA) {
        this.NO_CONTA = NO_CONTA;
    }

    public BigDecimal getCOMISION() {
        return COMISION;
    }

    public void setCOMISION(BigDecimal COMISION) {
        this.COMISION = COMISION;
    }

    public BigDecimal getSALDO_COMISION() {
        return SALDO_COMISION;
    }

    public void setSALDO_COMISION(BigDecimal SALDO_COMISION) {
        this.SALDO_COMISION = SALDO_COMISION;
    }

    public String getCOD_OPER() {
        return COD_OPER;
    }

    public void setCOD_OPER(String COD_OPER) {
        this.COD_OPER = COD_OPER;
    }

    public BigDecimal getNO_CUOTAS() {
        return NO_CUOTAS;
    }

    public void setNO_CUOTAS(BigDecimal NO_CUOTAS) {
        this.NO_CUOTAS = NO_CUOTAS;
    }

    public BigDecimal getGASTO_ND() {
        return GASTO_ND;
    }

    public void setGASTO_ND(BigDecimal GASTO_ND) {
        this.GASTO_ND = GASTO_ND;
    }

    public BigDecimal getGASTO_NC() {
        return GASTO_NC;
    }

    public void setGASTO_NC(BigDecimal GASTO_NC) {
        this.GASTO_NC = GASTO_NC;
    }

    public BigDecimal getGASTO_FINAN() {
        return GASTO_FINAN;
    }

    public void setGASTO_FINAN(BigDecimal GASTO_FINAN) {
        this.GASTO_FINAN = GASTO_FINAN;
    }

    public BigDecimal getTEA() {
        return TEA;
    }

    public void setTEA(BigDecimal TEA) {
        this.TEA = TEA;
    }

    public BigDecimal getGASTOS() {
        return GASTOS;
    }

    public void setGASTOS(BigDecimal GASTOS) {
        this.GASTOS = GASTOS;
    }

    public BigDecimal getNOTAS_DEB() {
        return NOTAS_DEB;
    }

    public void setNOTAS_DEB(BigDecimal NOTAS_DEB) {
        this.NOTAS_DEB = NOTAS_DEB;
    }

    public BigDecimal getNOTAS_CRE() {
        return NOTAS_CRE;
    }

    public void setNOTAS_CRE(BigDecimal NOTAS_CRE) {
        this.NOTAS_CRE = NOTAS_CRE;
    }

    public BigDecimal getIMPUESTO_FINAN() {
        return IMPUESTO_FINAN;
    }

    public void setIMPUESTO_FINAN(BigDecimal IMPUESTO_FINAN) {
        this.IMPUESTO_FINAN = IMPUESTO_FINAN;
    }

    public BigDecimal getGASTO_DE_FLETES() {
        return GASTO_DE_FLETES;
    }

    public void setGASTO_DE_FLETES(BigDecimal GASTO_DE_FLETES) {
        this.GASTO_DE_FLETES = GASTO_DE_FLETES;
    }

    public BigDecimal getGASTO_DE_SEGUROS() {
        return GASTO_DE_SEGUROS;
    }

    public void setGASTO_DE_SEGUROS(BigDecimal GASTO_DE_SEGUROS) {
        this.GASTO_DE_SEGUROS = GASTO_DE_SEGUROS;
    }

    public String getIND_PER_GRA_CAP() {
        return IND_PER_GRA_CAP;
    }

    public void setIND_PER_GRA_CAP(String IND_PER_GRA_CAP) {
        this.IND_PER_GRA_CAP = IND_PER_GRA_CAP;
    }

    public BigInteger getFRE_PAGO_DIAS() {
        return FRE_PAGO_DIAS;
    }

    public void setFRE_PAGO_DIAS(BigInteger FRE_PAGO_DIAS) {
        this.FRE_PAGO_DIAS = FRE_PAGO_DIAS;
    }

    public String getTIPO_NOTA() {
        return TIPO_NOTA;
    }

    public void setTIPO_NOTA(String TIPO_NOTA) {
        this.TIPO_NOTA = TIPO_NOTA;
    }

    public String getDIVISION() {
        return DIVISION;
    }

    public void setDIVISION(String DIVISION) {
        this.DIVISION = DIVISION;
    }

    public String getNO_PROYECTO() {
        return NO_PROYECTO;
    }

    public void setNO_PROYECTO(String NO_PROYECTO) {
        this.NO_PROYECTO = NO_PROYECTO;
    }

    public String getCIERRE_COM() {
        return CIERRE_COM;
    }

    public void setCIERRE_COM(String CIERRE_COM) {
        this.CIERRE_COM = CIERRE_COM;
    }

    public String getCIERRE_PAG() {
        return CIERRE_PAG;
    }

    public void setCIERRE_PAG(String CIERRE_PAG) {
        this.CIERRE_PAG = CIERRE_PAG;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getTI_DESPACHO() {
        return TI_DESPACHO;
    }

    public void setTI_DESPACHO(String TI_DESPACHO) {
        this.TI_DESPACHO = TI_DESPACHO;
    }

    public String getZONA() {
        return ZONA;
    }

    public void setZONA(String ZONA) {
        this.ZONA = ZONA;
    }

    public String getTIPO_FACT() {
        return TIPO_FACT;
    }

    public void setTIPO_FACT(String TIPO_FACT) {
        this.TIPO_FACT = TIPO_FACT;
    }

    public String getUBI_DIR() {
        return UBI_DIR;
    }

    public void setUBI_DIR(String UBI_DIR) {
        this.UBI_DIR = UBI_DIR;
    }

    public Date getFECHA_ENTREGA() {
        return FECHA_ENTREGA;
    }

    public void setFECHA_ENTREGA(Date FECHA_ENTREGA) {
        this.FECHA_ENTREGA = FECHA_ENTREGA;
    }

    public String getMOTIVO_TRASLADO() {
        return MOTIVO_TRASLADO;
    }

    public void setMOTIVO_TRASLADO(String MOTIVO_TRASLADO) {
        this.MOTIVO_TRASLADO = MOTIVO_TRASLADO;
    }

    public String getCUSER() {
        return CUSER;
    }

    public void setCUSER(String CUSER) {
        this.CUSER = CUSER;
    }

    public String getCODI_ZONA() {
        return CODI_ZONA;
    }

    public void setCODI_ZONA(String CODI_ZONA) {
        this.CODI_ZONA = CODI_ZONA;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNO_LIQ() {
        return NO_LIQ;
    }

    public void setNO_LIQ(String NO_LIQ) {
        this.NO_LIQ = NO_LIQ;
    }

    public String getIND_DOC() {
        return IND_DOC;
    }

    public void setIND_DOC(String IND_DOC) {
        this.IND_DOC = IND_DOC;
    }

    public String getCODI_PROFE() {
        return CODI_PROFE;
    }

    public void setCODI_PROFE(String CODI_PROFE) {
        this.CODI_PROFE = CODI_PROFE;
    }

    public String getNO_CLIENTE_TERCE() {
        return NO_CLIENTE_TERCE;
    }

    public void setNO_CLIENTE_TERCE(String NO_CLIENTE_TERCE) {
        this.NO_CLIENTE_TERCE = NO_CLIENTE_TERCE;
    }

    public String getALM_DESTINO() {
        return ALM_DESTINO;
    }

    public void setALM_DESTINO(String ALM_DESTINO) {
        this.ALM_DESTINO = ALM_DESTINO;
    }

    public String getMOTIVO_NC() {
        return MOTIVO_NC;
    }

    public void setMOTIVO_NC(String MOTIVO_NC) {
        this.MOTIVO_NC = MOTIVO_NC;
    }

    public String getCOD_T_PED() {
        return COD_T_PED;
    }

    public void setCOD_T_PED(String COD_T_PED) {
        this.COD_T_PED = COD_T_PED;
    }

    public String getCONCEPTO() {
        return CONCEPTO;
    }

    public void setCONCEPTO(String CONCEPTO) {
        this.CONCEPTO = CONCEPTO;
    }

    public BigDecimal getSALDO_NETO() {
        return SALDO_NETO;
    }

    public void setSALDO_NETO(BigDecimal SALDO_NETO) {
        this.SALDO_NETO = SALDO_NETO;
    }

    public String getNO_LIQ_OFI() {
        return NO_LIQ_OFI;
    }

    public void setNO_LIQ_OFI(String NO_LIQ_OFI) {
        this.NO_LIQ_OFI = NO_LIQ_OFI;
    }

    public String getNRO_LECTURA() {
        return NRO_LECTURA;
    }

    public void setNRO_LECTURA(String NRO_LECTURA) {
        this.NRO_LECTURA = NRO_LECTURA;
    }

    public String getTIPO_ACTIVO() {
        return TIPO_ACTIVO;
    }

    public void setTIPO_ACTIVO(String TIPO_ACTIVO) {
        this.TIPO_ACTIVO = TIPO_ACTIVO;
    }

    public String getNO_LIQ_SUC() {
        return NO_LIQ_SUC;
    }

    public void setNO_LIQ_SUC(String NO_LIQ_SUC) {
        this.NO_LIQ_SUC = NO_LIQ_SUC;
    }

    public String getCOD_CLAS_PED() {
        return COD_CLAS_PED;
    }

    public void setCOD_CLAS_PED(String COD_CLAS_PED) {
        this.COD_CLAS_PED = COD_CLAS_PED;
    }

    public String getTIPO_FPAGO() {
        return TIPO_FPAGO;
    }

    public void setTIPO_FPAGO(String TIPO_FPAGO) {
        this.TIPO_FPAGO = TIPO_FPAGO;
    }

    public BigDecimal getP_DSCTO_GLOBAL() {
        return P_DSCTO_GLOBAL;
    }

    public void setP_DSCTO_GLOBAL(BigDecimal p_DSCTO_GLOBAL) {
        P_DSCTO_GLOBAL = p_DSCTO_GLOBAL;
    }

    public String getANO_DOC() {
        return ANO_DOC;
    }

    public void setANO_DOC(String ANO_DOC) {
        this.ANO_DOC = ANO_DOC;
    }

    public BigDecimal getVALOR_VENTA() {
        return VALOR_VENTA;
    }

    public void setVALOR_VENTA(BigDecimal VALOR_VENTA) {
        this.VALOR_VENTA = VALOR_VENTA;
    }

    public BigDecimal getM_DSCTO_GLOBAL() {
        return M_DSCTO_GLOBAL;
    }

    public void setM_DSCTO_GLOBAL(BigDecimal m_DSCTO_GLOBAL) {
        M_DSCTO_GLOBAL = m_DSCTO_GLOBAL;
    }

    public Date getFECHA_VENCE() {
        return FECHA_VENCE;
    }

    public void setFECHA_VENCE(Date FECHA_VENCE) {
        this.FECHA_VENCE = FECHA_VENCE;
    }

    public String getCODI_DEPA() {
        return CODI_DEPA;
    }

    public void setCODI_DEPA(String CODI_DEPA) {
        this.CODI_DEPA = CODI_DEPA;
    }

    public String getCODI_PROV() {
        return CODI_PROV;
    }

    public void setCODI_PROV(String CODI_PROV) {
        this.CODI_PROV = CODI_PROV;
    }

    public String getCODI_DIST() {
        return CODI_DIST;
    }

    public void setCODI_DIST(String CODI_DIST) {
        this.CODI_DIST = CODI_DIST;
    }

    public String getNO_DOCU() {
        return NO_DOCU;
    }

    public void setNO_DOCU(String NO_DOCU) {
        this.NO_DOCU = NO_DOCU;
    }

    public String getNOMBRE_DIGI() {
        return NOMBRE_DIGI;
    }

    public void setNOMBRE_DIGI(String NOMBRE_DIGI) {
        this.NOMBRE_DIGI = NOMBRE_DIGI;
    }

    public String getDIRECCION_DIGI() {
        return DIRECCION_DIGI;
    }

    public void setDIRECCION_DIGI(String DIRECCION_DIGI) {
        this.DIRECCION_DIGI = DIRECCION_DIGI;
    }

    public String getCOD_TIENDA() {
        return COD_TIENDA;
    }

    public void setCOD_TIENDA(String COD_TIENDA) {
        this.COD_TIENDA = COD_TIENDA;
    }

    public String getCOD_DIR_ENTREGA() {
        return COD_DIR_ENTREGA;
    }

    public void setCOD_DIR_ENTREGA(String COD_DIR_ENTREGA) {
        this.COD_DIR_ENTREGA = COD_DIR_ENTREGA;
    }

    public String getNO_SOLIC() {
        return NO_SOLIC;
    }

    public void setNO_SOLIC(String NO_SOLIC) {
        this.NO_SOLIC = NO_SOLIC;
    }

    public String getTIPO_DOC_CLI() {
        return TIPO_DOC_CLI;
    }

    public void setTIPO_DOC_CLI(String TIPO_DOC_CLI) {
        this.TIPO_DOC_CLI = TIPO_DOC_CLI;
    }

    public String getNUM_DOC_CLI() {
        return NUM_DOC_CLI;
    }

    public void setNUM_DOC_CLI(String NUM_DOC_CLI) {
        this.NUM_DOC_CLI = NUM_DOC_CLI;
    }

    public String getMOTIVO_ANULA() {
        return MOTIVO_ANULA;
    }

    public void setMOTIVO_ANULA(String MOTIVO_ANULA) {
        this.MOTIVO_ANULA = MOTIVO_ANULA;
    }

    public String getIMPRIME() {
        return IMPRIME;
    }

    public void setIMPRIME(String IMPRIME) {
        this.IMPRIME = IMPRIME;
    }

    public String getALMACEN_REF() {
        return ALMACEN_REF;
    }

    public void setALMACEN_REF(String ALMACEN_REF) {
        this.ALMACEN_REF = ALMACEN_REF;
    }

    public String getTIPO_OBSE() {
        return TIPO_OBSE;
    }

    public void setTIPO_OBSE(String TIPO_OBSE) {
        this.TIPO_OBSE = TIPO_OBSE;
    }

    public String getCOD_OBSE() {
        return COD_OBSE;
    }

    public void setCOD_OBSE(String COD_OBSE) {
        this.COD_OBSE = COD_OBSE;
    }

    public String getIND_VTA_ANTICIPADA() {
        return IND_VTA_ANTICIPADA;
    }

    public void setIND_VTA_ANTICIPADA(String IND_VTA_ANTICIPADA) {
        this.IND_VTA_ANTICIPADA = IND_VTA_ANTICIPADA;
    }

    public String getCOD_SERVICIO() {
        return COD_SERVICIO;
    }

    public void setCOD_SERVICIO(String COD_SERVICIO) {
        this.COD_SERVICIO = COD_SERVICIO;
    }

    public String getMOD_VENTA() {
        return MOD_VENTA;
    }

    public void setMOD_VENTA(String MOD_VENTA) {
        this.MOD_VENTA = MOD_VENTA;
    }

    public BigDecimal getTOTAL_BRUTO() {
        return TOTAL_BRUTO;
    }

    public void setTOTAL_BRUTO(BigDecimal TOTAL_BRUTO) {
        this.TOTAL_BRUTO = TOTAL_BRUTO;
    }

    public BigDecimal getFLETE() {
        return FLETE;
    }

    public void setFLETE(BigDecimal FLETE) {
        this.FLETE = FLETE;
    }

    public BigDecimal getT_DESCUENTO() {
        return T_DESCUENTO;
    }

    public void setT_DESCUENTO(BigDecimal t_DESCUENTO) {
        T_DESCUENTO = t_DESCUENTO;
    }

    public String getTIPO_NCRED() {
        return TIPO_NCRED;
    }

    public void setTIPO_NCRED(String TIPO_NCRED) {
        this.TIPO_NCRED = TIPO_NCRED;
    }

    public String getIND_IGV() {
        return IND_IGV;
    }

    public void setIND_IGV(String IND_IGV) {
        this.IND_IGV = IND_IGV;
    }

    public String getALIAS() {
        return ALIAS;
    }

    public void setALIAS(String ALIAS) {
        this.ALIAS = ALIAS;
    }

    public String getIND_PVENT() {
        return IND_PVENT;
    }

    public void setIND_PVENT(String IND_PVENT) {
        this.IND_PVENT = IND_PVENT;
    }

    public String getCOD_CAJA() {
        return COD_CAJA;
    }

    public void setCOD_CAJA(String COD_CAJA) {
        this.COD_CAJA = COD_CAJA;
    }

    public String getCAJERA() {
        return CAJERA;
    }

    public void setCAJERA(String CAJERA) {
        this.CAJERA = CAJERA;
    }

    public String getTIPO_DOC_EMP() {
        return TIPO_DOC_EMP;
    }

    public void setTIPO_DOC_EMP(String TIPO_DOC_EMP) {
        this.TIPO_DOC_EMP = TIPO_DOC_EMP;
    }

    public String getNUM_DOC_EMP() {
        return NUM_DOC_EMP;
    }

    public void setNUM_DOC_EMP(String NUM_DOC_EMP) {
        this.NUM_DOC_EMP = NUM_DOC_EMP;
    }

    public String getSERIE_LIQ() {
        return SERIE_LIQ;
    }

    public void setSERIE_LIQ(String SERIE_LIQ) {
        this.SERIE_LIQ = SERIE_LIQ;
    }

    public String getNUM_LIQ() {
        return NUM_LIQ;
    }

    public void setNUM_LIQ(String NUM_LIQ) {
        this.NUM_LIQ = NUM_LIQ;
    }

    public String getTIPO_DOC_LIQ() {
        return TIPO_DOC_LIQ;
    }

    public void setTIPO_DOC_LIQ(String TIPO_DOC_LIQ) {
        this.TIPO_DOC_LIQ = TIPO_DOC_LIQ;
    }

    public String getIND_NOTA_CRED() {
        return IND_NOTA_CRED;
    }

    public void setIND_NOTA_CRED(String IND_NOTA_CRED) {
        this.IND_NOTA_CRED = IND_NOTA_CRED;
    }

    public String getIND_EXPORTACION() {
        return IND_EXPORTACION;
    }

    public void setIND_EXPORTACION(String IND_EXPORTACION) {
        this.IND_EXPORTACION = IND_EXPORTACION;
    }

    public String getCENTRO_COSTO() {
        return CENTRO_COSTO;
    }

    public void setCENTRO_COSTO(String CENTRO_COSTO) {
        this.CENTRO_COSTO = CENTRO_COSTO;
    }

    public String getIND_FERIAS() {
        return IND_FERIAS;
    }

    public void setIND_FERIAS(String IND_FERIAS) {
        this.IND_FERIAS = IND_FERIAS;
    }

    public String getIND_PROVINCIA() {
        return IND_PROVINCIA;
    }

    public void setIND_PROVINCIA(String IND_PROVINCIA) {
        this.IND_PROVINCIA = IND_PROVINCIA;
    }

    public Date getFEC_CREA() {
        return FEC_CREA;
    }

    public void setFEC_CREA(Date FEC_CREA) {
        this.FEC_CREA = FEC_CREA;
    }

    public String getUSU_CREA() {
        return USU_CREA;
    }

    public void setUSU_CREA(String USU_CREA) {
        this.USU_CREA = USU_CREA;
    }

    public String getUSU_MODI() {
        return USU_MODI;
    }

    public void setUSU_MODI(String USU_MODI) {
        this.USU_MODI = USU_MODI;
    }

    public Date getFEC_MODI() {
        return FEC_MODI;
    }

    public void setFEC_MODI(Date FEC_MODI) {
        this.FEC_MODI = FEC_MODI;
    }

    public String getCONSUMO() {
        return CONSUMO;
    }

    public void setCONSUMO(String CONSUMO) {
        this.CONSUMO = CONSUMO;
    }

    public BigDecimal getREDONDEO() {
        return REDONDEO;
    }

    public void setREDONDEO(BigDecimal REDONDEO) {
        this.REDONDEO = REDONDEO;
    }

    public String getCONVENIO() {
        return CONVENIO;
    }

    public void setCONVENIO(String CONVENIO) {
        this.CONVENIO = CONVENIO;
    }

    public BigDecimal getSUB_TOTAL1() {
        return SUB_TOTAL1;
    }

    public void setSUB_TOTAL1(BigDecimal SUB_TOTAL1) {
        this.SUB_TOTAL1 = SUB_TOTAL1;
    }

    public String getNO_CUPON() {
        return NO_CUPON;
    }

    public void setNO_CUPON(String NO_CUPON) {
        this.NO_CUPON = NO_CUPON;
    }

    public BigInteger getNO_CUPON_CORREL() {
        return NO_CUPON_CORREL;
    }

    public void setNO_CUPON_CORREL(BigInteger NO_CUPON_CORREL) {
        this.NO_CUPON_CORREL = NO_CUPON_CORREL;
    }

    public String getCODI_COLE() {
        return CODI_COLE;
    }

    public void setCODI_COLE(String CODI_COLE) {
        this.CODI_COLE = CODI_COLE;
    }

    public String getCODI_LOCAL() {
        return CODI_LOCAL;
    }

    public void setCODI_LOCAL(String CODI_LOCAL) {
        this.CODI_LOCAL = CODI_LOCAL;
    }

    public String getIND_FACT_TEXTO() {
        return IND_FACT_TEXTO;
    }

    public void setIND_FACT_TEXTO(String IND_FACT_TEXTO) {
        this.IND_FACT_TEXTO = IND_FACT_TEXTO;
    }

    public String getIMP_FACT_DESC() {
        return IMP_FACT_DESC;
    }

    public void setIMP_FACT_DESC(String IMP_FACT_DESC) {
        this.IMP_FACT_DESC = IMP_FACT_DESC;
    }

    public String getTIPO_DOC_REF1() {
        return TIPO_DOC_REF1;
    }

    public void setTIPO_DOC_REF1(String TIPO_DOC_REF1) {
        this.TIPO_DOC_REF1 = TIPO_DOC_REF1;
    }

    public String getNO_SOLIC1() {
        return NO_SOLIC1;
    }

    public void setNO_SOLIC1(String NO_SOLIC1) {
        this.NO_SOLIC1 = NO_SOLIC1;
    }

    public String getIND_GUIA_TEXTO() {
        return IND_GUIA_TEXTO;
    }

    public void setIND_GUIA_TEXTO(String IND_GUIA_TEXTO) {
        this.IND_GUIA_TEXTO = IND_GUIA_TEXTO;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public String getEXCL_AUX() {
        return EXCL_AUX;
    }

    public void setEXCL_AUX(String EXCL_AUX) {
        this.EXCL_AUX = EXCL_AUX;
    }

    public String getCOD_BCARD() {
        return COD_BCARD;
    }

    public void setCOD_BCARD(String COD_BCARD) {
        this.COD_BCARD = COD_BCARD;
    }

    public BigDecimal getIMPUESTO_FLETE() {
        return IMPUESTO_FLETE;
    }

    public void setIMPUESTO_FLETE(BigDecimal IMPUESTO_FLETE) {
        this.IMPUESTO_FLETE = IMPUESTO_FLETE;
    }

    public BigDecimal getIMPUESTO_GASTOS_ADM() {
        return IMPUESTO_GASTOS_ADM;
    }

    public void setIMPUESTO_GASTOS_ADM(BigDecimal IMPUESTO_GASTOS_ADM) {
        this.IMPUESTO_GASTOS_ADM = IMPUESTO_GASTOS_ADM;
    }

    public BigDecimal getGASTOS_ADMINISTRATIVOS() {
        return GASTOS_ADMINISTRATIVOS;
    }

    public void setGASTOS_ADMINISTRATIVOS(BigDecimal GASTOS_ADMINISTRATIVOS) {
        this.GASTOS_ADMINISTRATIVOS = GASTOS_ADMINISTRATIVOS;
    }

    public String getON_LINE() {
        return ON_LINE;
    }

    public void setON_LINE(String ON_LINE) {
        this.ON_LINE = ON_LINE;
    }

    public BigDecimal getPESO() {
        return PESO;
    }

    public void setPESO(BigDecimal PESO) {
        this.PESO = PESO;
    }

    public BigInteger getPIEZAS() {
        return PIEZAS;
    }

    public void setPIEZAS(BigInteger PIEZAS) {
        this.PIEZAS = PIEZAS;
    }

    public String getDEPARTAMENTO_DEST() {
        return DEPARTAMENTO_DEST;
    }

    public void setDEPARTAMENTO_DEST(String DEPARTAMENTO_DEST) {
        this.DEPARTAMENTO_DEST = DEPARTAMENTO_DEST;
    }

    public String getPROVINCIA_DEST() {
        return PROVINCIA_DEST;
    }

    public void setPROVINCIA_DEST(String PROVINCIA_DEST) {
        this.PROVINCIA_DEST = PROVINCIA_DEST;
    }

    public String getDISTRITO_DEST() {
        return DISTRITO_DEST;
    }

    public void setDISTRITO_DEST(String DISTRITO_DEST) {
        this.DISTRITO_DEST = DISTRITO_DEST;
    }

    public String getTELEFONO_DEST() {
        return TELEFONO_DEST;
    }

    public void setTELEFONO_DEST(String TELEFONO_DEST) {
        this.TELEFONO_DEST = TELEFONO_DEST;
    }

    public String getMARCA1() {
        return MARCA1;
    }

    public void setMARCA1(String MARCA1) {
        this.MARCA1 = MARCA1;
    }

    public String getNO_VENDEDOR1() {
        return NO_VENDEDOR1;
    }

    public void setNO_VENDEDOR1(String NO_VENDEDOR1) {
        this.NO_VENDEDOR1 = NO_VENDEDOR1;
    }

    public String getESTADO1() {
        return ESTADO1;
    }

    public void setESTADO1(String ESTADO1) {
        this.ESTADO1 = ESTADO1;
    }

    public String getNRO_CONVENIO() {
        return NRO_CONVENIO;
    }

    public void setNRO_CONVENIO(String NRO_CONVENIO) {
        this.NRO_CONVENIO = NRO_CONVENIO;
    }

    public String getMARCA2() {
        return MARCA2;
    }

    public void setMARCA2(String MARCA2) {
        this.MARCA2 = MARCA2;
    }

    public String getBODEGAPRO() {
        return BODEGAPRO;
    }

    public void setBODEGAPRO(String BODEGAPRO) {
        this.BODEGAPRO = BODEGAPRO;
    }

    public Date getVIG_PREC_INICIO() {
        return VIG_PREC_INICIO;
    }

    public void setVIG_PREC_INICIO(Date VIG_PREC_INICIO) {
        this.VIG_PREC_INICIO = VIG_PREC_INICIO;
    }

    public Date getVIG_PREC_FIN() {
        return VIG_PREC_FIN;
    }

    public void setVIG_PREC_FIN(Date VIG_PREC_FIN) {
        this.VIG_PREC_FIN = VIG_PREC_FIN;
    }

    public String getCONT_NETO() {
        return CONT_NETO;
    }

    public void setCONT_NETO(String CONT_NETO) {
        this.CONT_NETO = CONT_NETO;
    }

    public String getNO_CLIENTE1() {
        return NO_CLIENTE1;
    }

    public void setNO_CLIENTE1(String NO_CLIENTE1) {
        this.NO_CLIENTE1 = NO_CLIENTE1;
    }

    public String getMARCA3() {
        return MARCA3;
    }

    public void setMARCA3(String MARCA3) {
        this.MARCA3 = MARCA3;
    }

    public String getIND_FMULTIPLE() {
        return IND_FMULTIPLE;
    }

    public void setIND_FMULTIPLE(String IND_FMULTIPLE) {
        this.IND_FMULTIPLE = IND_FMULTIPLE;
    }

    public String getIND_NC_FICTA() {
        return IND_NC_FICTA;
    }

    public void setIND_NC_FICTA(String IND_NC_FICTA) {
        this.IND_NC_FICTA = IND_NC_FICTA;
    }

    public String getTIPO_REFE_FACTU1() {
        return TIPO_REFE_FACTU1;
    }

    public void setTIPO_REFE_FACTU1(String TIPO_REFE_FACTU1) {
        this.TIPO_REFE_FACTU1 = TIPO_REFE_FACTU1;
    }

    public String getNO_REFE_FACTU1() {
        return NO_REFE_FACTU1;
    }

    public void setNO_REFE_FACTU1(String NO_REFE_FACTU1) {
        this.NO_REFE_FACTU1 = NO_REFE_FACTU1;
    }

    public String getCODI_CAMP() {
        return CODI_CAMP;
    }

    public void setCODI_CAMP(String CODI_CAMP) {
        this.CODI_CAMP = CODI_CAMP;
    }

    public String getNO_GUIA_PROM() {
        return NO_GUIA_PROM;
    }

    public void setNO_GUIA_PROM(String NO_GUIA_PROM) {
        this.NO_GUIA_PROM = NO_GUIA_PROM;
    }

    public String getNO_GUIA_VENTA() {
        return NO_GUIA_VENTA;
    }

    public void setNO_GUIA_VENTA(String NO_GUIA_VENTA) {
        this.NO_GUIA_VENTA = NO_GUIA_VENTA;
    }

    public String getIND_PROMARG() {
        return IND_PROMARG;
    }

    public void setIND_PROMARG(String IND_PROMARG) {
        this.IND_PROMARG = IND_PROMARG;
    }

    public String getIND_NC_FICTA1() {
        return IND_NC_FICTA1;
    }

    public void setIND_NC_FICTA1(String IND_NC_FICTA1) {
        this.IND_NC_FICTA1 = IND_NC_FICTA1;
    }

    public String getNO_GUIA_CONSIG() {
        return NO_GUIA_CONSIG;
    }

    public void setNO_GUIA_CONSIG(String NO_GUIA_CONSIG) {
        this.NO_GUIA_CONSIG = NO_GUIA_CONSIG;
    }

    public String getMOT_CONTING() {
        return MOT_CONTING;
    }

    public void setMOT_CONTING(String MOT_CONTING) {
        this.MOT_CONTING = MOT_CONTING;
    }

    public BigDecimal getOPER_GRATUITAS() {
        return OPER_GRATUITAS;
    }

    public void setOPER_GRATUITAS(BigDecimal OPER_GRATUITAS) {
        this.OPER_GRATUITAS = OPER_GRATUITAS;
    }

    public BigDecimal getOPER_EXONERADAS() {
        return OPER_EXONERADAS;
    }

    public void setOPER_EXONERADAS(BigDecimal OPER_EXONERADAS) {
        this.OPER_EXONERADAS = OPER_EXONERADAS;
    }

    public BigDecimal getOPER_INAFECTAS() {
        return OPER_INAFECTAS;
    }

    public void setOPER_INAFECTAS(BigDecimal OPER_INAFECTAS) {
        this.OPER_INAFECTAS = OPER_INAFECTAS;
    }

    public BigDecimal getOPER_GRAVADAS() {
        return OPER_GRAVADAS;
    }

    public void setOPER_GRAVADAS(BigDecimal OPER_GRAVADAS) {
        this.OPER_GRAVADAS = OPER_GRAVADAS;
    }

    public String getESTADO_SUNAT() {
        return ESTADO_SUNAT;
    }

    public void setESTADO_SUNAT(String ESTADO_SUNAT) {
        this.ESTADO_SUNAT = ESTADO_SUNAT;
    }

    public String getTIPO_OPERACION() {
        return TIPO_OPERACION;
    }

    public void setTIPO_OPERACION(String TIPO_OPERACION) {
        this.TIPO_OPERACION = TIPO_OPERACION;
    }

    public String getSUSTENTO() {
        return SUSTENTO;
    }

    public void setSUSTENTO(String SUSTENTO) {
        this.SUSTENTO = SUSTENTO;
    }

    public String getCOD_DETRAC() {
        return COD_DETRAC;
    }

    public void setCOD_DETRAC(String COD_DETRAC) {
        this.COD_DETRAC = COD_DETRAC;
    }

    public BigDecimal getPORC_DETRAC() {
        return PORC_DETRAC;
    }

    public void setPORC_DETRAC(BigDecimal PORC_DETRAC) {
        this.PORC_DETRAC = PORC_DETRAC;
    }

    public BigDecimal getVALOR_REF_DETRAC() {
        return VALOR_REF_DETRAC;
    }

    public void setVALOR_REF_DETRAC(BigDecimal VALOR_REF_DETRAC) {
        this.VALOR_REF_DETRAC = VALOR_REF_DETRAC;
    }

    public String getNUM_CUENTA_DETRAC() {
        return NUM_CUENTA_DETRAC;
    }

    public void setNUM_CUENTA_DETRAC(String NUM_CUENTA_DETRAC) {
        this.NUM_CUENTA_DETRAC = NUM_CUENTA_DETRAC;
    }

    public BigDecimal getDETRACCION() {
        return DETRACCION;
    }

    public void setDETRACCION(BigDecimal DETRACCION) {
        this.DETRACCION = DETRACCION;
    }

    public String getMOT_ANU() {
        return MOT_ANU;
    }

    public void setMOT_ANU(String MOT_ANU) {
        this.MOT_ANU = MOT_ANU;
    }

    public String getEST_RES_CON() {
        return EST_RES_CON;
    }

    public void setEST_RES_CON(String EST_RES_CON) {
        this.EST_RES_CON = EST_RES_CON;
    }

    public String getCOD_HASH() {
        return COD_HASH;
    }

    public void setCOD_HASH(String COD_HASH) {
        this.COD_HASH = COD_HASH;
    }

    public String getCOD_BARRA_SUNAT() {
        return COD_BARRA_SUNAT;
    }

    public void setCOD_BARRA_SUNAT(String COD_BARRA_SUNAT) {
        this.COD_BARRA_SUNAT = COD_BARRA_SUNAT;
    }

    public List<Arfafl> getArfaflList() {
        return arfaflList;
    }

    public void setArfaflList(List<Arfafl> arfaflList) {
        this.arfaflList = arfaflList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arfafePK != null ? arfafePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfafe)) {
            return false;
        }
        Arfafe other = (Arfafe) object;
        if ((this.arfafePK == null && other.arfafePK != null) || (this.arfafePK != null && !this.arfafePK.equals(other.arfafePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Arfafe{" +
                "arfafePK=" + arfafePK +
                '}';
    }
}
