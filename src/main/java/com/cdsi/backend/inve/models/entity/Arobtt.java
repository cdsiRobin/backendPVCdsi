package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NamedStoredProcedureQueries(
        {
                @NamedStoredProcedureQuery(
                        name="crear_file_plano_fe",
                        procedureName="FACTU.G_ARCHI_PLANO_FE",
                        resultClasses= Arobtt.class,
                        parameters={                                
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PCIA", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PCOD_SUC", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PTIP_DOCU", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.IN,  name="PNRO_DOCU", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.OUT, name="R_MSJ", type=String.class )
                        }
                ),
                @NamedStoredProcedureQuery(
                		name = "cxc_artstrd_pven",
            			procedureName = "CXC.P_PASE_A_CXC_PVENT",
            			resultClasses= Arobtt.class,
            			parameters = {
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="PNO_CIA", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="ptipo_m", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pcentro", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pcod_ven_cob", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pno_cliente", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="ptipo_doc", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pcod_doc", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pno_docu", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pmoneda_doc", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pimporte_doc", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pfecha_doc", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="ptipo_cambio_doc", type=BigDecimal.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pfecha_vence", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pTIPO_DOC_EMP", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pNUM_DOC_EMP", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pconvenio", type=String.class),
            					@StoredProcedureParameter(mode=ParameterMode.IN, name="pIND_FERIAS", type=String.class),
                                @StoredProcedureParameter(mode=ParameterMode.OUT, name="R_MSJ", type=String.class)
            			})
        }
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AROBTT")
public class Arobtt implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	protected ArobttPk arobttPk;
	
	@Column(name = "DESCRIP")
    private String descrip;

}
