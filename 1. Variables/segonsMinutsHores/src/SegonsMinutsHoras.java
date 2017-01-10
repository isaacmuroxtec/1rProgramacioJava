import javax.swing.JOptionPane;


public class SegonsMinutsHoras {

	/**
	 * 
	 */
	public static void main(String[] args) {
		//llegeig linea (variables)
		String linea= JOptionPane.showInputDialog("Introdueix un nombre");
		int segonsEntrada= Integer.parseInt(linea);
		int hores=0;
		int minuts=0;
		int segons=0;
		
			//algoritmos
			segons=segonsEntrada%60;
			minuts=segonsEntrada/60;
			hores= minuts/60;
			minuts=minuts%60;
			
			//indicamos lo que queremos ver en pantalla
		System.out.println(hores);
		System.out.println(minuts);
		System.out.println(segons);
	}

}
