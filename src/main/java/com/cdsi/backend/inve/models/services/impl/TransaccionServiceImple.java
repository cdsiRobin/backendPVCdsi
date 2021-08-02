package com.cdsi.backend.inve.models.services.impl;

import com.cdsi.backend.inve.models.dao.ITransaccionRepo;
import com.cdsi.backend.inve.models.entity.Transaccion;
import com.cdsi.backend.inve.models.services.ITransaccionService;
import com.cdsi.backend.inve.models.services.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class TransaccionServiceImple implements ITransaccionService {
    @Autowired
    private ITransaccionRepo iTransaccionRepo;

    @Override
    public List<Transaccion> findByCiaAndUser(String cia, String usuario) {
        try {
            return this.iTransaccionRepo.findByCiaAndUser(cia,usuario);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public Transaccion findById(Long id) throws ServiceException {
        return null;
    }

    @Override
    public List<Transaccion> getAll() throws ServiceException {
        return null;
    }

    @Override
    public List<Transaccion> findByLike(Transaccion transaccion) throws ServiceException {
        return null;
    }

    @Override
    public Transaccion save(Transaccion transaccion) throws ServiceException {
        return null;
    }

    @Override
    public Transaccion delete(Long id) throws ServiceException {
        return null;
    }
}
