/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implementacao01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Líder
 */   
public class Projeto {

    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Boolean concluido;
    

    
    private ArrayList<Alocacao> alocacoes;
    
    Projeto(){}

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public Boolean getConcluido() {
        return concluido;
    }

   

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(LocalDate dataTermino) {
        
        this.dataTermino = dataTermino;
        
        if(LocalDate.now().isAfter(dataTermino) || LocalDate.now().isEqual(dataTermino)){
        
            this.concluido =true;
        
        }
       
        if(dataTermino == null){
        
            this.concluido = false;
            
            System.out.println("data nula");
            
        }
        
        
        if(LocalDate.now().isBefore(dataTermino)){
            
            this.concluido = false;            
            
        }
        
        
        
        
        
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    public void setAlocacao(Alocacao alocacao) {
        
        if(this.alocacoes == null){
            
            this.alocacoes = new ArrayList<Alocacao>();
   
        }
        
        this.alocacoes.add(alocacao);
    
    }
    
    
    
    @Override
    
    public String toString(){ 
        
        String dataInicio1;
        String dataTermino1;
        String concluido1;
        String desenvolvedores1 ="";
        
        
        if(this.concluido ==false){
            concluido1 ="Não concluido";
        }
        else{
            concluido1 ="Concluído";
        }
        
        dataInicio1 = this.dataInicio.toString();
        dataTermino1 = this.dataTermino.toString();
        
        for(int i = 1;i<= this.alocacoes.size();i++){
            
            desenvolvedores1 = desenvolvedores1 +"." +this.alocacoes.get(i-1).getDesenvolvedor().getNome()+", data de entrada: " 
                    +this.alocacoes.get(i-1).getDataEntrada() +", data de saída: " +this.alocacoes.get(i-1).getDataSaida();
            
        }
        
        
        return "Data de início: " +dataInicio1 +".Data de término: "+dataTermino1+". Estado: " +concluido1 + ". Desenvolvedores: " + desenvolvedores1;
    }
    
    
    
    
    
    
}
