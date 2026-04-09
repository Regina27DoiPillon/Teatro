import java.util.Scanner;
class DescontoCompra{
    public static void descontonacompra(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        double compra = teclado.nextDouble();
        double desconto = 0;
        double totalfinal = compra;
        int d = 0;
        if (compra<=200){

        }else if(compra>200 && compra<=500){
            desconto = compra*0.1;
            d=10;
        }else{
            desconto = compra*0.2;
            d=20;
        }
        totalfinal=compra-desconto;
        System.out.println("O valor de "+compra+" teve "+ desconto+"R$ de desconto ("+d+"). Preço a pagar: "+totalfinal);
        teclado.close();
    }
}