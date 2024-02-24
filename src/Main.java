import javax.swing.JFrame;

//import ventana.JFrame;

public class Main {

	public static void main(String[] args) 
	{ 

	// TODO Auto-generated method stub
			JFrame ventana = new JFrame("Example");

			ventana.setVisible(true); //La hace visible
			ventana.setSize(100,100); //Tamaño
			ventana.setLocation(100,100);


			ventana.setLocationRelativeTo(null); //Centra la ventana
			ventana.setResizable(false);

			ventana.setTitle("Mi ventana");

			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			System.out.println("Hola");

	}

}