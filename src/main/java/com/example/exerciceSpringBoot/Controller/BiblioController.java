package com.example.exerciceSpringBoot.Controller;

import com.example.exerciceSpringBoot.Service.BiblioService;
import com.example.exerciceSpringBoot.entities.Livre;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/biblio")
public class BiblioController {
    private final BiblioService biblioService;

    @GetMapping("/alllivrelessthan/{nb}")
    public ResponseEntity<List<Livre>> getLivresLessThan(@PathVariable("nb") Integer nb){
        List<Livre> livres = biblioService.findLivreInfNbChapt(nb);
        return new ResponseEntity<>(livres, HttpStatus.OK);
    }
}
