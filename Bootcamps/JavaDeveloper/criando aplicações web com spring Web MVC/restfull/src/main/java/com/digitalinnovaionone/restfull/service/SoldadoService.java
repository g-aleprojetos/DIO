package com.digitalinnovaionone.restfull.service;

import com.digitalinnovaionone.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(){
        Soldado soldado = new Soldado();
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        
    }
}
