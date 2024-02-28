public class Nacionales extends Producto{
    private String campo1; ///nombre
    private int campo2;///codigo
    private String campo3;///Registro Dian



    public Nacionales(String campo1, int campo2, String campo3) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
    }

    public String getCampo1() {
        return campo1;
    }

    @Override
    public String toString(){
        return " ; producto: "  + campo1 + " - codigo: " + campo2 + " - registro Dian: " + campo3;
    }
}