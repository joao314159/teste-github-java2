/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Random;
/**
 *
 * @author Líder
 */
public class Pessoa {
    
    private Boolean vivo;
    private Integer fome;
    private Integer sede;
    
    private Integer quantidadeComida;
    private Integer quantidadeAgua;
    
    private Integer x;
    private Integer y;

    public Boolean getVivo() {
        return vivo;
    }

    public Integer getFome() {
        return fome;
    }

    public Integer getSede() {
        return sede;
    }

    public Integer getQuantidadeComida() {
        return quantidadeComida;
    }

    public Integer getQuantidadeAgua() {
        return quantidadeAgua;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    
    
    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public void setFome(Integer fome) {
        this.fome = fome;
    }

    public void setSede(Integer sede) {
        this.sede = sede;
    }

    public void setQuantidadeComida(Integer quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public void setQuantidadeAgua(Integer quantidadeAgua) {
        this.quantidadeAgua = quantidadeAgua;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Pessoa() {
        this.vivo = true;
        this.fome = 0;
        this.sede = 0;
        this.quantidadeComida = 10;
        this.quantidadeAgua = 10;
        this.x = 0;
        this.y = 0;
    }
    
    
    
    
    
    
    
    public void comer(){
        
        this.fome = this.fome - this.quantidadeComida;
        this.quantidadeComida =0;
        
    }
    
    public void beber(){
        
        this.sede = this.sede - this.quantidadeAgua;
        this.quantidadeAgua = 0;
        
    }
    
    public void coletarComida(){
        
        Random random = new Random();
        this.quantidadeComida = this.quantidadeComida+random.nextInt(10);      
        
    }
    public void coletarAgua(){
        
        Random random = new Random();
        this.quantidadeAgua = this.quantidadeAgua+random.nextInt(10); 
    
    }
    
    public void checarFome(){
        
        System.out.println("fome:"+ this.fome);
        
    } 
    public void checarSede(){
        
        System.out.println("Sede:" + this.sede);
    }
            
            
            
    
    public void mover(Integer x, Integer y){
        
        if(this.vivo){
        
            this.fome = this.fome+5*x+5*y;
            this.sede = this.sede+5*x+5*y;
        
            if(this.fome>70 ||this.sede>50){this.vivo = false;}
            
            this.x=this.x+x;
            this.y=this.y+y;
                         
        }
        
        else{
            
            System.out.println("O camponês está morto e não pode se mover.");
            
        }
    }
    
}
