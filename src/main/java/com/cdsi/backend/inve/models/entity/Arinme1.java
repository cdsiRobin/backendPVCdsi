package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ARINME1")
public class Arinme1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Arinme1PK arinme1PK;
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "NO_PROVE")
    private String noProve;
    @Column(name = "NO_ORDEN")
    private String noOrden;
    @Column(name = "NO_GUIA")
    private String noGuia;
    @Column(name = "TIPO_DOC_REM")
    private String tipoDocRem;
    @Column(name = "ANO_DOC")
    private String anoDoc;
    @Column(name = "SERIE_DOC_REM")
    private String serieDocRem;
    @Column(name = "CORR_DOC_REM")
    private String corrDocRem;
    @Column(name = "NO_REFE")
    private String noRefe;
    @Column(name = "TIPO_DOC_REC")
    private String tipoDocRec;
    @Column(name = "SERIE_DOC_REC")
    private String serieDocRec;
    @Column(name = "CORR_DOC_REC")
    private String corrDocRec;
    @Column(name = "TIPO_DOC_REC_2")
    private String tipoDocRec2;
    @Column(name = "SERIE_DOC_REC_2")
    private String serieDocRec2;
    @Column(name = "CORR_DOC_REC_2")
    private String corrDocRec2;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MOV_TOT")
    private BigDecimal movTot;
    @Column(name = "TOT_ART_IV")
    private BigDecimal totArtIv;
    @Column(name = "IMP_VENTAS")
    private BigDecimal impVentas;
    @Column(name = "IMP_ISC")
    private BigDecimal impIsc;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "DESCUENTO_SINGRABAR")
    private BigDecimal descuentoSingrabar;
    @Column(name = "TIPO_CAMBIO")
    private BigDecimal tipoCambio;
    @Column(name = "ANO_PROCE")
    private Short anoProce;
    @Column(name = "MES_PROCE")
    private Short mesProce;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "IND_CONTROL")
    private String indControl;
    @Column(name = "STATUS_CONTROL")
    private String statusControl;
    @Column(name = "VEHICULO")
    private String vehiculo;
    @Column(name = "VENTA")
    private String venta;
    @Column(name = "COD_TRANSP")
    private String codTransp;
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "DIRECC_TRANSP")
    private String direccTransp;
    @Column(name = "RUC_TRANSP")
    private String rucTransp;
    @Column(name = "CHOFER")
    private String chofer;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "OPERACION")
    private Long operacion;
    @Column(name = "TIPO_DOC_REFE")
    private String tipoDocRefe;
    @Column(name = "CARGA_AUTOMATICA")
    private String cargaAutomatica;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_SIST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSist;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "NO_CONTA")
    private Long noConta;
    @Column(name = "F_INI_TRAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fIniTras;
    @Column(name = "ACT_OBRA")
    private String actObra;
    @Column(name = "AUT_REQ")
    private String autReq;
    @Column(name = "DESTINATARIO")
    private String destinatario;
    @Column(name = "PUNTO_PARTIDA")
    private String puntoPartida;
    @Column(name = "PUNTO_LLEGADA")
    private String puntoLlegada;
    @Column(name = "BREVETE")
    private String brevete;
    @Column(name = "RUC_DESTINATARIO")
    private String rucDestinatario;
    @Column(name = "DIRECCION_ORIGEN")
    private String direccionOrigen;
    @Column(name = "DIRECCION_DESTINO")
    private String direccionDestino;
    @Column(name = "DESCRIP_OTROS")
    private String descripOtros;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "PARTIDA_DISTRITO")
    private String partidaDistrito;
    @Column(name = "PARTIDA_PROVINCIA")
    private String partidaProvincia;
    @Column(name = "PARTIDA_DEPARTAMENTO")
    private String partidaDepartamento;
    @Column(name = "LLEGADA_DISTRITO")
    private String llegadaDistrito;
    @Column(name = "LLEGADA_PROVINCIA")
    private String llegadaProvincia;
    @Column(name = "LLEGADA_DEPARTAMENTO")
    private String llegadaDepartamento;
    @Column(name = "PROYECTO")
    private String proyecto;
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Column(name = "TIPO_COMP_PAGO")
    private String tipoCompPago;
    @Column(name = "SERIE_COMP_PAGO")
    private String serieCompPago;
    @Column(name = "NUMERO_COMP_PAGO")
    private String numeroCompPago;
    @Column(name = "COSTO_MINIMO_TRANSPORTE")
    private BigDecimal costoMinimoTransporte;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "CERTIFICADO_INSCRIPCION")
    private String certificadoInscripcion;
    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "PESO_TOTAL")
    private BigDecimal pesoTotal;
    @Column(name = "RAZON_SOCIAL_DESTINATARIO")
    private String razonSocialDestinatario;
    @Column(name = "NO_PED_MANT")
    private String noPedMant;
    @Column(name = "NO_GUIA_BROCAS")
    private String noGuiaBrocas;
    @Column(name = "IND_GUIA_BROCAS")
    private String indGuiaBrocas;
    @Column(name = "NO_ALMACEN_UNIDAD")
    private String noAlmacenUnidad;
    @Column(name = "NO_GUIA_UNIDAD")
    private String noGuiaUnidad;
    @Column(name = "IND_GUIA_UNIDAD")
    private String indGuiaUnidad;
    @Column(name = "NO_CANJE")
    private String noCanje;
    @Column(name = "IND_CANJE")
    private String indCanje;
    @Column(name = "NOMBRE_EMPLE")
    private String nombreEmple;
    @Column(name = "NO_GUIA_MANT")
    private String noGuiaMant;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "DIRECCION_COMERCIAL")
    private String direccionComercial;
    @Column(name = "CODI_COLE")
    private String codiCole;
    @Column(name = "CODI_ZONA")
    private String codiZona;
    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "F_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fEntrega;
    @Column(name = "NO_GUIA_PROM")
    private String noGuiaProm;
    @Column(name = "NO_DOCU_REFE")
    private String noDocuRefe;
    @Column(name = "NO_LIQ")
    private String noLiq;
    @Column(name = "NO_LIQ_OFI")
    private String noLiqOfi;
    @Column(name = "IND_GEN_COM")
    private String indGenCom;
    @Column(name = "NRO_LECT_PROV")
    private String nroLectProv;
    @Column(name = "NO_LIQ_SUC")
    private String noLiqSuc;
    @Column(name = "IND_REVERSION")
    private String indReversion;
    @Column(name = "TIPO_COSTO")
    private String tipoCosto;
    @Column(name = "IND_GUIADO")
    private String indGuiado;
    @Column(name = "TIPO_DOC_REF")
    private String tipoDocRef;
    @Column(name = "NO_SOLIC")
    private String noSolic;
    @Column(name = "COD_FPAGO")
    private String codFpago;
    @Column(name = "NOMB_TIENDA")
    private String nombTienda;
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "CLASE_TRANSC")
    private String claseTransc;
    @Column(name = "NOMBRE_DIGI")
    private String nombreDigi;
    @Column(name = "DIRECCION_DIGI")
    private String direccionDigi;
    @Column(name = "IND_FACTURA")
    private String indFactura;
    @Column(name = "IND_BOLETA")
    private String indBoleta;
    @Column(name = "TIPO_TRANS_REV")
    private String tipoTransRev;
    @Column(name = "NO_DOCU_REV")
    private String noDocuRev;
    @Column(name = "F_ANULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fAnulacion;
    @Column(name = "COD_TIENDA")
    private String codTienda;
    @Column(name = "COD_DIR_ENTREGA")
    private String codDirEntrega;
    @Column(name = "COD_DIR_SALIDA")
    private String codDirSalida;
    @Column(name = "NO_GUIA_REFE")
    private String noGuiaRefe;
    @Column(name = "IMPRIME")
    private String imprime;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "TIPO_DOC_REV")
    private String tipoDocRev;
    @Column(name = "NO_FACTU_REV")
    private String noFactuRev;
    @Column(name = "ALMA_TRANS_REV")
    private String almaTransRev;
    @Column(name = "IND_SELECCION")
    private String indSeleccion;
    @Column(name = "NO_DOCU_COMP")
    private String noDocuComp;
    @Column(name = "NO_DESP")
    private String noDesp;
    @Column(name = "NO_COMPTRAS")
    private String noComptras;
    @Column(name = "ALM_ORIG_COMP")
    private String almOrigComp;
    @Column(name = "NO_PERSONAL")
    private String noPersonal;
    @Column(name = "TIPO_DOC_AUTO")
    private String tipoDocAuto;
    @Column(name = "SERIE_DOC_AUTO")
    private String serieDocAuto;
    @Column(name = "CORR_DOC_AUTO")
    private String corrDocAuto;
    @Column(name = "IND_COMPLEMENTO")
    private String indComplemento;
    @Column(name = "ALIAS")
    private String alias;
    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "COD_CAJA")
    private String codCaja;
    @Column(name = "CENTRO_ORDEN")
    private String centroOrden;
    @Column(name = "TIPO_TRAN_COMP")
    private String tipoTranComp;
    @Column(name = "BODEGA_REFE")
    private String bodegaRefe;
    @Column(name = "IND_PROVINCIA")
    private String indProvincia;
    @Column(name = "MONEDA_OLD")
    private String monedaOld;
    @Column(name = "CORR_DOC_REC_YO")
    private String corrDocRecYo;
    @Column(name = "TIPO_DOC_REC_YO")
    private String tipoDocRecYo;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "FECHA_FACTU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactu;
    @Column(name = "NRO_CANJE")
    private String nroCanje;
    @Column(name = "CODI_LOCAL")
    private String codiLocal;
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Column(name = "DNI_REPRE")
    private String dniRepre;
    @Column(name = "FEC_CANJE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCanje;
    @Column(name = "MODALIDAD")
    private String modalidad;
    @Column(name = "CODI_CAMP")
    private String codiCamp;
    @Column(name = "FLAG")
    private String flag;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "CONSUMO")
    private String consumo;
    @Column(name = "DEMASIA")
    private String demasia;
    @Column(name = "GRABA_COD_BARRA")
    private String grabaCodBarra;
    @Column(name = "USU_DESP")
    private String usuDesp;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    @Column(name = "NO_GUIA_DESP")
    private String noGuiaDesp;
    @Column(name = "FECHA_DESP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesp;
    @Column(name = "IND_FACT_TEXTO")
    private String indFactTexto;
    @Column(name = "IND_GUIA_TEXTO")
    private String indGuiaTexto;
    @Column(name = "GUIA_TEXTO")
    private String guiaTexto;
    @Column(name = "COD_BCARD")
    private String codBcard;
    @Column(name = "OBSERVACIONES2")
    private String observaciones2;
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "FEC_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModi;
    @Column(name = "USU_MODI")
    private String usuModi;
    @Column(name = "ON_LINE")
    private String onLine;
    @Column(name = "NO_VENDEDOR1")
    private String noVendedor1;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "IND_FERIAS")
    private String indFerias;
    @Column(name = "NRO_CONVENIO")
    private String nroConvenio;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "MARCA3")
    private String marca3;
    @Column(name = "NO_DOCU_ANT")
    private String noDocuAnt;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "TIPO_DOC_ANT")
    private String tipoDocAnt;
    @Column(name = "BODEGA_ANT")
    private String bodegaAnt;
    @Column(name = "CODI_PROFE")
    private String codiProfe;
    @Column(name = "IND_FICTA")
    private String indFicta;
    @Column(name = "GENERO_NC")
    private String generoNc;
    @Column(name = "IND_PROFORMA")
    private String indProforma;
    @Column(name = "GR_SERIE")
    private String grSerie;
    @Column(name = "GR_CORRE")
    private String grCorre;
    @Column(name = "CANT_LINEAS")
    private BigInteger cantLineas;

    public Arinme1() {
    }

    public Arinme1(Arinme1PK arinme1PK) {
        this.arinme1PK = arinme1PK;
    }

    public Arinme1(String noCia, String bodega, String tipoDoc, String noDocu) {
        this.arinme1PK = new Arinme1PK(noCia, bodega, tipoDoc, noDocu);
    }

    public Arinme1PK getArinme1PK() {
        return arinme1PK;
    }

    public void setArinme1PK(Arinme1PK arinme1PK) {
        this.arinme1PK = arinme1PK;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNoProve() {
        return noProve;
    }

    public void setNoProve(String noProve) {
        this.noProve = noProve;
    }

    public String getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(String noOrden) {
        this.noOrden = noOrden;
    }

    public String getNoGuia() {
        return noGuia;
    }

    public void setNoGuia(String noGuia) {
        this.noGuia = noGuia;
    }

    public String getTipoDocRem() {
        return tipoDocRem;
    }

    public void setTipoDocRem(String tipoDocRem) {
        this.tipoDocRem = tipoDocRem;
    }

    public String getAnoDoc() {
        return anoDoc;
    }

    public void setAnoDoc(String anoDoc) {
        this.anoDoc = anoDoc;
    }

    public String getSerieDocRem() {
        return serieDocRem;
    }

    public void setSerieDocRem(String serieDocRem) {
        this.serieDocRem = serieDocRem;
    }

    public String getCorrDocRem() {
        return corrDocRem;
    }

    public void setCorrDocRem(String corrDocRem) {
        this.corrDocRem = corrDocRem;
    }

    public String getNoRefe() {
        return noRefe;
    }

    public void setNoRefe(String noRefe) {
        this.noRefe = noRefe;
    }

    public String getTipoDocRec() {
        return tipoDocRec;
    }

    public void setTipoDocRec(String tipoDocRec) {
        this.tipoDocRec = tipoDocRec;
    }

    public String getSerieDocRec() {
        return serieDocRec;
    }

    public void setSerieDocRec(String serieDocRec) {
        this.serieDocRec = serieDocRec;
    }

    public String getCorrDocRec() {
        return corrDocRec;
    }

    public void setCorrDocRec(String corrDocRec) {
        this.corrDocRec = corrDocRec;
    }

    public String getTipoDocRec2() {
        return tipoDocRec2;
    }

    public void setTipoDocRec2(String tipoDocRec2) {
        this.tipoDocRec2 = tipoDocRec2;
    }

    public String getSerieDocRec2() {
        return serieDocRec2;
    }

    public void setSerieDocRec2(String serieDocRec2) {
        this.serieDocRec2 = serieDocRec2;
    }

    public String getCorrDocRec2() {
        return corrDocRec2;
    }

    public void setCorrDocRec2(String corrDocRec2) {
        this.corrDocRec2 = corrDocRec2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public BigDecimal getMovTot() {
        return movTot;
    }

    public void setMovTot(BigDecimal movTot) {
        this.movTot = movTot;
    }

    public BigDecimal getTotArtIv() {
        return totArtIv;
    }

    public void setTotArtIv(BigDecimal totArtIv) {
        this.totArtIv = totArtIv;
    }

    public BigDecimal getImpVentas() {
        return impVentas;
    }

    public void setImpVentas(BigDecimal impVentas) {
        this.impVentas = impVentas;
    }

    public BigDecimal getImpIsc() {
        return impIsc;
    }

    public void setImpIsc(BigDecimal impIsc) {
        this.impIsc = impIsc;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getDescuentoSingrabar() {
        return descuentoSingrabar;
    }

    public void setDescuentoSingrabar(BigDecimal descuentoSingrabar) {
        this.descuentoSingrabar = descuentoSingrabar;
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Short getAnoProce() {
        return anoProce;
    }

    public void setAnoProce(Short anoProce) {
        this.anoProce = anoProce;
    }

    public Short getMesProce() {
        return mesProce;
    }

    public void setMesProce(Short mesProce) {
        this.mesProce = mesProce;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getIndControl() {
        return indControl;
    }

    public void setIndControl(String indControl) {
        this.indControl = indControl;
    }

    public String getStatusControl() {
        return statusControl;
    }

    public void setStatusControl(String statusControl) {
        this.statusControl = statusControl;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public String getCodTransp() {
        return codTransp;
    }

    public void setCodTransp(String codTransp) {
        this.codTransp = codTransp;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccTransp() {
        return direccTransp;
    }

    public void setDireccTransp(String direccTransp) {
        this.direccTransp = direccTransp;
    }

    public String getRucTransp() {
        return rucTransp;
    }

    public void setRucTransp(String rucTransp) {
        this.rucTransp = rucTransp;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getOperacion() {
        return operacion;
    }

    public void setOperacion(Long operacion) {
        this.operacion = operacion;
    }

    public String getTipoDocRefe() {
        return tipoDocRefe;
    }

    public void setTipoDocRefe(String tipoDocRefe) {
        this.tipoDocRefe = tipoDocRefe;
    }

    public String getCargaAutomatica() {
        return cargaAutomatica;
    }

    public void setCargaAutomatica(String cargaAutomatica) {
        this.cargaAutomatica = cargaAutomatica;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaSist() {
        return fechaSist;
    }

    public void setFechaSist(Date fechaSist) {
        this.fechaSist = fechaSist;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getAlmaOrigen() {
        return almaOrigen;
    }

    public void setAlmaOrigen(String almaOrigen) {
        this.almaOrigen = almaOrigen;
    }

    public String getAlmaDestino() {
        return almaDestino;
    }

    public void setAlmaDestino(String almaDestino) {
        this.almaDestino = almaDestino;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Long getNoConta() {
        return noConta;
    }

    public void setNoConta(Long noConta) {
        this.noConta = noConta;
    }

    public Date getFIniTras() {
        return fIniTras;
    }

    public void setFIniTras(Date fIniTras) {
        this.fIniTras = fIniTras;
    }

    public String getActObra() {
        return actObra;
    }

    public void setActObra(String actObra) {
        this.actObra = actObra;
    }

    public String getAutReq() {
        return autReq;
    }

    public void setAutReq(String autReq) {
        this.autReq = autReq;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(String puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public String getPuntoLlegada() {
        return puntoLlegada;
    }

    public void setPuntoLlegada(String puntoLlegada) {
        this.puntoLlegada = puntoLlegada;
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete;
    }

    public String getRucDestinatario() {
        return rucDestinatario;
    }

    public void setRucDestinatario(String rucDestinatario) {
        this.rucDestinatario = rucDestinatario;
    }

    public String getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(String direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getDescripOtros() {
        return descripOtros;
    }

    public void setDescripOtros(String descripOtros) {
        this.descripOtros = descripOtros;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getPartidaDistrito() {
        return partidaDistrito;
    }

    public void setPartidaDistrito(String partidaDistrito) {
        this.partidaDistrito = partidaDistrito;
    }

    public String getPartidaProvincia() {
        return partidaProvincia;
    }

    public void setPartidaProvincia(String partidaProvincia) {
        this.partidaProvincia = partidaProvincia;
    }

    public String getPartidaDepartamento() {
        return partidaDepartamento;
    }

    public void setPartidaDepartamento(String partidaDepartamento) {
        this.partidaDepartamento = partidaDepartamento;
    }

    public String getLlegadaDistrito() {
        return llegadaDistrito;
    }

    public void setLlegadaDistrito(String llegadaDistrito) {
        this.llegadaDistrito = llegadaDistrito;
    }

    public String getLlegadaProvincia() {
        return llegadaProvincia;
    }

    public void setLlegadaProvincia(String llegadaProvincia) {
        this.llegadaProvincia = llegadaProvincia;
    }

    public String getLlegadaDepartamento() {
        return llegadaDepartamento;
    }

    public void setLlegadaDepartamento(String llegadaDepartamento) {
        this.llegadaDepartamento = llegadaDepartamento;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoCompPago() {
        return tipoCompPago;
    }

    public void setTipoCompPago(String tipoCompPago) {
        this.tipoCompPago = tipoCompPago;
    }

    public String getSerieCompPago() {
        return serieCompPago;
    }

    public void setSerieCompPago(String serieCompPago) {
        this.serieCompPago = serieCompPago;
    }

    public String getNumeroCompPago() {
        return numeroCompPago;
    }

    public void setNumeroCompPago(String numeroCompPago) {
        this.numeroCompPago = numeroCompPago;
    }

    public BigDecimal getCostoMinimoTransporte() {
        return costoMinimoTransporte;
    }

    public void setCostoMinimoTransporte(BigDecimal costoMinimoTransporte) {
        this.costoMinimoTransporte = costoMinimoTransporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCertificadoInscripcion() {
        return certificadoInscripcion;
    }

    public void setCertificadoInscripcion(String certificadoInscripcion) {
        this.certificadoInscripcion = certificadoInscripcion;
    }

    public String getMotivoTraslado() {
        return motivoTraslado;
    }

    public void setMotivoTraslado(String motivoTraslado) {
        this.motivoTraslado = motivoTraslado;
    }

    public BigDecimal getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(BigDecimal pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getRazonSocialDestinatario() {
        return razonSocialDestinatario;
    }

    public void setRazonSocialDestinatario(String razonSocialDestinatario) {
        this.razonSocialDestinatario = razonSocialDestinatario;
    }

    public String getNoPedMant() {
        return noPedMant;
    }

    public void setNoPedMant(String noPedMant) {
        this.noPedMant = noPedMant;
    }

    public String getNoGuiaBrocas() {
        return noGuiaBrocas;
    }

    public void setNoGuiaBrocas(String noGuiaBrocas) {
        this.noGuiaBrocas = noGuiaBrocas;
    }

    public String getIndGuiaBrocas() {
        return indGuiaBrocas;
    }

    public void setIndGuiaBrocas(String indGuiaBrocas) {
        this.indGuiaBrocas = indGuiaBrocas;
    }

    public String getNoAlmacenUnidad() {
        return noAlmacenUnidad;
    }

    public void setNoAlmacenUnidad(String noAlmacenUnidad) {
        this.noAlmacenUnidad = noAlmacenUnidad;
    }

    public String getNoGuiaUnidad() {
        return noGuiaUnidad;
    }

    public void setNoGuiaUnidad(String noGuiaUnidad) {
        this.noGuiaUnidad = noGuiaUnidad;
    }

    public String getIndGuiaUnidad() {
        return indGuiaUnidad;
    }

    public void setIndGuiaUnidad(String indGuiaUnidad) {
        this.indGuiaUnidad = indGuiaUnidad;
    }

    public String getNoCanje() {
        return noCanje;
    }

    public void setNoCanje(String noCanje) {
        this.noCanje = noCanje;
    }

    public String getIndCanje() {
        return indCanje;
    }

    public void setIndCanje(String indCanje) {
        this.indCanje = indCanje;
    }

    public String getNombreEmple() {
        return nombreEmple;
    }

    public void setNombreEmple(String nombreEmple) {
        this.nombreEmple = nombreEmple;
    }

    public String getNoGuiaMant() {
        return noGuiaMant;
    }

    public void setNoGuiaMant(String noGuiaMant) {
        this.noGuiaMant = noGuiaMant;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getCodiCole() {
        return codiCole;
    }

    public void setCodiCole(String codiCole) {
        this.codiCole = codiCole;
    }

    public String getCodiZona() {
        return codiZona;
    }

    public void setCodiZona(String codiZona) {
        this.codiZona = codiZona;
    }

    public String getNoVendedor() {
        return noVendedor;
    }

    public void setNoVendedor(String noVendedor) {
        this.noVendedor = noVendedor;
    }

    public Date getFEntrega() {
        return fEntrega;
    }

    public void setFEntrega(Date fEntrega) {
        this.fEntrega = fEntrega;
    }

    public String getNoGuiaProm() {
        return noGuiaProm;
    }

    public void setNoGuiaProm(String noGuiaProm) {
        this.noGuiaProm = noGuiaProm;
    }

    public String getNoDocuRefe() {
        return noDocuRefe;
    }

    public void setNoDocuRefe(String noDocuRefe) {
        this.noDocuRefe = noDocuRefe;
    }

    public String getNoLiq() {
        return noLiq;
    }

    public void setNoLiq(String noLiq) {
        this.noLiq = noLiq;
    }

    public String getNoLiqOfi() {
        return noLiqOfi;
    }

    public void setNoLiqOfi(String noLiqOfi) {
        this.noLiqOfi = noLiqOfi;
    }

    public String getIndGenCom() {
        return indGenCom;
    }

    public void setIndGenCom(String indGenCom) {
        this.indGenCom = indGenCom;
    }

    public String getNroLectProv() {
        return nroLectProv;
    }

    public void setNroLectProv(String nroLectProv) {
        this.nroLectProv = nroLectProv;
    }

    public String getNoLiqSuc() {
        return noLiqSuc;
    }

    public void setNoLiqSuc(String noLiqSuc) {
        this.noLiqSuc = noLiqSuc;
    }

    public String getIndReversion() {
        return indReversion;
    }

    public void setIndReversion(String indReversion) {
        this.indReversion = indReversion;
    }

    public String getTipoCosto() {
        return tipoCosto;
    }

    public void setTipoCosto(String tipoCosto) {
        this.tipoCosto = tipoCosto;
    }

    public String getIndGuiado() {
        return indGuiado;
    }

    public void setIndGuiado(String indGuiado) {
        this.indGuiado = indGuiado;
    }

    public String getTipoDocRef() {
        return tipoDocRef;
    }

    public void setTipoDocRef(String tipoDocRef) {
        this.tipoDocRef = tipoDocRef;
    }

    public String getNoSolic() {
        return noSolic;
    }

    public void setNoSolic(String noSolic) {
        this.noSolic = noSolic;
    }

    public String getCodFpago() {
        return codFpago;
    }

    public void setCodFpago(String codFpago) {
        this.codFpago = codFpago;
    }

    public String getNombTienda() {
        return nombTienda;
    }

    public void setNombTienda(String nombTienda) {
        this.nombTienda = nombTienda;
    }

    public String getTipoArti() {
        return tipoArti;
    }

    public void setTipoArti(String tipoArti) {
        this.tipoArti = tipoArti;
    }

    public String getClaseTransc() {
        return claseTransc;
    }

    public void setClaseTransc(String claseTransc) {
        this.claseTransc = claseTransc;
    }

    public String getNombreDigi() {
        return nombreDigi;
    }

    public void setNombreDigi(String nombreDigi) {
        this.nombreDigi = nombreDigi;
    }

    public String getDireccionDigi() {
        return direccionDigi;
    }

    public void setDireccionDigi(String direccionDigi) {
        this.direccionDigi = direccionDigi;
    }

    public String getIndFactura() {
        return indFactura;
    }

    public void setIndFactura(String indFactura) {
        this.indFactura = indFactura;
    }

    public String getIndBoleta() {
        return indBoleta;
    }

    public void setIndBoleta(String indBoleta) {
        this.indBoleta = indBoleta;
    }

    public String getTipoTransRev() {
        return tipoTransRev;
    }

    public void setTipoTransRev(String tipoTransRev) {
        this.tipoTransRev = tipoTransRev;
    }

    public String getNoDocuRev() {
        return noDocuRev;
    }

    public void setNoDocuRev(String noDocuRev) {
        this.noDocuRev = noDocuRev;
    }

    public Date getFAnulacion() {
        return fAnulacion;
    }

    public void setFAnulacion(Date fAnulacion) {
        this.fAnulacion = fAnulacion;
    }

    public String getCodTienda() {
        return codTienda;
    }

    public void setCodTienda(String codTienda) {
        this.codTienda = codTienda;
    }

    public String getCodDirEntrega() {
        return codDirEntrega;
    }

    public void setCodDirEntrega(String codDirEntrega) {
        this.codDirEntrega = codDirEntrega;
    }

    public String getCodDirSalida() {
        return codDirSalida;
    }

    public void setCodDirSalida(String codDirSalida) {
        this.codDirSalida = codDirSalida;
    }

    public String getNoGuiaRefe() {
        return noGuiaRefe;
    }

    public void setNoGuiaRefe(String noGuiaRefe) {
        this.noGuiaRefe = noGuiaRefe;
    }

    public String getImprime() {
        return imprime;
    }

    public void setImprime(String imprime) {
        this.imprime = imprime;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getTipoDocRev() {
        return tipoDocRev;
    }

    public void setTipoDocRev(String tipoDocRev) {
        this.tipoDocRev = tipoDocRev;
    }

    public String getNoFactuRev() {
        return noFactuRev;
    }

    public void setNoFactuRev(String noFactuRev) {
        this.noFactuRev = noFactuRev;
    }

    public String getAlmaTransRev() {
        return almaTransRev;
    }

    public void setAlmaTransRev(String almaTransRev) {
        this.almaTransRev = almaTransRev;
    }

    public String getIndSeleccion() {
        return indSeleccion;
    }

    public void setIndSeleccion(String indSeleccion) {
        this.indSeleccion = indSeleccion;
    }

    public String getNoDocuComp() {
        return noDocuComp;
    }

    public void setNoDocuComp(String noDocuComp) {
        this.noDocuComp = noDocuComp;
    }

    public String getNoDesp() {
        return noDesp;
    }

    public void setNoDesp(String noDesp) {
        this.noDesp = noDesp;
    }

    public String getNoComptras() {
        return noComptras;
    }

    public void setNoComptras(String noComptras) {
        this.noComptras = noComptras;
    }

    public String getAlmOrigComp() {
        return almOrigComp;
    }

    public void setAlmOrigComp(String almOrigComp) {
        this.almOrigComp = almOrigComp;
    }

    public String getNoPersonal() {
        return noPersonal;
    }

    public void setNoPersonal(String noPersonal) {
        this.noPersonal = noPersonal;
    }

    public String getTipoDocAuto() {
        return tipoDocAuto;
    }

    public void setTipoDocAuto(String tipoDocAuto) {
        this.tipoDocAuto = tipoDocAuto;
    }

    public String getSerieDocAuto() {
        return serieDocAuto;
    }

    public void setSerieDocAuto(String serieDocAuto) {
        this.serieDocAuto = serieDocAuto;
    }

    public String getCorrDocAuto() {
        return corrDocAuto;
    }

    public void setCorrDocAuto(String corrDocAuto) {
        this.corrDocAuto = corrDocAuto;
    }

    public String getIndComplemento() {
        return indComplemento;
    }

    public void setIndComplemento(String indComplemento) {
        this.indComplemento = indComplemento;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIndPvent() {
        return indPvent;
    }

    public void setIndPvent(String indPvent) {
        this.indPvent = indPvent;
    }

    public String getCodCaja() {
        return codCaja;
    }

    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }

    public String getCentroOrden() {
        return centroOrden;
    }

    public void setCentroOrden(String centroOrden) {
        this.centroOrden = centroOrden;
    }

    public String getTipoTranComp() {
        return tipoTranComp;
    }

    public void setTipoTranComp(String tipoTranComp) {
        this.tipoTranComp = tipoTranComp;
    }

    public String getBodegaRefe() {
        return bodegaRefe;
    }

    public void setBodegaRefe(String bodegaRefe) {
        this.bodegaRefe = bodegaRefe;
    }

    public String getIndProvincia() {
        return indProvincia;
    }

    public void setIndProvincia(String indProvincia) {
        this.indProvincia = indProvincia;
    }

    public String getMonedaOld() {
        return monedaOld;
    }

    public void setMonedaOld(String monedaOld) {
        this.monedaOld = monedaOld;
    }

    public String getCorrDocRecYo() {
        return corrDocRecYo;
    }

    public void setCorrDocRecYo(String corrDocRecYo) {
        this.corrDocRecYo = corrDocRecYo;
    }

    public String getTipoDocRecYo() {
        return tipoDocRecYo;
    }

    public void setTipoDocRecYo(String tipoDocRecYo) {
        this.tipoDocRecYo = tipoDocRecYo;
    }

    public String getCodPreOrden() {
        return codPreOrden;
    }

    public void setCodPreOrden(String codPreOrden) {
        this.codPreOrden = codPreOrden;
    }

    public Date getFechaFactu() {
        return fechaFactu;
    }

    public void setFechaFactu(Date fechaFactu) {
        this.fechaFactu = fechaFactu;
    }

    public String getNroCanje() {
        return nroCanje;
    }

    public void setNroCanje(String nroCanje) {
        this.nroCanje = nroCanje;
    }

    public String getCodiLocal() {
        return codiLocal;
    }

    public void setCodiLocal(String codiLocal) {
        this.codiLocal = codiLocal;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDniRepre() {
        return dniRepre;
    }

    public void setDniRepre(String dniRepre) {
        this.dniRepre = dniRepre;
    }

    public Date getFecCanje() {
        return fecCanje;
    }

    public void setFecCanje(Date fecCanje) {
        this.fecCanje = fecCanje;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getCodiCamp() {
        return codiCamp;
    }

    public void setCodiCamp(String codiCamp) {
        this.codiCamp = codiCamp;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getDemasia() {
        return demasia;
    }

    public void setDemasia(String demasia) {
        this.demasia = demasia;
    }

    public String getGrabaCodBarra() {
        return grabaCodBarra;
    }

    public void setGrabaCodBarra(String grabaCodBarra) {
        this.grabaCodBarra = grabaCodBarra;
    }

    public String getUsuDesp() {
        return usuDesp;
    }

    public void setUsuDesp(String usuDesp) {
        this.usuDesp = usuDesp;
    }

    public String getIndCodBarra() {
        return indCodBarra;
    }

    public void setIndCodBarra(String indCodBarra) {
        this.indCodBarra = indCodBarra;
    }

    public String getNoGuiaDesp() {
        return noGuiaDesp;
    }

    public void setNoGuiaDesp(String noGuiaDesp) {
        this.noGuiaDesp = noGuiaDesp;
    }

    public Date getFechaDesp() {
        return fechaDesp;
    }

    public void setFechaDesp(Date fechaDesp) {
        this.fechaDesp = fechaDesp;
    }

    public String getIndFactTexto() {
        return indFactTexto;
    }

    public void setIndFactTexto(String indFactTexto) {
        this.indFactTexto = indFactTexto;
    }

    public String getIndGuiaTexto() {
        return indGuiaTexto;
    }

    public void setIndGuiaTexto(String indGuiaTexto) {
        this.indGuiaTexto = indGuiaTexto;
    }

    public String getGuiaTexto() {
        return guiaTexto;
    }

    public void setGuiaTexto(String guiaTexto) {
        this.guiaTexto = guiaTexto;
    }

    public String getCodBcard() {
        return codBcard;
    }

    public void setCodBcard(String codBcard) {
        this.codBcard = codBcard;
    }

    public String getObservaciones2() {
        return observaciones2;
    }

    public void setObservaciones2(String observaciones2) {
        this.observaciones2 = observaciones2;
    }

    public Date getFecCrea() {
        return fecCrea;
    }

    public void setFecCrea(Date fecCrea) {
        this.fecCrea = fecCrea;
    }

    public String getUsuCrea() {
        return usuCrea;
    }

    public void setUsuCrea(String usuCrea) {
        this.usuCrea = usuCrea;
    }

    public Date getFecModi() {
        return fecModi;
    }

    public void setFecModi(Date fecModi) {
        this.fecModi = fecModi;
    }

    public String getUsuModi() {
        return usuModi;
    }

    public void setUsuModi(String usuModi) {
        this.usuModi = usuModi;
    }

    public String getOnLine() {
        return onLine;
    }

    public void setOnLine(String onLine) {
        this.onLine = onLine;
    }

    public String getNoVendedor1() {
        return noVendedor1;
    }

    public void setNoVendedor1(String noVendedor1) {
        this.noVendedor1 = noVendedor1;
    }

    public String getMarca1() {
        return marca1;
    }

    public void setMarca1(String marca1) {
        this.marca1 = marca1;
    }

    public String getIndFerias() {
        return indFerias;
    }

    public void setIndFerias(String indFerias) {
        this.indFerias = indFerias;
    }

    public String getNroConvenio() {
        return nroConvenio;
    }

    public void setNroConvenio(String nroConvenio) {
        this.nroConvenio = nroConvenio;
    }

    public String getMarca2() {
        return marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    public String getMarca3() {
        return marca3;
    }

    public void setMarca3(String marca3) {
        this.marca3 = marca3;
    }

    public String getNoDocuAnt() {
        return noDocuAnt;
    }

    public void setNoDocuAnt(String noDocuAnt) {
        this.noDocuAnt = noDocuAnt;
    }

    public String getNoCliente1() {
        return noCliente1;
    }

    public void setNoCliente1(String noCliente1) {
        this.noCliente1 = noCliente1;
    }

    public String getTipoDocAnt() {
        return tipoDocAnt;
    }

    public void setTipoDocAnt(String tipoDocAnt) {
        this.tipoDocAnt = tipoDocAnt;
    }

    public String getBodegaAnt() {
        return bodegaAnt;
    }

    public void setBodegaAnt(String bodegaAnt) {
        this.bodegaAnt = bodegaAnt;
    }

    public String getCodiProfe() {
        return codiProfe;
    }

    public void setCodiProfe(String codiProfe) {
        this.codiProfe = codiProfe;
    }

    public String getIndFicta() {
        return indFicta;
    }

    public void setIndFicta(String indFicta) {
        this.indFicta = indFicta;
    }

    public String getGeneroNc() {
        return generoNc;
    }

    public void setGeneroNc(String generoNc) {
        this.generoNc = generoNc;
    }

    public String getIndProforma() {
        return indProforma;
    }

    public void setIndProforma(String indProforma) {
        this.indProforma = indProforma;
    }

    public String getGrSerie() {
        return grSerie;
    }

    public void setGrSerie(String grSerie) {
        this.grSerie = grSerie;
    }

    public String getGrCorre() {
        return grCorre;
    }

    public void setGrCorre(String grCorre) {
        this.grCorre = grCorre;
    }

    public BigInteger getCantLineas() {
        return cantLineas;
    }

    public void setCantLineas(BigInteger cantLineas) {
        this.cantLineas = cantLineas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arinme1PK != null ? arinme1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinme1)) {
            return false;
        }
        Arinme1 other = (Arinme1) object;
        if ((this.arinme1PK == null && other.arinme1PK != null) || (this.arinme1PK != null && !this.arinme1PK.equals(other.arinme1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "INVE.Arinme1[ arinme1PK=" + arinme1PK + " ]";
    }
}
