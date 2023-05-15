/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.levelup.CGB.dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import java.util.Date;

/**
 *
 * @author Asus
 */
@Data
@Entity
@Table(name="GEN_MATERIALES")

public class GenMateriales implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name ="ID_MAT")
    private Long idMat;
    
    @Column(name ="DESCRIPCION_MAT")
    private String descripcionMat;
    
    @Column(name ="ELIMINADO_MAT")
    private String eliminadoMat;
    
    @Column(name ="USUARIO_MAT")
    private String usuarioMat;
    
    @Column(name ="FECHA_MAT")
    @Temporal(TemporalType.DATE)
    private Date fechaMat;
    
    @Column(name ="IP_MAT")
    private String ipMat;
    
    public GenMateriales (){
    }
    
    public GenMateriales (Long idMat){
        this.idMat = idMat;
    }
    
    public Long getIdMat() {
        return idMat;
    }

    public void setIdMat(Long idMat) {
        this.idMat = idMat;
    }

    public String getDescripcionMat() {
        return descripcionMat;
    }

    public void setDescripcionMat(String descripcionMat) {
        this.descripcionMat = descripcionMat;
    }

    public String getEliminadoMat() {
        return eliminadoMat;
    }

    public void setEliminadoMat(String eliminadoMat) {
        this.eliminadoMat = eliminadoMat;
    }

    public String getUsuarioMat() {
        return usuarioMat;
    }

    public void setUsuarioMat(String usuarioMat) {
        this.usuarioMat = usuarioMat;
    }

    public Date getFechaMat() {
        return fechaMat;
    }

    public void setFechaMat(Date fechaMat) {
        this.fechaMat = fechaMat;
    }

    public String getIpMat() {
        return ipMat;
    }

    public void setIpMat(String ipMat) {
        this.ipMat = ipMat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idMat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GenMateriales other = (GenMateriales) obj;
        return Objects.equals(this.idMat, other.idMat);
    }

    @Override
    public String toString() {
        return "GenMateriales{" + "idMat=" + idMat + ", descripcionMat=" + descripcionMat + ", eliminadoMat=" + eliminadoMat + ", usuarioMat=" + usuarioMat + ", fechaMat=" + fechaMat + ", ipMat=" + ipMat + '}';
    }

    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
          
    
}
