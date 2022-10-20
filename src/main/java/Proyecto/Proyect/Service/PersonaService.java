/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Proyect.Service;

import Proyecto.Proyect.entity.Persona;
import java.util.List;

/**
 *
 * @author HPG8
 */
public interface PersonaService {

    public List<Persona> findAll();

    public Persona findById(Long id);

    public Persona save(Persona persona);

    public void delete(Persona persona);

    public void deleteById(Long id);
}
