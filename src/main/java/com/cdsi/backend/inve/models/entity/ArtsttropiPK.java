package com.cdsi.backend.inve.models.entity;

import java.io.Serializable;

public class ArtsttropiPK implements Serializable {
	
	private String NO_CIA;
	private String TIPO_M;
	private String TIPO_OPER_ITEM;
	private String COD_OPER_ITEM;
	
	public ArtsttropiPK() {
	}
	
	public ArtsttropiPK(String nO_CIA, String tIPO_M, String tIPO_OPER_ITEM, String cOD_OPER_ITEM) {
		NO_CIA = nO_CIA;
		TIPO_M = tIPO_M;
		TIPO_OPER_ITEM = tIPO_OPER_ITEM;
		COD_OPER_ITEM = cOD_OPER_ITEM;
	}

	public String getNO_CIA() {
		return NO_CIA;
	}

	public void setNO_CIA(String nO_CIA) {
		NO_CIA = nO_CIA;
	}

	public String getTIPO_M() {
		return TIPO_M;
	}

	public void setTIPO_M(String tIPO_M) {
		TIPO_M = tIPO_M;
	}

	public String getTIPO_OPER_ITEM() {
		return TIPO_OPER_ITEM;
	}

	public void setTIPO_OPER_ITEM(String tIPO_OPER_ITEM) {
		TIPO_OPER_ITEM = tIPO_OPER_ITEM;
	}

	public String getCOD_OPER_ITEM() {
		return COD_OPER_ITEM;
	}

	public void setCOD_OPER_ITEM(String cOD_OPER_ITEM) {
		COD_OPER_ITEM = cOD_OPER_ITEM;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((COD_OPER_ITEM == null) ? 0 : COD_OPER_ITEM.hashCode());
		result = prime * result + ((NO_CIA == null) ? 0 : NO_CIA.hashCode());
		result = prime * result + ((TIPO_M == null) ? 0 : TIPO_M.hashCode());
		result = prime * result + ((TIPO_OPER_ITEM == null) ? 0 : TIPO_OPER_ITEM.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArtsttropiPK other = (ArtsttropiPK) obj;
		if (COD_OPER_ITEM == null) {
			if (other.COD_OPER_ITEM != null)
				return false;
		} else if (!COD_OPER_ITEM.equals(other.COD_OPER_ITEM))
			return false;
		if (NO_CIA == null) {
			if (other.NO_CIA != null)
				return false;
		} else if (!NO_CIA.equals(other.NO_CIA))
			return false;
		if (TIPO_M == null) {
			if (other.TIPO_M != null)
				return false;
		} else if (!TIPO_M.equals(other.TIPO_M))
			return false;
		if (TIPO_OPER_ITEM == null) {
			if (other.TIPO_OPER_ITEM != null)
				return false;
		} else if (!TIPO_OPER_ITEM.equals(other.TIPO_OPER_ITEM))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArtsttropiPK [NO_CIA=" + NO_CIA + ", TIPO_M=" + TIPO_M + ", TIPO_OPER_ITEM=" + TIPO_OPER_ITEM
				+ ", COD_OPER_ITEM=" + COD_OPER_ITEM + "]";
	}

}
