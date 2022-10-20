/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Proyect.Service;

import Proyecto.Proyect.entity.TipoPersona;
import java.util.List;

/**
 *
 * @author HPG8
 */
public interface TipoPersonaService {

    public List<TipoPersona> findAll();

    public TipoPersona findById(Long id);

    public TipoPersona save(TipoPersona tipopersona);

    public void delete(TipoPersona tipopersona);

    public void deleteById(Long id);
}
