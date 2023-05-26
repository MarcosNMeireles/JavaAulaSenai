import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome, int numNotas) {
        this.nome = nome;
        notas = new double[numNotas];
    }

    public void setNota(int indice, double nota) {
        notas[indice] = nota;
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        // Criar janela e painel
        JFrame frame = new JFrame("Calculadora de Média");
        JPanel panel = new JPanel();

        // Criar campos de texto e rótulos
        JLabel labelNome = new JLabel("Nome do aluno:");
        JTextField textFieldNome = new JTextField(20);

        JLabel[] labelNotas = new JLabel[4];
        JFormattedTextField[] textFieldNotas = new JFormattedTextField[4];
        NumberFormat format = DecimalFormat.getInstance(Locale.getDefault());
        for (int i = 0; i < 4; i++) {
            // Criar rótulo para a nota do bimestre
            labelNotas[i] = new JLabel("Nota do " + (i + 1) + "º bimestre:");

            // Configurar o campo de texto da nota
            
            NumberFormatter formatter = new NumberFormatter(format);
            formatter.setValueClass(Double.class);
            formatter.setMinimum(0.0);
            formatter.setMaximum(10.0);
            formatter.setAllowsInvalid(true);
            formatter.setCommitsOnValidEdit(true);
            textFieldNotas[i] = new JFormattedTextField(formatter);
            textFieldNotas[i].setColumns(5);
        }

        // Criar área de texto para exibir o resultado
        JTextArea textAreaResultado = new JTextArea(5, 20);
        textAreaResultado.setEditable(false);

        // Adicionar componentes ao painel
        panel.add(labelNome);
        panel.add(textFieldNome);

        for (int i = 0; i < 4; i++) {
            panel.add(labelNotas[i]);
            panel.add(textFieldNotas[i]);
        }

        panel.add(textAreaResultado);

        // Criar botão calcular
        JButton buttonCalcular = new JButton("Calcular Média");
        buttonCalcular.addActionListener(e -> {
            // Obter o nome do aluno digitado
            String nomeAluno = textFieldNome.getText();
            // Criar objeto Aluno com o nome e 4 notas
            Aluno aluno = new Aluno(nomeAluno, 4);

            for (int i = 0; i < 4; i++) {
                // Obter a nota do campo de texto correspondente
                double nota = 0;
                try {
                    nota = format.parse(textFieldNotas[i].getText()).doubleValue();
                } catch (ParseException e1) {
                    // Tratar exceção em caso de falha na conversão
                    nota = -1; // Valor inválido
                }
                // Definir a nota no objeto Aluno
                aluno.setNota(i, nota);
            }

            // Calcular a média do aluno
            double media = aluno.calcularMedia();

            // Exibir o resultado na área de texto
            if (media != -1) {
                textAreaResultado.setText("Média do aluno " + aluno.getNome() + ": " + media);
            } else {
                textAreaResultado.setText("Erro: Insira notas válidas.");
            }
        });

        panel.add(buttonCalcular);

        // Configurar janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
