/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Líder
 */
public class Mapa {
    
    Quadrado[][] quadrados = new Quadrado[10][10];

    public Mapa() {
        
        for(int i = 0; i<10;i++){
            
            for(int i2 = 0; i2<10;i2++){
                
                quadrados[i][i2]=new Quadrado(i,i2,false);
                
            }
            
        }
        
    }

    public void setCidade(Integer x,Integer y) {
        this.quadrados[x][y].seteCidade(true);
    }
    
    
    
    
    
}
