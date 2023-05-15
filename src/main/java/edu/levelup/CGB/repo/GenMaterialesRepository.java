/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.levelup.CGB.repo;

import edu.levelup.CGB.dominio.GenMateriales;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Asus
 */
@Repository
public interface GenMaterialesRepository extends JpaRepository<GenMateriales, Long> {
    Optional<GenMateriales> findByIdMat(Long idMat);
    void deleteByIdMat(Long idMat);

    

    
}
