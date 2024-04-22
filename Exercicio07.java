import java.util.Scanner;

/*
Escreva um programa em Java que informe o tamanho de uma determinada String.
*/
public class Exercicio07 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva uma palavra!");
        char[] palavraArray = leia.next().toCharArray();
        int contadora = 0;
        for(int i = 0; i < palavraArray.length; i++){
            contadora++;
        }
        System.out.println("A palavra possui: " +contadora+ " letras");
    }
}
