package com.principal;

import java.util.Calendar;
import java.util.Scanner;

public class Core {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Core programa = new Core();
		
		programa.inici();

	}
	public void inici(){
		Scanner lector = new Scanner (System.in);
		System.out.println("Introdueix un dia:");
		int day = lector.nextInt();
		
		System.out.println("Introdueix un mes:");
		int month = lector.nextInt() - 1;
		
		System.out.println("Introdueix un any:");
		int year = lector.nextInt();
		
		System.out.println("Comprova Edat: "+comprovaData(day, month, year));
		System.out.println("Calcula Edat: "+edat(day, month, year));
		System.out.println("diesIntermitjos: "+diesIntermitjos(year));
		System.out.println("entreDiesMateixAny: " + entreDiesMateixAny(day, month, year, 31, 11, year));
		System.out.println("calcula dies desde que vas neixer: " + calculaDies(day, month, year));
	}
	
	public int diesIntermitjos(int any){
		int resultat = 0;
		
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		
		for (int i = any + 1; i < y; i++){
			resultat = resultat + 365;
			
			if (bixest(i)){
				resultat++;
			}
			
			
		}
		
		return resultat;
	}
	
	public int calculaDies(int diaInici, int mesInici, int anyInici){
		int resultat = 0;
		Calendar c = Calendar.getInstance();
		int diaFinal = c.get(Calendar.DATE);
		int mesFinal = c.get(Calendar.MONTH);
		int anyFinal = c.get(Calendar.YEAR);
		
		if (anyInici < anyFinal){
			resultat = entreDiesMateixAny(diaInici, mesInici, anyInici, 31, 11, anyInici);
			resultat += diesIntermitjos(anyInici);
			resultat += entreDiesMateixAny(1,0, anyFinal, diaFinal, mesFinal, anyFinal);
		} else {
			resultat = entreDiesMateixAny(diaInici, mesInici, anyInici, diaFinal, mesFinal, anyFinal);
		}
		
		
		return resultat;
	}
	
	public int entreDiesMateixAny(int diaInici, int mesInici, int anyInici, int diaFinal, int mesFinal, int anyFinal){
		int resultat = 0;
		int [] diesMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (bixest(anyInici)){
			diesMes[1]++;
		}
		
		if (mesInici < mesFinal){
			// Calculem els dies que hi ha entre diaInici i el final de mes 
			resultat = diesMes[mesInici] - diaInici;
			
			//Sumem els dies de tots els mesos entremig
			for (int i = mesInici +1; i < mesFinal; i++){
				resultat += diesMes[i];
			}
			
			//Sumem els dies finals 
			resultat += diaFinal;
			
		} else {
			resultat = diaFinal - diaInici;
		}
		
		return resultat;
	}
	
	public int edat(int dia, int mes, int any){
		int resultat = 0;
		
		Calendar c = Calendar.getInstance();
		int d = c.get(Calendar.DATE);
		int m = c.get(Calendar.MONTH);
		int y = c.get(Calendar.YEAR);
		
		resultat = y - any;
		
		if (mes > m || (mes == m && dia > d)){
			resultat --;
		}
		
		return resultat;
	}

	public boolean comprovaData(int dia, int mes, int any){
		boolean resultat = false;
		Calendar c = Calendar.getInstance();
		int [] diesMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (bixest(any) == true){
			diesMes[1] = 29;
		}
		
		if ( any >= 0 && any <= c.get(Calendar.YEAR)&&  mes >= 0 && mes <=11 && dia > 0 && dia <= diesMes[mes]){
			resultat = true;
		}
		
		return resultat;
	}

	public boolean bixest(int any){
		boolean resultat = (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;
		return resultat;
	}

	public int calculaEdad (int anyo, int mes, int dia){
		int resultat = 0;
		
		Calendar c = Calendar.getInstance();
		int d = c.get(Calendar.DATE);
		int m = c.get(Calendar.MONTH);
		int y = c.get(Calendar.YEAR);
		
		resultat = y - anyo;
		
		if (mes > m){
			resultat --;
		} else if (mes == m){
			if (dia > d){
				resultat--;
			}
		}
			
		return resultat; 
	}
	
	public int diesEntreAnys(int any){
		int resultat = 0;
		Calendar c = Calendar.getInstance();
		int anyActual = c.get(Calendar.YEAR);
		
		for (int i = any; i < anyActual; i++){
			int diesAny = 365;
			if (bixest(i)){
				diesAny++;
			}
			resultat = resultat + diesAny;
		}
		
		return resultat;
	}
	
	
}













