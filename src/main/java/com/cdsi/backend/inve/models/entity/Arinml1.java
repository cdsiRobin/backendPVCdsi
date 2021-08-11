package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ARINML1")
public class Arinml1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Arinml1PK arinml1PK;
    @Column(name = "NO_LINEA")
    private Integer noLinea;
    @Column(name = "LOTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lote;
    @Column(name = "NO_ENTRADA")
    private String noEntrada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIDADES")
    private BigDecimal unidades;
    @Column(name = "CONTENIDO")
    private BigDecimal contenido;
    @Column(name = "CONTENIDO_UND")
    private String contenidoUnd;
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Column(name = "IND_CONTROL")
    private String indControl;
    @Column(name = "UND_REFERENCIA")
    private BigDecimal undReferencia;
    @Column(name = "LOTE_LOG")
    private Short loteLog;
    @Column(name = "MONEDA_ARTI")
    private String monedaArti;
    @Column(name = "LINEA_EXT")
    private Short lineaExt;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "OBSLIN")
    private String obslin;
    @Column(name = "NO_REQUI")
    private String noRequi;
    @Column(name = "COSTO_UNI")
    private BigDecimal costoUni;
    @Column(name = "STOCK_ALMACEN")
    private BigDecimal stockAlmacen;
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "CONSUMO")
    private BigDecimal consumo;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "COD_ANTIGUO")
    private String codAntiguo;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    @Column(name = "STOCK_ALMACEN1")
    private BigDecimal stockAlmacen1;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "COD_PRE_ORDEN1")
    private String codPreOrden1;
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
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "NO_ARTI1")
    private String noArti1;
    @Column(name = "MARCA3")
    private String marca3;
    /*
    @Column(name = "TIPO_BS")
    private String tipoBs;
    */
    public Arinml1() {
    }

    public Arinml1(Arinml1PK arinml1PK) {
        this.arinml1PK = arinml1PK;
    }

    public Arinml1(String noCia, String bodega, String tipoDoc, String noDocu, String noArti) {
        this.arinml1PK = new Arinml1PK(noCia, bodega, tipoDoc, noDocu, noArti);
    }

    public Arinml1PK getArinml1PK() {
        return arinml1PK;
    }

    public void setArinml1PK(Arinml1PK arinml1PK) {
        this.arinml1PK = arinml1PK;
    }

    public Integer getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(Integer noLinea) {
        this.noLinea = noLinea;
    }

    public Date getLote() {
        return lote;
    }

    public void setLote(Date lote) {
        this.lote = lote;
    }

    public String getNoEntrada() {
        return noEntrada;
    }

    public void setNoEntrada(String noEntrada) {
        this.noEntrada = noEntrada;
    }

    public BigDecimal getUnidades() {
        return unidades;
    }

    public void setUnidades(BigDecimal unidades) {
        this.unidades = unidades;
    }

    public BigDecimal getContenido() {
        return contenido;
    }

    public void setContenido(BigDecimal contenido) {
        this.contenido = contenido;
    }

    public String getContenidoUnd() {
        return contenidoUnd;
    }

    public void setContenidoUnd(String contenidoUnd) {
        this.contenidoUnd = contenidoUnd;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getIndControl() {
        return indControl;
    }

    public void setIndControl(String indControl) {
        this.indControl = indControl;
    }

    public BigDecimal getUndReferencia() {
        return undReferencia;
    }

    public void setUndReferencia(BigDecimal undReferencia) {
        this.undReferencia = undReferencia;
    }

    public Short getLoteLog() {
        return loteLog;
    }

    public void setLoteLog(Short loteLog) {
        this.loteLog = loteLog;
    }

    public String getMonedaArti() {
        return monedaArti;
    }

    public void setMonedaArti(String monedaArti) {
        this.monedaArti = monedaArti;
    }

    public Short getLineaExt() {
        return lineaExt;
    }

    public void setLineaExt(Short lineaExt) {
        this.lineaExt = lineaExt;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getObslin() {
        return obslin;
    }

    public void setObslin(String obslin) {
        this.obslin = obslin;
    }

    public String getNoRequi() {
        return noRequi;
    }

    public void setNoRequi(String noRequi) {
        this.noRequi = noRequi;
    }

    public BigDecimal getCostoUni() {
        return costoUni;
    }

    public void setCostoUni(BigDecimal costoUni) {
        this.costoUni = costoUni;
    }

    public BigDecimal getStockAlmacen() {
        return stockAlmacen;
    }

    public void setStockAlmacen(BigDecimal stockAlmacen) {
        this.stockAlmacen = stockAlmacen;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getConsumo() {
        return consumo;
    }

    public void setConsumo(BigDecimal consumo) {
        this.consumo = consumo;
    }

    public String getCodPreOrden() {
        return codPreOrden;
    }

    public void setCodPreOrden(String codPreOrden) {
        this.codPreOrden = codPreOrden;
    }

    public String getCodAntiguo() {
        return codAntiguo;
    }

    public void setCodAntiguo(String codAntiguo) {
        this.codAntiguo = codAntiguo;
    }

    public String getIndCodBarra() {
        return indCodBarra;
    }

    public void setIndCodBarra(String indCodBarra) {
        this.indCodBarra = indCodBarra;
    }

    public BigDecimal getStockAlmacen1() {
        return stockAlmacen1;
    }

    public void setStockAlmacen1(BigDecimal stockAlmacen1) {
        this.stockAlmacen1 = stockAlmacen1;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodPreOrden1() {
        return codPreOrden1;
    }

    public void setCodPreOrden1(String codPreOrden1) {
        this.codPreOrden1 = codPreOrden1;
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

    public String getMarca1() {
        return marca1;
    }

    public void setMarca1(String marca1) {
        this.marca1 = marca1;
    }

    public String getMarca2() {
        return marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    public String getNoArti1() {
        return noArti1;
    }

    public void setNoArti1(String noArti1) {
        this.noArti1 = noArti1;
    }

    public String getMarca3() {
        return marca3;
    }

    public void setMarca3(String marca3) {
        this.marca3 = marca3;
    }
    /*
    public String getTipoBs() {
        return tipoBs;
    }

    public void setTipoBs(String tipoBs) {
        this.tipoBs = tipoBs;
    }
    */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arinml1PK != null ? arinml1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinml1)) {
            return false;
        }
        Arinml1 other = (Arinml1) object;
        if ((this.arinml1PK == null && other.arinml1PK != null) || (this.arinml1PK != null && !this.arinml1PK.equals(other.arinml1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "INVE.Arinml1[ arinml1PK=" + arinml1PK + " ]";
    }
}
