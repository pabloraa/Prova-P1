import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        new InterfaceGrafica();

        Scanner ler = new Scanner(System.in);

        ArrayList<Jogador> Jogador = new ArrayList<Jogador>();

        Jogador jogador1 = new Jogador("Alane");

        Jogador jogador2 = new Jogador("Beatriz");

        Jogador jogador3 = new Jogador("Davi");

        Jogador jogador4 = new Jogador("Deniziane");

        Jogador jogador5 = new Jogador("Fernanda");

        Jogador jogador6 = new Jogador("Giovana");

        Jogador jogador7 = new Jogador("Isabele");

        Jogador jogador8 = new Jogador("Juninho");

        Jogador jogador9 = new Jogador("Leidy");

        Jogador jogador10 = new Jogador("Lucas Henrique");

        Jogador jogador11 = new Jogador("Lucas Luigi");

        Jogador jogador12 = new Jogador("Lucas Pizzane");

        Jogador jogador13 = new Jogador("Marcus");

        Jogador jogador114 = new Jogador("Matheus");

        Jogador jogador15 = new Jogador("Maycon");

        Jogador jogador16 = new Jogador("MC bin");

        Jogador jogador17 = new Jogador("Michael");

        Jogador jogador18 = new Jogador("Nizam");

        Jogador jogador19 = new Jogador("Raquele");

        Jogador jogador20 = new Jogador("Rodriguinho");

        Jogador jogador21 = new Jogador("Thalyta");

        Jogador jogador22 = new Jogador("Vanessa");

        Jogador jogador23 = new Jogador("Vinicius");

        Jogador jogador24 = new Jogador("Wanessa");

        Jogador jogador25 = new Jogador("Yasmin");

        String opcao = "";

        String votoJogador = "";

        int quantidadeVoto = 0;

        System.out.println("Deseja Votar");

        System.out.println("Deseja votar?");

        opcao = ler.nextLine();

        do{

            System.out.println("Digite o nome do jogador que você quer eliminar do BBB");

            votoJogador = ler.nextLine();

            Jogador jogador = new Jogador(votoJogador);

            Jogador.add(jogador);

            if(votoJogador.equals(Jogador)){

                jogador.incrementaUmVoto();

            }

            for(Jogador obj: Jogador){

                jogador.incrementaUmVoto();

            }

           for (Jogador obj : Jogador) {

               System.out.println(obj.toString());

           }

            System.out.println("Deseja votar novamente?");

            opcao = ler.nextLine();

        }while(!"sair".equals(opcao));
    }
}