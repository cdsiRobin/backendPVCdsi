package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARCCTDA")
public class ArcctdaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArcctdaPKEntity arcctdaPKEntity;

    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "DIRE_OFI")
    private String direOfi;
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Column(name = "CODI_PROV")
    private String codiProv;
    @Column(name = "CODI_DIST")
    private String codiDist;

    @Column(name = "TIPO_DIR")
    private String tipoDir;
    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "TIPO_ENTI")
    private String tipoEnti;
    @Column(name = "COD_SUC")
    private String codSuc;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "ESTAB_SUNAT")
    private String estabSunat;

    @JoinColumns({
            @JoinColumn(name = "NO_CIA",referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_CLIENTE" , referencedColumnName = "NO_CLIENTE", insertable = false, updatable = false)})
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"arcctdaEntity","hibernateLazyInitializer","handler"})
    private Arccmc arccmc;

    public ArcctdaEntity() {
    }

    public ArcctdaEntity(ArcctdaPKEntity arcctdaPKEntity) {
        this.arcctdaPKEntity = arcctdaPKEntity;
    }

    public ArcctdaEntity(String noCia, String noCliente, String codTienda) {
        this.arcctdaPKEntity = new ArcctdaPKEntity(noCia, noCliente, codTienda);
    }

    public ArcctdaPKEntity getArcctdaPKEntity() {
        return arcctdaPKEntity;
    }

    public void setArcctdaPKEntity(ArcctdaPKEntity arcctdaPKEntity) {
        this.arcctdaPKEntity = arcctdaPKEntity;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDireOfi() {
        return direOfi;
    }

    public void setDireOfi(String direOfi) {
        this.direOfi = direOfi;
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

    public String getTipoDir() {
        return tipoDir;
    }

    public void setTipoDir(String tipoDir) {
        this.tipoDir = tipoDir;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getTipoEnti() {
        return tipoEnti;
    }

    public void setTipoEnti(String tipoEnti) {
        this.tipoEnti = tipoEnti;
    }

    public String getCodSuc() {
        return codSuc;
    }

    public void setCodSuc(String codSuc) {
        this.codSuc = codSuc;
    }

    public String getNoCliente1() {
        return noCliente1;
    }

    public void setNoCliente1(String noCliente1) {
        this.noCliente1 = noCliente1;
    }

    public String getEstabSunat() {
        return estabSunat;
    }

    public void setEstabSunat(String estabSunat) {
        this.estabSunat = estabSunat;
    }

    public Arccmc getArccmc() {
        return arccmc;
    }

    public void setArccmc(Arccmc arccmc) {
        this.arccmc = arccmc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arcctdaPKEntity != null ? arcctdaPKEntity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArcctdaEntity)) {
            return false;
        }
        ArcctdaEntity other = (ArcctdaEntity) object;
        if ((this.arcctdaPKEntity == null && other.arcctdaPKEntity != null) || (this.arcctdaPKEntity != null
                && !this.arcctdaPKEntity.equals(other.arcctdaPKEntity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityCXC.ArcctdaEntity[ arcctdaPKEntity=" + arcctdaPKEntity + " ]";
    }
}
