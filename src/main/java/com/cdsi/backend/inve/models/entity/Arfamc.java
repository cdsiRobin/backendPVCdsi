package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Arfamc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NO_CIA")
	private String cia;
	
	@Column(name="RAZON_SOCIAL")
	private String nombre;
	
	@Column(name="NOMBRE_ANO")
	private String nombreAno;
	
	@Column(name="NO_CLIENTE_ONLINE")
	private String ruc;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="BANCO")
	private String banco;
		
	@Column(name="CUENTA_SOL")
	private String cuentaSol;
	
	@Column(name = "CUENTA_DOL")
	private String cuentaDol;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name = "PORCEN_RETENCION")
	private String retencion;
	
	@Column(name = "PORCEN_PERCEPTION")
	private String percepcion;
	
	@Column(name = "NUM_CUENTA_DETRAC")
	private String cuentaDetrac;
    
	public String getRetencion() {
		return retencion;
	}

	public void setRetencion(String retencion) {
		this.retencion = retencion;
	}

	public String getPercepcion() {
		return percepcion;
	}

	public void setPercepcion(String percepcion) {
		this.percepcion = percepcion;
	}

	public String getCuentaDetrac() {
		return cuentaDetrac;
	}

	public void setCuentaDetrac(String cuentaDetrac) {
		this.cuentaDetrac = cuentaDetrac;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCuentaSol() {
		return cuentaSol;
	}

	public void setCuentaSol(String cuentaSol) {
		this.cuentaSol = cuentaSol;
	}

	public String getCuentaDol() {
		return cuentaDol;
	}

	public void setCuentaDol(String cuentaDol) {
		this.cuentaDol = cuentaDol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCia() {
		return cia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreAno() {
		return nombreAno;
	}

	public void setNombreAno(String nombreAno) {
		this.nombreAno = nombreAno;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
    /*
	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuentaSol() {
		return cuentaSol;
	}

	public void setCuentaSol(String cuentaSol) {
		this.cuentaSol = cuentaSol;
	}

	public String getCuentaDol() {
		return cuentaDol;
	}

	public void setCuentaDol(String cuentaDol) {
		this.cuentaDol = cuentaDol;
	}
	*/
	
}
