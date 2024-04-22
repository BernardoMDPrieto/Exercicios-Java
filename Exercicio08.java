import java.util.Scanner;

/*Escreva um programa em Java que inverta uma palavra, se o texto for batatinha ele
deve me retornar ahnitatab.*/
public class Exercicio08 {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        char[] palavraArray = leia.next().toLowerCase().toCharArray();
        int ponteiroEsquerda = 0;
        int ponteiroDireita = palavraArray.length-1;

        do{
            char conteudoPonteiroEsquerda = palavraArray[ponteiroEsquerda];
            char conteudoPonteiroDireita = palavraArray[ponteiroDireita];

            palavraArray[ponteiroEsquerda] = conteudoPonteiroDireita;
            palavraArray[ponteiroDireita] = conteudoPonteiroEsquerda;

            ponteiroDireita--;
            ponteiroEsquerda++;
        }while(ponteiroDireita > ponteiroEsquerda);

        String palavraInvertida = String.valueOf(palavraArray);

        System.out.println(palavraInvertida);


    }
}
