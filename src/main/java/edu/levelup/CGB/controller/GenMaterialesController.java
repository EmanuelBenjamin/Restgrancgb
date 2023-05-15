/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.CGB.controller;

import edu.levelup.CGB.dominio.GenMateriales;
import edu.levelup.CGB.repo.GenMaterialesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */
@RestController
@RequestMapping("/Materiales")
public class GenMaterialesController {

    @GetMapping("/hola")
    public String mensaje() {
        return "Hola mundo";
    }

    @Autowired
    private GenMaterialesRepository genmaterialesRepository;

    @GetMapping
    public List<GenMateriales> getAllMateriales() {
        return genmaterialesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<GenMateriales> getMaterialById(@PathVariable Long id) {
        return genmaterialesRepository.findById(id);
    }

    @PostMapping
    public GenMateriales addMateriales(@RequestBody GenMateriales genmaterial) {
        return genmaterialesRepository.save(genmaterial);
    }

    @PutMapping("/{id}")
    public GenMateriales updateMateriales(@RequestBody GenMateriales genmaterial, @PathVariable int id) {
        genmaterial.setId(id);
        return genmaterialesRepository.save(genmaterial);
    }

    @DeleteMapping("/{id}")
    public void deleteMateriales(@PathVariable Long id) {
        genmaterialesRepository.deleteById(id);
    }
}
