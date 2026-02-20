package com.examenrico.danielml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.examenrico.danielml.model.Nave;
import com.examenrico.danielml.service.interfaces.NaveService;

@Service
public class NaveServiceImpl implements NaveService  {

    @Autowired
    private NaveService naveService;

    @Override
    public List<Nave> FindById(Long id) {
        return naveService.FindById(id);
    }

    @Override
    public List<Nave> findAll() {
        return naveService.findAll();
    }

    @Override
    public Nave updateNave(Nave nave) {
        return naveService.updateNave(nave);
    }

    @Override
    public void deleteNaveById(@RequestBody Long id) {
        naveService.deleteNaveById(id);
    }

    @Override
    public Nave addNave(Nave nave) {
        return naveService.addNave(nave);
    }
}
