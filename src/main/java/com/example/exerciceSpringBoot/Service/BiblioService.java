package com.example.exerciceSpringBoot.Service;

import com.example.exerciceSpringBoot.Repository.AuteurLivreRepository;
import com.example.exerciceSpringBoot.Repository.AuteurRepository;
import com.example.exerciceSpringBoot.Repository.LivreRepository;
import com.example.exerciceSpringBoot.entities.Auteur;
import com.example.exerciceSpringBoot.entities.Livre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BiblioService {
    private final AuteurRepository auteurRepository;
    private final LivreRepository livreRepository;
    private final AuteurLivreRepository auteurLivreRepository;

    public Auteur findAuteurDominant(Livre livre){
        return null;
    }

    public List<Livre> findLivresParUnSeulAuteur(){
        return null ;
    }

    public List<Livre> findLivreInfNbChapt(int nb_chap_tot){

        return livreRepository.findByNb_chap_totLessThan(nb_chap_tot);
    }
}
