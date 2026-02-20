package com.examenrico.danielml.service.interfaces;

import java.util.List;

import com.examenrico.danielml.model.Nave;

public interface NaveService {

    public List<Nave> FindById(Long id);

    public List<Nave> findAll();

    public Nave updateNave(Nave nave);

    public void deleteNaveById(Long id);

    public Nave addNave(Nave nave);
    
}
    