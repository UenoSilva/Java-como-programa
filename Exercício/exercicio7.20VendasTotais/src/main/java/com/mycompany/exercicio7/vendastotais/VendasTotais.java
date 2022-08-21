// Exercício 7.20: VendasTotais.java

package com.mycompany.exercicio7.vendastotais;

/**
 *
 * @author Ueno Souza Silva
 */
public class VendasTotais {
    
    private double[][] vendas = new double[4][5];
    private String[] nomeDoVendedor = new String[4];
    private int[] codigoDoProduto = new int[5];

    public VendasTotais(double[][] vendas, String[] nomeDoVendedor, int[] codigoDoProduto) {
        this.vendas = vendas;
        this.nomeDoVendedor = nomeDoVendedor;
        this.codigoDoProduto = codigoDoProduto;
    }

    public double[][] vendasTotaisPorVendedor(){
        double[][] vendasTotais = new double[4][1];
        double aux = 0;
        int cont = 0;
        for(int j = 0; j < 4; j++){
            for(int x = 0; x < vendas.length; x++){
                aux += vendas[x][cont];
            }
            ++cont;
            vendasTotais[j][0] = aux;
            aux = 0;
        }
        return vendasTotais;
    }
    
    public double[][] vendasTotaisPorProduto(){
        double[][] vendasTotais = new double[1][5];
        int aux = 0;
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < vendas[x].length; y++){
                aux += vendas[x][y]; 
            }
            vendasTotais[0][x] = aux;
            aux = 0;
        }
        return vendasTotais;
    }
    
    public void toStringVendasNoMes(){
        System.out.println("\n-------------------------------------------------------------------------------------\n"+
                           "                              Vendas no mês XXXX");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%13s", "");
        for(int x = 0; x < nomeDoVendedor.length; x++){
            String g = String.format("%s %02d", "Vendedor(a)", x+1);
            System.out.printf("%18s", g);
        }
        System.out.println("");
        for(int l = 0; l < vendas.length; l++){
            System.out.printf("%s %05d", "Produto", this.codigoDoProduto[l]);
            for(int c = 0; c < vendas[l].length; c++){
                String g;
                g = String.format("%s %,.2f","R$", this.vendas[l][c]);
                System.out.printf("%18s", g);
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------------------------------------------------\n");
    }
    
    public void toStringVendasTotaisPorVendedor(){
        double[][] v = vendasTotaisPorVendedor();
        System.out.println("\n-------------------------------------------------------------------------------------\n"+
                           "                              Vendas por vendendor(a)");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%13s", "");
        for(int x = 0; x < nomeDoVendedor.length; x++){
            String g = String.format("%s", "Vendedor(a)");
            System.out.printf("%18s", g);
        }
        System.out.printf("\n%15s", "");
        for(int x = 0; x < nomeDoVendedor.length; x++){
            System.out.printf("%3s%s", "", nomeDoVendedor[x]);
        }
        System.out.printf("\nTotal vendido");
        for(int x = 0; x < v.length; x++){
            for(int y = 0; y < v[x].length; y++){
                String g = String.format("%s %,.2f","R$", v[x][y]);
                System.out.printf("%18s", g);
            }
        }
        System.out.println("\n-------------------------------------------------------------------------------------\n");
    }
    
    public void toStringVendasTotaisPorPodutro(){
        double[][] v = vendasTotaisPorProduto();
        System.out.println("\n-------------------------------------------------------------------------------------------------------\n"+
                           "                                           Vendas por Produto");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%13s", "");
        for(int x = 0; x < codigoDoProduto.length; x++){
            String g = String.format("%s %05d", "Produto", codigoDoProduto[x]);
            System.out.printf("%18s", g);
        }
        System.out.printf("\nTotal vendido");
        for(int x = 0; x < v.length; x++){
            for(int y = 0; y < v[x].length; y++){
                String g = String.format("%s %,.2f","R$", v[x][y]);
                System.out.printf("%18s", g);
            }
        }
        System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
    }
    
    
}
