/*
Escreva um programa em Java que solicite ao usuário que digite dois números inteiros e
exiba a soma dos dois números.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro valor!");
        int valorA = leia.nextInt();
        System.out.println("Informe o segundo valor!");
        int valorB = leia.nextInt();
        leia.close();
        int soma = valorA+valorB;

        System.out.println(valorA + " + " + valorB + " = " + soma);
    }
}
