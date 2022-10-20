
package Proyecto.Proyect.ServiceImpl;

import Proyecto.Proyect.Repository.MaterialesRepository;
import Proyecto.Proyect.Service.MaterialesService;
import Proyecto.Proyect.entity.Materiales;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author HPG8
 */
@Service
public class MaterialesServiceImpl implements MaterialesService{
    @Autowired
    private MaterialesRepository materialesRepository;
    
    @Transactional
    @Override
    public List<Materiales> findAll() {
        return (List<Materiales>) materialesRepository.findAll();
    }

    @Override
    public Materiales findById(Long id) {
        return materialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales save(Materiales materiales) {
        return materialesRepository.save(materiales);
    }

    @Override
    public void delete(Materiales materiales) {
        materialesRepository.delete(materiales);
    }

    @Override
    public void deleteById(Long id) {
        materialesRepository.deleteById(id);
    }
}
