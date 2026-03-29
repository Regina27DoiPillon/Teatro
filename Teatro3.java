import java.util.Scanner;

class Teatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sala = 0;
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
        String[] percorrer_x = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};
        int aaaa = 0;
        int y = 0;
        String[] titulopeca = {"Bela Adormecida", "As 7 maravilhas do mundo", "O espaço distorcido"};
        String[] nomesala = {"Principal", "Beethoven", "Genshin Impact"};
        int[] reservadas = new int[3];
        reservadas[0] = 0;
        reservadas[1] = 0;
        reservadas[2] = 0;
        int[] compradas = new int[3];
        compradas[0] = 0;
        compradas[1] = 0;
        compradas[2] = 0;
        // String cadeira="";

        while (loopsala == true) {
            while(true){
                System.out.println(
                    "Bem vindo ao Teatro Devisate. Informe qual sala deseja:\n[1] = Principal; \n[2] = Beethoven; \n[3] = Genshin Impact; \n[4] = Sair."
                );

                sala = teclado.nextInt();
                if(sala > 4 || sala < 0){
                    System.out.println("Informação digitada incorretamente.");
                }else{
                    if(sala == 4){
                        loopsala = false;
                    }else{
                        break;
                    }
                }
            }


            switch (sala) {
                case 1:
                    System.out.println(nomesala[sala - 1]);
                    System.out.println(titulopeca[sala - 1]);
                    System.out.print("   ");

                    for (aaaa = 0; aaaa < 12; aaaa++) {
                        System.out.print(" " + percorrer_x[aaaa] + "  ");
                    }

                    System.out.println("");

                    for (a = 0; a < 12; a++) {
                        if (a >= 10) {
                            System.out.print(a + 1 + " ");
                        } else {
                            System.out.print(a + 1 + "  ");
                        }

                        for (b = 0; b < 12; b++) {
                            if (!"R".equals(principal[a][b]) && !"X".equals(principal[a][b])) {
                                principal[a][b] = " ";
                            }
                            if("R".equals(principal[a][b])){
                                reservadas[sala-1] = reservadas[sala-1] + 1;
                            }
                            if("X".equals(principal[a][b])){
                                compradas[sala-1] = compradas[sala-1] + 1;
                            }
                            System.out.print("[" + principal[a][b] + "] ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("[ ] Livre   [R] Reservada   [X] Ocupada");
                    System.out.println("["+ (144 - reservadas[sala-1] - compradas[sala - 1]) +"] Livre   ["+ reservadas[sala - 1] +"] Reservada   ["+ compradas[sala - 1] +"] Ocupada");
                    System.out.println("Valor estimado das cadeiras ocupadas: "+ compradas[sala-1] * 20 +"\nValor estimado das cadeiras reservadas: "+ reservadas[sala - 1] * 10 + "\nValor total da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 10)) + "\nValor total estimado da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 20)));
                    break;

                case 2:
                    System.out.println(nomesala[sala - 1]);
                    System.out.println(titulopeca[sala - 1]);
                    System.out.print("   ");

                    for (aaaa = 0; aaaa < 12; aaaa++) {
                        System.out.print(" " + percorrer_x[aaaa] + "  ");
                    }

                    System.out.println("");
                    for (a = 0; a < 12; a++) {
                        if (a >= 10) {
                            System.out.print(a + 1 + " ");
                        } else {
                            System.out.print(a + 1 + "  ");
                        }

                        for (b = 0; b < 12; b++) {
                            if (!"R".equals(beethoven[a][b]) && !"X".equals(beethoven[a][b])) {
                                beethoven[a][b] = " ";
                            }
                            if("R".equals(beethoven[a][b])){
                                reservadas[sala-1] = reservadas[sala-1] + 1;
                            }
                            if("X".equals(beethoven[a][b])){
                                compradas[sala-1] = compradas[sala-1] + 1;
                            }
                            System.out.print("[" + beethoven[a][b] + "] ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("[ ] Livre   [R] Reservada   [X] Ocupada");
                    System.out.println("["+ (144 - reservadas[sala-1] - compradas[sala - 1] +"] Livre   ["+ reservadas[sala - 1]) +"] Reservada   ["+ compradas[sala - 1] +"] Ocupada");
                    System.out.println("Valor estimado das cadeiras ocupadas: "+ compradas[sala-1] * 20 +"\nValor estimado das cadeiras reservadas: "+ reservadas[sala - 1] * 10 + "\nValor total da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 10)) + "\nValor total estimado da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 20)));
                    break;

                case 3:
                    System.out.println(nomesala[sala - 1]);
                    System.out.println(titulopeca[sala - 1]);
                    System.out.print("   ");

                    for (aaaa = 0; aaaa < 12; aaaa++) {
                        System.out.print(" " + percorrer_x[aaaa] + "  ");
                    }

                    System.out.println("");
                    for (a = 0; a < 12; a++) {
                        if (a >= 10) {
                            System.out.print(a + 1 + " ");
                        } else {
                            System.out.print(a + 1 + "  ");
                        }

                        for (b = 0; b < 12; b++) {
                            if (!"R".equals(genshin[a][b]) && !"X".equals(genshin[a][b])) {
                                genshin[a][b] = " ";
                            }
                            if("R".equals(genshin[a][b])){
                                reservadas[sala-1] = reservadas[sala-1] + 1;
                            }
                            if("X".equals(genshin[a][b])){
                                compradas[sala-1] = compradas[sala-1] + 1;
                            }
                            System.out.print("[" + genshin[a][b] + "] ");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("[ ] Livre   [R] Reservada   [X] Ocupada");
                    System.out.println("["+ (144 - reservadas[sala-1] - compradas[sala - 1] +"] Livre   ["+ reservadas[sala - 1]) +"] Reservada   ["+ compradas[sala - 1] +"] Ocupada");
                    System.out.println("Valor estimado das cadeiras ocupadas: "+ compradas[sala-1] * 20 +"\nValor estimado das cadeiras reservadas: "+ reservadas[sala - 1] * 10 + "\nValor total da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 10)) + "\nValor total estimado da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 20)));
                    break;
            }




            while (i < 0 || i == 0) {

                System.out.println("--------------------------\nInforme quantos ingressos deseja adquirir (0 = sair): ");
                qntdd_ingresso = teclado.nextInt();

                if (qntdd_ingresso == 0) {
                    i = 1;
            }else{

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
                    switch (sala) {
                        case 1:
                            if (y >= 0 && y < 12 && zz >= 0 && zz < 12) {
                                if (principal[zz][y].equals("X") || principal[zz][y].equals("R")){
                                    System.out.println("Acento ocupado. Redigite as informações de forma correta.");
                                }else{
                                    principal[zz][y] = co_re;
                                }
                            } else {System.out.println("Acento indisponível. Redigite as informações de forma correta.");}
                            break;

                        case 2:
                            if (y >= 0 && y < 12 && zz >= 0 && zz < 12) {
                                if(beethoven[zz][y].equals("X") || beethoven[zz][y].equals("R")){
                                    System.out.println("Acento ocupado. Redigite as informações de forma correta.");
                                }else{
                                    beethoven[zz][y] = co_re;
                                }
                            } else {System.out.println("Acento indisponível. Redigite as informações de forma correta.");}
                            break;

                        case 3:
                            if (y >= 0 && y < 12 && zz >= 0 && zz < 12) {
                                if(genshin[zz][y].equals("X") || genshin[zz][y].equals("R")){
                                    System.out.println("Acento ocupado. Redigite as informações de forma correta.");
                                }else{
                                    genshin[zz][y] = co_re;
                                }
                            } else {System.out.println("Acento indisponível. Redigite as informações de forma correta.");}
                            break;
                    }

                    dinheiro_acumulado[sala] =
                        (comprareserva == 1)? dinheiro_acumulado[sala] + 20 : dinheiro_acumulado[sala] + 10;
                }
            }
                System.out.print("   ");
                for (aaaa = 0; aaaa < 12; aaaa++) {
                    System.out.print(" " + percorrer_x[aaaa] + "  ");
                }

                System.out.println("");

                for (a = 0; a < 12; a++) {
                    if (a >= 10) {
                        System.out.print(a + 1 + " ");
                    } else {
                        System.out.print(a + 1 + "  ");
                    }

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