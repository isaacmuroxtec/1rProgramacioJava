
public class PrimerStrings {

	public static void main(String[] args) {

		String a = new String();
		
		
		
		System.out.println("Adria Sanchez:" + a.length());
		
		String c = new String("ferrocarril");
		
		System.out.println("Artur:" + c.length());
		
		
		
		char[] b = {'h', 'o', 'l', 'a'};
		
		c.charAt(1);
		String f = c.concat("adeu");
		
		System.out.println("Moral:"+f+ ": Esteve:"+ f.length());
		
		
		int g = c.indexOf('r');
		System.out.println("Saus:"+g);
		
		int h = c.indexOf('r', 4);
		System.out.println("aitor:"+ h);
		
		int i = c.lastIndexOf('r');
		System.out.println("Camp:" + i);
		
		String frase = "Estem fent programacio a info4. Estem a 30 de gener. Som una classe ...";
		
		String[] paraules = frase.split(" ");
		//System.out.println(paraules[1]);
		
		for (int j = 0; j < paraules.length; j++) {
			System.out.print(paraules[j]);
		}
		System.out.println();
		
		System.out.println(frase.toUpperCase());
		
		
		String j = c.substring(4, 7);
		System.out.println("Torralbo:" + j);

		String k = c.replace('r', 'l');
		
		System.out.println("Esteve:"+k);
		
		
		String m = c.replaceFirst("rr", "gu");
		System.out.println("delaCruz::" + m);
		
		c.length();
		int d = b.length;
	}

}
