import java.util.ArrayList;

import java.util.Scanner;

// Projeto salvando dados em um arrayList;

public class ListaTelefonica {

    public static void main(String[] args) {

        ArrayList<String> agenda = new ArrayList();

        Scanner ler = new Scanner(System.in);
        System.out.println("Deseja adicionar um novo contato ?(S/N)");
        String user = ler.next();
        String sim = "S";
        while (user.equals(sim)) {
            System.out.println("Digite o nome do contato");
            String contato = ler.next();
            System.out.println("Digite o número com o DDD");
            String numero = ler.next();
            int a = numero.length();
            if (a != 10) { // checagem de números validos e invalidos;
                System.out.println("Número invalido");
            } else {
                System.out.println("Contato salvo com sucesso");
                agenda.add(contato + " " + numero);
                System.out.println("Deseja adicionar um novo contato ?(S/N)");
                String retorno = ler.next();

                if (!retorno.equals(sim)) {
                    break;
                }
            }
        }

        System.out.println("Sua agenda possui " + agenda.toArray().length + " "+"contatos: " + "\n" + agenda);

        }
    }
