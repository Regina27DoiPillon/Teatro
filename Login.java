import java.util.Scanner;
class Login{
    public static void login(){
        Scanner teclado = new Scanner(System.in);
        String s = "senha123";
        String u = "Admin123";
        System.out.println("Informe o Login do usuário: ");
        String usuario = teclado.nextLine();
        System.out.println("Informe a Senha: ");
        String senha = teclado.nextLine();
        String acesso = (s.equals(senha) && u.equals(usuario))? "Acesso liberado." : "Acesso negado.";
        System.out.println(acesso);
        
    }
}