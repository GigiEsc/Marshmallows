/**
 * @author GigiEsc
 */
public class Tarea5 {
    
    
	//Devuelve el valor de mi_arreglo en la posicion [columna][fila]
	static String obtenerValor(String mi_arreglo[][], int columna, int fila)
	{
		return mi_arreglo[columna][fila];
	}
	
        
        
	//Devuelve la cantidad de columnas de mi_arreglo
	static int obtenerCantidadColumnas(double mi_arreglo[][])
	{
		return mi_arreglo.length;
	}
	
        
        
	//Devuelve la cantidad de filas de mi_arreglo
	static int obtenerCantidadFilas(double mi_arreglo[][])
	{
		return mi_arreglo[1].length;
	}
	
        
        
	//Devuelve la cantidad de elementos que puede almacenar mi_arreglo
	static int obtenerCantidadElementos(double mi_arreglo[][])
	{
               double cant=0;
               for(int contador=0;contador<mi_arreglo.length;contador++)
               {
                   cant=cant+mi_arreglo[contador].length;
               
               }
                     return (int)cant;
        }
             
	
        
        
	//Devuelve la suma de todos los elementos de mi_arreglo
	static double sumaElementos(double mi_arreglo[][])
	{
	    double total=0;
           
            for (int contador = 0;contador<mi_arreglo.length;contador++)
              {
                for(int conta2 = 0; conta2 < mi_arreglo[contador].length; conta2++)
                    {
                    total = total + mi_arreglo[contador][conta2];
                    }
              
              }
            return total;
	}
	//tome la idea principal de tutoriales en Youtube http://www.youtube.com/watch?v=PTgVfuMx_SA 
   
        
        
	//Devuelve el promedio de todos los elementos de mi_arreglo
	static double promedioElementos(double mi_arreglo[][])
	{
            double total=0;
            double prom=0;
          
            //encontre respuestas sobre esto en 
            //>> https://espanol.answers.yahoo.com/question/index?qid=20120927045401AAK14B3 <<

             for (int contador = 0;contador<mi_arreglo.length;contador++)
              {
                for(int conta2 = 0; conta2 < mi_arreglo[contador].length; conta2++)
                    {
                    
                        total = total + mi_arreglo[contador][conta2];
                    }
              }
             
            int contador = 0;
            prom = prom + mi_arreglo[contador].length;
            
		return total/prom;
	}
	
        
        
	//Devuelve verdadero si num esta en mi_arreglo, de lo contrario devuelve false
	static boolean existe(double mi_arreglo[][], int num)
	{
	    double total=0;
           
            for (int contador = 0;contador<mi_arreglo.length;contador++)
              {
                for(int conta2 = 0; conta2 < mi_arreglo[contador].length; conta2++)
                    {
                    if (mi_arreglo[contador][conta2]==num)
                        {
                        return true;
                        }
                    }
              
              }
            return false;
	}
        
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}