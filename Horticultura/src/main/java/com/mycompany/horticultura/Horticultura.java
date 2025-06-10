package com.mycompany.horticultura;

public class Horticultura {
    public static void main(String[] args) {
        Estufa estufa = new Estufa(18.0, 35.0, 50.0, 80.0);
        
        /*Temperatura minima pode variar de 15 a 18, coloquei o maior
        temperatura maxima pode variar de 30 a 35, coloquei o maior
        humidade minima é cerca de 50% e a maxima de 70 a 80% coloquei a maior
        */
        
        System.out.println("Condições iniciais:");
        System.out.println(estufa);

        System.out.println("\nTentando ajustar temperatura para 25.0°C:");
        
        if(estufa.ajustarTemperatura(25.0)){
            System.out.println("Sucesso");
        }else{
            System.out.println("-1");
        }
        
        System.out.println(estufa);
        
        System.out.println("\nTentando ajustar umidade para 85.0%:");
      
        if(estufa.ajustarUmidade(85.0)){
            System.out.println("Sucesso");
        }else{
            System.out.println("-1");
        }
        
        System.out.println(estufa);
        
        System.out.println("\nTentando ajustar umidade para 74.0%:");
      
        if(estufa.ajustarUmidade(85.0)){
            System.out.println("Sucesso");
        }else{
            System.out.println("-1");
        }
        
        System.out.println(estufa);

        System.out.println("\nCondições finais:");
        System.out.println(estufa);
    }
}

