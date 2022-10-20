
package Proyecto.Proyect.Service;

import Proyecto.Proyect.entity.Materiales;
import java.util.List;



/**
 *
 * @author HPG8
 */
public interface MaterialesService {
 public List<Materiales> findAll();

    public Materiales findById(Long id);

    public Materiales save(Materiales materiales);

    public void delete(Materiales Materiales);

    public void deleteById(Long id);
   
}
