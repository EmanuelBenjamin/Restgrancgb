/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.CGB.service;

import edu.levelup.CGB.dominio.GenMateriales;
import edu.levelup.CGB.repo.GenMaterialesRepository;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class GenMaterialesService implements Serializable{
    
    @Autowired
    GenMaterialesRepository genmaterialesrepository;
    
    public List<GenMateriales>getGenMateriales(){
        return genmaterialesrepository.findAll();
    }
    
    public GenMateriales getGenMaterialesById(Long id){
        return genmaterialesrepository.findById(id).orElse(null);
    }
    
    public GenMateriales saveGenMateriales(GenMateriales genMateriales){
        return genmaterialesrepository.save(genMateriales);
    }
    public void deleteGenMaterialesById(Long id){
        genmaterialesrepository.deleteById(id);
    }
    
    public GenMateriales updateGenMateriales(Long id){
        GenMateriales existingGenMateriales = genmaterialesrepository.findById(id).orElse(null);
        if (existingGenMateriales != null){
            existingGenMateriales.setDescripcionMat(existingGenMateriales.getDescripcionMat());
            existingGenMateriales.setEliminadoMat(existingGenMateriales.getEliminadoMat());
            existingGenMateriales.setUsuarioMat(existingGenMateriales.getUsuarioMat());
            existingGenMateriales.setFechaMat(existingGenMateriales.getFechaMat());
            existingGenMateriales.setIpMat(existingGenMateriales.getIpMat());
            genmaterialesrepository.save(existingGenMateriales);
        }
        return  existingGenMateriales;
    }
}
