package com.cdsi.backend.inve.models.services;

import java.util.List;

import com.cdsi.backend.inve.models.entity.TapUsuPven;


public interface ITapUsuPvenService {

	TapUsuPven listarPorId(String cia, String emp);
	
	List<TapUsuPven> listarCajeros(String cia,String centro);
}
