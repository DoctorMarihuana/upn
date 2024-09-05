package actividad_s3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empleado {

    private String codigo;
    private String nombre;
    private String apellido;
    private double sueldo;
    
    
    public Empleado() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static List<Empleado> ingresaEmpleado(int cant){
        
        Scanner teclado = new Scanner(System.in);
        List<Empleado> lista = new ArrayList<>();
        for (int i = 0; i < cant; i++) {
            Empleado e = new Empleado();
            System.out.println("Empleado " + (i + 1));
            System.out.print("* ing. codigo: ");
            e.codigo = teclado.nextLine();
            System.out.print("* ing. nombre: ");
            e.nombre = teclado.nextLine();
            System.out.print("* ing. apellido: ");
            e.apellido = teclado.nextLine();
            System.out.print("* ing. sueldo: ");           
            e.sueldo = Double.parseDouble(teclado.nextLine());
            lista.add(e);
        }        
        return lista;
    }
    
    public static Empleado buscarCodigo(String cod_bus, List<Empleado> lista){
        int cant = lista.size();
        Empleado band = null;
        for(int i = 0; i<cant; i++){
            if(lista.get(i).getCodigo().equals(cod_bus) ){
                band = lista.get(i);
                break;
            }
        }        
        return band;
    }
    
    public static void listarEmpleado(List<Empleado> lista) {
        int cant = lista.size();
        for (int i = 0; i < cant; i++) {
            System.out.println("Empleado " + (i + 1));
            System.out.println("- Codigo: " + lista.get(i).getCodigo());
            System.out.println("- Nombre: " + lista.get(i).getNombre());
            System.out.println("- Apellido: " + lista.get(i).getApellido());
            System.out.println("- Sueldo: " + lista.get(i).getSueldo());
            System.out.println("");
        }
    }

    public static List<Empleado> ordenaSueldo(List<Empleado> lista) {
        int cant = lista.size();
        Empleado AUX = new Empleado();
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant - 1; j++) {
                if (lista.get(j).getSueldo() > lista.get(j + 1).getSueldo()) {
                    //AUX = Lista[j+1];
                    AUX = lista.get(j + 1);
                    //Lista[j+1] = Lista[j] 
                    lista.set(j + 1, lista.get(j));
                    //Lista[j] = AUX
                    lista.set(j, AUX);
                }
            }
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + '}';
    }

}
