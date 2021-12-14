package com.cdsi.backend.inve.models.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ARINMN1")
public class Arinmn1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Arinmn1PK arinmn1PK;
    @Column(name = "ANO")
    private Short ano;
    @Column(name = "MES")
    private Short mes;

    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIDADES")
    private BigDecimal unidades;
   
    @Column(name = "NO_LINEA")
    private Short noLinea;
    @Column(name = "NO_ORDEN")
    private String noOrden;


    @Column(name = "CONTENIDO")
    private BigDecimal contenido;
    

    public Arinmn1() {
    }

    public Arinmn1(Arinmn1PK arinmn1PK) {
        this.arinmn1PK = arinmn1PK;
    }

    public Arinmn1(String noCia, String bodega, String noArti, String tipoDoc, String noDocu) {
        this.arinmn1PK = new Arinmn1PK(noCia, bodega, noArti, tipoDoc, noDocu);
    }

    public Arinmn1PK getArinmn1PK() {
		return arinmn1PK;
	}

	public void setArinmn1PK(Arinmn1PK arinmn1pk) {
		arinmn1PK = arinmn1pk;
	}

	public Short getAno() {
		return ano;
	}

	public void setAno(Short ano) {
		this.ano = ano;
	}

	public Short getMes() {
		return mes;
	}

	public void setMes(Short mes) {
		this.mes = mes;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getUnidades() {
		return unidades;
	}

	public void setUnidades(BigDecimal unidades) {
		this.unidades = unidades;
	}

	public Short getNoLinea() {
		return noLinea;
	}

	public void setNoLinea(Short noLinea) {
		this.noLinea = noLinea;
	}

	public String getNoOrden() {
		return noOrden;
	}

	public void setNoOrden(String noOrden) {
		this.noOrden = noOrden;
	}

	public BigDecimal getContenido() {
		return contenido;
	}

	public void setContenido(BigDecimal contenido) {
		this.contenido = contenido;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arinmn1PK != null ? arinmn1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arinmn1)) {
            return false;
        }
        Arinmn1 other = (Arinmn1) object;
        if ((this.arinmn1PK == null && other.arinmn1PK != null) || (this.arinmn1PK != null && !this.arinmn1PK.equals(other.arinmn1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Arinmn1[ arinmn1PK=" + arinmn1PK + " ]";
    }
    
}
