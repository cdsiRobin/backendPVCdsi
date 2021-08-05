package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ARPFOE")
public class Arpfoe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfoePK arpfoePK;

    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "DIVISION")
    private String division;
    @Column(name = "NO_PROFORMA")
    private String noProforma;
    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "COD_T_PED")
    private String codTPed;
    @Column(name = "COD_FPAGO")
    private String codFpago;
    @Column(name = "TIEMPO_ENTREGA")
    private Short tiempoEntrega;
    @Column(name = "F_RECEPCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fRecepcion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "F_APROBACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fAprobacion;
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "FECHA_ENTREGA_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntregaReal;
    @Column(name = "FECHA_VENCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVence;
    @Column(name = "PLACA_VEHICULO")
    private String placaVehiculo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO_PEDIDO")
    private BigDecimal pesoPedido;
    @Column(name = "UBIGEO")
    private String ubigeo;
    @Column(name = "RUTA")
    private String ruta;
    @Column(name = "SECUENCIA_RUTA")
    private String secuenciaRuta;
    @Column(name = "TIPO_PRECIO")
    private String tipoPrecio;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "TIPO_CAMBIO")
    private BigDecimal tipoCambio;
    @Column(name = "SUB_TOTAL")
    private BigDecimal subTotal;
    @Column(name = "T_IMPUESTO")
    private BigDecimal tImpuesto;
    @Column(name = "T_PRECIO")
    private BigDecimal tPrecio;
    @Column(name = "IMPUESTO")
    private BigDecimal impuesto;
    @Column(name = "IMP_ISC")
    private BigDecimal impIsc;
    @Column(name = "CANT_AUTORIZAR")
    private BigDecimal cantAutorizar;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "BODEGA")
    private String bodega;
    @Column(name = "CUSER")
    private String cuser;
    @Column(name = "CUSER_AUTO")
    private String cuserAuto;
    @Column(name = "FECHA_SYS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSys;
    @Column(name = "IGV")
    private BigDecimal igv;
    @Column(name = "IND_GUIADO")
    private String indGuiado;
    @Column(name = "MOTIVO_DE_NO_DESPACHO")
    private String motivoDeNoDespacho;
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Column(name = "NO_DOCU")
    private String noDocu;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @Column(name = "TI_DESPACHO")
    private String tiDespacho;
    @Column(name = "ZONA")
    private String zona;
    @Column(name = "TIPO_FACT")
    private String tipoFact;
    @Column(name = "COD_TRANSP")
    private String codTransp;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "NO_SALIDA")
    private Short noSalida;
    @Column(name = "NO_SOLIC")
    private String noSolic;
    @Column(name = "OBSERVA")
    private String observa;
    @Column(name = "PER_DE_GRACIA")
    private Short perDeGracia;
    @Column(name = "TIPO_DE_GRACIA")
    private String tipoDeGracia;
    @Column(name = "TEA")
    private BigDecimal tea;
    @Column(name = "NO_CUOTAS")
    private Short noCuotas;
    @Column(name = "GASTO_DE_FLETES")
    private BigDecimal gastoDeFletes;
    @Column(name = "GASTO_DE_SEGUROS")
    private BigDecimal gastoDeSeguros;
    @Column(name = "PRIORIDAD")
    private String prioridad;
    @Column(name = "DIRECCION_ENTREGA")
    private String direccionEntrega;
    @Column(name = "DIRECCION_COMERCIAL")
    private String direccionComercial;
    @Column(name = "UBI_DIR")
    private String ubiDir;
    @Column(name = "UBI_ENT")
    private String ubiEnt;
    @Column(name = "PORC_GASTO")
    private BigDecimal porcGasto;
    @Column(name = "GASTO_FINAN")
    private BigDecimal gastoFinan;
    @Column(name = "CODI_ZZONA")
    private String codiZzona;
    @Column(name = "CODI_ZONA")
    private String codiZona;
    @Column(name = "CODI_COLE")
    private String codiCole;
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Column(name = "CODI_PROV")
    private String codiProv;
    @Column(name = "CODI_DIST")
    private String codiDist;
    @Column(name = "CODI_PROMO")
    private String codiPromo;
    @Column(name = "NO_GUIA")
    private String noGuia;
    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;
    @Column(name = "RUC")
    private String ruc;
    @Column(name = "NO_FACTU")
    private String noFactu;
    @Column(name = "T_DESCUENTO")
    private BigDecimal tDescuento;
    @Column(name = "P_DSCTO_GLOBAL")
    private BigDecimal pDsctoGlobal;
    @Column(name = "FECHA_DOC_REF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDocRef;
    @Column(name = "TIPO_DOC_REF")
    private String tipoDocRef;
    @Column(name = "COD_CLAS_PED")
    private String codClasPed;
    @Column(name = "TIPO_FPAGO")
    private String tipoFpago;
    @Column(name = "T_DSCTO_GLOBAL")
    private BigDecimal tDsctoGlobal;
    @Column(name = "T_VALOR_VENTA")
    private BigDecimal tValorVenta;
    @Column(name = "MOTIVO_NO_ATENCION")
    private String motivoNoAtencion;
    @Column(name = "COD_TIENDA")
    private String codTienda;
    @Column(name = "NOMB_TIENDA")
    private String nombTienda;
    @Column(name = "DIREC_TIENDA")
    private String direcTienda;
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "NOMBRE_DIGI")
    private String nombreDigi;
    @Column(name = "DIRECCION_DIGI")
    private String direccionDigi;
    @Column(name = "TIPO_DOC_CLI")
    private String tipoDocCli;
    @Column(name = "NUM_DOC_CLI")
    private String numDocCli;
    @Column(name = "ORIGEN_DIREC")
    private String origenDirec;
    @Column(name = "COD_DIR_ENTREGA")
    private String codDirEntrega;
    @Column(name = "FECHA_NO_ATENCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNoAtencion;
    @Column(name = "COD_DIR_SALIDA")
    private String codDirSalida;
    @Column(name = "NO_CLIENTE_SALIDA")
    private String noClienteSalida;
    @Column(name = "TIPO_OBSE")
    private String tipoObse;
    @Column(name = "COD_OBSE")
    private String codObse;
    @Column(name = "ESTADO_ASIGNACION")
    private String estadoAsignacion;
    @Column(name = "VIG_PREC_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigPrecInicio;
    @Column(name = "VIG_PREC_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigPrecFinal;
    @Column(name = "LISTA_PREC_ANT")
    private String listaPrecAnt;
    @Column(name = "USUARIO_APROB")
    private String usuarioAprob;
    @Column(name = "IND_VTA_ANTICIPADA")
    private String indVtaAnticipada;
    @Column(name = "IND_DESP")
    private String indDesp;
    @Column(name = "COD_T_PEDIDO")
    private String codTPedido;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "TOTAL_BRUTO")
    private BigDecimal totalBruto;
    @Column(name = "FLETE")
    private BigDecimal flete;
    @Column(name = "COD_T_PED1")
    private String codTPed1;
    @Column(name = "COD_T_PEDB")
    private String codTPedb;
    @Column(name = "COD_T_PEDN")
    private String codTPedn;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ALIAS")
    private String alias;
    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "IND_FACTURA1")
    private String indFactura1;
    @Column(name = "IND_BOLETA1")
    private String indBoleta1;
    @Column(name = "COD_CAJA")
    private String codCaja;
    @Column(name = "CAJERA")
    private String cajera;
    @Column(name = "TIPO_DOC_EMP")
    private String tipoDocEmp;
    @Column(name = "NUM_DOC_EMP")
    private String numDocEmp;
    @Column(name = "CODI_LOCAL")
    private String codiLocal;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "CENTRO_COSTO")
    private String centroCosto;
    @Column(name = "IND_NOTA_CRED")
    private String indNotaCred;
    @Column(name = "IND_EXPORTACION")
    private String indExportacion;
    @Column(name = "CONSUMO")
    private String consumo;
    @Column(name = "IND_FERIAS")
    private String indFerias;
    @Column(name = "USU_CIERRE")
    private String usuCierre;
    @Column(name = "IND_PROVINCIA")
    private String indProvincia;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "REDONDEO")
    private BigDecimal redondeo;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    @Column(name = "IND_FACT_TEXTO")
    private String indFactTexto;
    @Column(name = "TIPO_DOC_REF1")
    private String tipoDocRef1;
    @Column(name = "NO_SOLIC1")
    private String noSolic1;
    @Column(name = "IND_GUIA_TEXTO")
    private String indGuiaTexto;
    @Column(name = "COD_BCARD")
    private String codBcard;
    @Column(name = "OBSERVA2")
    private String observa2;
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
    @Column(name = "FACTURA_TEXTO")
    private String facturaTexto;
    @Column(name = "IMPUESTO_FLETE")
    private BigDecimal impuestoFlete;
    @Column(name = "IMPUESTO_GASTOS_ADM")
    private BigDecimal impuestoGastosAdm;
    @Column(name = "GASTOS_ADMINISTRATIVOS")
    private BigDecimal gastosAdministrativos;
    @Column(name = "ON_LINE")
    private String onLine;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "PIEZAS")
    private Short piezas;
    @Column(name = "DEPARTAMENTO_DEST")
    private String departamentoDest;
    @Column(name = "PROVINCIA_DEST")
    private String provinciaDest;
    @Column(name = "DISTRITO_DEST")
    private String distritoDest;
    @Column(name = "TELEFONO_DEST")
    private String telefonoDest;
    @Column(name = "NO_VENDEDOR1")
    private String noVendedor1;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "NRO_CONVENIO")
    private String nroConvenio;
    @Column(name = "CONT_NETO")
    private String contNeto;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "CODI_PROFE")
    private String codiProfe;
    @Column(name = "COD_AGENTE")
    private String codAgente;
    @Column(name = "CODI_CAMP")
    private String codiCamp;
    /*
    @Column(name = "IND_PROFORMA1")
    private String indProforma1;
    */
    /*
    @Column(name = "A_CTA")
    private BigDecimal aCta;
    */
    /*
    @Column(name = "SALDO")
    private BigDecimal saldo;
    */
    /*
    @Column(name = "ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entrega;
    */
    /*
    @Column(name = "HORA_ENTREGA")
    private String horaEntrega;
    */
    /*
    @Column(name = "IND_PIDE_LOTE")
    private String indPideLote;
    */
    /*
    @Column(name = "FECHA_ESTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEstado;
    */
    /*
    @Column(name = "COD_MAQUINA")
    private String codMaquina;
    */
    /*
    @Column(name = "COD_LUGAR")
    private String codLugar;
    */
    /*
    @Column(name = "COD_FRENTE")
    private String codFrente;
    */
    @Column(name = "MOT_CONTING")
    private Character motConting;
    @Column(name = "OPER_EXONERADAS")
    private BigDecimal operExoneradas;
    @Column(name = "OPER_GRATUITAS")
    private BigDecimal operGratuitas;
    @Column(name = "OPER_GRAVADAS")
    private BigDecimal operGravadas;
    @Column(name = "OPER_INAFECTAS")
    private BigDecimal operInafectas;
    @Column(name = "TIPO_OPERACION")
    private String tipoOperacion;
    @Column(name = "EMAIL_PEDIDO")
    private String emailPedido;
    @Column(name = "COD_DETRAC")
    private String codDetrac;
    /*
    @Column(name = "COMPRADOR")
    private String comprador;
    */
    /*
    @Column(name = "GUIA_TEMP")
    private String guiaTemp;
    */
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_ORDEN", referencedColumnName = "NO_ORDEN", insertable = false, updatable = false)})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arpfol> arpfolList;

    public Arpfoe() {
    }

    public Arpfoe(ArpfoePK arpfoePK) {
        this.arpfoePK = arpfoePK;
    }

    public Arpfoe(String noCia, String noOrden) {
        this.arpfoePK = new ArpfoePK(noCia, noOrden);
    }

    public ArpfoePK getArpfoePK() {
        return arpfoePK;
    }

    public void setArpfoePK(ArpfoePK arpfoePK) {
        this.arpfoePK = arpfoePK;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getNoProforma() {
        return noProforma;
    }

    public void setNoProforma(String noProforma) {
        this.noProforma = noProforma;
    }

    public String getNoVendedor() {
        return noVendedor;
    }

    public void setNoVendedor(String noVendedor) {
        this.noVendedor = noVendedor;
    }

    public String getCodTPed() {
        return codTPed;
    }

    public void setCodTPed(String codTPed) {
        this.codTPed = codTPed;
    }

    public String getCodFpago() {
        return codFpago;
    }

    public void setCodFpago(String codFpago) {
        this.codFpago = codFpago;
    }

    public Short getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(Short tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public Date getFRecepcion() {
        return fRecepcion;
    }

    public void setFRecepcion(Date fRecepcion) {
        this.fRecepcion = fRecepcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFAprobacion() {
        return fAprobacion;
    }

    public void setFAprobacion(Date fAprobacion) {
        this.fAprobacion = fAprobacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaEntregaReal() {
        return fechaEntregaReal;
    }

    public void setFechaEntregaReal(Date fechaEntregaReal) {
        this.fechaEntregaReal = fechaEntregaReal;
    }

    public Date getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(Date fechaVence) {
        this.fechaVence = fechaVence;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public BigDecimal getPesoPedido() {
        return pesoPedido;
    }

    public void setPesoPedido(BigDecimal pesoPedido) {
        this.pesoPedido = pesoPedido;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getSecuenciaRuta() {
        return secuenciaRuta;
    }

    public void setSecuenciaRuta(String secuenciaRuta) {
        this.secuenciaRuta = secuenciaRuta;
    }

    public String getTipoPrecio() {
        return tipoPrecio;
    }

    public void setTipoPrecio(String tipoPrecio) {
        this.tipoPrecio = tipoPrecio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTImpuesto() {
        return tImpuesto;
    }

    public void setTImpuesto(BigDecimal tImpuesto) {
        this.tImpuesto = tImpuesto;
    }

    public BigDecimal getTPrecio() {
        return tPrecio;
    }

    public void setTPrecio(BigDecimal tPrecio) {
        this.tPrecio = tPrecio;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    public BigDecimal getImpIsc() {
        return impIsc;
    }

    public void setImpIsc(BigDecimal impIsc) {
        this.impIsc = impIsc;
    }

    public BigDecimal getCantAutorizar() {
        return cantAutorizar;
    }

    public void setCantAutorizar(BigDecimal cantAutorizar) {
        this.cantAutorizar = cantAutorizar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public String getCuserAuto() {
        return cuserAuto;
    }

    public void setCuserAuto(String cuserAuto) {
        this.cuserAuto = cuserAuto;
    }

    public Date getFechaSys() {
        return fechaSys;
    }

    public void setFechaSys(Date fechaSys) {
        this.fechaSys = fechaSys;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public String getIndGuiado() {
        return indGuiado;
    }

    public void setIndGuiado(String indGuiado) {
        this.indGuiado = indGuiado;
    }

    public String getMotivoDeNoDespacho() {
        return motivoDeNoDespacho;
    }

    public void setMotivoDeNoDespacho(String motivoDeNoDespacho) {
        this.motivoDeNoDespacho = motivoDeNoDespacho;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNoDocu() {
        return noDocu;
    }

    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getTiDespacho() {
        return tiDespacho;
    }

    public void setTiDespacho(String tiDespacho) {
        this.tiDespacho = tiDespacho;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipoFact() {
        return tipoFact;
    }

    public void setTipoFact(String tipoFact) {
        this.tipoFact = tipoFact;
    }

    public String getCodTransp() {
        return codTransp;
    }

    public void setCodTransp(String codTransp) {
        this.codTransp = codTransp;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Short getNoSalida() {
        return noSalida;
    }

    public void setNoSalida(Short noSalida) {
        this.noSalida = noSalida;
    }

    public String getNoSolic() {
        return noSolic;
    }

    public void setNoSolic(String noSolic) {
        this.noSolic = noSolic;
    }

    public String getObserva() {
        return observa;
    }

    public void setObserva(String observa) {
        this.observa = observa;
    }

    public Short getPerDeGracia() {
        return perDeGracia;
    }

    public void setPerDeGracia(Short perDeGracia) {
        this.perDeGracia = perDeGracia;
    }

    public String getTipoDeGracia() {
        return tipoDeGracia;
    }

    public void setTipoDeGracia(String tipoDeGracia) {
        this.tipoDeGracia = tipoDeGracia;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public Short getNoCuotas() {
        return noCuotas;
    }

    public void setNoCuotas(Short noCuotas) {
        this.noCuotas = noCuotas;
    }

    public BigDecimal getGastoDeFletes() {
        return gastoDeFletes;
    }

    public void setGastoDeFletes(BigDecimal gastoDeFletes) {
        this.gastoDeFletes = gastoDeFletes;
    }

    public BigDecimal getGastoDeSeguros() {
        return gastoDeSeguros;
    }

    public void setGastoDeSeguros(BigDecimal gastoDeSeguros) {
        this.gastoDeSeguros = gastoDeSeguros;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getUbiDir() {
        return ubiDir;
    }

    public void setUbiDir(String ubiDir) {
        this.ubiDir = ubiDir;
    }

    public String getUbiEnt() {
        return ubiEnt;
    }

    public void setUbiEnt(String ubiEnt) {
        this.ubiEnt = ubiEnt;
    }

    public BigDecimal getPorcGasto() {
        return porcGasto;
    }

    public void setPorcGasto(BigDecimal porcGasto) {
        this.porcGasto = porcGasto;
    }

    public BigDecimal getGastoFinan() {
        return gastoFinan;
    }

    public void setGastoFinan(BigDecimal gastoFinan) {
        this.gastoFinan = gastoFinan;
    }

    public String getCodiZzona() {
        return codiZzona;
    }

    public void setCodiZzona(String codiZzona) {
        this.codiZzona = codiZzona;
    }

    public String getCodiZona() {
        return codiZona;
    }

    public void setCodiZona(String codiZona) {
        this.codiZona = codiZona;
    }

    public String getCodiCole() {
        return codiCole;
    }

    public void setCodiCole(String codiCole) {
        this.codiCole = codiCole;
    }

    public String getCodiDepa() {
        return codiDepa;
    }

    public void setCodiDepa(String codiDepa) {
        this.codiDepa = codiDepa;
    }

    public String getCodiProv() {
        return codiProv;
    }

    public void setCodiProv(String codiProv) {
        this.codiProv = codiProv;
    }

    public String getCodiDist() {
        return codiDist;
    }

    public void setCodiDist(String codiDist) {
        this.codiDist = codiDist;
    }

    public String getCodiPromo() {
        return codiPromo;
    }

    public void setCodiPromo(String codiPromo) {
        this.codiPromo = codiPromo;
    }

    public String getNoGuia() {
        return noGuia;
    }

    public void setNoGuia(String noGuia) {
        this.noGuia = noGuia;
    }

    public String getMotivoTraslado() {
        return motivoTraslado;
    }

    public void setMotivoTraslado(String motivoTraslado) {
        this.motivoTraslado = motivoTraslado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNoFactu() {
        return noFactu;
    }

    public void setNoFactu(String noFactu) {
        this.noFactu = noFactu;
    }

    public BigDecimal getTDescuento() {
        return tDescuento;
    }

    public void setTDescuento(BigDecimal tDescuento) {
        this.tDescuento = tDescuento;
    }

    public BigDecimal getPDsctoGlobal() {
        return pDsctoGlobal;
    }

    public void setPDsctoGlobal(BigDecimal pDsctoGlobal) {
        this.pDsctoGlobal = pDsctoGlobal;
    }

    public Date getFechaDocRef() {
        return fechaDocRef;
    }

    public void setFechaDocRef(Date fechaDocRef) {
        this.fechaDocRef = fechaDocRef;
    }

    public String getTipoDocRef() {
        return tipoDocRef;
    }

    public void setTipoDocRef(String tipoDocRef) {
        this.tipoDocRef = tipoDocRef;
    }

    public String getCodClasPed() {
        return codClasPed;
    }

    public void setCodClasPed(String codClasPed) {
        this.codClasPed = codClasPed;
    }

    public String getTipoFpago() {
        return tipoFpago;
    }

    public void setTipoFpago(String tipoFpago) {
        this.tipoFpago = tipoFpago;
    }

    public BigDecimal getTDsctoGlobal() {
        return tDsctoGlobal;
    }

    public void setTDsctoGlobal(BigDecimal tDsctoGlobal) {
        this.tDsctoGlobal = tDsctoGlobal;
    }

    public BigDecimal getTValorVenta() {
        return tValorVenta;
    }

    public void setTValorVenta(BigDecimal tValorVenta) {
        this.tValorVenta = tValorVenta;
    }

    public String getMotivoNoAtencion() {
        return motivoNoAtencion;
    }

    public void setMotivoNoAtencion(String motivoNoAtencion) {
        this.motivoNoAtencion = motivoNoAtencion;
    }

    public String getCodTienda() {
        return codTienda;
    }

    public void setCodTienda(String codTienda) {
        this.codTienda = codTienda;
    }

    public String getNombTienda() {
        return nombTienda;
    }

    public void setNombTienda(String nombTienda) {
        this.nombTienda = nombTienda;
    }

    public String getDirecTienda() {
        return direcTienda;
    }

    public void setDirecTienda(String direcTienda) {
        this.direcTienda = direcTienda;
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

    public String getTipoArti() {
        return tipoArti;
    }

    public void setTipoArti(String tipoArti) {
        this.tipoArti = tipoArti;
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

    public String getTipoDocCli() {
        return tipoDocCli;
    }

    public void setTipoDocCli(String tipoDocCli) {
        this.tipoDocCli = tipoDocCli;
    }

    public String getNumDocCli() {
        return numDocCli;
    }

    public void setNumDocCli(String numDocCli) {
        this.numDocCli = numDocCli;
    }

    public String getOrigenDirec() {
        return origenDirec;
    }

    public void setOrigenDirec(String origenDirec) {
        this.origenDirec = origenDirec;
    }

    public String getCodDirEntrega() {
        return codDirEntrega;
    }

    public void setCodDirEntrega(String codDirEntrega) {
        this.codDirEntrega = codDirEntrega;
    }

    public Date getFechaNoAtencion() {
        return fechaNoAtencion;
    }

    public void setFechaNoAtencion(Date fechaNoAtencion) {
        this.fechaNoAtencion = fechaNoAtencion;
    }

    public String getCodDirSalida() {
        return codDirSalida;
    }

    public void setCodDirSalida(String codDirSalida) {
        this.codDirSalida = codDirSalida;
    }

    public String getNoClienteSalida() {
        return noClienteSalida;
    }

    public void setNoClienteSalida(String noClienteSalida) {
        this.noClienteSalida = noClienteSalida;
    }

    public String getTipoObse() {
        return tipoObse;
    }

    public void setTipoObse(String tipoObse) {
        this.tipoObse = tipoObse;
    }

    public String getCodObse() {
        return codObse;
    }

    public void setCodObse(String codObse) {
        this.codObse = codObse;
    }

    public String getEstadoAsignacion() {
        return estadoAsignacion;
    }

    public void setEstadoAsignacion(String estadoAsignacion) {
        this.estadoAsignacion = estadoAsignacion;
    }

    public Date getVigPrecInicio() {
        return vigPrecInicio;
    }

    public void setVigPrecInicio(Date vigPrecInicio) {
        this.vigPrecInicio = vigPrecInicio;
    }

    public Date getVigPrecFinal() {
        return vigPrecFinal;
    }

    public void setVigPrecFinal(Date vigPrecFinal) {
        this.vigPrecFinal = vigPrecFinal;
    }

    public String getListaPrecAnt() {
        return listaPrecAnt;
    }

    public void setListaPrecAnt(String listaPrecAnt) {
        this.listaPrecAnt = listaPrecAnt;
    }

    public String getUsuarioAprob() {
        return usuarioAprob;
    }

    public void setUsuarioAprob(String usuarioAprob) {
        this.usuarioAprob = usuarioAprob;
    }

    public String getIndVtaAnticipada() {
        return indVtaAnticipada;
    }

    public void setIndVtaAnticipada(String indVtaAnticipada) {
        this.indVtaAnticipada = indVtaAnticipada;
    }

    public String getIndDesp() {
        return indDesp;
    }

    public void setIndDesp(String indDesp) {
        this.indDesp = indDesp;
    }

    public String getCodTPedido() {
        return codTPedido;
    }

    public void setCodTPedido(String codTPedido) {
        this.codTPedido = codTPedido;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public BigDecimal getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(BigDecimal totalBruto) {
        this.totalBruto = totalBruto;
    }

    public BigDecimal getFlete() {
        return flete;
    }

    public void setFlete(BigDecimal flete) {
        this.flete = flete;
    }

    public String getCodTPed1() {
        return codTPed1;
    }

    public void setCodTPed1(String codTPed1) {
        this.codTPed1 = codTPed1;
    }

    public String getCodTPedb() {
        return codTPedb;
    }

    public void setCodTPedb(String codTPedb) {
        this.codTPedb = codTPedb;
    }

    public String getCodTPedn() {
        return codTPedn;
    }

    public void setCodTPedn(String codTPedn) {
        this.codTPedn = codTPedn;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getIndFactura1() {
        return indFactura1;
    }

    public void setIndFactura1(String indFactura1) {
        this.indFactura1 = indFactura1;
    }

    public String getIndBoleta1() {
        return indBoleta1;
    }

    public void setIndBoleta1(String indBoleta1) {
        this.indBoleta1 = indBoleta1;
    }

    public String getCodCaja() {
        return codCaja;
    }

    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }

    public String getCajera() {
        return cajera;
    }

    public void setCajera(String cajera) {
        this.cajera = cajera;
    }

    public String getTipoDocEmp() {
        return tipoDocEmp;
    }

    public void setTipoDocEmp(String tipoDocEmp) {
        this.tipoDocEmp = tipoDocEmp;
    }

    public String getNumDocEmp() {
        return numDocEmp;
    }

    public void setNumDocEmp(String numDocEmp) {
        this.numDocEmp = numDocEmp;
    }

    public String getCodiLocal() {
        return codiLocal;
    }

    public void setCodiLocal(String codiLocal) {
        this.codiLocal = codiLocal;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getIndNotaCred() {
        return indNotaCred;
    }

    public void setIndNotaCred(String indNotaCred) {
        this.indNotaCred = indNotaCred;
    }

    public String getIndExportacion() {
        return indExportacion;
    }

    public void setIndExportacion(String indExportacion) {
        this.indExportacion = indExportacion;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getIndFerias() {
        return indFerias;
    }

    public void setIndFerias(String indFerias) {
        this.indFerias = indFerias;
    }

    public String getUsuCierre() {
        return usuCierre;
    }

    public void setUsuCierre(String usuCierre) {
        this.usuCierre = usuCierre;
    }

    public String getIndProvincia() {
        return indProvincia;
    }

    public void setIndProvincia(String indProvincia) {
        this.indProvincia = indProvincia;
    }

    public String getCodPreOrden() {
        return codPreOrden;
    }

    public void setCodPreOrden(String codPreOrden) {
        this.codPreOrden = codPreOrden;
    }

    public BigDecimal getRedondeo() {
        return redondeo;
    }

    public void setRedondeo(BigDecimal redondeo) {
        this.redondeo = redondeo;
    }

    public String getIndCodBarra() {
        return indCodBarra;
    }

    public void setIndCodBarra(String indCodBarra) {
        this.indCodBarra = indCodBarra;
    }

    public String getIndFactTexto() {
        return indFactTexto;
    }

    public void setIndFactTexto(String indFactTexto) {
        this.indFactTexto = indFactTexto;
    }

    public String getTipoDocRef1() {
        return tipoDocRef1;
    }

    public void setTipoDocRef1(String tipoDocRef1) {
        this.tipoDocRef1 = tipoDocRef1;
    }

    public String getNoSolic1() {
        return noSolic1;
    }

    public void setNoSolic1(String noSolic1) {
        this.noSolic1 = noSolic1;
    }

    public String getIndGuiaTexto() {
        return indGuiaTexto;
    }

    public void setIndGuiaTexto(String indGuiaTexto) {
        this.indGuiaTexto = indGuiaTexto;
    }

    public String getCodBcard() {
        return codBcard;
    }

    public void setCodBcard(String codBcard) {
        this.codBcard = codBcard;
    }

    public String getObserva2() {
        return observa2;
    }

    public void setObserva2(String observa2) {
        this.observa2 = observa2;
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

    public String getFacturaTexto() {
        return facturaTexto;
    }

    public void setFacturaTexto(String facturaTexto) {
        this.facturaTexto = facturaTexto;
    }

    public BigDecimal getImpuestoFlete() {
        return impuestoFlete;
    }

    public void setImpuestoFlete(BigDecimal impuestoFlete) {
        this.impuestoFlete = impuestoFlete;
    }

    public BigDecimal getImpuestoGastosAdm() {
        return impuestoGastosAdm;
    }

    public void setImpuestoGastosAdm(BigDecimal impuestoGastosAdm) {
        this.impuestoGastosAdm = impuestoGastosAdm;
    }

    public BigDecimal getGastosAdministrativos() {
        return gastosAdministrativos;
    }

    public void setGastosAdministrativos(BigDecimal gastosAdministrativos) {
        this.gastosAdministrativos = gastosAdministrativos;
    }

    public String getOnLine() {
        return onLine;
    }

    public void setOnLine(String onLine) {
        this.onLine = onLine;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Short getPiezas() {
        return piezas;
    }

    public void setPiezas(Short piezas) {
        this.piezas = piezas;
    }

    public String getDepartamentoDest() {
        return departamentoDest;
    }

    public void setDepartamentoDest(String departamentoDest) {
        this.departamentoDest = departamentoDest;
    }

    public String getProvinciaDest() {
        return provinciaDest;
    }

    public void setProvinciaDest(String provinciaDest) {
        this.provinciaDest = provinciaDest;
    }

    public String getDistritoDest() {
        return distritoDest;
    }

    public void setDistritoDest(String distritoDest) {
        this.distritoDest = distritoDest;
    }

    public String getTelefonoDest() {
        return telefonoDest;
    }

    public void setTelefonoDest(String telefonoDest) {
        this.telefonoDest = telefonoDest;
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

    public String getNroConvenio() {
        return nroConvenio;
    }

    public void setNroConvenio(String nroConvenio) {
        this.nroConvenio = nroConvenio;
    }

    public String getContNeto() {
        return contNeto;
    }

    public void setContNeto(String contNeto) {
        this.contNeto = contNeto;
    }

    public String getMarca2() {
        return marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    public String getNoCliente1() {
        return noCliente1;
    }

    public void setNoCliente1(String noCliente1) {
        this.noCliente1 = noCliente1;
    }

    public String getCodiProfe() {
        return codiProfe;
    }

    public void setCodiProfe(String codiProfe) {
        this.codiProfe = codiProfe;
    }

    public String getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(String codAgente) {
        this.codAgente = codAgente;
    }

    public String getCodiCamp() {
        return codiCamp;
    }

    public void setCodiCamp(String codiCamp) {
        this.codiCamp = codiCamp;
    }
    /*
    public String getIndProforma1() {
        return indProforma1;
    }

    public void setIndProforma1(String indProforma1) {
        this.indProforma1 = indProforma1;
    }
    */
    /*
    public BigDecimal getACta() {
        return aCta;
    }

    public void setACta(BigDecimal aCta) {
        this.aCta = aCta;
    }
    */
    /*
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    */
    /*
    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }
    */
    /*
    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    */
    /*
    public String getIndPideLote() {
        return indPideLote;
    }

    public void setIndPideLote(String indPideLote) {
        this.indPideLote = indPideLote;
    }
    */
  /*
    public Date getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }
*/
    /*
    public String getCodMaquina() {
        return codMaquina;
    }

    public void setCodMaquina(String codMaquina) {
        this.codMaquina = codMaquina;
    }
    */
  /*
    public String getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(String codLugar) {
        this.codLugar = codLugar;
    }
*/
    /*
    public String getCodFrente() {
        return codFrente;
    }

    public void setCodFrente(String codFrente) {
        this.codFrente = codFrente;
    }
    */
    public Character getMotConting() {
        return motConting;
    }

    public void setMotConting(Character motConting) {
        this.motConting = motConting;
    }

    public BigDecimal getOperExoneradas() {
        return operExoneradas;
    }

    public void setOperExoneradas(BigDecimal operExoneradas) {
        this.operExoneradas = operExoneradas;
    }

    public BigDecimal getOperGratuitas() {
        return operGratuitas;
    }

    public void setOperGratuitas(BigDecimal operGratuitas) {
        this.operGratuitas = operGratuitas;
    }

    public BigDecimal getOperGravadas() {
        return operGravadas;
    }

    public void setOperGravadas(BigDecimal operGravadas) {
        this.operGravadas = operGravadas;
    }

    public BigDecimal getOperInafectas() {
        return operInafectas;
    }

    public void setOperInafectas(BigDecimal operInafectas) {
        this.operInafectas = operInafectas;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getEmailPedido() {
        return emailPedido;
    }

    public void setEmailPedido(String emailPedido) {
        this.emailPedido = emailPedido;
    }

    public String getCodDetrac() {
        return codDetrac;
    }

    public void setCodDetrac(String codDetrac) {
        this.codDetrac = codDetrac;
    }
    /*
    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }
    */
    /*
    public String getGuiaTemp() {
        return guiaTemp;
    }

    public void setGuiaTemp(String guiaTemp) {
        this.guiaTemp = guiaTemp;
    }
    */
    public List<Arpfol> getArpfolList() {
        return arpfolList;
    }

    public void setArpfolList(List<Arpfol> arpfolList) {
        this.arpfolList = arpfolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfoePK != null ? arpfoePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpfoe)) {
            return false;
        }
        Arpfoe other = (Arpfoe) object;
        if ((this.arpfoePK == null && other.arpfoePK != null) || (this.arpfoePK != null && !this.arpfoePK.equals(other.arpfoePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpfoe[ arpfoePK=" + arpfoePK + " ]";
    }

}
