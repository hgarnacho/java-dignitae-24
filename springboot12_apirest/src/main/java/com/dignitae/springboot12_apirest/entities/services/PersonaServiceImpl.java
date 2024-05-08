package com.dignitae.springboot12_apirest.entities.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dignitae.springboot12_apirest.entities.PersonaEntity;
import com.dignitae.springboot12_apirest.repositories.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

    PersonaRepository pr;

    public PersonaServiceImpl(PersonaRepository pr){
        this.pr = pr;
    }

    @SuppressWarnings("null")
    @Override
    public void delete(PersonaEntity pe) {
        pr.delete(pe);
        
    }

    @Override
    public List<PersonaEntity> findAll() {
        return pr.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public PersonaEntity findById(Long id) {
        //Como devuelve optional PersonaEntity, tenemos que contemplarlo
        return pr.findById(id).orElse(null);
    }

    @Override
    public void initializeDemoData() {
        pr.save(new PersonaEntity("Héctor Garnacho", "hgarnacho@gmail.com", "654123456"));
        pr.save(new PersonaEntity("Marina Sánchez", "msanchez@gmail.com", "69534490"));
        pr.save(new PersonaEntity("Roberto Martín", "rmartin@gmail.com", "644544544"));
        pr.save(new PersonaEntity("Ana Velasco", "avelasco@gmail.com", "6557136945"));
        pr.save(new PersonaEntity("Antonio Sánz", "asanz@gmail.com", "644387492"));
        pr.save(new PersonaEntity("Unai García", "ugarcia@gmail.com", "613265349"));
        pr.save(new PersonaEntity("Ainara Coello", "acoello@gmail.com", "64125836"));
        pr.save(new PersonaEntity("Marta Mellado", "mmellado@gmail.com", "65456987"));        
    }

    @SuppressWarnings("null")
    @Override
    public PersonaEntity save(PersonaEntity pe) {
       if(pe.getFechaHoraCreacion() == null){
            pe.setFechaHoraCreacion(new Date());
       } 
       return  pr.save(pe);
    }

}
