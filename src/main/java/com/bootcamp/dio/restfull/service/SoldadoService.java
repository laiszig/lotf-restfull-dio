package com.bootcamp.dio.restfull.service;

import com.bootcamp.dio.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String id) {
        Soldado soldado = new Soldado();
        soldado.setId(id);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flexa");
        return soldado;

    }
}
