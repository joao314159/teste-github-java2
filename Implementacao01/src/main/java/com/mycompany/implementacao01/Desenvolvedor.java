/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementacao01;

import java.util.ArrayList;

/**
 *
 * @author Líder
 */
public class Desenvolvedor {
    
    private Long cpf;
    private String nome;
    private String email;
    
    private ArrayList<Alocacao> alocacoes;
    
    
    
    Desenvolvedor(){}

    public Long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    
    
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAlocacoes(ArrayList<Alocacao> alocacoes) {
        this.alocacoes = alocacoes;
    }
    
    
    
    
    
}
