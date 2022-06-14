/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Líder
 */
public class actionsFacade {
    
    Pessoa pessoa;
    Mapa mapa;

    public actionsFacade(Pessoa pessoa, Mapa mapa) {
        this.pessoa = pessoa;
        this.mapa = mapa;
    }
    
    
    
    void viajar(Integer x,Integer y){
        
        
        while(pessoa.getX() <x && pessoa.getY() <y){
            
            this.pessoa.mover(1, 1);
            
            if(pessoa.getFome()>40){
                
                while(pessoa.getFome()>35){
                    
                    pessoa.coletarComida();
                    pessoa.comer();
                    
                }
                
            }
            
            if(pessoa.getSede()>20){
                
                while(pessoa.getSede()>15){
                    
                    pessoa.coletarAgua();
                    pessoa.beber();
                    
                }
                
            }
        
        }
        
        while(pessoa.getX() <x && pessoa.getY() ==y){
            
            this.pessoa.mover(1, 0);
            
            if(pessoa.getFome()>40){
                
                while(pessoa.getFome()>35){
                    
                    pessoa.coletarComida();
                    pessoa.comer();
                    
                }
                
            }
            
            if(pessoa.getSede()>20){
                
                while(pessoa.getSede()>15){
                    
                    pessoa.coletarAgua();
                    pessoa.beber();
                    
                }
                
            }
        
        }
        
        while(pessoa.getX() == x && pessoa.getY() <y){
            
            this.pessoa.mover(0, 1);
            
            if(pessoa.getFome()>40){
                
                while(pessoa.getFome()>35){
                    
                    pessoa.coletarComida();
                    pessoa.comer();
                    
                }
                
            }
            
            if(pessoa.getSede()>20){
                
                while(pessoa.getSede()>15){
                    
                    pessoa.coletarAgua();
                    pessoa.beber();
                    
                }
                
            }
        
        }
    }
    
    void acao2(){System.out.println("executa métodos específicos para realizar a ação");}
    
    void acao3(){System.out.println("executa métodos específicos para realizar a ação");}
    
}
