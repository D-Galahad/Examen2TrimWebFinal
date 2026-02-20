package com.examenrico.danielml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.examenrico.danielml.model.Nave;
import com.examenrico.danielml.service.interfaces.NaveService;

@Service
public class NaveServiceImpl implements NaveService  {

    @Autowired
    private NaveService naveService;

    @Transactional(readOnly = true)
    public List<Nave> FindById(Long id) {
        return naveService.FindById(id);
    }

    @Transactional(readOnly = true)
    public List<Nave> findAll() {
        return naveService.findAll();
    }

    @Transactional(readOnly = true)
    public Nave updateNave(Nave nave) {
        return naveService.updateNave(nave);
    }

    @Transactional(readOnly = true)
    public void deleteNaveById(@RequestBody Long id) {
        naveService.deleteNaveById(id);
    }

    @Transactional(readOnly = true)
    public Nave addNave(Nave nave) {
        return naveService.addNave(nave);
    }
}
