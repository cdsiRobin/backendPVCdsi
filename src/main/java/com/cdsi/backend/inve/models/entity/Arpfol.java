package com.cdsi.backend.inve.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ARPFOL")
public class Arpfol implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected ArpfolPK arpfolPK;

    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "ARTI_NUEVO")
    private String artiNuevo;
    @Column(name = "BODEGA")
    private String bodega;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANT_COMP")
    private BigDecimal cantComp;
    @Column(name = "CANT_SOLICITADA")
    private BigDecimal cantSolicitada;
    @Column(name = "CANT_RESER")
    private BigDecimal cantReser;
    @Column(name = "CANT_RESER_DE_PROD")
    private BigDecimal cantReserDeProd;
    @Column(name = "CANT_ENTREG")
    private BigDecimal cantEntreg;
    @Column(name = "CANT_PPROC")
    private BigDecimal cantPproc;
    @Column(name = "CANT_ASIGNADA")
    private BigDecimal cantAsignada;
    @Column(name = "CANT_REASIGNADA")
    private BigDecimal cantReasignada;
    @Column(name = "CANT_AUTORIZAR")
    private BigDecimal cantAutorizar;
    @Column(name = "FECHA_DE_PROD_RESER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeProdReser;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "TIPO_DOC")
    private String tipoDoc;
    @Column(name = "NO_FACTU")
    private String noFactu;
    @Column(name = "TOT_LINEA")
    private BigDecimal totLinea;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "COD_CLI")
    private String codCli;
    @Column(name = "CAN_CLI")
    private BigDecimal canCli;
    @Column(name = "DSCTO_FPAGO")
    private BigDecimal dsctoFpago;
    @Column(name = "DSCTO_CLIENTE")
    private BigDecimal dsctoCliente;
    @Column(name = "DSCTO_PROMOCION")
    private BigDecimal dsctoPromocion;
    @Column(name = "DSCTO_OTROS")
    private BigDecimal dsctoOtros;
    @Column(name = "D_PROMO")
    private BigDecimal dPromo;
    @Column(name = "IGV")
    private BigDecimal igv;
    @Column(name = "D_COMER")
    private BigDecimal dComer;
    @Column(name = "D_FPAGO")
    private BigDecimal dFpago;
    @Column(name = "NO_LINEA")
    private Short noLinea;
    @Column(name = "FLETE")
    private BigDecimal flete;
    @Column(name = "P_DSCTO1")
    private BigDecimal pDscto1;
    @Column(name = "P_DSCTO2")
    private BigDecimal pDscto2;
    @Column(name = "P_DSCTO3")
    private BigDecimal pDscto3;
    @Column(name = "M_DSCTO1")
    private BigDecimal mDscto1;
    @Column(name = "M_DSCTO2")
    private BigDecimal mDscto2;
    @Column(name = "M_DSCTO3")
    private BigDecimal mDscto3;
    @Column(name = "LOTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lote;
    @Column(name = "NO_ENTRADA")
    private String noEntrada;
    @Column(name = "FECHA_RESERVA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReserva;
    @Column(name = "IMP_ISC")
    private BigDecimal impIsc;
    @Column(name = "IMP_IGV")
    private BigDecimal impIgv;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "RET_COMISION")
    private BigDecimal retComision;
    @Column(name = "CANT_TMP01")
    private BigDecimal cantTmp01;
    @Column(name = "CANT_TMP02")
    private BigDecimal cantTmp02;
    @Column(name = "CANT_TMP03")
    private BigDecimal cantTmp03;
    @Column(name = "CANT_TMP04")
    private BigDecimal cantTmp04;
    @Column(name = "CANT_TMP05")
    private BigDecimal cantTmp05;
    @Column(name = "CANT_SAL01")
    private BigDecimal cantSal01;
    @Column(name = "CANT_SAL02")
    private BigDecimal cantSal02;
    @Column(name = "CANT_SAL03")
    private BigDecimal cantSal03;
    @Column(name = "CANT_SAL04")
    private BigDecimal cantSal04;
    @Column(name = "CANT_SAL05")
    private BigDecimal cantSal05;
    @Column(name = "FECHA_REASIGNADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReasignado;
    @Column(name = "PRECIO_SIGV")
    private BigDecimal precioSigv;
    @Column(name = "TOTAL_LIN")
    private BigDecimal totalLin;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PARTE")
    private Short parte;
    @Column(name = "COD_PRE_ORDEN")
    private String codPreOrden;
    @Column(name = "TOT_LINEABK")
    private BigDecimal totLineabk;
    @Column(name = "CANT_ENTREG1")
    private BigDecimal cantEntreg1;
    @Column(name = "NO_ARTI1")
    private String noArti1;
    @Column(name = "MARCA2")
    private String marca2;
    @Column(name = "NO_CLIENTE1")
    private String noCliente1;
    @Column(name = "MARCA1")
    private String marca1;
    @Column(name = "TIPO_BS")
    private String tipoBs;
    @Column(name = "IND_PIDE_LOTE")
    private String indPideLote;
    @Column(name = "OPER_EXONERADAS")
    private BigDecimal operExoneradas;
    @Column(name = "OPER_GRATUITAS")
    private BigDecimal operGratuitas;
    @Column(name = "OPER_GRAVADAS")
    private BigDecimal operGravadas;
    @Column(name = "OPER_INAFECTAS")
    private BigDecimal operInafectas;
    @Column(name = "TIPO_AFECTACION")
    private String tipoAfectacion;
    @Column(name = "PRECIO_UNI")
    private BigDecimal precioUni;
    @Column(name = "TXT_COD_ALTER")
    private String txtCodAlter;
    @Column(name = "PREC_IGV")
    private BigDecimal precIgv;
    @Column(name = "MEDIDA")
    private String medida;

    public Arpfol() {
    }

    public Arpfol(ArpfolPK arpfolPK) {
        this.arpfolPK = arpfolPK;
    }

    public Arpfol(String noCia, String noOrden, String noArti) {
        this.arpfolPK = new ArpfolPK(noCia, noOrden, noArti);
    }

    public ArpfolPK getArpfolPK() {
        return arpfolPK;
    }

    public void setArpfolPK(ArpfolPK arpfolPK) {
        this.arpfolPK = arpfolPK;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getTipoArti() {
        return tipoArti;
    }

    public void setTipoArti(String tipoArti) {
        this.tipoArti = tipoArti;
    }

    public String getArtiNuevo() {
        return artiNuevo;
    }

    public void setArtiNuevo(String artiNuevo) {
        this.artiNuevo = artiNuevo;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public BigDecimal getCantComp() {
        return cantComp;
    }

    public void setCantComp(BigDecimal cantComp) {
        this.cantComp = cantComp;
    }

    public BigDecimal getCantSolicitada() {
        return cantSolicitada;
    }

    public void setCantSolicitada(BigDecimal cantSolicitada) {
        this.cantSolicitada = cantSolicitada;
    }

    public BigDecimal getCantReser() {
        return cantReser;
    }

    public void setCantReser(BigDecimal cantReser) {
        this.cantReser = cantReser;
    }

    public BigDecimal getCantReserDeProd() {
        return cantReserDeProd;
    }

    public void setCantReserDeProd(BigDecimal cantReserDeProd) {
        this.cantReserDeProd = cantReserDeProd;
    }

    public BigDecimal getCantEntreg() {
        return cantEntreg;
    }

    public void setCantEntreg(BigDecimal cantEntreg) {
        this.cantEntreg = cantEntreg;
    }

    public BigDecimal getCantPproc() {
        return cantPproc;
    }

    public void setCantPproc(BigDecimal cantPproc) {
        this.cantPproc = cantPproc;
    }

    public BigDecimal getCantAsignada() {
        return cantAsignada;
    }

    public void setCantAsignada(BigDecimal cantAsignada) {
        this.cantAsignada = cantAsignada;
    }

    public BigDecimal getCantReasignada() {
        return cantReasignada;
    }

    public void setCantReasignada(BigDecimal cantReasignada) {
        this.cantReasignada = cantReasignada;
    }

    public BigDecimal getCantAutorizar() {
        return cantAutorizar;
    }

    public void setCantAutorizar(BigDecimal cantAutorizar) {
        this.cantAutorizar = cantAutorizar;
    }

    public Date getFechaDeProdReser() {
        return fechaDeProdReser;
    }

    public void setFechaDeProdReser(Date fechaDeProdReser) {
        this.fechaDeProdReser = fechaDeProdReser;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNoFactu() {
        return noFactu;
    }

    public void setNoFactu(String noFactu) {
        this.noFactu = noFactu;
    }

    public BigDecimal getTotLinea() {
        return totLinea;
    }

    public void setTotLinea(BigDecimal totLinea) {
        this.totLinea = totLinea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodCli() {
        return codCli;
    }

    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }

    public BigDecimal getCanCli() {
        return canCli;
    }

    public void setCanCli(BigDecimal canCli) {
        this.canCli = canCli;
    }

    public BigDecimal getDsctoFpago() {
        return dsctoFpago;
    }

    public void setDsctoFpago(BigDecimal dsctoFpago) {
        this.dsctoFpago = dsctoFpago;
    }

    public BigDecimal getDsctoCliente() {
        return dsctoCliente;
    }

    public void setDsctoCliente(BigDecimal dsctoCliente) {
        this.dsctoCliente = dsctoCliente;
    }

    public BigDecimal getDsctoPromocion() {
        return dsctoPromocion;
    }

    public void setDsctoPromocion(BigDecimal dsctoPromocion) {
        this.dsctoPromocion = dsctoPromocion;
    }

    public BigDecimal getDsctoOtros() {
        return dsctoOtros;
    }

    public void setDsctoOtros(BigDecimal dsctoOtros) {
        this.dsctoOtros = dsctoOtros;
    }

    public BigDecimal getDPromo() {
        return dPromo;
    }

    public void setDPromo(BigDecimal dPromo) {
        this.dPromo = dPromo;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getDComer() {
        return dComer;
    }

    public void setDComer(BigDecimal dComer) {
        this.dComer = dComer;
    }

    public BigDecimal getDFpago() {
        return dFpago;
    }

    public void setDFpago(BigDecimal dFpago) {
        this.dFpago = dFpago;
    }

    public Short getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(Short noLinea) {
        this.noLinea = noLinea;
    }

    public BigDecimal getFlete() {
        return flete;
    }

    public void setFlete(BigDecimal flete) {
        this.flete = flete;
    }

    public BigDecimal getPDscto1() {
        return pDscto1;
    }

    public void setPDscto1(BigDecimal pDscto1) {
        this.pDscto1 = pDscto1;
    }

    public BigDecimal getPDscto2() {
        return pDscto2;
    }

    public void setPDscto2(BigDecimal pDscto2) {
        this.pDscto2 = pDscto2;
    }

    public BigDecimal getPDscto3() {
        return pDscto3;
    }

    public void setPDscto3(BigDecimal pDscto3) {
        this.pDscto3 = pDscto3;
    }

    public BigDecimal getMDscto1() {
        return mDscto1;
    }

    public void setMDscto1(BigDecimal mDscto1) {
        this.mDscto1 = mDscto1;
    }

    public BigDecimal getMDscto2() {
        return mDscto2;
    }

    public void setMDscto2(BigDecimal mDscto2) {
        this.mDscto2 = mDscto2;
    }

    public BigDecimal getMDscto3() {
        return mDscto3;
    }

    public void setMDscto3(BigDecimal mDscto3) {
        this.mDscto3 = mDscto3;
    }

    public Date getLote() {
        return lote;
    }

    public void setLote(Date lote) {
        this.lote = lote;
    }

    public String getNoEntrada() {
        return noEntrada;
    }

    public void setNoEntrada(String noEntrada) {
        this.noEntrada = noEntrada;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public BigDecimal getImpIsc() {
        return impIsc;
    }

    public void setImpIsc(BigDecimal impIsc) {
        this.impIsc = impIsc;
    }

    public BigDecimal getImpIgv() {
        return impIgv;
    }

    public void setImpIgv(BigDecimal impIgv) {
        this.impIgv = impIgv;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getRetComision() {
        return retComision;
    }

    public void setRetComision(BigDecimal retComision) {
        this.retComision = retComision;
    }

    public BigDecimal getCantTmp01() {
        return cantTmp01;
    }

    public void setCantTmp01(BigDecimal cantTmp01) {
        this.cantTmp01 = cantTmp01;
    }

    public BigDecimal getCantTmp02() {
        return cantTmp02;
    }

    public void setCantTmp02(BigDecimal cantTmp02) {
        this.cantTmp02 = cantTmp02;
    }

    public BigDecimal getCantTmp03() {
        return cantTmp03;
    }

    public void setCantTmp03(BigDecimal cantTmp03) {
        this.cantTmp03 = cantTmp03;
    }

    public BigDecimal getCantTmp04() {
        return cantTmp04;
    }

    public void setCantTmp04(BigDecimal cantTmp04) {
        this.cantTmp04 = cantTmp04;
    }

    public BigDecimal getCantTmp05() {
        return cantTmp05;
    }

    public void setCantTmp05(BigDecimal cantTmp05) {
        this.cantTmp05 = cantTmp05;
    }

    public BigDecimal getCantSal01() {
        return cantSal01;
    }

    public void setCantSal01(BigDecimal cantSal01) {
        this.cantSal01 = cantSal01;
    }

    public BigDecimal getCantSal02() {
        return cantSal02;
    }

    public void setCantSal02(BigDecimal cantSal02) {
        this.cantSal02 = cantSal02;
    }

    public BigDecimal getCantSal03() {
        return cantSal03;
    }

    public void setCantSal03(BigDecimal cantSal03) {
        this.cantSal03 = cantSal03;
    }

    public BigDecimal getCantSal04() {
        return cantSal04;
    }

    public void setCantSal04(BigDecimal cantSal04) {
        this.cantSal04 = cantSal04;
    }

    public BigDecimal getCantSal05() {
        return cantSal05;
    }

    public void setCantSal05(BigDecimal cantSal05) {
        this.cantSal05 = cantSal05;
    }

    public Date getFechaReasignado() {
        return fechaReasignado;
    }

    public void setFechaReasignado(Date fechaReasignado) {
        this.fechaReasignado = fechaReasignado;
    }

    public BigDecimal getPrecioSigv() {
        return precioSigv;
    }

    public void setPrecioSigv(BigDecimal precioSigv) {
        this.precioSigv = precioSigv;
    }

    public BigDecimal getTotalLin() {
        return totalLin;
    }

    public void setTotalLin(BigDecimal totalLin) {
        this.totalLin = totalLin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getParte() {
        return parte;
    }

    public void setParte(Short parte) {
        this.parte = parte;
    }

    public String getCodPreOrden() {
        return codPreOrden;
    }

    public void setCodPreOrden(String codPreOrden) {
        this.codPreOrden = codPreOrden;
    }

    public BigDecimal getTotLineabk() {
        return totLineabk;
    }

    public void setTotLineabk(BigDecimal totLineabk) {
        this.totLineabk = totLineabk;
    }

    public BigDecimal getCantEntreg1() {
        return cantEntreg1;
    }

    public void setCantEntreg1(BigDecimal cantEntreg1) {
        this.cantEntreg1 = cantEntreg1;
    }

    public String getNoArti1() {
        return noArti1;
    }

    public void setNoArti1(String noArti1) {
        this.noArti1 = noArti1;
    }

    public String getMarca2() {
        return marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    public String getNoCliente1() {
        return noCliente1;
    }

    public void setNoCliente1(String noCliente1) {
        this.noCliente1 = noCliente1;
    }

    public String getMarca1() {
        return marca1;
    }

    public void setMarca1(String marca1) {
        this.marca1 = marca1;
    }

    public String getTipoBs() {
        return tipoBs;
    }

    public void setTipoBs(String tipoBs) {
        this.tipoBs = tipoBs;
    }

    public String getIndPideLote() {
        return indPideLote;
    }

    public void setIndPideLote(String indPideLote) {
        this.indPideLote = indPideLote;
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

    public String getTipoAfectacion() {
        return tipoAfectacion;
    }

    public void setTipoAfectacion(String tipoAfectacion) {
        this.tipoAfectacion = tipoAfectacion;
    }

    public BigDecimal getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(BigDecimal precioUni) {
        this.precioUni = precioUni;
    }

    public String getTxtCodAlter() {
        return txtCodAlter;
    }

    public void setTxtCodAlter(String txtCodAlter) {
        this.txtCodAlter = txtCodAlter;
    }

    public BigDecimal getPrecIgv() {
        return precIgv;
    }

    public void setPrecIgv(BigDecimal precIgv) {
        this.precIgv = precIgv;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arpfolPK != null ? arpfolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arpfol)) {
            return false;
        }
        Arpfol other = (Arpfol) object;
        if ((this.arpfolPK == null && other.arpfolPK != null) || (this.arpfolPK != null && !this.arpfolPK.equals(other.arpfolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Arpfol[ arpfolPK=" + arpfolPK + " ]";
    }

}
