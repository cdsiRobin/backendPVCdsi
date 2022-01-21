package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name = "ARINTD")
public class Arintd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArintdPK arintdPK;
    
    @Column(name = "TIPO_ARTI")
    private String tipoArti;
    @Column(name = "IND_TIPO_TRA")
    private String indTipoTra;
    @Column(name = "DESCRI")
    private String descri;
    @Column(name = "MOVIMI")
    private String movimi;
    @Column(name = "REG_MOV")
    private String regMov;
    @Column(name = "GUIA_FACTURA")
    private String guiaFactura;
    @Column(name = "DOCU_GENE")
    private String docuGene;
    @Column(name = "CTROL_SERIADO")
    private String ctrolSeriado;
    @Column(name = "CONTABILIZA")
    private String contabiliza;
    @Column(name = "AFECT_COST")
    private String afectCost;
    @Column(name = "COD_DIARIO")
    private String codDiario;
    @Column(name = "IND_KARDEX")
    private String indKardex;
    @Column(name = "IND_CONTROL")
    private String indControl;
    @Column(name = "IND_CONSU")
    private String indConsu;
    @Column(name = "IND_ACTU_STK")
    private String indActuStk;
    @Column(name = "TRASLADO_AUTO")
    private String trasladoAuto;
    @Column(name = "IND_TIPO_CONSU")
    private String indTipoConsu;
    @Column(name = "IND_ACTIVO")
    private String indActivo;
    @Column(name = "GRUPO_ORI")
    private String grupoOri;
    @Column(name = "ALMA_ORI")
    private String almaOri;
    @Column(name = "GRUPO_DES")
    private String grupoDes;
    @Column(name = "ALMA_DES")
    private String almaDes;
    @Column(name = "IND_DEVO")
    private String indDevo;
    @Column(name = "IND_PEDIDO")
    private String indPedido;
    @Column(name = "IND_NOTA_CRED")
    private String indNotaCred;
    @Column(name = "IND_FACTURA")
    private String indFactura;
    @Column(name = "IND_GUIA")
    private String indGuia;
    @Column(name = "ENTI_REFE")
    private String entiRefe;
    @Column(name = "DOCU_1_REFE")
    private String docu1Refe;
    @Column(name = "DOCU_2_REFE")
    private String docu2Refe;
    @Column(name = "TIPO_DEPEND")
    private String tipoDepend;
    @Column(name = "TIPO_TRAN_COMP")
    private String tipoTranComp;
    @Column(name = "TIPO_TRAN_REVE")
    private String tipoTranReve;
    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "IND_AJU_STOCK")
    private String indAjuStock;
    @Column(name = "ACTIVO")
    private String activo;
    @Column(name = "IND_EXPORTACION")
    private String indExportacion;
    @Column(name = "IND_VTA_ANTICIPADA")
    private String indVtaAnticipada;
    
    @Column(name = "TIPO_DEPEND1")
    private String tipoDepend1;
    @Column(name = "TIPO_TRAN_AUTO")
    private String tipoTranAuto;
    @Column(name = "SOL_PED")
    private String solPed;
    @Column(name = "ESTADO_ITEM")
    private String estadoItem;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "IND_AJU_CERO")
    private String indAjuCero;
    @Column(name = "SOLO_INVENT")
    private String soloInvent;
    @Column(name = "DEMASIA")
    private String demasia;
    @Column(name = "IND_NO_OBLIGA_CB")
    private String indNoObligaCb;
    @Column(name = "IND_FACT_TEXTO")
    private String indFactTexto;
    @Column(name = "IND_CAMPANA")
    private String indCampana;
    @Column(name = "INGRESA_COSTEO")
    private String ingresaCosteo;
    @Column(name = "IND_OPERAC_COSTEO")
    private String indOperacCosteo;
    @Column(name = "IND_GUIA_TEXTO")
    private String indGuiaTexto;

    @Column(name = "IND_GMPROD")
    private String indGmprod;
    @Column(name = "COD_TRANS_ANT")
    private String codTransAnt;
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "IND_COLEGIO")
    private String indColegio;
    @Column(name = "IND_FIN_PUBLIC")
    private String indFinPublic;
    @Column(name = "IND_CONTROL_IMPRENTA")
    private String indControlImprenta;
    @Column(name = "IND_CONTADO_NETO")
    private String indContadoNeto;
    @Column(name = "IND_PREC_V")
    private Character indPrecV;
    @Column(name = "SINFACBOL")
    private String sinfacbol;
    /*
    @JoinColumns({
        @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
        @JoinColumn(name = "CLASE_TRANSC", referencedColumnName = "CLASE_TRANSC")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Arinctd arinctd;
    */
    public Arintd() {
    }

    public Arintd(ArintdPK arintdPK) {
        this.arintdPK = arintdPK;
    }

    public Arintd(String noCia, String tipoM) {
        this.arintdPK = new ArintdPK(noCia, tipoM);
    }

    public ArintdPK getArintdPK() {
        return arintdPK;
    }

    public void setArintdPK(ArintdPK arintdPK) {
        this.arintdPK = arintdPK;
    }

    public String getTipoArti() {
        return tipoArti;
    }

    public void setTipoArti(String tipoArti) {
        this.tipoArti = tipoArti;
    }

    public String getIndTipoTra() {
        return indTipoTra;
    }

    public void setIndTipoTra(String indTipoTra) {
        this.indTipoTra = indTipoTra;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getMovimi() {
        return movimi;
    }

    public void setMovimi(String movimi) {
        this.movimi = movimi;
    }

    public String getRegMov() {
        return regMov;
    }

    public void setRegMov(String regMov) {
        this.regMov = regMov;
    }

    public String getGuiaFactura() {
        return guiaFactura;
    }

    public void setGuiaFactura(String guiaFactura) {
        this.guiaFactura = guiaFactura;
    }

    public String getDocuGene() {
        return docuGene;
    }

    public void setDocuGene(String docuGene) {
        this.docuGene = docuGene;
    }

    public String getCtrolSeriado() {
        return ctrolSeriado;
    }

    public void setCtrolSeriado(String ctrolSeriado) {
        this.ctrolSeriado = ctrolSeriado;
    }

    public String getContabiliza() {
        return contabiliza;
    }

    public void setContabiliza(String contabiliza) {
        this.contabiliza = contabiliza;
    }

    public String getAfectCost() {
        return afectCost;
    }

    public void setAfectCost(String afectCost) {
        this.afectCost = afectCost;
    }

    public String getCodDiario() {
        return codDiario;
    }

    public void setCodDiario(String codDiario) {
        this.codDiario = codDiario;
    }

    public String getIndKardex() {
        return indKardex;
    }

    public void setIndKardex(String indKardex) {
        this.indKardex = indKardex;
    }

    public String getIndControl() {
        return indControl;
    }

    public void setIndControl(String indControl) {
        this.indControl = indControl;
    }

    public String getIndConsu() {
        return indConsu;
    }

    public void setIndConsu(String indConsu) {
        this.indConsu = indConsu;
    }

    public String getIndActuStk() {
        return indActuStk;
    }

    public void setIndActuStk(String indActuStk) {
        this.indActuStk = indActuStk;
    }

    public String getTrasladoAuto() {
        return trasladoAuto;
    }

    public void setTrasladoAuto(String trasladoAuto) {
        this.trasladoAuto = trasladoAuto;
    }

    public String getIndTipoConsu() {
        return indTipoConsu;
    }

    public void setIndTipoConsu(String indTipoConsu) {
        this.indTipoConsu = indTipoConsu;
    }

    public String getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(String indActivo) {
        this.indActivo = indActivo;
    }

    public String getGrupoOri() {
        return grupoOri;
    }

    public void setGrupoOri(String grupoOri) {
        this.grupoOri = grupoOri;
    }

    public String getAlmaOri() {
        return almaOri;
    }

    public void setAlmaOri(String almaOri) {
        this.almaOri = almaOri;
    }

    public String getGrupoDes() {
        return grupoDes;
    }

    public void setGrupoDes(String grupoDes) {
        this.grupoDes = grupoDes;
    }

    public String getAlmaDes() {
        return almaDes;
    }

    public void setAlmaDes(String almaDes) {
        this.almaDes = almaDes;
    }

    public String getIndDevo() {
        return indDevo;
    }

    public void setIndDevo(String indDevo) {
        this.indDevo = indDevo;
    }

    public String getIndPedido() {
        return indPedido;
    }

    public void setIndPedido(String indPedido) {
        this.indPedido = indPedido;
    }

    public String getIndNotaCred() {
        return indNotaCred;
    }

    public void setIndNotaCred(String indNotaCred) {
        this.indNotaCred = indNotaCred;
    }

    public String getIndFactura() {
        return indFactura;
    }

    public void setIndFactura(String indFactura) {
        this.indFactura = indFactura;
    }

    public String getIndGuia() {
        return indGuia;
    }

    public void setIndGuia(String indGuia) {
        this.indGuia = indGuia;
    }

    public String getEntiRefe() {
        return entiRefe;
    }

    public void setEntiRefe(String entiRefe) {
        this.entiRefe = entiRefe;
    }

    public String getDocu1Refe() {
        return docu1Refe;
    }

    public void setDocu1Refe(String docu1Refe) {
        this.docu1Refe = docu1Refe;
    }

    public String getDocu2Refe() {
        return docu2Refe;
    }

    public void setDocu2Refe(String docu2Refe) {
        this.docu2Refe = docu2Refe;
    }

    public String getTipoDepend() {
        return tipoDepend;
    }

    public void setTipoDepend(String tipoDepend) {
        this.tipoDepend = tipoDepend;
    }

    public String getTipoTranComp() {
        return tipoTranComp;
    }

    public void setTipoTranComp(String tipoTranComp) {
        this.tipoTranComp = tipoTranComp;
    }

    public String getTipoTranReve() {
        return tipoTranReve;
    }

    public void setTipoTranReve(String tipoTranReve) {
        this.tipoTranReve = tipoTranReve;
    }

    public String getMotivoTraslado() {
        return motivoTraslado;
    }

    public void setMotivoTraslado(String motivoTraslado) {
        this.motivoTraslado = motivoTraslado;
    }

    public String getIndAjuStock() {
        return indAjuStock;
    }

    public void setIndAjuStock(String indAjuStock) {
        this.indAjuStock = indAjuStock;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getIndExportacion() {
        return indExportacion;
    }

    public void setIndExportacion(String indExportacion) {
        this.indExportacion = indExportacion;
    }

    public String getIndVtaAnticipada() {
        return indVtaAnticipada;
    }

    public void setIndVtaAnticipada(String indVtaAnticipada) {
        this.indVtaAnticipada = indVtaAnticipada;
    }

    public String getTipoDepend1() {
        return tipoDepend1;
    }

    public void setTipoDepend1(String tipoDepend1) {
        this.tipoDepend1 = tipoDepend1;
    }

    public String getTipoTranAuto() {
        return tipoTranAuto;
    }

    public void setTipoTranAuto(String tipoTranAuto) {
        this.tipoTranAuto = tipoTranAuto;
    }

    public String getSolPed() {
        return solPed;
    }

    public void setSolPed(String solPed) {
        this.solPed = solPed;
    }

    public String getEstadoItem() {
        return estadoItem;
    }

    public void setEstadoItem(String estadoItem) {
        this.estadoItem = estadoItem;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIndAjuCero() {
        return indAjuCero;
    }

    public void setIndAjuCero(String indAjuCero) {
        this.indAjuCero = indAjuCero;
    }

    public String getSoloInvent() {
        return soloInvent;
    }

    public void setSoloInvent(String soloInvent) {
        this.soloInvent = soloInvent;
    }

    public String getDemasia() {
        return demasia;
    }

    public void setDemasia(String demasia) {
        this.demasia = demasia;
    }

    public String getIndNoObligaCb() {
        return indNoObligaCb;
    }

    public void setIndNoObligaCb(String indNoObligaCb) {
        this.indNoObligaCb = indNoObligaCb;
    }

    public String getIndFactTexto() {
        return indFactTexto;
    }

    public void setIndFactTexto(String indFactTexto) {
        this.indFactTexto = indFactTexto;
    }

    public String getIndCampana() {
        return indCampana;
    }

    public void setIndCampana(String indCampana) {
        this.indCampana = indCampana;
    }

    public String getIngresaCosteo() {
        return ingresaCosteo;
    }

    public void setIngresaCosteo(String ingresaCosteo) {
        this.ingresaCosteo = ingresaCosteo;
    }

    public String getIndOperacCosteo() {
        return indOperacCosteo;
    }

    public void setIndOperacCosteo(String indOperacCosteo) {
        this.indOperacCosteo = indOperacCosteo;
    }

    public String getIndGuiaTexto() {
        return indGuiaTexto;
    }

    public void setIndGuiaTexto(String indGuiaTexto) {
        this.indGuiaTexto = indGuiaTexto;
    }

    public String getIndGmprod() {
        return indGmprod;
    }

    public void setIndGmprod(String indGmprod) {
        this.indGmprod = indGmprod;
    }

    public String getCodTransAnt() {
        return codTransAnt;
    }

    public void setCodTransAnt(String codTransAnt) {
        this.codTransAnt = codTransAnt;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getIndColegio() {
        return indColegio;
    }

    public void setIndColegio(String indColegio) {
        this.indColegio = indColegio;
    }

    public String getIndFinPublic() {
        return indFinPublic;
    }

    public void setIndFinPublic(String indFinPublic) {
        this.indFinPublic = indFinPublic;
    }

    public String getIndControlImprenta() {
        return indControlImprenta;
    }

    public void setIndControlImprenta(String indControlImprenta) {
        this.indControlImprenta = indControlImprenta;
    }

    public String getIndContadoNeto() {
        return indContadoNeto;
    }

    public void setIndContadoNeto(String indContadoNeto) {
        this.indContadoNeto = indContadoNeto;
    }

    public Character getIndPrecV() {
        return indPrecV;
    }

    public void setIndPrecV(Character indPrecV) {
        this.indPrecV = indPrecV;
    }

    public String getSinfacbol() {
        return sinfacbol;
    }

    public void setSinfacbol(String sinfacbol) {
        this.sinfacbol = sinfacbol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arintdPK != null ? arintdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arintd)) {
            return false;
        }
        Arintd other = (Arintd) object;
        if ((this.arintdPK == null && other.arintdPK != null) || (this.arintdPK != null && !this.arintdPK.equals(other.arintdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.migrarpv.inve.Arintd[ arintdPK=" + arintdPK + " ]";
    }
    
}
