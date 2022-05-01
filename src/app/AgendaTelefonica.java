/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entities.Contato;
import entities.AgendaTel;

/**
 *
 * @author Saulo
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contato c1 = new Contato("Zeca Pagodinho","88999456097");
        Contato c2 = new Contato("Brazuca","88935244532");
        Contato c3 = new Contato("Saulinho","88854634532");
        Contato c4 = new Contato("Saulo","88994253097");
        
        AgendaTel ag = new AgendaTel();
        
        ag.inserir(c1);
        ag.inserir(c2);
        ag.inserir(c3);
        ag.inserir(c4);
        ag.buscarTodos();
        ag.buscar("Brazuca");
        ag.remover("Saulo");
        System.out.println("Contatos Existentes: "+ag.tamanho());

    }
    
}
