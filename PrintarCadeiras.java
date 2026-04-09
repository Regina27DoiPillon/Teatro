class PrintarCadeiras{
    public static void quadro12x12(String[] titulopeca, String[] nomesala, int sala, int aaaa, String[] percorrer_x, int a, int b, String[][] principal, String[][] beethoven, String[][] genshin, int[] reservadas, int[] compradas){
        
        System.out.println("Sala: "+ sala + " => " + nomesala[sala - 1]);
        System.out.println("Peça atual => "+ titulopeca[sala - 1]);
        System.out.println("Preço do ingresso => inteira: 20R$  ===  metade: 10R$");
        System.out.print("   ");

                    //for (aaaa = 0; aaaa < 12; aaaa++) {
                       // System.out.print(" " + percorrer_x[aaaa] + "  ");
                    //}
                    for (a = 0; a < 12; a++) {
                        if (a >= 9) {
                            System.out.print((a + 1) + "  ");
                        } else {
                            System.out.print((a + 1) + "   ");
                        }
                    }

                    System.out.println("");

                    //for (a = 0; a < 12; a++) {
                        //if (a >= 10) {
                        //    System.out.print(a + 1 + " ");
                        //} else {
                        //    System.out.print(a + 1 + "  ");
                        //}
                    for (aaaa = 0; aaaa < 12; aaaa++) {
                        a = aaaa;
                            System.out.print(percorrer_x[aaaa] + " ");
                      

            switch(sala){
                case 1:
                        for (b = 0; b < 12; b++) {
                            if (!"R".equals(principal[a][b]) && !"X".equals(principal[a][b])) {
                                principal[a][b] = " ";
                            }
                            System.out.print("[" + principal[a][b] + "] ");
                        }break;
                case 2:
                    for (b = 0; b < 12; b++) {
                            if (!"R".equals(beethoven[a][b]) && !"X".equals(beethoven[a][b])) {
                                beethoven[a][b] = " ";
                            }
                            System.out.print("[" + beethoven[a][b] + "] ");
                    } break;
                case 3:
                    for (b = 0; b < 12; b++) {
                            if (!"R".equals(genshin[a][b]) && !"X".equals(genshin[a][b])) {
                                genshin[a][b] = " ";
                            }
                            System.out.print("[" + genshin[a][b] + "] ");
                        }


                        }
                        
                        System.out.print("\n");
                    }
                    System.out.println("[ ] Livre     [R] Reservada   [X] Ocupada");
                    System.out.println("["+ ((144 - reservadas[sala - 1]) - compradas[sala - 1]) +"] Livre   ["+ reservadas[sala - 1] +"] Reservada      ["+ compradas[sala - 1] +"] Ocupada");
                    /*System.out.println("Valor estimado das cadeiras ocupadas: "+ compradas[sala-1] * 20 +"\nValor estimado das cadeiras reservadas: "+ reservadas[sala - 1] * 10 + "\nValor total da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 10)) + "\nValor total estimado da sala: " + ((compradas[sala-1] * 20) + (reservadas[sala - 1] * 20)));*/
    }
}