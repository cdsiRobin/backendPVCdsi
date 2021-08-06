package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ARFACC")
public class Arfacc implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArfaccPK arfaccPK;
    @Column(name = "ANO_DOC")
    private String anoDoc;
    @Column(name = "CONS_INICIO")
    private Long consInicio;
    @Column(name = "CONS_DESDE")
    private Long consDesde;
    @Column(name = "CONS_HASTA")
    private Long consHasta;
    @Column(name = "LINEAS")
    private Short lineas;
    @Column(name = "IND_CONTROL_AUTO")
    private String indControlAuto;
    @Column(name = "TIPO_M")
    private String tipoM;
    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "IND_FECHA_AUTO")
    private String indFechaAuto;
    @Column(name = "NO_CABA")
    private String noCaba;
    @Column(name = "FERIA")
    private String feria;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "USU_PROV")
    private String usuProv;
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
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "MARCA1")
    private String marca1;

    public Arfacc() {
    }

    public Arfacc(ArfaccPK arfaccPK) {
        this.arfaccPK = arfaccPK;
    }

    public Arfacc(String noCia, String centro, String tipoDoc, String serie) {
        this.arfaccPK = new ArfaccPK(noCia, centro, tipoDoc, serie);
    }

    public ArfaccPK getArfaccPK() {
        return arfaccPK;
    }

    public void setArfaccPK(ArfaccPK arfaccPK) {
        this.arfaccPK = arfaccPK;
    }

    public String getAnoDoc() {
        return anoDoc;
    }

    public void setAnoDoc(String anoDoc) {
        this.anoDoc = anoDoc;
    }

    public Long getConsInicio() {
        return consInicio;
    }

    public void setConsInicio(Long consInicio) {
        this.consInicio = consInicio;
    }

    public Long getConsDesde() {
        return consDesde;
    }

    public void setConsDesde(Long consDesde) {
        this.consDesde = consDesde;
    }

    public Long getConsHasta() {
        return consHasta;
    }

    public void setConsHasta(Long consHasta) {
        this.consHasta = consHasta;
    }

    public Short getLineas() {
        return lineas;
    }

    public void setLineas(Short lineas) {
        this.lineas = lineas;
    }

    public String getIndControlAuto() {
        return indControlAuto;
    }

    public void setIndControlAuto(String indControlAuto) {
        this.indControlAuto = indControlAuto;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getIndFechaAuto() {
        return indFechaAuto;
    }

    public void setIndFechaAuto(String indFechaAuto) {
        this.indFechaAuto = indFechaAuto;
    }

    public String getNoCaba() {
        return noCaba;
    }

    public void setNoCaba(String noCaba) {
        this.noCaba = noCaba;
    }

    public String getFeria() {
        return feria;
    }

    public void setFeria(String feria) {
        this.feria = feria;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getUsuProv() {
        return usuProv;
    }

    public void setUsuProv(String usuProv) {
        this.usuProv = usuProv;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMarca1() {
        return marca1;
    }

    public void setMarca1(String marca1) {
        this.marca1 = marca1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arfaccPK != null ? arfaccPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfacc)) {
            return false;
        }
        Arfacc other = (Arfacc) object;
        if ((this.arfaccPK == null && other.arfaccPK != null) || (this.arfaccPK != null && !this.arfaccPK.equals(other.arfaccPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arfacc[ arfaccPK=" + arfaccPK + " ]";
    }

}
