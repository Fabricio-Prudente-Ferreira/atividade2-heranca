package org.example;

import org.example.exceptions.ArgumentoInvalidoException;

public class Dev {
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Dev(String nome, Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Double getSalario(){
        if(qtdHoras == null || valorHora == null) {
            throw new ArgumentoInvalidoException("qtdHora e/ou valorHora nulos");
        }

        return qtdHoras * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("nome='").append(nome).append('\'');
        sb.append(", qtdHoras=").append(qtdHoras);
        sb.append(", valorHora=").append(valorHora);
        sb.append(", salário= R$").append(getSalario());

        return sb.toString();
    }
}
