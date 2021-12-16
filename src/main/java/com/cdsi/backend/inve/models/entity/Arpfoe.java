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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ARPFOE")
public class Arpfoe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ArpfoePK arpfoePK;
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    @Column(name = "DIVISION")
    private String division;

    @Column(name = "NO_VENDEDOR")
    private String noVendedor;
    @Column(name = "COD_T_PED")
    private String codTPed;
    @Column(name = "COD_FPAGO")
    private String codFpago;

    @Column(name = "F_RECEPCION")
    @Temporal(TemporalType.DATE)
    private Date fRecepcion;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "F_APROBACION")
    @Temporal(TemporalType.DATE)
    private Date fAprobacion;
        
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
    @Column(name = "IMP_ISC")
    private BigDecimal impIsc;

    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "BODEGA")
    private String bodega;


    @Column(name = "IGV")
    private BigDecimal igv;
    @Column(name = "IND_GUIADO")
    private String indGuiado;
    
    @Column(name = "NO_SOLIC")
    private String noSolic;
    @Column(name = "OBSERVA")
    private String observa;
       
    @Column(name = "PER_DE_GRACIA")
    private Short perDeGracia;
    
    @Column(name = "DIRECCION_COMERCIAL")
    private String direccionComercial;
    
    @Column(name = "CODI_DEPA")
    private String codiDepa;
    @Column(name = "CODI_PROV")
    private String codiProv;
    @Column(name = "CODI_DIST")
    private String codiDist;

    @Column(name = "MOTIVO_TRASLADO")
    private String motivoTraslado;
    @Column(name = "NOMBRE_CLIENTE")
    private String nombreCliente;
    @Column(name = "RUC")
    private String ruc;

    @Column(name = "T_DESCUENTO")
    private BigDecimal tDescuento;

    @Column(name = "FECHA_DOC_REF")
    @Temporal(TemporalType.DATE)
    private Date fechaDocRef;
    @Column(name = "TIPO_DOC_REF")
    private String tipoDocRef;
    @Column(name = "COD_CLAS_PED")
    private String codClasPed;
    @Column(name = "TIPO_FPAGO")
    private String tipoFpago;
    @Column(name = "T_DSCTO_GLOBAL")
    private BigDecimal tDsctoGlobal;
    @Column(name = "T_VALOR_VENTA")
    private BigDecimal tValorVenta;

    @Column(name = "COD_TIENDA")
    private String codTienda;
    @Column(name = "NOMB_TIENDA")
    private String nombTienda;
    @Column(name = "DIREC_TIENDA")
    private String direcTienda;
    @Column(name = "ALMA_ORIGEN")
    private String almaOrigen;

    @Column(name = "TIPO_ARTI")
    private String tipoArti;

    @Column(name = "TIPO_DOC_CLI")
    private String tipoDocCli;
    @Column(name = "NUM_DOC_CLI")
    private String numDocCli;

    @Column(name = "TOTAL_BRUTO")
    private BigDecimal totalBruto;

    @Column(name = "TIPO")
    private String tipo;

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

    @Column(name = "CENTRO_COSTO")
    private String centroCosto;
    @Column(name = "IND_NOTA_CRED")
    private String indNotaCred;
    @Column(name = "IND_EXPORTACION")
    private String indExportacion;
    @Column(name = "CONSUMO")
    private String consumo;
    @Column(name = "IND_FERIAS")
    private String indFerias;
    @Column(name = "USU_CIERRE")
    private String usuCierre;
    @Column(name = "IND_PROVINCIA")
    private String indProvincia;

    @Column(name = "REDONDEO")
    private BigDecimal redondeo;
    @Column(name = "IND_COD_BARRA")
    private String indCodBarra;

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
    
     @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    @JoinColumns({
            @JoinColumn(name = "NO_CIA", referencedColumnName = "NO_CIA", insertable = false, updatable = false),
            @JoinColumn(name = "NO_ORDEN", referencedColumnName = "NO_ORDEN", insertable = false, updatable = false)})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Arpfol> arpfolList;
    

    public Arpfoe() {
    }

    public Arpfoe(ArpfoePK arpfoePK) {
        this.arpfoePK = arpfoePK;
    }

    public Arpfoe(String noCia, String noOrden) {
        this.arpfoePK = new ArpfoePK(noCia, noOrden);
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