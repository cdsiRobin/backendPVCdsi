package com.cdsi.backend.inve.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArtsccbPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "TIPO_CABA")
    private String tipoCaba;
    @Basic(optional = false)
    @Column(name = "NO_CABA")
    private String noCaba;

    public ArtsccbPK() {
    }

    public ArtsccbPK(String noCia, String tipoCaba, String noCaba) {
        this.noCia = noCia;
        this.tipoCaba = tipoCaba;
        this.noCaba = noCaba;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getTipoCaba() {
        return tipoCaba;
    }

    public void setTipoCaba(String tipoCaba) {
        this.tipoCaba = tipoCaba;
    }

    public String getNoCaba() {
        return noCaba;
    }

    public void setNoCaba(String noCaba) {
        this.noCaba = noCaba;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (tipoCaba != null ? tipoCaba.hashCode() : 0);
        hash += (noCaba != null ? noCaba.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArtsccbPK)) {
            return false;
        }
        ArtsccbPK other = (ArtsccbPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.tipoCaba == null && other.tipoCaba != null) || (this.tipoCaba != null && !this.tipoCaba.equals(other.tipoCaba))) {
            return false;
        }
        if ((this.noCaba == null && other.noCaba != null) || (this.noCaba != null && !this.noCaba.equals(other.noCaba))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.caja.ArtsccbPK[ noCia=" + noCia + ", tipoCaba=" + tipoCaba + ", noCaba=" + noCaba + " ]";
    }
    
}
