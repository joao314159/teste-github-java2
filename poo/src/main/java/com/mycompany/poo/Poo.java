/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo;

/**
 *
 * @author Líder
 */
public class Poo {

    public static void main(String[] args) {
    
        Pessoa pessoa1 = new Pessoa();
        pessoa1.checarFome();
        
        Mapa mapa1 = new Mapa();
        
        //colocamos uma cidade na posição 8 na coordenada x e 6 na coordenada y do mapa
        mapa1.setCidade(8,6);
        
        //Imaginemos que a pessoa1 é um camponês que deseja viajar em segurança até a cidade1. Para isso poderíamos
        //usar o método mover() do camponês para que sua posição mude para a posição da cidade. Entretanto também 
        //é importante garantir que o camponês tenha água e comida suficiente para que não morra de fome ou de sede durante
        //sua viagem. Percebe-se que existem diferentes métodos que precisam ser executados, de uma maneira específica
        //na classe pessoa, para que determinada tarefa seja executada(fazer o personagem viajar até a cidade especificada em segurança),
        //e se fossem acrescentadas novas classes com novos métodos especificando outras necessidades que o viajante
        //teria durante sua viagem, então seria necessário ao usuário o entedimento de vários métodos e de várias classes,
        //que ele deveria acessar para realizar operações que promovessem a realização da tarefa(a viagem do camponês).
        //A realização dessa tarefa pode ser simplificada pela adição de uma classe facade.
        //A classe facade actionsFacade irá realizar a ação de deslocar o personagem até um ponto em uma viagem segura,
        //por meio de um método simples. Assim, a operação poderá ser feita sem acessar diretamente qualquer outro método.
        //Basta passar os parâmetros referentes a localização no método viajar() e o método realiza todas as operações mais
        //complicadas e acessos a outros objetos. Outras operações poderiam ser adicionadas ao actionsFacade, caso novas funcionalidas
        //fossem adicionadas a Pessoa.
        
        actionsFacade actions = new actionsFacade(pessoa1,mapa1);
        
        //para o camponês viajar até a cidade nas coordenadas 8 e 6;
        actions.viajar(8,6);
        
        //checamos a fome e a sede e vemos que o método da actionsFacade funcionou e o camponês não passa fome e nem sede.
        pessoa1.checarFome();
        pessoa1.checarSede();
        
    }
    
}
