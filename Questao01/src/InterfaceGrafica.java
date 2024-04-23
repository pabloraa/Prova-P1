import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceGrafica extends JFrame {


    private JPanel painel = new JPanel();
    JFrame frame = new JFrame();
    private TextField textField1;
    private TextField textField2;
    JButton botao = new JButton("Votar");

    JButton botao2 = new JButton("Apurar resultado");

    public InterfaceGrafica(){

        ArrayList<String> jogador = new ArrayList<>();

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

        JLabel label1 = new JLabel("Votação BBB 24");

        textField1 = new TextField(30);

        textField2 = new TextField(30);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input1 = textField1.getText();

                if(input1.equals("1")){

                    JOptionPane.showMessageDialog(null, "Em quem você vota para sair da casa");

                    String input2 = textField2.getText();

                    if(input2.equals(jogador)){


                    }
                }
                else if(input1.equals("sair")){

                    JOptionPane.showMessageDialog(null,"Você escolheu a opção sair da votação do BBB 24");

                    System.exit(0);

                }
            }
        });

        frame.setSize(400,500);

        setTitle("AGENDA DE CONTATOS");

        painel.add(label1);

        painel.add(botao);

        painel.add(botao2);

        painel.add(textField1);

        frame.add(painel);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}