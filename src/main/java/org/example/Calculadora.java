package org.example;

public class Calculadora {
    int a;
    int b;

    public  Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculadora() {
    }


    // somar - subtracao - divisao - multiplicacao

    public int somar(int a, int b) {
        System.out.println("Entrou int");
        return a + b;
    }

    public double somar(double a, double b) {
        System.out.println("Entrou no double");
        return a + b;
    }
}
