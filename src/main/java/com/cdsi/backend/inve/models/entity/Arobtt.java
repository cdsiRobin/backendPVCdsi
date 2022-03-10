package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

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
                )
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
