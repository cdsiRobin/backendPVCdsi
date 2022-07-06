package com.cdsi.backend.inve.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ARCCMC")
public class Arccmc implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArccmc objIdArc;
	
	@Size(min = 1, max=200)
	private String nombre;
	
	@Size(min = 0, max=200)
	private String direccion;
	
	private String ruc;
	
	@Column(name ="NU_DOCUMENTO")
	private String dni;

	@Column(name ="TELEFONO1")
	private String telefono;
	
	@Column(name ="TELEFONO2")
	private String celular;
	
	@Size(min = 1, max=1)
	private String extranjero;
	
	@Column(name="TIPO_PERSONA")
	@Size(min = 1, max=1)
	private String tipo;
	
	@Size(min = 1, max=1)
	private String activo;
	
	private String web;
	/*
	@Column(name="COD_PAIS")
	private String pais;
	*/
	
	@Column(name="TIPO_DOCUMENTO")
	@Size(min = 1, max=10)
	private String documento;
	
	private String email;
	
	private String clase; //020
	
	@Column(name="COD_PAIS")
	private String codPais; //001
	
	@Column(name="COD_VEN_COB")
	private String codVenCob; //001
	
	@Column(name="TIPO_FPAGO")
	private String tipoFpago; //20
	
	@Column(name="COD_FPAGO")
	private String codFpago; //01

	@JsonIgnoreProperties({"arccmc"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arccmc", cascade = CascadeType.ALL)
	private List<ArcctdaEntity> arcctdaEntity;
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public IdArccmc getObjIdArc() {
		return objIdArc;
	}

	public void setObjIdArc(IdArccmc objIdArc) {
		this.objIdArc = objIdArc;
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

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getExtranjero() {
		return extranjero;
	}

	public void setExtranjero(String extranjero) {
		this.extranjero = extranjero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
    /*
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
    */
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<ArcctdaEntity> getArcctdaEntity() {
		return arcctdaEntity;
	}

	public void setArcctdaEntity(List<ArcctdaEntity> arcctdaEntity) {
		this.arcctdaEntity = arcctdaEntity;
	}
	
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getCodVenCob() {
		return codVenCob;
	}

	public void setCodVenCob(String codVenCob) {
		this.codVenCob = codVenCob;
	}

	public String getTipoFpago() {
		return tipoFpago;
	}

	public void setTipoFpago(String tipoFpago) {
		this.tipoFpago = tipoFpago;
	}

	public String getCodFpago() {
		return codFpago;
	}

	public void setCodFpago(String codFpago) {
		this.codFpago = codFpago;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (objIdArc != null ? objIdArc.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Arccmc)) {
			return false;
		}
		Arccmc other = (Arccmc) object;
		if ((this.objIdArc == null && other.objIdArc != null) || (this.objIdArc != null && !this.objIdArc.equals(other.objIdArc))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EntityCXC.Arccmc[ arccmcPK=" + objIdArc + " ]";
	}
}
