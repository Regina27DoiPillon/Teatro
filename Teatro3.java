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
        String[] percorrer_x = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        int aaaa = 0;
        int y = 0;
        String[] titulopeca = {"Bela Adormecida", "As 7 maravilhas do mundo", "O espaço distorcido"};
        String[] nomesala = {"Principal", "Beethoven", "Genshin Impact"};
        int[] reservadas = {0, 0, 0};
        int[] compradas = {0, 0, 0};
        boolean loopmenu = true;
        int mainmenu = 0;
        // String cadeira="";

        while (loopsala == true) {
            while (loopmenu == true) {
                System.out.println(
                    "\nInforme o que deseja fazer:\n[0] = Sair; \n[1] = Ver Shows e Espetáculos; \n[2] = Mostrar valor arrecadado do Teatro; \n[3] = 20 exercícios paginados de Java."
                );
                mainmenu = teclado.nextInt();

                if (mainmenu < 0 || mainmenu > 3) {
                    System.out.println("\nInformação digitada incorretamente.\n\n");
                } else {
                    break;
                }
            }

            if (mainmenu == 0) {
                System.out.println("\n\nSaindo...");
                break;
            } else {
                switch (mainmenu) {
                    case 1:
                        while (true) {
                            System.out.println(
                                "\nBem vindo ao Teatro Devisate. Informe qual sala deseja: \n[0] = Sair;\n[1] = Principal; \n[2] = Beethoven; \n[3] = Genshin Impact."
                            );
                            sala = teclado.nextInt();

                            if (sala > 4 || sala < 0) {
                                System.out.println("\nInformação digitada incorretamente.\n\n");
                            } else {
                                break;
                            }
                        }

                        if (sala == 0) {
                            break;
                        } else {

                            PrintarCadeiras.quadro12x12(
                                titulopeca,
                                nomesala,
                                sala,
                                aaaa,
                                percorrer_x,
                                a,
                                b,
                                principal,
                                beethoven,
                                genshin,
                                reservadas,
                                compradas
                            );

                            while (i < 0 || i == 0) {

                                System.out.println("--------------------------\nInforme quantos ingressos deseja adquirir (0 = sair): ");
                                qntdd_ingresso = teclado.nextInt();

                                if (qntdd_ingresso == 0) {
                                    i = 1;
                                } else {

                                    for (i = qntdd_ingresso; i > 0; i--) {

                                        while (loopsala == true) {
                                            System.out.println("\nInforme o que deseja fazer: \n[1] = Comprar ingresso (20 reais); \n[2] = Reservar ingresso (10 reais);");
                                            comprareserva = teclado.nextInt();
                                            teclado.nextLine();

                                            if (comprareserva == 1 || comprareserva == 2) {
                                                co_re = (comprareserva == 1) ? "comprar" : "reservar";
                                                break;
                                            }
                                            System.out.println("\nDigite um valor válido (1 ou 2).");
                                        }

                                        System.out.println("\nInforme qual assento na coluna (1 ~ 12) deseja " + co_re + ":");
                                        y = teclado.nextInt();
                                        y = y - 1;

                                        System.out.println("Informe qual assento na fileira (A ~ L) deseja " + co_re + ":");
                                        x = teclado.nextLine();
                                        x = x.toUpperCase();

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
                                                    if (principal[zz][y].equals("X") || principal[zz][y].equals("R")) {
                                                        System.out.println("Acento ocupado. Redigite as informações de forma correta.");
                                                    } else {
                                                        principal[zz][y] = co_re;
                                                    }
                                                } else {
                                                    System.out.println("Acento indisponível. Redigite as informações de forma correta.");
                                                }
                                                break;

                                            case 2:
                                                if (y >= 0 && y < 12 && zz >= 0 && zz < 12) {
                                                    if (beethoven[zz][y].equals("X") || beethoven[zz][y].equals("R")) {
                                                        System.out.println("Acento ocupado. Redigite as informações de forma correta.");
                                                    } else {
                                                        beethoven[zz][y] = co_re;
                                                    }
                                                } else {
                                                    System.out.println("Acento indisponível. Redigite as informações de forma correta.");
                                                }
                                                break;

                                            case 3:
                                                if (y >= 0 && y < 12 && zz >= 0 && zz < 12) {
                                                    if (genshin[zz][y].equals("X") || genshin[zz][y].equals("R")) {
                                                        System.out.println("Acento ocupado. Redigite as informações de forma correta.");
                                                    } else {
                                                        genshin[zz][y] = co_re;
                                                    }
                                                } else {
                                                    System.out.println("Acento indisponível. Redigite as informações de forma correta.");
                                                }
                                                break;
                                        }

                                        dinheiro_acumulado[sala] =
                                            (comprareserva == 1)
                                                ? dinheiro_acumulado[sala] + 20
                                                : dinheiro_acumulado[sala] + 10;
                                    }
                                }

                                PrintarCadeiras.quadro12x12(
                                    titulopeca,
                                    nomesala,
                                    sala,
                                    aaaa,
                                    percorrer_x,
                                    a,
                                    b,
                                    principal,
                                    beethoven,
                                    genshin,
                                    reservadas,
                                    compradas
                                );
                            }

                            comprareserva = 0;
                            break;
                        }
                    case 2:
                        break;
                }
            }
        }
    }
}