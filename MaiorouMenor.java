import java.util.Scanner;

class MaiorouMenor{
    public static void maioroumenor(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1 = teclado.nextInt();
        System.out.println("Informe outro número: ");
        int num2 = teclado.nextInt();
        String maioroumenor = (num1==num2)? "igual": (num1>num2)? "maior" : "menor";
        System.out.println("O número "+num1+" é "+maioroumenor+" que "+num2);
        teclado.close();
    }
}