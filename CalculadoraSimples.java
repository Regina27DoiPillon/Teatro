import java.util.Scanner;
class CalculadoraSimples{
    public static void calculadorasimples(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tipo de operação que deseja realizar (+, -, *, /): ");
        String operacao = teclado.nextLine();
        System.out.println("Informe o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Informe o segundo número: ");
        double num2 = teclado.nextDouble();
        double resultado = 0;
        switch (operacao){
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("Erro, divisão por 0!");
                }else{
                    resultado = num1/num2;
                    }
                break;
        }
        System.out.println(num1+""+operacao+""+num2+"="+resultado);
    }
}