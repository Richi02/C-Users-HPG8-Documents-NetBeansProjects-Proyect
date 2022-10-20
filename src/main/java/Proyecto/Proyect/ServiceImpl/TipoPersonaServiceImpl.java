/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.Proyect.ServiceImpl;

import Proyecto.Proyect.Repository.TipoPersonaRepository;
import Proyecto.Proyect.Service.TipoPersonaService;
import Proyecto.Proyect.entity.TipoPersona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HPG8
 */
@Service
public class TipoPersonaServiceImpl implements TipoPersonaService{

    @Autowired
    private TipoPersonaRepository TipoPersonaRepository;

    @Transactional
    @Override
    public List<TipoPersona> findAll() {
        return (List<TipoPersona>) TipoPersonaRepository.findAll();
    }

    @Override
    public TipoPersona findById(Long id) {
        return TipoPersonaRepository.findById(id).orElse(null);
    }

    @Override
    public TipoPersona save(TipoPersona tipoPersona) {
        return TipoPersonaRepository.save(tipoPersona);
    }

    @Override
    public void delete(TipoPersona tipoPersona) {
        TipoPersonaRepository.delete(tipoPersona);
    }

    @Override
    public void deleteById(Long id) {
        TipoPersonaRepository.deleteById(id);
    }
}
