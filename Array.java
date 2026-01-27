import java.util.Scanner;

public class Array{

    static int [] vetor;

    public static void criaVetor(int tamanho, Scanner sc){

        

        vetor = new int [tamanho];

        for (int i = 0; i<tamanho; i++){
            System.out.println("Digite um número para a posição" + "" + i + ":");
            vetor[i] = sc.nextInt();
            
        }
    }
 
    //soma vetor 

    public static void somatorio(){

        System.out.println("A soma dos elementos do vetor:");

        int soma=0;

        for (int i = 0; i<vetor.length; i++){
            soma += vetor[i];
        }

        System.out.println("Resultado:" + soma);    
    }

    //media vetor

    public static void media(){
        System.out.println("A média dos elementos do vetor:");
        int somaTotal = 0;
        double media=0;
        for (int i=0; i<vetor.length; i++){
                somaTotal+=vetor[i];
                
                
        }
        media = (double)somaTotal/vetor.length;
        System.out.println("A média dos elementos:" + media);
    }

    //obterElementoVetor

    public static void ObtemElementoVetor(Scanner sc){

        int pos = 0;
        System.out.println("Digite a posição do elemento:");
        pos = sc.nextInt();
        if (pos >= 0 && pos < vetor.length){
            System.out.println("Elemento na posição:" + vetor[pos]);
        } else {
            System.out.println("ERRO: Posição inválida. Digite um número entre 0 e " + (vetor.length - 1)+ ".");

        }
        
             
    }

    //inserir elemento no vetor

    public static void InsereElementoVetor(Scanner sc){

        int pos = 0;
        System.out.println("Digite a posição do elemento que deseja modificar:");
        pos = sc.nextInt();

        if (pos >= 0 && pos < vetor.length){
            int NovoValor = 0;
            System.out.println("Elemento na posição:" + vetor[pos]);
            System.out.println("Digite o novo valor:");
            NovoValor = sc.nextInt();
            vetor[pos] = NovoValor;
            System.out.println("O novo valor é:" + NovoValor + "Na posição:" + pos);
        } else {
            System.out.println("ERRO: Posição inválida. Digite um número entre 0 e " + (vetor.length -1) + ".");
        }

    }

    //substituiImparPorZero

    public static void substituiImparPorZero(){

        for (int i = 0; i < vetor.length; i++){

            if (vetor[i] % 2 != 0) {

                
                System.out.println("Os números ímpares são:" + vetor[i]);
                vetor[i] = 0;
                System.out.println("Agora os ímpares substituídos por 0" + vetor[i]);
            }

        }

    }

    public static void maiorElemento(){
        int maior = vetor[0];
        for (int i =0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                
            }
        }

        System.out.println("O maior elemento é:" + maior);
    }

    
        

    public static void menorElemento(){
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }

        System.out.println("O menor elemento é:" + menor);
    }

 
    public static void imprimeVetor(){

        System.out.println("Conteúdo do Vetor:");

        for (int i = 0; i<vetor.length; i++){
            System.out.println(vetor[i]);

        }
    }
    
}

