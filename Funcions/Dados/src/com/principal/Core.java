package com.principal;

import com.casino.Dau;


public class Core {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Core programa = new Core();
		programa.inici();
	}
	
	public void inici(){
		Dau daum = new Dau();
		Dau daun = new Dau();
		int [] tirades = new int[13];
		
		for(int i = 0; i < 1000; i ++){
			int j = daum.tirada() + daun.tirada();
			tirades[j] = tirades[j] + 1;
		}
		
		for (int i=2; i < tirades.length; i++){
			String linia = barres(i, tirades[i]);
			System.out.println(linia);
		}

	}
	
	public String barres(int tirada, int numTirades){
		String resultat = tirada + ":";
		
		for (int i = 0; i < numTirades/4; i ++){
			resultat = resultat + "*"; 
		}
		
		return resultat;
	}

}



















