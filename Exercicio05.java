/*
Escreva um programa em Java que solicite ao usuário que digite um número e verifique
se ele é positivo, negativo ou igual a zero. Em seguida, exiba a mensagem correspondente.
*/


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[]args){
    System.out.println("Informe um número!");
    Scanner leia = new Scanner(System.in);
    int valorUsuario = leia.nextInt();
    leia.close();
    if(valorUsuario > 0){
        System.out.println("O número é positivo");
    }else if(valorUsuario < 0){
        System.out.println("O número é negativo");
    }else{
        System.out.println("O número é igual a zero");
    }

    }
}
