/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Saulo
 */
public class AgendaTel {
private List<Contato> contato = new ArrayList<>();

public List<Contato> getContato() {
        return contato;
    }
  
public void inserir(Contato c){
     contato.add(c);
  }
public Contato buscar(String nome){
        System.out.println("----Buscar por: "+nome+" -----");
        for(Contato x : contato) {
            if(x.getNome().equals(nome)){
                System.out.println("Nome: "+x.getNome());
                System.out.println("@>@ -> Telefone: "+x.getTelefone());
            }
        }
        return null;
  }
   public void buscarTodos(){
       System.out.println("----Todos os Contatos-----");
            for(Contato x : contato) {
           System.out.println("Nome: "+x.getNome()+ " > Contato: "+x.getTelefone() );
            }
        System.out.println("______________________________\n");
  }
public void remover(String nome){
    System.out.println("\n----Remover : "+nome+" -----");
    int z = -1;
  for(Contato x : contato) {
            if(x.getNome().equals(nome)){
               z = contato.indexOf(x);
            }
        }
    contato.remove(z);
    System.out.println("Exterminado com Sucesso!\n");
}
  
public int tamanho(){
         return contato.size();
  }
}
