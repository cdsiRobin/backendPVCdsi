package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "ARTSTCB")
public class Artstcb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArtstcbPK artstcbPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artstcb", fetch = FetchType.EAGER)
    private List<Artsccb> artsccbList;

    public Artstcb() {
    }

    public Artstcb(ArtstcbPK artstcbPK) {
        this.artstcbPK = artstcbPK;
    }

    public Artstcb(String noCia, String tipoCaba) {
        this.artstcbPK = new ArtstcbPK(noCia, tipoCaba);
    }

    public ArtstcbPK getArtstcbPK() {
        return artstcbPK;
    }

    public void setArtstcbPK(ArtstcbPK artstcbPK) {
        this.artstcbPK = artstcbPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Artsccb> getArtsccbList() {
        return artsccbList;
    }

    public void setArtsccbList(List<Artsccb> artsccbList) {
        this.artsccbList = artsccbList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artstcbPK != null ? artstcbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artstcb)) {
            return false;
        }
        Artstcb other = (Artstcb) object;
        if ((this.artstcbPK == null && other.artstcbPK != null) || (this.artstcbPK != null && !this.artstcbPK.equals(other.artstcbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.caja.Artstcb[ artstcbPK=" + artstcbPK + " ]";
    }
    
}