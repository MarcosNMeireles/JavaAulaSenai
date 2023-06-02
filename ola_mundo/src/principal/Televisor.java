package principal;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Televisor extends JFrame implements ActionListener {
    private int canal;
    private int volume;
    private boolean ligado;

    private JLabel canalLabel;
    private JLabel volumeLabel;
    private JLabel ligadoLabel;

    public Televisor() {
        canal = 1;
        volume = 0;
        ligado = false;

        canalLabel = new JLabel("Canal: " + canal);
        volumeLabel = new JLabel("Volume: " + volume);
        ligadoLabel = new JLabel("TV está ligada: " + (ligado ? "Sim" : "Não"));

        JButton aumentarVolumeBtn = new JButton("Aumentar volume");
        JButton reduzirVolumeBtn = new JButton("Reduzir volume");
        JButton subirCanalBtn = new JButton("Subir canal");
        JButton descerCanalBtn = new JButton("Descer canal");
        JButton ligarTelevisorBtn = new JButton("Ligar televisão");
        JButton desligarTelevisorBtn = new JButton("Desligar televisão");
        JButton mostrarStatusBtn = new JButton("Mostrar status da televisão");

        aumentarVolumeBtn.addActionListener(this);
        reduzirVolumeBtn.addActionListener(this);
        subirCanalBtn.addActionListener(this);
        descerCanalBtn.addActionListener(this);
        ligarTelevisorBtn.addActionListener(this);
        desligarTelevisorBtn.addActionListener(this);
        mostrarStatusBtn.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(aumentarVolumeBtn);
        panel.add(reduzirVolumeBtn);
        panel.add(subirCanalBtn);
        panel.add(descerCanalBtn);
        panel.add(ligarTelevisorBtn);
        panel.add(desligarTelevisorBtn);
        panel.add(mostrarStatusBtn);

        add(canalLabel);
        add(volumeLabel);
        add(ligadoLabel);
        add(panel);

        setTitle("Televisor");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void reduzirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void subirCanal() {
        if (canal < 16) {
            canal++;
        }
    }

    public void descerCanal() {
        if (canal > 1) {
            canal--;
        }
    }

    public void ligarTelevisor() {
        ligado = true;
    }

    public void desligarTelevisor() {
        ligado = false;
    }

    public void mostrarStatus() {
        String mensagem = "Status da TV:\n"
                + "Canal: " + canal + "\n"
                + "Volume: " + volume + "\n"
                + "TV está ligada: " + (ligado ? "Sim" : "Não");

        JOptionPane.showMessageDialog(this, mensagem, "Status da Televisão", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aumentar volume")) {
            aumentarVolume();
        } else if (e.getActionCommand().equals("Reduzir volume")) {
            reduzirVolume();
        } else if (e.getActionCommand().equals("Subir canal")) {
            subirCanal();
        } else if (e.getActionCommand().equals("Descer canal")) {
            descerCanal();
        } else if (e.getActionCommand().equals("Ligar televisão")) {
            ligarTelevisor();
        } else if (e.getActionCommand().equals("Desligar televisão")) {
            desligarTelevisor();
        } else if (e.getActionCommand().equals("Mostrar status da televisão")) {
            mostrarStatus();
        }

        canalLabel.setText("Canal: " + canal);
        volumeLabel.setText("Volume: " + volume);
        ligadoLabel.setText("TV está ligada: " + (ligado ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        new Televisor();
    }
}
