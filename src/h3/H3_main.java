package h3;

public class H3_main {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
        int[] c = {1, 3, 2}; 
        int[] b = {1, 2, 4}; 
        int[] f = {1, 1, 2};
        
        System.out.println(compareArraysVal(a, c));
        System.out.println( compareArraysVal(a, b));
        System.out.println( compareArraysVal(a, f));
	}
	
	public static boolean compareArraysVal(int[]a, int []b) {
		
		
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
		int aktuell = a[i];
		int anzahl = 0;
		for (int j = 0; j < a.length; j++) {
			if (aktuell == a[j]) {
				anzahl++;
			}
		}
		
		
		int anzahl1 = 0;
		for (int j = 0; j < b.length; j++) {
			if (aktuell == b[j]) {
				anzahl1++;
			}
		}
		
		if ( anzahl != anzahl1) {
			return false;
		}
		
		
		
		}
		
		return true;
		
		
	}

}
