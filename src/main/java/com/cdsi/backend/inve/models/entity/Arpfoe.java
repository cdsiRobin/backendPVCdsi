package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ARPFOE")
public class Arpfoe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfoePK arpfoePK;

    @Column(name = "NO_CLIENTE")
    private String noCliente;

    @Column(name = "NO_PROFORMA")
    private String noProforma;
    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "COD_T_PED")
    private String codTPed;
    @Column(name = "COD_FPAGO")
    private String codFpago;

    @Column(name = "TIPO_PRECIO")
    private String tipoPrecio;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "TIPO_CAMBIO")
    private BigDecimal tipoCambio;
    @Column(name = "SUB_TOTAL")
    private BigDecimal subTotal;
    @Column(name = "T_IMPUESTO")
    private BigDecimal tImpuesto;
    @Column(name = "T_PRECIO")
    private BigDecimal tPrecio;
    @Column(name = "IMPUESTO")
    private BigDecimal impuesto;

    @Column(name = "CANT_AUTORIZAR")
    private BigDecimal cantAutorizar;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "BODEGA")
    private String bodega;
    @Column(name = "CUSER")
    private String cuser;

    @Column(name = "IGV")
    private BigDecimal igv;

    @Column(name = "UBI_DIR")
    private String ubiDir;
    @Column(name = "UBI_ENT")
    private String ubiEnt;

    @Column(name = "NO_GUIA")
    private String noGuia;

    @Column(name = "RUC")
    private String ruc;
    @Column(name = "NO_FACTU")
    private String noFactu;
    @Column(name = "T_DESCUENTO")
    private BigDecimal tDescuento;
    @Column(name = "P_DSCTO_GLOBAL")
    private BigDecimal pDsctoGlobal;

    @Column(name = "COD_CLAS_PED")
    private String codClasPed;
    @Column(name = "TIPO_FPAGO")
    private String tipoFpago;
    @Column(name = "T_DSCTO_GLOBAL")
    private BigDecimal tDsctoGlobal;
    @Column(name = "T_VALOR_VENTA")
    private BigDecimal tValorVenta;

    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;
    @Column(name = "ALMA_DESTINO")
    private String almaDestino;

    @Column(name = "TIPO_DOC_CLI")
    private String tipoDocCli;
    @Column(name = "NUM_DOC_CLI")
    private String numDocCli;

    @Column(name = "IND_VTA_ANTICIPADA")
    private String indVtaAnticipada;

    @Column(name = "COD_T_PEDIDO")
    private String codTPedido;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "TOTAL_BRUTO")
    private BigDecimal totalBruto;

    @Column(name = "IND_PVENT")
    private String indPvent;
    @Column(name = "CENTRO")
    private String centro;
    @Column(name = "IND_FACTURA1")
    private String indFactura1;
    @Column(name = "IND_BOLETA1")
    private String indBoleta1;
    @Column(name = "COD_CAJA")
    private String codCaja;
    @Column(name = "CAJERA")
    private String cajera;
    @Column(name = "TIPO_DOC_EMP")
    private String tipoDocEmp;
    @Column(name = "NUM_DOC_EMP")
    private String numDocEmp;
    @Column(name = "CODI_LOCAL")
    private String codiLocal;

    @Column(name = "CENTRO_COSTO")
    private String centroCosto;

    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "REDONDEO")
    private BigDecimal redondeo;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;


    @Column(name = "IND_PROFORMA1")
    private String indProforma1;
    @Column(name = "A_CTA")
    private BigDecimal aCta;
    @Column(name = "SALDO")
    private BigDecimal saldo;

    @Column(name = "FECHA_ESTADO")
    @Temporal(TemporalType.DATE)
    private Date fechaEstado;
    @Column(name = "COMPRADOR")
    private String comprador;
    @Column(name = "MOT_CONTING")
    private Character motConting;
    @Column(name = "OPER_EXONERADAS")
    private BigDecimal operExoneradas;
    @Column(name = "OPER_GRATUITAS")
    private BigDecimal operGratuitas;
    @Column(name = "OPER_GRAVADAS")
    private BigDecimal operGravadas;
    @Column(name = "OPER_INAFECTAS")
    private BigDecimal operInafectas;
    @Column(name = "TIPO_OPERACION")
    private String tipoOperacion;
    @Column(name = "EMAIL_PEDIDO")
    private String emailPedido;
    @Column(name = "COD_DETRAC")
    private String codDetrac;
    @Column(name = "PORC_DETRAC")
    private BigDecimal porcDetrac;
    @Column(name = "NUM_CUENTA_DETRAC")
    private String numCuentaDetrac;
    @Column(name = "DETRACCION")
    private BigDecimal detraccion;
    @Column(name = "VALOR_REF_DETRAC")
    private BigDecimal valorRefDetrac;
    
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_ORDEN", referencedColumnName = "NO_ORDEN", insertable = false, updatable = false)})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arpfol> arpfolList;
    
    public List<Arpfol> getArpfolList() {
        return arpfolList;
    }

    public void setArpfolList(List<Arpfol> arpfolList) {
        this.arpfolList = arpfolList;
    }

    public Arpfoe() {
    }

    public Arpfoe(ArpfoePK arpfoePK) {
        this.arpfoePK = arpfoePK;
    }

    public Arpfoe(String noCia, String noOrden) {
        this.arpfoePK = new ArpfoePK(noCia, noOrden);
    }

    public ArpfoePK getArpfoePK() {
		return arpfoePK;
	}

	public void setArpfoePK(ArpfoePK arpfoePK) {
		this.arpfoePK = arpfoePK;
	}

	public String getNoCliente() {
		return noCliente;
	}

	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

	public String getNoProforma() {
		return noProforma;
	}

	public void setNoProforma(String noProforma) {
		this.noProforma = noProforma;
	}

	public String getNoVendedor() {
		return noVendedor;
	}

	public void setNoVendedor(String noVendedor) {
		this.noVendedor = noVendedor;
	}

	public String getCodTPed() {
		return codTPed;
	}

	public void setCodTPed(String codTPed) {
		this.codTPed = codTPed;
	}

	public String getCodFpago() {
		return codFpago;
	}

	public void setCodFpago(String codFpago) {
		this.codFpago = codFpago;
	}

	public String getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(String tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(BigDecimal tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal gettImpuesto() {
		return tImpuesto;
	}

	public void settImpuesto(BigDecimal tImpuesto) {
		this.tImpuesto = tImpuesto;
	}

	public BigDecimal gettPrecio() {
		return tPrecio;
	}

	public void settPrecio(BigDecimal tPrecio) {
		this.tPrecio = tPrecio;
	}

	public BigDecimal getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getCantAutorizar() {
		return cantAutorizar;
	}

	public void setCantAutorizar(BigDecimal cantAutorizar) {
		this.cantAutorizar = cantAutorizar;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public String getCuser() {
		return cuser;
	}

	public void setCuser(String cuser) {
		this.cuser = cuser;
	}

	public BigDecimal getIgv() {
		return igv;
	}

	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}

	public String getUbiDir() {
		return ubiDir;
	}

	public void setUbiDir(String ubiDir) {
		this.ubiDir = ubiDir;
	}

	public String getUbiEnt() {
		return ubiEnt;
	}

	public void setUbiEnt(String ubiEnt) {
		this.ubiEnt = ubiEnt;
	}

	public String getNoGuia() {
		return noGuia;
	}

	public void setNoGuia(String noGuia) {
		this.noGuia = noGuia;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNoFactu() {
		return noFactu;
	}

	public void setNoFactu(String noFactu) {
		this.noFactu = noFactu;
	}

	public BigDecimal gettDescuento() {
		return tDescuento;
	}

	public void settDescuento(BigDecimal tDescuento) {
		this.tDescuento = tDescuento;
	}

	public BigDecimal getpDsctoGlobal() {
		return pDsctoGlobal;
	}

	public void setpDsctoGlobal(BigDecimal pDsctoGlobal) {
		this.pDsctoGlobal = pDsctoGlobal;
	}

	public String getCodClasPed() {
		return codClasPed;
	}

	public void setCodClasPed(String codClasPed) {
		this.codClasPed = codClasPed;
	}

	public String getTipoFpago() {
		return tipoFpago;
	}

	public void setTipoFpago(String tipoFpago) {
		this.tipoFpago = tipoFpago;
	}

	public BigDecimal gettDsctoGlobal() {
		return tDsctoGlobal;
	}

	public void settDsctoGlobal(BigDecimal tDsctoGlobal) {
		this.tDsctoGlobal = tDsctoGlobal;
	}

	public BigDecimal gettValorVenta() {
		return tValorVenta;
	}

	public void settValorVenta(BigDecimal tValorVenta) {
		this.tValorVenta = tValorVenta;
	}

	public String getAlmaOrigen() {
		return almaOrigen;
	}

	public void setAlmaOrigen(String almaOrigen) {
		this.almaOrigen = almaOrigen;
	}

	public String getAlmaDestino() {
		return almaDestino;
	}

	public void setAlmaDestino(String almaDestino) {
		this.almaDestino = almaDestino;
	}

	public String getTipoDocCli() {
		return tipoDocCli;
	}

	public void setTipoDocCli(String tipoDocCli) {
		this.tipoDocCli = tipoDocCli;
	}

	public String getNumDocCli() {
		return numDocCli;
	}

	public void setNumDocCli(String numDocCli) {
		this.numDocCli = numDocCli;
	}

	public String getIndVtaAnticipada() {
		return indVtaAnticipada;
	}

	public void setIndVtaAnticipada(String indVtaAnticipada) {
		this.indVtaAnticipada = indVtaAnticipada;
	}

	public String getCodTPedido() {
		return codTPedido;
	}

	public void setCodTPedido(String codTPedido) {
		this.codTPedido = codTPedido;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public BigDecimal getTotalBruto() {
		return totalBruto;
	}

	public void setTotalBruto(BigDecimal totalBruto) {
		this.totalBruto = totalBruto;
	}

	public String getIndPvent() {
		return indPvent;
	}

	public void setIndPvent(String indPvent) {
		this.indPvent = indPvent;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getIndFactura1() {
		return indFactura1;
	}

	public void setIndFactura1(String indFactura1) {
		this.indFactura1 = indFactura1;
	}

	public String getIndBoleta1() {
		return indBoleta1;
	}

	public void setIndBoleta1(String indBoleta1) {
		this.indBoleta1 = indBoleta1;
	}

	public String getCodCaja() {
		return codCaja;
	}

	public void setCodCaja(String codCaja) {
		this.codCaja = codCaja;
	}

	public String getCajera() {
		return cajera;
	}

	public void setCajera(String cajera) {
		this.cajera = cajera;
	}

	public String getTipoDocEmp() {
		return tipoDocEmp;
	}

	public void setTipoDocEmp(String tipoDocEmp) {
		this.tipoDocEmp = tipoDocEmp;
	}

	public String getNumDocEmp() {
		return numDocEmp;
	}

	public void setNumDocEmp(String numDocEmp) {
		this.numDocEmp = numDocEmp;
	}

	public String getCodiLocal() {
		return codiLocal;
	}

	public void setCodiLocal(String codiLocal) {
		this.codiLocal = codiLocal;
	}

	public String getCentroCosto() {
		return centroCosto;
	}

	public void setCentroCosto(String centroCosto) {
		this.centroCosto = centroCosto;
	}

	public String getCodPreOrden() {
		return codPreOrden;
	}

	public void setCodPreOrden(String codPreOrden) {
		this.codPreOrden = codPreOrden;
	}

	public BigDecimal getRedondeo() {
		return redondeo;
	}

	public void setRedondeo(BigDecimal redondeo) {
		this.redondeo = redondeo;
	}

	public String getIndCodBarra() {
		return indCodBarra;
	}

	public void setIndCodBarra(String indCodBarra) {
		this.indCodBarra = indCodBarra;
	}

	public String getIndProforma1() {
		return indProforma1;
	}

	public void setIndProforma1(String indProforma1) {
		this.indProforma1 = indProforma1;
	}

	public BigDecimal getaCta() {
		return aCta;
	}

	public void setaCta(BigDecimal aCta) {
		this.aCta = aCta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Date getFechaEstado() {
		return fechaEstado;
	}

	public void setFechaEstado(Date fechaEstado) {
		this.fechaEstado = fechaEstado;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public Character getMotConting() {
		return motConting;
	}

	public void setMotConting(Character motConting) {
		this.motConting = motConting;
	}

	public BigDecimal getOperExoneradas() {
		return operExoneradas;
	}

	public void setOperExoneradas(BigDecimal operExoneradas) {
		this.operExoneradas = operExoneradas;
	}

	public BigDecimal getOperGratuitas() {
		return operGratuitas;
	}

	public void setOperGratuitas(BigDecimal operGratuitas) {
		this.operGratuitas = operGratuitas;
	}

	public BigDecimal getOperGravadas() {
		return operGravadas;
	}

	public void setOperGravadas(BigDecimal operGravadas) {
		this.operGravadas = operGravadas;
	}

	public BigDecimal getOperInafectas() {
		return operInafectas;
	}

	public void setOperInafectas(BigDecimal operInafectas) {
		this.operInafectas = operInafectas;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public String getEmailPedido() {
		return emailPedido;
	}

	public void setEmailPedido(String emailPedido) {
		this.emailPedido = emailPedido;
	}

	public String getCodDetrac() {
		return codDetrac;
	}

	public void setCodDetrac(String codDetrac) {
		this.codDetrac = codDetrac;
	}

	public BigDecimal getPorcDetrac() {
		return porcDetrac;
	}

	public void setPorcDetrac(BigDecimal porcDetrac) {
		this.porcDetrac = porcDetrac;
	}

	public String getNumCuentaDetrac() {
		return numCuentaDetrac;
	}

	public void setNumCuentaDetrac(String numCuentaDetrac) {
		this.numCuentaDetrac = numCuentaDetrac;
	}

	public BigDecimal getDetraccion() {
		return detraccion;
	}

	public void setDetraccion(BigDecimal detraccion) {
		this.detraccion = detraccion;
	}

	public BigDecimal getValorRefDetrac() {
		return valorRefDetrac;
	}

	public void setValorRefDetrac(BigDecimal valorRefDetrac) {
		this.valorRefDetrac = valorRefDetrac;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfoePK != null ? arpfoePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpfoe)) {
            return false;
        }
        Arpfoe other = (Arpfoe) object;
        if ((this.arpfoePK == null && other.arpfoePK != null) || (this.arpfoePK != null && !this.arpfoePK.equals(other.arpfoePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.factu.Arpfoe[ arpfoePK=" + arpfoePK + " ]";
    }
    
}