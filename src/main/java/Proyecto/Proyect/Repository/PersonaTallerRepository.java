/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Proyect.Repository;

import Proyecto.Proyect.entity.PersonaTaller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HPG8
 */
@Repository
public interface PersonaTallerRepository extends CrudRepository<PersonaTaller, Long>{
   
}
