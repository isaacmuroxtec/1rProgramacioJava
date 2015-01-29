
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {10,11,5,4,8,3,9,2};
		int aux = 0;
		for (int j = a.length - 1; j > 0; j--) {
			
			for (int i = 0; i < j; i++) {
				if (a[i] > a[i + 1]){
					aux = a[i];
					a[i] = a[i+1];
					a[i+1] = aux; 
				}
			}
		}
			
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		
	}

}
