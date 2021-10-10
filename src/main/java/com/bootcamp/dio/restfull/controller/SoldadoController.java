package com.bootcamp.dio.restfull.controller;

import com.bootcamp.dio.restfull.dto.Soldado;
import com.bootcamp.dio.restfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    @GetMapping("/{id}")
    public ResponseEntity<Soldado> buscarSoldado (@PathVariable String id) {
       Soldado soldado = soldadoService.buscarSoldado(id);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }
}
