import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class ConferirUsuario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String UsuarioCadastrado = "RamonFRosario"; // usuario ja cadastrado
        String Usuario; // usuario a ser colocado
        String SenhaCadastrada = "1234"; // senha cadastrada
        String Senha; // senha a ser colocado
        System.out.println("Digite seu usuario");
        Usuario = ler.nextLine();

        while (!Usuario.equals(UsuarioCadastrado)) { // enquanto o usuario não for o correto ele continua em laço
            System.out.println("Usuario não encontrado, tente novamente");
            System.out.println("Digite seu usuario");
            Usuario = ler.nextLine();

        }
        if (Usuario.equals(UsuarioCadastrado)) {
            System.out.printf("Usuario encontrado,informe a senha:\n");
            Senha = ler.nextLine();
            if (Senha.equals(SenhaCadastrada)) { // checagem de senha
                System.out.println("Acesso permitido, Seja bem vindo");

            } else {
                System.out.println("Senha incorreta, tente novamente mais tarde");


                }

            }
         else {

        }

    }


}


