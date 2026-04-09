import java.util.Scanner;
class Estacao{
    public static void estacao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o mês (1~12): ");
        int mes = teclado.nextInt();
        String estacao = (mes<=3 || mes==12)? "Verão" : (mes>3 && mes<=6)? "Outono" : (mes>6 && mes<=9)? "Inverno" : "Primavera";
        System.out.println("A estação é "+estacao);
        teclado.close();
    }
}