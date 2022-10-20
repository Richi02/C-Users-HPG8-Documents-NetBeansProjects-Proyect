/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Proyect.ServiceImpl;

import Proyecto.Proyect.Repository.ProgramaRepository;
import Proyecto.Proyect.Service.ProgramaService;
import Proyecto.Proyect.entity.Materiales;
import Proyecto.Proyect.entity.Programa;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author HPG8
 */
@Service
public class ProgramaServiceImpl implements ProgramaService{

    @Autowired
    private ProgramaRepository ProgramaRepository;

   @Transactional
    @Override
    public List<Programa> findAll() {
        return (List<Programa>) ProgramaRepository.findAll();
    }
    @Override
    public Programa findById(Long id) {
        return (Programa) ProgramaRepository.findById(id).orElse(null);
    }

    @Override
    public Programa save(Programa programa) {
        return ProgramaRepository.save(programa);
    }

    @Override
    public void delete(Programa programa) {
        ProgramaRepository.delete(programa);
    }

    @Override
    public void deleteById(Long id) {
        ProgramaRepository.deleteById(id);
    }
}
