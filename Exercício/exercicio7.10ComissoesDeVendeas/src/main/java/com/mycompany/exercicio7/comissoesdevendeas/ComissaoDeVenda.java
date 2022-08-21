package com.mycompany.exercicio7.comissoesdevendeas;

/*
 * Utilize um array unidimensional para resolver o seguinte problema: uma empresa paga seu pessoal de vendas por
 * comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor
 * que vende R$ 5.000 brutos em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando
 * um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha que o salário
 * de cada vendedor foi truncado para uma quantia inteira):
    a) $200–299
    b) $300–399
    c) $400–499
    d) $500–599
    e) $600–699
    f) $700–799
    g) $800–899
    h) $900–999
    i) R$ 1.000 e acima
Resuma os resultados em formato tabular.
package com.mycompany.exercicio7.comissoesdevendeas;

/**
 *
 * @author Ueno Souza Silva
 */

public class ComissaoDeVenda {
    
    private int numeroDeVandedores;
    private double[] vendasPorsemana;
    
    public ComissaoDeVenda(int numeroDeVendedores, double[] vendasPorSemana){
        this.numeroDeVandedores = numeroDeVendedores;
        this.vendasPorsemana = vendasPorSemana;
    }

    public int getNumeroDeVandedores() {
        return numeroDeVandedores;
    }

    public void setNumeroDeVandedores(int numeroDeVandedores) {
        this.numeroDeVandedores = numeroDeVandedores;
    }
    
    public void outputDados(){
        
        System.out.printf("%n%nBarra de dados: %n");
        outputBarChar();
    }
    
    public double[] comissao(){
        double[] comissao = new double[this.numeroDeVandedores];
        for(int i = 0; i < vendasPorsemana.length; i++){
            comissao[i] = vendasPorsemana[i] * 0.09 + 200.0;
        }
        
        System.out.println("Comissão dos vendedores: ");
        for(int i = 0; i < comissao.length; i++){
            
            System.out.printf("Vendendor [%d] - comissão: %.2f%n",i+1, comissao[i]);
        
        }
        
        return comissao;
    }
    
    public void outputBarChar(){
       comissao();
       int[] frequency = new int[11];
       
       for(double num : comissao()){
           int number = (int) num;
           
           if(number <= 9){
            ++frequency[number/10];
           }
       }
       
       for(int counter = 0; counter < frequency.length; counter++){
           if(counter == 10){
               System.out.printf("R$%d e acima: ", 1000);
           }else if(counter < 10 && counter > 1){
               System.out.printf("R$%d-%d: ", counter*100, counter*100+99);
           }
           
           for(int star = 0; star < frequency[counter]; star++){
               System.out.printf("*");
           }
           System.out.println("");
       }
    }
    
}
