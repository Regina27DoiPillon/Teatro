import java.util.Scanner;
class Temperatura{
    public static void temperatura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a temepratura em °C: ");
        double temp = teclado.nextDouble();
        String condicao = (temp<15)? "frio" : (temp>=15 && temp<=25)? "agradável" : "quente";
        System.out.println(temp + " é "+condicao);
        teclado.close();
    }
}