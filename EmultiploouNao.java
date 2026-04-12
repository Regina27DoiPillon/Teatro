import java.util.Scanner;
class EmultiploouNao{
    public static void ehmultiploounao(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = teclado.nextInt();
        int multiplo = 0;
        int m = 0;
        if (num%3==0){
            multiplo++;
            m=3;
        }
        if (num%5==0){
            multiplo++;
        }
        String mu = (multiplo == 2)? "de 5 e 3" : (multiplo ==1 && m==3)? "de 3" : (multiplo==1 &&m==0)? "de 5" : "de nenhum";
        System.out.println("O número "+ num+ " é multiplo "+mu);
        
    }
}