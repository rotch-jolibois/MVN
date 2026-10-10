package com.example.mvc.service;

import com.example.mvc.model.Carro;

import java.util.ArrayList;

public class BancoDeDados {
    private static BancoDeDados bancoDeDados;
    private Long ultimoId;
    public ArrayList<Carro> carros = new ArrayList<>();
    private BancoDeDados() {}

    public static BancoDeDados getInstance() {
        if (bancoDeDados == null) {
            bancoDeDados = new BancoDeDados();
        }
        return bancoDeDados;
    }
    public long pegarProximoId(){
        if (carros.isEmpty() && ultimoId == null){
            ultimoId = 0L;
            return ultimoId;

    }
        return 0;
    }}
