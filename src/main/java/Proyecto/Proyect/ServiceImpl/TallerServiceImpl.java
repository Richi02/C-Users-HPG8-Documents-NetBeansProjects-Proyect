
package Proyecto.Proyect.ServiceImpl;

import Proyecto.Proyect.Repository.TallerRepository;
import Proyecto.Proyect.Service.TallerService;
import Proyecto.Proyect.entity.Taller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






/**
 *
 * @author HPG8
 */
@Service
public class TallerServiceImpl implements TallerService{

    @Autowired
    private TallerRepository TallerRepository;

    @Override
    public List<Taller> findAll() {
    return (List<Taller>) TallerRepository.findAll();
    }
    
    
    
    @Override
    public Taller findById(Long id) {
        return (Taller) TallerRepository.findById(id).orElse(null);
    }

    @Override
    public Taller save(Taller taller) {
        return TallerRepository.save(taller);
    }

    @Override
    public void delete(Taller Taller) {
        TallerRepository.delete(Taller);
    }

    @Override
    public void deleteById(Long id) {
        TallerRepository.deleteById(id);
    }
}
