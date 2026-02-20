package com.examenrico.danielml.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.examenrico.danielml.model.Nave;
import com.examenrico.danielml.service.NaveServiceImpl;

@Controller
@RequestMapping("/nave")
public class NaveController {
    
    @Autowired
    private NaveServiceImpl naveServiceImpl;

    
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
