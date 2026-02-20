package com.examenrico.danielml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenrico.danielml.model.Nave;
import com.examenrico.danielml.repository.TripulanteRepo;
import com.examenrico.danielml.service.NaveServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/nave")
public class NaveRestController {

    @Autowired
    private NaveServiceImpl naveServiceImpl;

    @Autowired
    private TripulanteRepo tripulanteRepo;

    @GetMapping("/{id}")
    public List<Nave> findById(@RequestParam ("id") Long id) {
        return naveServiceImpl.FindById(id);

    }

    @GetMapping
    public List<Nave> findAll() {
        return naveServiceImpl.findAll();
    }

    @PostMapping("/save")
    public Nave addNave(@RequestBody Nave nave) {
        return naveServiceImpl.addNave(nave);
    }

    @DeleteMapping("/delete")
    public void deleteNaveById(@RequestBody Long id) {        
        naveServiceImpl.deleteNaveById(id);
    }

    @PostMapping("/update")
    public Nave updateNave(@RequestBody Nave nave) {        
        return naveServiceImpl.updateNave(nave);
    }
    
    
    
    
    
    
}
