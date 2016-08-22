package br.edu.uricer;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class SequenciaTeste {
     
    int lista[] = new int[6];

   
    @Test
    public void testValorMin() {
        lista[0] = 6;
        lista[1] = 9;
        lista[2] = 15;
        lista[3] = -2;
        lista[4] = 92;
        lista[5] = 11;
        Sequencia procura = new Sequencia(lista);
        int esperado = -2;
        int result = procura.valorMin();
        
        assertEquals(esperado, result);
    }
    @Test
    public void testValorMax() {
        lista[0] = 6;
        lista[1] = 9;
        lista[2] = 15;
        lista[3] = -2;
        lista[4] = 92;
        lista[5] = 11;
        Sequencia procura = new Sequencia(lista);
        int esperado = 92;
        int result = procura.valorMax();
        
        assertEquals(esperado, result);
    }
    
    @Test
    public void testNumElementos() {
        lista[0] = 6;
        lista[1] = 9;
        lista[2] = 15;
        lista[3] = -2;
        lista[4] = 92;
        lista[5] = 11;
        Sequencia procura = new Sequencia(lista);
        int esperado = 6;
        int result = procura.numElementos();
        
        assertEquals(esperado, result);
    }
    @Test
    public void testValorMedio() {
        lista[0] = 6;
        lista[1] = 9;
        lista[2] = 15;
        lista[3] = -2;
        lista[4] = 92;
        lista[5] = 11;
        Sequencia procura = new Sequencia(lista);
        int esperado = (int) (long) 21.833333333333332;
        long result = (long) procura.media();
        
        assertEquals(esperado, result);
    }
    
}