package actividad_s3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Empleado> lista = new ArrayList<>();

        int cant = 0;
        System.out.print("Ingresa cantidad de emp.: ");
        cant = Integer.parseInt(teclado.nextLine());

        lista = Empleado.ingresaEmpleado(cant);

        System.out.println("--- Los empleados son: ---");
        Empleado.listarEmpleado(lista);

        lista = Empleado.ordenaSueldo(lista);

        System.out.println("--- Los empleados son: ---");
        Empleado.listarEmpleado(lista);
        
        System.out.println("---------");
        System.out.println("Ingresar Codigo de emp. a buscar: ");
        String codigo = teclado.nextLine();
        Empleado e = Empleado.buscarCodigo(codigo, lista);
        
        if(e == null){
            System.out.println("Empleado NO existe");
        }else{
            System.out.println("Empleado SI existe");
            System.out.println(e.toString());
        }
        
    }

}
