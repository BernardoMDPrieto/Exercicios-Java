/*- Escreva um programa em Java que verifique se a pessoa possui carteira de motorista.
Se possuir, exiba a mensagem "Você pode dirigir!", caso contrário, exiba a mensagem
"Você não pode dirigir".*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe se você possui carteira de motorista! (s/n)");
        String mensagemUsuario = leia.next();
        if(mensagemUsuario.equals("s")){
            System.out.println("Você pode dirigir!");
        }else if(mensagemUsuario.equals("n")){
            System.out.println("Você não pode dirigir!");
        }
    }
}
