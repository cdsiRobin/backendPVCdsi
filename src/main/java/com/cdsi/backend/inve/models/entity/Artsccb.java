package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cdsi.backend.inve.models.ArtsccbPK;
import com.cdsi.backend.inve.models.Artstcb;

@Entity
@Table(name = "ARTSCCB")
public class Artsccb implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArtsccbPK artsccbPK;
    @Column(name = "DESC_CABA")
    private String descCaba;
    @Column(name = "NO_RESPONSABLE")
    private String noResponsable;
    @Column(name = "NO_BANCO")
    private String noBanco;
    @Column(name = "CTA_BANCARIA")
    private String ctaBancaria;

    @Column(name = "CTA_N")
    private String ctaN;
    @Column(name = "CTA_D")
    private String ctaD;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FONDO_FIJO_N")
    private BigDecimal fondoFijoN;

    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "COD_DIARIO")
    private String codDiario;
    @Column(name = "IND_SOBREGIRO")
    private String indSobregiro;
    @Column(name = "IND_TRANSITORIO")
    private String indTransitorio;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "FEC_ULT_CIERRE")
    @Temporal(TemporalType.DATE)
    private Date fecUltCierre;
    @Column(name = "IND_GRF")
    private String indGrf;
    @Column(name = "IND_FAC_UNI")
    private String indFacUni;
    @Column(name = "IND_PORC_DESC")
    private String indPorcDesc;

    @JoinColumns({
        @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
        @JoinColumn(name = "TIPO_CABA", referencedColumnName = "TIPO_CABA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Artstcb artstcb;

    public Artsccb() {
    }

    public Artsccb(ArtsccbPK artsccbPK) {
        this.artsccbPK = artsccbPK;
    }

    public Artsccb(String noCia, String tipoCaba, String noCaba) {
        this.artsccbPK = new ArtsccbPK(noCia, tipoCaba, noCaba);
    }

    public ArtsccbPK getArtsccbPK() {
        return artsccbPK;
    }

    public void setArtsccbPK(ArtsccbPK artsccbPK) {
        this.artsccbPK = artsccbPK;
    }

    public String getDescCaba() {
        return descCaba;
    }

    public void setDescCaba(String descCaba) {
        this.descCaba = descCaba;
    }

    public String getNoResponsable() {
        return noResponsable;
    }

    public void setNoResponsable(String noResponsable) {
        this.noResponsable = noResponsable;
    }

    public String getNoBanco() {
        return noBanco;
    }

    public void setNoBanco(String noBanco) {
        this.noBanco = noBanco;
    }

    public String getCtaBancaria() {
        return ctaBancaria;
    }

    public void setCtaBancaria(String ctaBancaria) {
        this.ctaBancaria = ctaBancaria;
    }

    public String getCtaN() {
        return ctaN;
    }

    public void setCtaN(String ctaN) {
        this.ctaN = ctaN;
    }

    public String getCtaD() {
        return ctaD;
    }

    public void setCtaD(String ctaD) {
        this.ctaD = ctaD;
    }

    public BigDecimal getFondoFijoN() {
        return fondoFijoN;
    }

    public void setFondoFijoN(BigDecimal fondoFijoN) {
        this.fondoFijoN = fondoFijoN;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodDiario() {
        return codDiario;
    }

    public void setCodDiario(String codDiario) {
        this.codDiario = codDiario;
    }

    public String getIndSobregiro() {
        return indSobregiro;
    }

    public void setIndSobregiro(String indSobregiro) {
        this.indSobregiro = indSobregiro;
    }

    public String getIndTransitorio() {
        return indTransitorio;
    }

    public void setIndTransitorio(String indTransitorio) {
        this.indTransitorio = indTransitorio;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public Date getFecUltCierre() {
        return fecUltCierre;
    }

    public void setFecUltCierre(Date fecUltCierre) {
        this.fecUltCierre = fecUltCierre;
    }

    public String getIndGrf() {
        return indGrf;
    }

    public void setIndGrf(String indGrf) {
        this.indGrf = indGrf;
    }

    public String getIndFacUni() {
        return indFacUni;
    }

    public void setIndFacUni(String indFacUni) {
        this.indFacUni = indFacUni;
    }

    public String getIndPorcDesc() {
        return indPorcDesc;
    }

    public void setIndPorcDesc(String indPorcDesc) {
        this.indPorcDesc = indPorcDesc;
    }

    public Artstcb getArtstcb() {
        return artstcb;
    }

    public void setArtstcb(Artstcb artstcb) {
        this.artstcb = artstcb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artsccbPK != null ? artsccbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artsccb)) {
            return false;
        }
        Artsccb other = (Artsccb) object;
        if ((this.artsccbPK == null && other.artsccbPK != null) || (this.artsccbPK != null && !this.artsccbPK.equals(other.artsccbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.caja.Artsccb[ artsccbPK=" + artsccbPK + " ]";
    }
    
}

