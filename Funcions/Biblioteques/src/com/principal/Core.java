package com.principal;

import com.utils.LlistesUtils;

public class Core {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Core programa = new Core();
		programa.inici();
	}
	public void inici(){
		int[] b = {6,5,8,3,7,5,8,3,6,7,4,5,6};
		System.out.println(LlistesUtils.mitjana(b));
	}
	
	
}
	
