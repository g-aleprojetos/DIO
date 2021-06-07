package com.digitalinnovaionone.restfull.controller;


import com.digitalinnovaionone.restfull.dto.Soldado;
import com.digitalinnovaionone.restfull.request.SoldadoEditRequest;
import com.digitalinnovaionone.restfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    @GetMapping
    public ResponseEntity<List<Soldado>> buscarSoldados(){

        List<Soldado> soldados = soldadoService.buscarSoldados();
        return ResponseEntity.status(HttpStatus.OK).body(soldados);
    }

    @GetMapping("/(cpf)")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable() String cpf){

        Soldado soldado = soldadoService.buscarSoldado(cpf);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/(cpf)")
    public ResponseEntity editarSoldado(@PathVariable() String cpf,@RequestBody SoldadoEditRequest soldadoEditRequest){

        soldadoService.alterarSoldado(cpf, soldadoEditRequest);
        return ResponseEntity.status(HttpStatus.UPGRADE_REQUIRED).build();

    }

    @DeleteMapping("/(cpf)")
    public ResponseEntity deletarSoldado(@PathVariable String cpf){
       soldadoService.deletarSoldado(cpf);
       return ResponseEntity.ok().build();
    }
}
