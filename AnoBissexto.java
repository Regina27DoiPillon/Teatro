import java.util.Scanner;
class AnoBissexto{
    public static void anobissexto(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o ano para verificar se ele é bissexto: ");
        int ano = teclado.nextInt();
        String bissexto = "não é";
        if (ano%4==0){
            if (ano%4==0 && ano%400==0){
                bissexto = "é";
            }else if(ano%4==0 && ano%100==0){
                
            }else if(ano%4==0){
                bissexto = "é";
            }
        }
        System.out.println("O ano "+ano+" "+bissexto+" bissexto.");
    }
}