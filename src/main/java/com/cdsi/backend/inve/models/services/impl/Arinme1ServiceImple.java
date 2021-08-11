package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.IArinme1Repo;
import com.cdsi.backend.inve.models.entity.Arinme1;
import com.cdsi.backend.inve.models.entity.Arinme1PK;
import com.cdsi.backend.inve.models.services.IArinme1Service;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Arinme1ServiceImple implements IArinme1Service {
    @Autowired
    private IArinme1Repo arinme1Repo;

    @Override
    public Arinme1 findById(Arinme1PK arinme1PK) throws ServiceException {
            Arinme1 arinme1 = this.arinme1Repo.findById(arinme1PK).orElse(null);
            return arinme1;
    }

    @Override
    public Page<Arinme1> buscarCia(int limit, int page,String cia) throws ServiceException {
        Pageable pageableRes = PageRequest.of(page,limit);
        Page<Arinme1> arinme1Page = this.arinme1Repo.buscarCia(cia,pageableRes);
        return arinme1Page;
    }


    @Override
    public Arinme1 findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Arinme1> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Arinme1> findByLike(Arinme1 arinme1) throws ServiceException {
        return null;
    }

    @Override
    public Arinme1 save(Arinme1 arinme1) throws ServiceException {
        return null;
    }

    @Override
    public Arinme1 delete(Long id) throws ServiceException {
        return null;
    }

}
