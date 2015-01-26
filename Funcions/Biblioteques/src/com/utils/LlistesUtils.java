package com.utils;

//public 
//protected
//private
public class LlistesUtils {
	
	public static double mitjana(int [] a){
		double resultat = 0;
		
		for (int i = 0;i < a.length;i++){
			resultat = a[i] + resultat;
		}
		resultat = resultat / a.length;
		
		return resultat;
	}

}
