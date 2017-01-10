import javax.swing.JOptionPane;


public class SegonsMinuts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//llegeig linea
		String linea= JOptionPane.showInputDialog("Introdueix un nombre");
		int segonsEntrada= Integer.parseInt(linea);
		int minuts=0;
		int segons=0;
		
			//variables
			minuts= segonsEntrada/60;
			segons=segonsEntrada%60;
			
			//indicamos lo que queremos ver en pantalla
		System.out.println(minuts);
		System.out.println(segons);
	}

}
