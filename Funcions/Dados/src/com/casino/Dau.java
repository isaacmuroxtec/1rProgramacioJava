package com.casino;

public class Dau {
	public int valor;
	
	public Dau(){
		valor = 1;
	}
	public Dau (int v){
		valor = v;
	}
	
	public int tirada(){
		valor = ((int)Math.round((Math.random() * 5))) + 1;
		return valor;
	}

}
