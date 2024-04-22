/*
Escreva um programa em Java que calcule o valor médio de três números de tipo float. o
programa deve retornar o número formatado com 2 casas decimais.
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro valor!");
        float valorA = leia.nextFloat();
        System.out.println("Informe o segundo valor!");
        float valorB = leia.nextFloat();
        System.out.println("Informe o terceiro valor!");
        float valorC = leia.nextFloat();

        float media = (valorA+valorB+valorC)/3;
        String mensagemUsuario = String.format("%.2f", media);

        System.out.println(mensagemUsuario);

    }
}
