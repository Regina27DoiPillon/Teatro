import java.util.Scanner;
class MaiordeTres{
    public static void maiordetres(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = teclado.nextInt();
        int maior = num1;
        int empate = 0;
        if (maior<num2){
            maior = num2;
        }
        if (maior<num3){
            maior=num3;
        }
        if(maior==num1){
            empate++;
        }
        if(maior==num2){
            empate++;
        }
        if(maior==num3){
            empate++;
        }
        String empatou = (empate>=2)? "Há empate entre os números." : "Não há empate.";
        System.out.println("O maior número é: "+maior+". "+empatou);
        teclado.close();

    }
}