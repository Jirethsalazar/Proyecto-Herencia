package herencia.java;

public class HerenciaJava {

    public static void main(String[] args) {
    // Crear objeto Clase Padre
    Humano adulto=new Humano();
    adulto.setNombre("Rusbelth");
    adulto.comer(adulto.getNombre());
    adulto.dormir();
    
    System.out.println();
    
    //Crear Objeto Clase Hija->Hombre
    Hombre padre=new Hombre();
    padre.setNombre("Jose");
    padre.comer(padre.getNombre());
    padre.dormir();
    padre.afeitarse();
    
    System.out.println();
    
    //Crear Objeto Clase Hija ->Mujer
    Mujer madre=new Mujer();
    madre.setNombre("Gabriela");
    madre.comer(madre.getNombre());
    madre.dormir();
    madre.maquillarse(madre.getNombre());
    
    
    
    
    
    
    }
    
}