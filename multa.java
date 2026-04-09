import java.util.Scanner;
class Multa{
    public static void multa(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o limite da via: ");
        double limite = teclado.nextDouble();
        System.out.println("Informe a velocidade do veículo: ");
        double velo = teclado.nextDouble();
        double vinteporcento = limite + limite*0.2;
        double metadeporcento = limite+limite*0.5;
        String deferimento = (limite>=velo)? "Sem multa." : (velo>limite && vinteporcento>=velo)? "Multa leve." : (velo>vinteporcento && metadeporcento>=velo)? "Multa grave." : "Suspensão.";
        System.out.println(deferimento);
        teclado.close();
    }
}