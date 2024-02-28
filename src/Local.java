import java.util.ArrayList;
import java.util.Random;

public class Local {
    private static ArrayList<Nacionales> productoNacional = new ArrayList<>();
    static ArrayList<Importados> productoImportado = new ArrayList<>();

    public static void registrarNacional(Nacionales nacionales){productoNacional.add(nacionales);}
    public static void registrarImportado(Importados importados){productoImportado.add(importados);}


    public static String listarProductosNacionales(){
        StringBuilder listaNacionales = new StringBuilder();
        for (Nacionales producto : productoNacional) {
            listaNacionales.append(producto.toString()).append("\n");
        }
        return listaNacionales.toString();
    }
    public static String ListarProductosImportados(){
        StringBuilder listarImportados = new StringBuilder();
        for (Importados producto : productoImportado){
            listarImportados.append(producto.toString()).append("\n");
        }
        return listarImportados.toString();
    }

    public static Nacionales BuscarProductosNacionales(String nombre) {
        for (Nacionales producto : productoNacional) {
            if (producto.getCampo1() != null && producto.getCampo1().trim().equalsIgnoreCase(nombre.trim()) ) {
                return producto;
            }
        }
        return null;
    }
    public static Importados BuscarProductosImportados(String nombre){
        for (Importados producto : productoImportado){
            if (producto.getCampo1() != null && producto.getCampo1().trim().equals(nombre.trim())){
                return producto;
            }
        }
        return null;
    }



    private static ArrayList<Empleado> empleados = new ArrayList<>();


    public static void RamdomEmpleado(){
        if (empleados.isEmpty());
        System.out.println("no hay empleados");
        return;
    }

}