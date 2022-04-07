package com.cdsi.backend.inve.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdsi.backend.inve.models.entity.Artsttropi;
import com.cdsi.backend.inve.models.entity.ArtsttropiPK;

@Repository
public interface IArtsttropiRepo extends PagingAndSortingRepository<Artsttropi, ArtsttropiPK> {
	
	@Query("SELECT a FROM Artsttropi a")
	List<Artsttropi> listar();

}