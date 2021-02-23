import java.util.*;

public class GeradorDeSenhas {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        String[] letrasMinusculas ={
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
        };
        String [] letrasMaiusculas = {
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
        };
        String[] numeros = {
                "0","1","2","3","4","5","6","7","8","9"
        };
        String[] caracterEspecial = {
                "!","@","#","$","%","&","*",":",";"
        };
        StringBuilder Senha = new StringBuilder(" ");

        System.out.println("Quantas letras maiúsculas são necessárias ? ");
        int QntLetrasMaiusculas = ler.nextInt();

        System.out.println("Quantas letras minúsculas são necessárias ?");
        int QntLetrasMinusculas = ler.nextInt();

        System.out.println("Quantos números são necessárias ? ");
        int QntNum = ler.nextInt();

        System.out.println("Quantos carácteres especiais são necessários ? ");
        int QntCaracter = ler.nextInt();

        for ( int i = 0; i < QntLetrasMaiusculas; i++){
            int b = random.nextInt(letrasMaiusculas.length);
            Senha.append(letrasMaiusculas[b]);
        }
        for (int i = 0; i <= QntLetrasMinusculas; i++){
            int b = random.nextInt(letrasMinusculas.length);
            Senha.append(letrasMinusculas[b]);
        }
       for (int i = 0; i < QntNum; i++){
            int b = random.nextInt(numeros.length);
            Senha.append(numeros[b]);
        }
        for (int i = 0; i < QntCaracter; i++){
            int b = random.nextInt(caracterEspecial.length);
            Senha.append(caracterEspecial[b]);
        }

        System.out.println("A senha gerada é: " + "\n" + Senha);

    }
}
