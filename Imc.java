import java.util.Scanner;
class Imc{
    public static void imc(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o seu peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Informe a sua altura: ");
        double altura = teclado.nextDouble();
        double imc = peso/(altura*altura);

        String condicao = (imc<18.5)? "abaixo do peso" : (imc>=18.5 && imc<25)? "peso normal" : (imc>=25 && imc<30)? "sobrepeso" : "obesidade";
        System.out.println("O imc = "+imc+" e está classificado como: "+condicao);
        
    }
}