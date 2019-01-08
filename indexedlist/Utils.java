package aed.indexedlist;
//import java.awt.List;

import es.upm.aedlib.indexedlist.*;

public class Utils {
  public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
      // Hay que modificar este metodo
	  IndexedList<E> lista = new ArrayIndexedList<>();

	  int j = 0; // copiamos la lista l a lista para no modificarla
	  while (j < l.size()) {
		  lista.add(j,l.get(j));
		  j++;
		  }

	  System.out.println(lista);
	  
	  int i = 0;
	  int a = lista.size()-1;
	  while (i < a ) {
		  while(a > 0 && a != i) {
			  if(lista.get(i).equals(lista.get(a))){ //eqNull(lista.get(i),lista.get(a))
			  lista.removeElementAt(a);  
			  }
			  a--;
			  //System.out.println(lista);
		  }
			  
			  a = lista.size()-1;
			  i++;
	  }	  
	  	System.out.println(lista);
	  
    return lista;
  }
  
  
  //public static boolean eqNull(Object o1, Object o2) { //El valor de l no será null y no contendrá elementos null
	  //return   o1.equals(o2);  o1 == o2 || o1 != null &&
	  
	  
  //}
}
