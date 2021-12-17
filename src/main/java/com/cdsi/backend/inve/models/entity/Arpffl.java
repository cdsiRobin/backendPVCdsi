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

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;

    @Column(name = "NO_LINEA")
    private Short noLinea;

    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;

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

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public Short getNoLinea() {
		return noLinea;
	}

	public void setNoLinea(Short noLinea) {
		this.noLinea = noLinea;
	}

	public String getIndCodBarra() {
		return indCodBarra;
	}

	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
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
