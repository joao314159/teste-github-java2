/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementacao01;

import java.time.LocalDate;

/**
 *
 * @author Líder
 */
public class Alocacao {
    
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Projeto projeto;
    private Desenvolvedor desenvolvedor;
    
    Alocacao(){}

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }
    
    
    
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

   
   
    
    
}
