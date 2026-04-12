import java.util.Scanner;
class Menu{
    public static void menuzin(){
        Scanner teclado = new Scanner(System.in);
        String[] titulos = {"[1] = Ano bissexto", "[2] = Aprovação escolar", "[3] = Calculadora simples", "[4] = Desconto na Compra", "[5] = Dia da semana", "[6] = É multiplo ou não?", "[7] = Estação do ano", "[8] = IMc", "[9] = Ingresso cinema", "[10] = Pedra, papel, tesoura", "[11] = Login", "[12] = Maior de tres", "[13] = Maior ou menor?", "[14] = Multa", "[15] = Nota e conceito", "[16] = Par ou ímpar", "[17] = Positivo ou negativo", "[18] = Nº romano", "[19] = Temperatura", "[20] = TRiângulo"};
        String comando = "";
        int exercicio = 0;
        int pag = 0;
        String[] paginar = {"", ""};
        int a = 0;

        System.out.print("------------------------------\n ");
        while(true){
            paginar[0] = (pag==0)? "" : "A";
            paginar[1] = (pag==2)? "" : "P";
            switch(pag){
                case 0:
        for(a = 0; a<7; a++){
            System.out.print(titulos[a] + "; ");
        } break;
                case 1:
                    for(a = 8; a<14; a++){
            System.out.print(titulos[a] + "; ");} break;
                case 2:
                    for(a = 15; a<19; a++){
            System.out.print(titulos[a] + "; ");} break;
        }
        System.out.println("\n"paginar[0] + " " + (pag+1) +"/3 "+ paginar[1]);

        System.out.println("\n");
        System.out.println("Informe qual exercício deseja ver ou se deseja paginar:");
        comando = teclado.nextLine();
        if ("A".equals(comando) || "P".equals(comando) || "V".equals(comando)){
            switch(comando){
                case A:
                    break;
                case P:
                    break;
                case V:
                    break;
            }
        }else{
            try{
                exercicio = Integer.parseInt(comando);
            }catch (NumberFormatException e) {
                System.out.println("Comando inválido.");
            }
        }
    }
}
}