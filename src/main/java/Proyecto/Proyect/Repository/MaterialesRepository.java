
package Proyecto.Proyect.Repository;

import Proyecto.Proyect.entity.Materiales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HPG8
 */
@Repository
public interface MaterialesRepository extends CrudRepository<Materiales,Long>{

   
    
}
