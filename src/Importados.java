public class Importados extends Producto{

    private String campo1;
    private int campo2;
    private String campo3;



    public Importados(String campo1, int campo2, String campo3) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;

    }

    public String getCampo1() {
        return campo1;
    }
    @Override
    public String toString(){
        return " ; producto: "  + campo1 + " - codigo: " + campo2 + " - Licencia Import: " + campo3;
    }
}