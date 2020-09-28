package dad.maven.prueba;

import org.apache.commons.lang.StringUtils;

public class Combinar {
  
 /* public static String combinar(Object [] array) {
	  String resultado ="";
	  for (int i = 0; i < array.length; i++) {
		resultado = resultado +array[i] + " ";
	} 
    return resultado;
  }*/
	
  public static String combinar(Object [] array) {
    return StringUtils.join(array, " ");
  }

  public static void main(String[] args) {
    Object [] array = { "hola", 3.1416, "adios", 4, true };
    String resultado = combinar(array); // "hola 3.1416 adios 4 true"
    System.out.println(resultado); 
  }

}
