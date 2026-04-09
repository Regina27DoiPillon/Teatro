import java.util.Scanner;
class IngCine{
    public static void ingressocine(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = teclado.nextInt();
        String ingresso = (idade<12 || idade>60)? "meia entrada - 10 reais" : "entrada - 20 reais";
        System.out.println("Seu ingresso é uma "+ ingresso);
        teclado.close();
    }
}