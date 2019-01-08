package aed.loops;

public class Utils {
  public static int maxNumRepeated(Integer[] a, Integer elem)  {// cuantas veces se repite elem de forma consecutiva en el array que nos dan.
      // Hay que modificar este metodo
	  
	  int cont1 = 0; 
	  int cont2 = 0; 
	  
	  for (int i = 0; i < a.length; i++) {
		  if (a[i].equals(elem)) {
			  cont1 ++;
		  }else {
			  cont1 = 0;
		  }if (cont1 > cont2) {
			  cont2=cont1;
		  }
	  }return cont2;
  }
}
