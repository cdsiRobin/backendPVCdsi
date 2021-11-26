package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Arfatp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private IdArfatp idArfa;
	private String descripcion;
	private String moneda;
	
	@Column(name = "IND_AUTO")
	private String indAuto;
	@Column(name = "IND_GENERAL")
	private String indGeneral;
	@Column(name = "IND_PTOVTA")
	private String indPtovta;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public IdArfatp getIdArfa() {
		return idArfa;
	}
	public void setIdArfa(IdArfatp idArfa) {
		this.idArfa = idArfa;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getIndAuto() {
		return indAuto;
	}
	public void setIndAuto(String indAuto) {
		this.indAuto = indAuto;
	}
	public String getIndGeneral() {
		return indGeneral;
	}
	public void setIndGeneral(String indGeneral) {
		this.indGeneral = indGeneral;
	}
	public String getIndPtovta() {
		return indPtovta;
	}
	public void setIndPtovta(String indPtovta) {
		this.indPtovta = indPtovta;
	}
	
}
