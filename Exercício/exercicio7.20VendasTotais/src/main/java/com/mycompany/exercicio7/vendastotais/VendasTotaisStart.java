// Exercício 7.20: VendasTotaisStart.java

package com.mycompany.exercicio7.vendastotais;

/**
 *
 * @author Ueno Souza Silva
 */
public class VendasTotaisStart {
    
    public static void main(String[] args){
        
        double[][] vendas = {{ 456.00,  341.98,  500.87, 1000.00},
                             { 200.34,  456.12,  123.00,  289.90},
                             {1200.00, 3456.32, 1000.00, 4045.34},
                             { 345.90,  900.00,  500.00,  400.00},
                             { 300.00,  345.00,  312.00,  399.76}};
        
        String[] nomeDoVendedor = {"Jonas Fagundes", "Maria do Rosario", "Emanuel da Costa", "João Kebler"};
        
        int[] codigoDoProduto = {2345, 1234, 0543, 9866, 5467};
                
        VendasTotais vendasTotais = new VendasTotais(vendas, nomeDoVendedor, codigoDoProduto);
        vendasTotais.vendasTotaisPorVendedor();
        
        vendasTotais.toStringVendasNoMes();
        vendasTotais.toStringVendasTotaisPorVendedor();
        vendasTotais.toStringVendasTotaisPorPodutro();
        
    }
    
}
