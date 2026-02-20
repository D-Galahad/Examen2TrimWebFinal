package com.examenrico.danielml.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.examenrico.danielml.model.Nave;
import com.examenrico.danielml.repository.TripulanteRepo;
import com.examenrico.danielml.service.NaveServiceImpl;
import com.examenrico.danielml.service.interfaces.NaveService;

@Controller
@RequestMapping("/nave")
public class NaveController {

    @Autowired
    private NaveService naveService;

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
        Model model;
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
