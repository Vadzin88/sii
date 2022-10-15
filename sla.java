import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

class Main extends JFrame{
  public static void main(String[] args) {
    Main janela = new Main();
    janela.setSize(495, 245);
    janela.setResizable(false);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);

  }

  public void paint(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(0,0,495,245);
    g.setColor(Color.BLUE);
    g.drawLine(0,0,495,245);
  }
}