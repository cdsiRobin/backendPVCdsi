package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ARPFFL")
public class Arpffl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfflPK arpfflPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "LOTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lote;
    @Column(name = "NO_ENTRADA")
    private String noEntrada;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "CANT_STOCK")
    private BigDecimal cantStock;
    @Column(name = "CANT_RESERVADO")
    private BigDecimal cantReservado;
    @Column(name = "IND_IMPRESION")
    private String indImpresion;
    @Column(name = "IND_PARENTESCO")
    private String indParentesco;
    @Column(name = "COD_CLI")
    private String codCli;
    @Column(name = "CAN_CLI")
    private BigDecimal canCli;
    @Column(name = "CANT_DEV")
    private BigDecimal cantDev;
    @Column(name = "NO_LINEA")
    private Short noLinea;
    @Column(name = "LINEA_PED")
    private Short lineaPed;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "RECIBIDO")
    private BigDecimal recibido;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "NO_ARTI1")
    private String noArti1;
    @Column(name = "MARCA3")
    private String marca3;
    @Column(name = "TIPO_BS")
    private String tipoBs;

    public Arpffl() {
    }

    public Arpffl(ArpfflPK arpfflPK) {
        this.arpfflPK = arpfflPK;
    }

    public Arpffl(ArpfflPK arpfflPK, BigDecimal cantidad) {
        this.arpfflPK = arpfflPK;
        this.cantidad = cantidad;
    }

    public Arpffl(String noCia, String bodega, String noGuia, String noArti) {
        this.arpfflPK = new ArpfflPK(noCia, bodega, noGuia, noArti);
    }

    public ArpfflPK getArpfflPK() {
        return arpfflPK;
    }

    public void setArpfflPK(ArpfflPK arpfflPK) {
        this.arpfflPK = arpfflPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCantStock() {
        return cantStock;
    }

    public void setCantStock(BigDecimal cantStock) {
        this.cantStock = cantStock;
    }

    public BigDecimal getCantReservado() {
        return cantReservado;
    }

    public void setCantReservado(BigDecimal cantReservado) {
        this.cantReservado = cantReservado;
    }

    public String getIndImpresion() {
        return indImpresion;
    }

    public void setIndImpresion(String indImpresion) {
        this.indImpresion = indImpresion;
    }

    public String getIndParentesco() {
        return indParentesco;
    }

    public void setIndParentesco(String indParentesco) {
        this.indParentesco = indParentesco;
    }

    public String getCodCli() {
        return codCli;
    }

    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }

    public BigDecimal getCanCli() {
        return canCli;
    }

    public void setCanCli(BigDecimal canCli) {
        this.canCli = canCli;
    }

    public BigDecimal getCantDev() {
        return cantDev;
    }

    public void setCantDev(BigDecimal cantDev) {
        this.cantDev = cantDev;
    }

    public Short getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(Short noLinea) {
        this.noLinea = noLinea;
    }

    public Short getLineaPed() {
        return lineaPed;
    }

    public void setLineaPed(Short lineaPed) {
        this.lineaPed = lineaPed;
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

    public String getCodPreOrden() {
        return codPreOrden;
    }

    public void setCodPreOrden(String codPreOrden) {
        this.codPreOrden = codPreOrden;
    }

    public BigDecimal getRecibido() {
        return recibido;
    }

    public void setRecibido(BigDecimal recibido) {
        this.recibido = recibido;
    }

    public String getIndCodBarra() {
        return indCodBarra;
    }

    public void setIndCodBarra(String indCodBarra) {
        this.indCodBarra = indCodBarra;
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

    public String getTipoBs() {
        return tipoBs;
    }

    public void setTipoBs(String tipoBs) {
        this.tipoBs = tipoBs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfflPK != null ? arpfflPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpffl)) {
            return false;
        }
        Arpffl other = (Arpffl) object;
        if ((this.arpfflPK == null && other.arpfflPK != null) || (this.arpfflPK != null && !this.arpfflPK.equals(other.arpfflPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpffl[ arpfflPK=" + arpfflPK + " ]";
    }
}
