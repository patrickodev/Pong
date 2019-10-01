import java.awt.Canvas;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
	
	private final int WIDTH = 240; //Largura da janela grafica
	private final int HEIGHT = 160; // Altura da janela grafica
	private final int SCALE = 5; // Escala da janela grafica
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
	}
	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame("Pong");
		frame.setResizable(false); //para nao redimensionar a janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pra terminar a aplicação quando fechar a janela
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void run() {
		
	}

}
