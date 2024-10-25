package org.example;

import org.example.exceptions.ArgumentoInvalidoException;
import org.example.exceptions.DevExistenteException;
import org.example.exceptions.ListaCheiaException;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Dev> devs;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.devs = new ArrayList<>();
    }

    public Boolean existePorNome(String nome){
        return getDevPorNome(nome) != null;
    }

    public void contratar(Dev dev){
        if(dev == null){
            throw new ArgumentoInvalidoException("Dev inválido!");
        }

        if(devs.size() >= vagas){
            throw new ListaCheiaException("Lista de Devs cheia!");
        }

        for(Dev devDaVez : devs){
            if(devDaVez == dev){
                throw new DevExistenteException("Dev já está contratado!");
            }
        }

        this.devs.add(dev);
    }

    public Integer getQuantidadeDevs(){
        return devs.size();
    }

    public Integer getQuantidadeDevsMobile(){
        int qtdDevsMobile = 0;

        for(Dev dev : devs){
            if(dev instanceof DevMobile){
                qtdDevsMobile++;
            }
        }

        return qtdDevsMobile;
    }

    public Double getTotalSalarios(){
        double totalSalario = 0.0;

        for(Dev dev : devs){
            totalSalario += dev.getSalario();
        }

        return Math.round(totalSalario * 100)/100.0;
    }

    public Dev getDevPorNome(String nome){
        if(nome == null){
            throw new ArgumentoInvalidoException("Nome inválido");
        }

        for(Dev dev : devs){
            if(dev.getNome().equalsIgnoreCase(nome)){
                return dev;
            }
        }

        return null;
    }
}
