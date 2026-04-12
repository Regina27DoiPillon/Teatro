import java.util.Scanner;
class Triangulo{
    public static void triangulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o 1º lado do triângulo: ");
        int lado1 = teclado.nextInt();
        System.out.println("Informe o 2º lado do triângulo: ");
        int lado2 = teclado.nextInt();
        System.out.println("Informe o 3º lado do triângulo: ");
        int lado3 = teclado.nextInt();
        int maiorlado= lado1;
        int triangulo = 1;
        if(maiorlado<lado2){maiorlado=lado2; triangulo=2;}
        if(maiorlado<lado3){maiorlado=lado3; triangulo=3;}
        String sim = "Não é";
        switch(triangulo){
            case 1:
                if(maiorlado<lado2+lado3){
                    sim = "É";
                }break;
            case 2: 
                if(maiorlado<lado1+lado3){
                    sim = "É";
                }break;
            case 3:
                if(maiorlado<lado1+lado2){
                    sim = "É";
                }break;
        }
        String tipo = "";
        if(sim=="É"){tipo = (lado1==lado2 && lado2==lado3)? "equilátero" : (lado1==lado2 || lado2==lado3 || lado3==lado1)? "isósceles" : "escaleno";}
        System.out.println(sim+" um triângulo "+tipo);
    }
}