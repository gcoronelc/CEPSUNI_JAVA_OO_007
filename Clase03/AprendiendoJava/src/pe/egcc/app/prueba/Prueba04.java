package pe.egcc.app.prueba;

public class Prueba04 {
  
  private static String nombre;
  
  static {
    nombre = "Gustavo Coronel";
  }

  public static void main(String[] args) {
    
    System.out.println("Nombre: " + nombre);
    System.out.println("Factorial de 5: " + factorial(5) );
  }
    
  public static long factorial(int n){
    long f = 1;
    for(int i = 2; i <= n; i++){
      f *= i;
    }
    return f;
  }
  
}
