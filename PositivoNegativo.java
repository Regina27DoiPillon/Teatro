import java.util.Scanner;
class PositivoNegativo{
    public static void positivonegativo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = teclado.nextInt();
        String devolucao = (num==0)? "zero" : (num>0)? "positivo" : "negativo";
        System.out.println("O número "+ num+" é "+ devolucao);
        
    }
}