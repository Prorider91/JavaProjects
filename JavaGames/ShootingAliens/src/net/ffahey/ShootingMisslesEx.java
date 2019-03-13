package net.ffahey;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMisslesEx extends JFrame {

    public ShootingMisslesEx() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Shooting aliens");
        setSize(400, 300);

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            ShootingMisslesEx ex = new ShootingMisslesEx();
            ex.setVisible(true);
        });
    }
}
