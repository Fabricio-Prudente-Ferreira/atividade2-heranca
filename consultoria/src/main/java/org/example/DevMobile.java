package org.example;

import org.example.exceptions.ArgumentoInvalidoException;

public class DevMobile extends Dev {
    private Integer qtdHoraMobile;
    private Double valorHoraMobile;

    public DevMobile(String nome, Integer qtdHoras, Double valorHora, Integer qtdHoraMobile, Double valorHoraMobile) {
        super(nome, qtdHoras, valorHora);
        this.qtdHoraMobile = qtdHoraMobile;
        this.valorHoraMobile = valorHoraMobile;
    }

    @Override
    public Double getSalario() {
        if(qtdHoraMobile == null || valorHoraMobile == null) {
            throw new ArgumentoInvalidoException("qtdHoraMobile e/ou valorHoraMobile nulos");
        }

        return super.getSalario() + qtdHoraMobile * valorHoraMobile;
    }

    public Integer getQtdHoraMobile() {
        return qtdHoraMobile;
    }

    public void setQtdHoraMobile(Integer qtdHoraMobile) {
        this.qtdHoraMobile = qtdHoraMobile;
    }

    public Double getValorHoraMobile() {
        return valorHoraMobile;
    }

    public void setValorHoraMobile(Double valorHoraMobile) {
        this.valorHoraMobile = valorHoraMobile;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("qtdHoraMobile=").append(qtdHoraMobile);
        sb.append(", valorHoraMobile=").append(valorHoraMobile);
        sb.append(", salário= R$ ").append(getSalario());
        return sb.toString();
    }
}
