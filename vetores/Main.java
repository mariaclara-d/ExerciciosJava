import java.util.Scanner;

public class Main{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor?");
        int N = sc.nextInt();
        Array.criaVetor(N, sc);
        Array.imprimeVetor();
        Array.somatorio();
        Array.media();
        Array.ObtemElementoVetor(sc);
        Array.InsereElementoVetor(sc);
        Array.substituiImparPorZero();
        Array.maiorElemento();
        Array.menorElemento();
        Array.imprimeVetor();
        

        sc.close();
    }
}