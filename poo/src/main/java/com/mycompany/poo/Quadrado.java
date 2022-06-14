/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

/**
 *
 * @author Líder
 */
public class Quadrado {
    
    private Integer x;
    private Integer y;
    private Boolean eCidade;
  

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Boolean geteCidade() {
        return eCidade;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void seteCidade(Boolean eCidade) {
        this.eCidade = eCidade;
    }

    
    
    public Quadrado(Integer x, Integer y, Boolean eCidade) {
        this.x = x;
        this.y = y;
        this.eCidade = eCidade;
    }
    
    
}
