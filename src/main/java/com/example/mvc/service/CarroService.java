package com.example.mvc.service;

import com.example.mvc.model.Carro;
import com.example.mvc.service.BancoDeDados;
import java.util.ArrayList;

public class CarroService {
    //CRUD

    public Carro salvar(Carro carro) {
        carro.setId(BancoDeDados.getInstance().pegarProximoId());
        BancoDeDados.getInstance().carros.add(carro);
        return carro;
    }

    public ArrayList<Carro> listarTodos(){
        return BancoDeDados.getInstance().carros;
    }

}
