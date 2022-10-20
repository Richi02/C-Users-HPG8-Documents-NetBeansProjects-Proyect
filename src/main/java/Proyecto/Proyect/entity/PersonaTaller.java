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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author HPG8
 */
@Data
@Entity
@Table(name = "pers_taller")
public class PersonaTaller implements Serializable{

    @Id
    @Column(name = "peta_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petaId;

    /*@ManyToOne //De muchos a uno
    @Column(name = "tall_id")
    private Long tallId;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "pers_id")
    private Long persId;*/

}

