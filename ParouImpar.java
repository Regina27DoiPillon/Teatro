import java.util.Scanner;
class ParouImpar{
    public static void parimpar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número para verificar se ele é par ou ímpar: ");
        int num = teclado.nextInt();
        String parouimpar = (num%2==0)? "Par" : "Ímpar";
        System.out.println("O número "+num+" é "+ parouimpar);
        teclado.close();
    }
}