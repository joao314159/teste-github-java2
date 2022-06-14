/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.implementacao01;

import java.time.LocalDate;

/**
 *
 * @author Líder
 */
public class Implementacao01 {

    public static void main(String[] args) {

        
        Projeto projeto1 = new Projeto();
        
        Projeto projeto2 = new Projeto();
        
        
        
        Desenvolvedor desenvolvedor1 = new Desenvolvedor();
        //PROJETO 1:
        //ENTRADA 04/05/2022
        //SAÍDA 24/05/2022
        
        //PROJETO 2:
        //ENTRADA 13/05/2022
        
        
        
        Desenvolvedor desenvolvedor2 = new Desenvolvedor();
        //PROJETO1:
        //ENTRADA 21/04/2022
        //SAÍDA:19/05/2022
        
        
        
        Desenvolvedor desenvolvedor3 = new Desenvolvedor();
        //PROJETO2:
        //ENTRADA: 16/05/2022
        
        
        
        desenvolvedor1.setNome("Vinícius");          
        desenvolvedor2.setNome("Vanessa");
        desenvolvedor3.setNome("João");
        
        desenvolvedor1.setEmail("vinicius@gmail.com");
        desenvolvedor2.setEmail("vanessa@gmail.com");
        desenvolvedor3.setEmail("joao@gmail.com");
        
        
        
        
        
        
        //ALOCAÇÃO DE VINICIUS PARA O PROJETO 1
        Alocacao alocacao1 = new Alocacao();
        
        //ALOCAÇÃO DE VANESSA PARA O PROJETO 2
        Alocacao alocacao2=  new Alocacao();
        
        
        //desenvolvedor 1
        alocacao1.setDataEntrada(LocalDate.parse("2022-05-04"));
        alocacao1.setDataSaida(LocalDate.parse("2022-05-24"));
        
        //desenvolvedor 2
        alocacao2.setDataEntrada(LocalDate.parse("2022-04-21"));
        alocacao2.setDataSaida(LocalDate.parse("2022-05-19"));
        
        
        
        
        alocacao1.setDesenvolvedor(desenvolvedor1);
        alocacao2.setDesenvolvedor(desenvolvedor2);
        
        
        
       
        
        projeto1.setAlocacao(alocacao1);
        projeto1.setAlocacao(alocacao2);
        
        
        
        projeto1.setDataInicio(LocalDate.parse("2022-03-24"));
        projeto1.setDataTermino(LocalDate.parse("2022-06-12"));
        
        
        LocalDate teste;
        
        
        
        System.out.println(projeto1);
        
        
        //AGORA O PROJETO 2
        
        
        //ALOCAÇÃO DE VINÍCIUS PARA O PROJEO 2
        Alocacao alocacao3 = new Alocacao();
        
        
        //ALOCAÇÃO DE JOÃO PARA O PROJETO 2
        Alocacao alocacao4 = new Alocacao();
        
        
        alocacao3.setDataEntrada(LocalDate.parse("2022-05-13"));
               
       
        alocacao4.setDataEntrada(LocalDate.parse("2022-05-16"));
        
        
        
        
        
        alocacao3.setDesenvolvedor(desenvolvedor1);
        alocacao4.setDesenvolvedor(desenvolvedor3);
        
        
        projeto2.setAlocacao(alocacao3);
        projeto2.setAlocacao(alocacao4);
        
        
        
        projeto2.setDataInicio(LocalDate.parse("2022-03-24"));
        projeto2.setDataTermino(LocalDate.parse("2022-05-25"));
        
        System.out.println(".");
        System.out.println(projeto2);
        
    }





}
