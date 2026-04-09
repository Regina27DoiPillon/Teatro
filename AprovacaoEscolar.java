import java.util.Scanner;
class AprovacaoEscolar{
    public static void aprovacaoescolar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a nota: ");
        double nota = teclado.nextDouble();
        String deferimento = (nota>=7)? "aprovado" : (nota<7 & nota>=5)? "recuperação" : "reprovado";
        System.out.println("O aluno cuja a nota é "+nota+" foi "+ deferimento);
        teclado.close();
    }
}