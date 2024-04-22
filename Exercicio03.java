/*Escreva um programa em Java que verifique se a letra inicial é uma vogal. Se for, exiba
a mensagem "A primeira letra do seu nome é uma vogal!", caso contrário, exiba a
mensagem "A primeira letra do seu nome não é uma vogal"*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu nome!");
        char[] nomeUsuario = leia.next().toLowerCase().toCharArray();
        leia.close();
        if(nomeUsuario[0] == 'a' || nomeUsuario[0] == 'e' || nomeUsuario[0] == 'i' || nomeUsuario[0] == 'o' || nomeUsuario[0] == 'u'){
            System.out.println("A primeira letra do seu nome é uma vogal!");
        }else{
            System.out.println("A primeira letra do seu nome não é uma vogal");
        }


    }
}
