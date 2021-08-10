package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ARPFFE")
public class Arpffe implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpffePK arpffePK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "NO_ORDEN")
    private String noOrden;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Column(name = "NO_FACTU")
    private String noFactu;
    @Column(name = "FECHA_SYS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSys;
    @Column(name = "ENTREGADO")
    private Character entregado;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "TIPO_DOC_REM")
    private String tipoDocRem;
    @Column(name = "SERIE_DOC_REM")
    private String serieDocRem;
    @Column(name = "CORR_DOC_REM")
    private String corrDocRem;
    @Column(name = "NO_DOCU")
    private String noDocu;
    @Column(name = "CUSER")
    private String cuser;
    @Column(name = "TIPO_TRANSC")
    private String tipoTransc;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "FEC_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCrea;
    @Column(name = "USU_CREA")
    private String usuCrea;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FEC_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModi;
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "PUNTO_PARTIDA")
    private String puntoPartida;
    @Column(name = "PUNTO_LLEGADA")
    private String puntoLlegada;
    @Column(name = "LLEGADA_DISTRITO")
    private String llegadaDistrito;
    @Column(name = "LLEGADA_PROVINCIA")
    private String llegadaProvincia;
    @Column(name = "LLEGADA_DEPARTAMENTO")
    private String llegadaDepartamento;
    @Column(name = "RAZON_SOCIAL_DESTINATARIO")
    private String razonSocialDestinatario;
    @Column(name = "RUC_DESTINATARIO")
    private String rucDestinatario;
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
    @Column(name = "VEHICULO")
    private String vehiculo;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "CERTIFICADO_INSCRIPCION")
    private String certificadoInscripcion;
    @Column(name = "BREVETE")
    private String brevete;
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
    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "NO_REFE")
    private String noRefe;
    @Column(name = "TIPO_DOC_REF")
    private String tipoDocRef;
    @Column(name = "NO_SOLIC")
    private String noSolic;
    @Column(name = "COD_FPAGO")
    private String codFpago;
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;
    @Column(name = "NOMB_TIENDA")
    private String nombTienda;
    @Column(name = "NOMBRE_DIGI")
    private String nombreDigi;
    @Column(name = "DIRECCION_DIGI")
    private String direccionDigi;
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "MOTIVO_ANULA")
    private String motivoAnula;
    @Column(name = "IND_FACTURA")
    private String indFactura;
    @Column(name = "IND_BOLETA")
    private String indBoleta;
    @Column(name = "F_ANULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fAnulacion;
    @Column(name = "COD_TIENDA")
    private String codTienda;
    @Column(name = "COD_DIR_ENTREGA")
    private String codDirEntrega;
    @Column(name = "COD_DIR_SALIDA")
    private String codDirSalida;
    @Column(name = "NO_GUIA_TRANSP")
    private String noGuiaTransp;
    @Column(name = "TIPO_GUIA")
    private String tipoGuia;
    @Column(name = "IMPRIME")
    private String imprime;
    @Column(name = "NO_DESP")
    private String noDesp;
    @Column(name = "ALIAS")
    private String alias;
    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "COD_CAJA")
    private String codCaja;
    @Column(name = "IND_FERIAS")
    private String indFerias;
    @Column(name = "IND_PROVINCIA")
    private String indProvincia;
    @Column(name = "CONSUMO")
    private String consumo;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "ESTADO_CONF_GUIA")
    private String estadoConfGuia;
    @Column(name = "NO_GUIA_DESP")
    private String noGuiaDesp;
    @Column(name = "USU_DESP")
    private String usuDesp;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    @Column(name = "IMPRIME_DESP")
    private String imprimeDesp;
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
    @Column(name = "ON_LINE")
    private String onLine;
    @Column(name = "NO_VENDEDOR1")
    private String noVendedor1;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "CODI_COLE")
    private String codiCole;
    @Column(name = "NRO_CONVENIO")
    private String nroConvenio;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "MARCA3")
    private String marca3;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "CODI_PROFE")
    private String codiProfe;
    @Column(name = "IND_FICTA")
    private String indFicta;
    @Column(name = "CODI_CAMP")
    private String codiCamp;
    @Column(name = "IND_PROFORMA")
    private String indProforma;
    @Column(name = "GR_REAL")
    private String grReal;
    @Column(name = "CANT_LINEAS")
    private BigInteger cantLineas;

    public Arpffe() {
    }

    public Arpffe(ArpffePK arpffePK) {
        this.arpffePK = arpffePK;
    }

    public Arpffe(String noCia, String bodega, String noGuia) {
        this.arpffePK = new ArpffePK(noCia, bodega, noGuia);
    }

    public ArpffePK getArpffePK() {
        return arpffePK;
    }

    public void setArpffePK(ArpffePK arpffePK) {
        this.arpffePK = arpffePK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getNoVendedor() {
        return noVendedor;
    }

    public void setNoVendedor(String noVendedor) {
        this.noVendedor = noVendedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(String noOrden) {
        this.noOrden = noOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNoFactu() {
        return noFactu;
    }

    public void setNoFactu(String noFactu) {
        this.noFactu = noFactu;
    }

    public Date getFechaSys() {
        return fechaSys;
    }

    public void setFechaSys(Date fechaSys) {
        this.fechaSys = fechaSys;
    }

    public Character getEntregado() {
        return entregado;
    }

    public void setEntregado(Character entregado) {
        this.entregado = entregado;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocRem() {
        return tipoDocRem;
    }

    public void setTipoDocRem(String tipoDocRem) {
        this.tipoDocRem = tipoDocRem;
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

    public String getNoDocu() {
        return noDocu;
    }

    public void setNoDocu(String noDocu) {
        this.noDocu = noDocu;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public String getTipoTransc() {
        return tipoTransc;
    }

    public void setTipoTransc(String tipoTransc) {
        this.tipoTransc = tipoTransc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecModi() {
        return fecModi;
    }

    public void setFecModi(Date fecModi) {
        this.fecModi = fecModi;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
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

    public String getRazonSocialDestinatario() {
        return razonSocialDestinatario;
    }

    public void setRazonSocialDestinatario(String razonSocialDestinatario) {
        this.razonSocialDestinatario = razonSocialDestinatario;
    }

    public String getRucDestinatario() {
        return rucDestinatario;
    }

    public void setRucDestinatario(String rucDestinatario) {
        this.rucDestinatario = rucDestinatario;
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

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCertificadoInscripcion() {
        return certificadoInscripcion;
    }

    public void setCertificadoInscripcion(String certificadoInscripcion) {
        this.certificadoInscripcion = certificadoInscripcion;
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete;
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

    public String getMotivoTraslado() {
        return motivoTraslado;
    }

    public void setMotivoTraslado(String motivoTraslado) {
        this.motivoTraslado = motivoTraslado;
    }

    public String getNoRefe() {
        return noRefe;
    }

    public void setNoRefe(String noRefe) {
        this.noRefe = noRefe;
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

    public String getNombTienda() {
        return nombTienda;
    }

    public void setNombTienda(String nombTienda) {
        this.nombTienda = nombTienda;
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

    public String getTipoArti() {
        return tipoArti;
    }

    public void setTipoArti(String tipoArti) {
        this.tipoArti = tipoArti;
    }

    public String getMotivoAnula() {
        return motivoAnula;
    }

    public void setMotivoAnula(String motivoAnula) {
        this.motivoAnula = motivoAnula;
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

    public String getNoGuiaTransp() {
        return noGuiaTransp;
    }

    public void setNoGuiaTransp(String noGuiaTransp) {
        this.noGuiaTransp = noGuiaTransp;
    }

    public String getTipoGuia() {
        return tipoGuia;
    }

    public void setTipoGuia(String tipoGuia) {
        this.tipoGuia = tipoGuia;
    }

    public String getImprime() {
        return imprime;
    }

    public void setImprime(String imprime) {
        this.imprime = imprime;
    }

    public String getNoDesp() {
        return noDesp;
    }

    public void setNoDesp(String noDesp) {
        this.noDesp = noDesp;
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

    public String getIndFerias() {
        return indFerias;
    }

    public void setIndFerias(String indFerias) {
        this.indFerias = indFerias;
    }

    public String getIndProvincia() {
        return indProvincia;
    }

    public void setIndProvincia(String indProvincia) {
        this.indProvincia = indProvincia;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getEstadoConfGuia() {
        return estadoConfGuia;
    }

    public void setEstadoConfGuia(String estadoConfGuia) {
        this.estadoConfGuia = estadoConfGuia;
    }

    public String getNoGuiaDesp() {
        return noGuiaDesp;
    }

    public void setNoGuiaDesp(String noGuiaDesp) {
        this.noGuiaDesp = noGuiaDesp;
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

    public String getImprimeDesp() {
        return imprimeDesp;
    }

    public void setImprimeDesp(String imprimeDesp) {
        this.imprimeDesp = imprimeDesp;
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

    public String getCodiCole() {
        return codiCole;
    }

    public void setCodiCole(String codiCole) {
        this.codiCole = codiCole;
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

    public String getIndFicta() {
        return indFicta;
    }

    public void setIndFicta(String indFicta) {
        this.indFicta = indFicta;
    }

    public String getCodiCamp() {
        return codiCamp;
    }

    public void setCodiCamp(String codiCamp) {
        this.codiCamp = codiCamp;
    }

    public String getIndProforma() {
        return indProforma;
    }

    public void setIndProforma(String indProforma) {
        this.indProforma = indProforma;
    }

    public String getGrReal() {
        return grReal;
    }

    public void setGrReal(String grReal) {
        this.grReal = grReal;
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
        hash += (arpffePK != null ? arpffePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpffe)) {
            return false;
        }
        Arpffe other = (Arpffe) object;
        if ((this.arpffePK == null && other.arpffePK != null) || (this.arpffePK != null && !this.arpffePK.equals(other.arpffePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpffe[ arpffePK=" + arpffePK + " ]";
    }
}
