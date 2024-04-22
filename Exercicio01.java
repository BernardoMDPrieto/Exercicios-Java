/*- Escreva um programa em Java que verifique se a altura é maior ou igual a 1.80. Se for,
exiba a mensagem "Você é alto(a)!", caso contrário, exiba a mensagem "Você não é tão
alto(a)"*/
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){
        System.out.println("Insira sua altura!");
        Scanner leia = new Scanner(System.in);
        double altura = leia.nextDouble();
        leia.close();

        if(altura >= 1.80){
            System.out.println("Você é alto(a)!");
        }else{
            System.out.println("Você não é tão alto(a)");
        }



    }
}
