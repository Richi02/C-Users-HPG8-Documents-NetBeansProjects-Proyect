
package Proyecto.Proyect.Service;

import Proyecto.Proyect.entity.Taller;
import java.util.List;

/**
 *
 * @author HPG8
 */
public interface TallerService {

    public List<Taller> findAll();

    public Taller findById(Long id);

    public Taller save(Taller taller);

    public void delete(Taller taller);

    public void deleteById(Long id);
}
