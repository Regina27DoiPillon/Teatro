import java.util.Scanner;
class NotaConceito{
    public static void notaconceito(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a nota: ");
        int nota = teclado.nextInt();
        String conceito = (nota<=10 && nota>=9)? "A" : (nota>=7 && nota<=8)? "B" : (nota<=6 && nota>=5)? "C" : "D";
        System.out.println("A sua nota foi de "+ nota+" e o conceito foi de "+conceito);
       
    }
}