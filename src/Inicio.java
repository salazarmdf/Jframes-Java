import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Inicio extends JFrame implements ActionListener {


    static JLabel numero1,numero2,numero3,numero4, resultado1,resultado2,resultado3,resultado4,registronacio,registroimport;
    static JTextField numero1a,numero1ab,numero1ac,numero2b,numero2bc,numero2bd,numero3c,numero4d;

    static JButton numeroUno,numeroDos,numeroTres,numeroCuatro,registroNacionales,registroImportados;

    static JLabel aviso;

    public void actionPerformed(ActionEvent e){
        ///registrar nacional
        if (e.getSource().equals(numeroUno)){
            String campo1 = numero1a.getText();
            int campo2 = Integer.parseInt(numero1ab.getText());
            String campo3 = numero1ac.getText();
            Nacionales producToNacional = new Nacionales(campo1,campo2,campo3);
            Local.registrarNacional(producToNacional);
            resultado1.setText("Productos Nacionales registrados ");
        }
        ///listar nacional
        if (e.getSource().equals(registroNacionales)) {
            String listaNacionales = Local.listarProductosNacionales();
            registronacio.setText(listaNacionales);
        }
        ///registrar importados
        if (e.getSource().equals(numeroDos)){
            String campo1 = numero2b.getText();
            int campo2 = Integer.parseInt(numero2bc.getText());
            String campo3 = numero2bd.getText();
            Importados importados = new Importados(campo1,campo2,campo3);
            Local.registrarImportado(importados);
            resultado2.setText("Productos Importados registrados");
        }
        ///listar importados
        if (e.getSource().equals(registroImportados)){
            String listaImportados = Local.ListarProductosImportados();
            registroimport.setText(listaImportados);
        }
        ///buscar nacional
        if (e.getSource().equals(numeroTres)){
            String buscandoNacionales = numero3c.getText().trim();
            Nacionales nacionales = Local.BuscarProductosNacionales(buscandoNacionales);

            if (nacionales!= null){
                resultado3.setText("producto encontrado.. " + nacionales);
            }else{
                resultado3.setText("Producto inexistente en bodega");
            }
        }
        ///buscar Importados
        if (e.getSource().equals(numeroCuatro)){
            String buscandoImportados = numero4d.getText();
            Importados importados = Local.BuscarProductosImportados(buscandoImportados);

            if (importados != null){
                resultado4.setText("Producto encontrado: " + importados);
            }else{
                resultado4.setText("Producto inexistente en bodega");
            }
        }



    }

    public Inicio(){

        numero1 = new JLabel("Registrar productos nacionales ---> ");
        numero1.setBounds(30,10,220,30);
        numero1a = new JTextField();
        numero1a.setBounds(235,10,100,30);
        numero1ab = new JTextField();
        numero1ab.setBounds(340,10,100,30);
        numero1ac = new JTextField();
        numero1ac.setBounds(445,10,100,30);
        numeroUno = new JButton("✓");
        numeroUno.setBounds(550,10,45,29);
        numeroUno.addActionListener(this);
        resultado1 = new JLabel(".....");
        resultado1.setBounds(605,10,200,30);
        ///
        numero2 = new JLabel("Registrar productos importados ---> ");
        numero2.setBounds(30,60,220,30);
        numero2b = new JTextField();
        numero2b.setBounds(235,60,100,30);
        numero2bc = new JTextField();
        numero2bc.setBounds(340,60,100,30);
        numero2bd = new JTextField();
        numero2bd.setBounds(445,60,100,30);
        numeroDos = new JButton("✓");
        numeroDos.setBounds(550,60,45,29);
        numeroDos.addActionListener(this);
        resultado2 = new JLabel(".....");
        resultado2.setBounds(605,60,210,30);

        ///
        numero3 = new JLabel("Introduzca el producto nacional que desea buscar ---------> ");
        numero3.setBounds(30,110,350,30);
        numero3c = new JTextField();
        numero3c.setBounds(360,110,160,30);
        numeroTres = new JButton("✓");
        numeroTres.setBounds(525,110,45,29);
        numeroTres.addActionListener(this);
        resultado3 = new JLabel(".....");
        resultado3.setBounds(580,110,500,30);
        ///
        numero4 = new JLabel("Introduzca el produducto importado que desea buscar ---> ");
        numero4.setBounds(30,150,350,30);
        numero4d = new JTextField();
        numero4d.setBounds(360,150,160,30);
        numeroCuatro = new JButton("✓");
        numeroCuatro.setBounds(525,150,45,29);
        numeroCuatro.addActionListener(this);
        resultado4 = new JLabel(".....");
        resultado4.setBounds(580,150,500,30);
        ///
        registroNacionales = new JButton("Listar productos nacionales ");
        registroNacionales.setBounds(30,200,250,40);
        registroNacionales.addActionListener(this);
        registroImportados = new JButton("listar productos importados");
        registroImportados.setBounds(30,470,250,40);
        registroImportados.addActionListener(this);
        ///
        registronacio = new JLabel(".....");
        registronacio.setBounds(290,200,800,60);
        registroimport = new JLabel(".....");
        registroimport.setBounds(290,470,800,60);
        ///AVISO
        aviso = new JLabel("Nota: al registrar los productos debe de hacerlo en orden: Nombre, Codigo, registro DIAN o licencia de importacion");
        aviso.setBounds(5,650,750,30);
        ///TEXTOS
        add(numero1);
        add(numero2);
        add(numero3);
        add(numero4);
        add(registroimport);
        add(registronacio);
        add(aviso);

        ///INGRESO DATOS
        add(numero1a);
        add(numero1ab);
        add(numero1ac);
        add(numero2b);
        add(numero2bc);
        add(numero2bd);
        add(numero3c);
        add(numero4d);

        ///BOTONES
        add(numeroUno);
        add(numeroDos);
        add(numeroTres);
        add(numeroCuatro);

        ///IMPRIMIR RESULTADOS
        add(resultado1);
        add(resultado2);
        add(resultado3);
        add(resultado4);

        ///LISTAR LOS PRODUCTOS
        add(registroNacionales);
        add(registroImportados);

        ///
        setLayout(null);
        setSize(1040,720);
        setTitle("Menú");
        setResizable(false); //este se desactiva con el boton maximizar
        //setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Inicio ventana = new Inicio();
    }
}