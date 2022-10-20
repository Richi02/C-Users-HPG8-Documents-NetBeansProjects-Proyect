/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Proyect.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HPG8
 */
@Data
@Entity
@Table(name = "programa")
public class Programa implements Serializable{

    @Id
    @Column(name = "prog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progId;

    @Column(name = "prog_name")
    String progName;

    @Column(name = "prog_descripcion")
    String progDescripcion;
}

