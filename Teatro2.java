import java.util.Scanner;

class Teatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean loopsala = true;

        String[][] principal = new String[12][12];
        String[][] beethoven = new String[12][12];
        String[][] genshin = new String[12][12];

        int[] dinheiro_acumulado = new int[5];

        int comprareserva = 0;
        int qntdd_ingresso = 0;
        int i = 0;
        int a = 0;
        int b = 0;
        int z = 0;
        int zz = 0;

        String co_re = "";
        String x = "";

        String[] percorrer_x = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        int aaaa = 0;
        int y = 0;
        String[] titulopeca = {"Bela Adormecida", "As 7 maravilhas do mundo", "O espaço distorcido"};
        // String cadeira="";

        while (loopsala == true) {

            System.out.println(
                "Bem vindo ao Teatro Devisate. Informe qual sala deseja:\n[1] = Principal; \n[2] = Beethoven; \n[3] = Genshin Impact; \n[4] = Sair."
            );

            int sala = teclado.nextInt();

            switch (sala) {

                case 1:
                    System.out.println(titulopeca[sala]);
                    System.out.print("   ");
        //escrever as cadeiras
                    for ( aaaa = 0; aaaa < 12; aaaa++){
                        System.out.print(" "+percorrer_x[aaaa] + "  ");
                    }
                    System.out.println("");
                    for (a = 0; a < 12; a++) {
                        if(a>=10){
                        System.out.print(a + 1 +" ");}else{System.out.print(a + 1 +"  ");}
                        for (b = 0; b < 12; b++) {
                            if (!"R".equals(principal[a][b]) && !"X".equals(principal[a][b])) {
                                principal[a][b] = " ";
                            }
                            System.out.print("[" + principal[a][b] + "] ");
                        }
                        System.out.print("\n");
                    }
//parou de escrever cadeira
                    while (i < 0 || i == 0) {

                        System.out.println("--------------------------\nInforme quantos ingressos deseja adquirir (0 = sair): ");
                        qntdd_ingresso = teclado.nextInt();

                        if (qntdd_ingresso == 0) {
                            break;
                        }

                        for (i = qntdd_ingresso; i > 0; i--) {

                            while (loopsala == true) {

                                System.out.println("Informe o que deseja fazer: \n[1] = Comprar ingresso (20 reais); \n[2] = Reservar ingresso (10 reais);");
                                

                                comprareserva = teclado.nextInt();
                                teclado.nextLine();

                                if (comprareserva == 1 || comprareserva == 2) {
                                    co_re = (comprareserva == 1) ? "comprar" : "reservar";
                                    break;
                                }

                                System.out.println("Digite um valor válido (1 ou 2).");
                            }

                            System.out.println("Informe qual assento na coluna (A ~ L) deseja " + co_re + ":");
                            x = teclado.nextLine();
                            x = x.toLowerCase();
                            System.out.println("Informe qual assento na fileira (1 ~ 12) deseja " + co_re + ":");
                            y = teclado.nextInt();
                            y = y - 1;

                            System.out.println("\n");

                            for (z = 0; z < 12; z++) {
                                if (x.equals(percorrer_x[z])) {
                                    zz = z;
                                    System.out.println(zz);
                                    break;
                                }
                            }

                            co_re = (co_re.equals("comprar")) ? "X" : "R";

                            if (y >= 0 && y < 12 && zz >= 0 && zz < 12) {
                                principal[zz][y] = co_re;
                            } else {

                            }

                            dinheiro_acumulado[sala] = (comprareserva == 1)? dinheiro_acumulado[sala] + 20 : dinheiro_acumulado[sala] + 10;
                        }

                        System.out.print("   ");
                    for ( aaaa = 0; aaaa < 12; aaaa++){
                        System.out.print(" "+percorrer_x[aaaa] + "  ");
                    }
                    System.out.println("");
                    for (a = 0; a < 12; a++) {
                        if(a>=10){
                        System.out.print(a + 1 +" ");}else{System.out.print(a + 1 +"  ");}
                        for (b = 0; b < 12; b++) {
                            if (!"R".equals(principal[a][b]) && !"X".equals(principal[a][b])) {
                                principal[a][b] = " ";
                            }
                            System.out.print("[" + principal[a][b] + "] ");
                        }
                        System.out.print("\n");
                    }
                    }

                    comprareserva = 0;
                    break;

            }
        }
    }
}