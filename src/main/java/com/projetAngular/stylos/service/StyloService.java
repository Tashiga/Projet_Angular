package com.projetAngular.stylos.service;

import com.projetAngular.stylos.exception.StyloNotFoundException;
import com.projetAngular.stylos.model.Stylo;
import com.projetAngular.stylos.repo.StyloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyloService {
    private final StyloRepo styloRepo;

    @Autowired
    public StyloService(StyloRepo styloRepo) {
        this.styloRepo = styloRepo;
    }

    //sauvegarde dans la bd
    public Stylo saveStylo(Stylo stylo) {
        return styloRepo.save(stylo);
    }

    public List<Stylo> findAllStylos() {
        return styloRepo.findAll();
    }

    public Stylo findStyloById(Long id) {
        return styloRepo.findStyloById(id)
                .orElseThrow(() -> new StyloNotFoundException("Stylo by id " + id + " was not found"));
    }

    public void deleteStylo(Long id) {
        styloRepo.deleteById(id);
    }

}
