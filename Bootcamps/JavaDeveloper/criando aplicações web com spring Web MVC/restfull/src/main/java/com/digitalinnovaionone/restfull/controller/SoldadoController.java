package com.digitalinnovaionone.restfull.controller;


import com.digitalinnovaionone.restfull.dto.Soldado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    @GetMapping
    public ResponseEntity<Soldado> buscarSoldado(){

        return
    }
}
