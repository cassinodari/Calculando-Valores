package br.edu.uricer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sequencia {
    
    private List<Integer> lista = new ArrayList<>(); 
   
    public Sequencia(int[] valores) {
        for(int i: valores){
            lista.add(i);
        }
    }

    public int valorMax(){
        return Collections.max(lista);        
    }
    
    public int valorMin(){
        return Collections.min(lista);        
    }
    
    public int numElementos(){
        return lista.size();
    }
    
    public double media(){
        int soma = 0;

        for(int i: lista){
            soma = soma + i;
        }
        return (double) soma/(double) lista.size();
    }
}