import java.util.Scanner;
class Joguinho{
    public static void pedrapapeltesoura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Jogador 1: (pedra = 1, papel = 2, tesoura = 3) ");
        int j1 = teclado.nextInt();
        System.out.println("Jogador 2: (pedra = 1, papel = 2, tesoura = 3) ");
        int j2 = teclado.nextInt();
        String vitoria = (j1+1==j2)? "Vitória j2" : (j2+1==j1)? "Vitória j1" : "empate";
        if (j1==3 && j2==1){vitoria= "Vitória J2";}
        if (j1==1 && j2==3){vitoria= "Vitória J1";}
        System.out.println(vitoria);
       
    }
}