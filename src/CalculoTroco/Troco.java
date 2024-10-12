package CalculoTroco;

public class Troco {
    
public Troco(double valor){
    int valorTratado = (int) (valor*100);

    int[] notas = {200,100,50,20,10,5,2};
    
    double[] moedas = {1, 0.50,0.25,0.10,0.05,0.01};
    
    System.out.println("NOTAS");
    for (int nota : notas){
        valorTratado = getNotas(valorTratado,nota*100);
    }
    System.out.println("MOEDAS");
    for(double moeda: moedas){
        valorTratado = getNotas(valorTratado, (int) (moeda*100));
    }
}
public int getNotas(int valor,int divisor){
    
    int quantidade = valor/divisor;
    
    String tipo = divisor > 100 ? "nota(s)" : "moeda(s)";

    if(divisor >= 100){
        System.out.println(quantidade + "" + tipo + "de R$"+ divisor/100 + ".00");
    }else{
        System.out.println(quantidade + "" + tipo + "de R$"+ divisor/100.0);
    }
    return valor % divisor;
    }

}

