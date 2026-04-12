import java.util.Scanner;

class Menu {
    public static void menuzin() {
        Scanner teclado = new Scanner(System.in);

        String[] titulos = {
            "[1] = Ano bissexto",
            "[2] = Aprovação escolar",
            "[3] = Calculadora simples",
            "[4] = Desconto na Compra",
            "[5] = Dia da semana",
            "[6] = É multiplo ou não?",
            "[7] = Estação do ano",
            "[8] = IMc",
            "[9] = Ingresso cinema",
            "[10] = Pedra, papel, tesoura",
            "[11] = Login",
            "[12] = Maior de tres",
            "[13] = Maior ou menor?",
            "[14] = Multa",
            "[15] = Nota e conceito",
            "[16] = Par ou ímpar",
            "[17] = Positivo ou negativo",
            "[18] = Nº romano",
            "[19] = Temperatura",
            "[20] = TRiângulo"
        };

        String comando = "";
        int exercicio = 0;
        int pag = 1;
        String[] paginar = {"", ""};
        int a = 0;
        int o = 0;

        System.out.print("------------------------------\n ");

        while (o == 0) {

            paginar[0] = (pag == 1) ? "" : "A";

            paginar[1] = (pag == 3) ? "" : "P";
            System.out.println("\n---------------------");
            switch (pag) {
                case 1:
                    for (a = 0; a < 7; a++) {
                        System.out.print(titulos[a] + "; ");
                    }
                    break;

                case 2:
                    for (a = 8; a < 14; a++) {
                        System.out.print(titulos[a] + "; ");
                    }
                    break;

                case 3:
                    for (a = 15; a < 20; a++) {
                        System.out.print(titulos[a] + "; ");
                    }
                    break;
            }

            System.out.println("\n" + paginar[0] + " " + (pag) + "/3 " + paginar[1]);

            System.out.println("\nInforme qual exercício deseja ver ou se deseja paginar ([A] = anterior, [P] = próximo, [V] = voltar para o menu):");

            comando = teclado.nextLine();
            comando = comando.toUpperCase();

            if (("A".equals(comando) && pag > 1)|| ("P".equals(comando) && pag < 3 ) || "V".equals(comando)) {

                switch (comando) {
                    case "A":
                        pag = pag - 1;
                        break;

                    case "P":
                        pag = pag + 1;
                        break;

                    case "V":
                        o = 1;
                        break;
                }
            } else {

                try {
                    exercicio = Integer.parseInt(comando);
                } catch (NumberFormatException e) {
                    System.out.println("Comando inválido.");
                }
                exercicio = exercicio - 1;
                if(exercicio > -1 && exercicio < 20){
                    if(pag==0 && exercicio<6){
                        switch (exercicio){
                            case 0:
                                AnoBissexto.anobissexto();
                                break;
                            case 1:
                                AprovacaoEscolar.aprovacaoescolar();
                                break;
                            case 2:
                                CalculadoraSimples.calculadorasimples();
                                break;
                            case 3:
                                DescontoCompra.descontonacompra();
                                break;
                            case 4:
                                DiaSemana.diasemana();
                                break;
                            case 5:
                                EmultiploouNao.ehmultiploounao();
                                break;
                            case 6:
                                Estacao.estacao();
                                break;
                            
                        }
                    }
                else if(pag==2 && exercicio<14 && exercicio>6){
                    switch (exercicio){
                            case 7:
                                Imc.imc();
                                break;
                            case 8:
                                IngCine.ingressocine();
                                break;
                            case 9:
                                Joguinho.pedrapapeltesoura();
                                break;
                            case 10:
                                Login.login();
                                break;
                            case 11:
                                MaiordeTres.maiordetres();
                                break;
                            case 12:
                                MaiorouMenor.maioroumenor();
                                break;
                            case 13:
                                Multa.multa();
                                break;
                            
                        }
                }else{
                    switch (exercicio){
                            case 14:
                                NotaConceito.notaconceito();
                                break;
                            case 15:
                                ParouImpar.parimpar();

                                break;
                            case 16:
                                PositivoNegativo.positivonegativo();
                                break;
                            case 17:
                                Romanos.romanos();
                                break;
                            case 18:
                                Temperatura.temperatura();
                                break;
                            case 19:
                                Triangulo.triangulo();
                                break;
                            
                                
                        }
                }
            }
        }
    }
    }
}