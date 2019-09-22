import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InterfazCalculadora extends JFrame{

    private FuncionesDePantallas funcionEnPantalla = new FuncionesDePantallas();
    private FuncionesCalculadora funcionCalculos = new FuncionesCalculadora();
    private String pantalla1 = "";
    private String pantalla2 = "";
    private String ultimaAccion = "";


 public InterfazCalculadora(){
        this.setSize(365, 500);
        elementosEnPantalla();
        setTitle("Calculadora de Valdi");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void elementosEnPantalla(){

       JPanel panel = new JPanel();
       panel.setLayout(null);
       this.getContentPane().add(panel);

       //Pantalla1
       JTextField display1 = new JTextField();
       display1.setEditable(false);
       display1.setFont(new Font(null, Font.BOLD, 25));
       display1.setBackground(Color.WHITE);
       display1.setBounds(15,20,315,50);
       display1.setHorizontalAlignment(JTextField.RIGHT);
       display1.setBorder(javax.swing.BorderFactory.createEmptyBorder());

       panel.add(display1);

       //Pantalla2
       JTextField display2 = new JTextField();
       display2.setEditable(false);
       display2.setFont(new Font(null, Font.BOLD, 25));
       display2.setBackground(Color.WHITE);
       display2.setBounds(15,70,315,50);
       display2.setHorizontalAlignment(JTextField.RIGHT);
       display2.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        panel.add(display2);

       //Botones
        JButton botonC = new JButton();
        JButton botonCE = new JButton();
        JButton botonBorrar = new JButton();
        JButton botonDividir = new JButton();
        JButton boton7 = new JButton();
        JButton boton8 = new JButton();
        JButton boton9 = new JButton();
        JButton botonPor = new JButton();
        JButton boton4 = new JButton();
        JButton boton5 = new JButton();
        JButton boton6 = new JButton();
        JButton botonMenos = new JButton();
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();
        JButton botonMas = new JButton();
        JButton botonMasMenos = new JButton();
        JButton boton0 = new JButton();
        JButton botonComa = new JButton();
        JButton botonIgual = new JButton();

        botonC.setText("C");
        botonCE.setText("CE");
        botonBorrar.setText("«");
        botonDividir.setText("÷");
        boton7.setText("7");
        boton8.setText("8");
        boton9.setText("9");
        botonPor.setText("×");
        boton4.setText("4");
        boton5.setText("5");
        boton6.setText("6");
        botonMenos.setText("-");
        boton1.setText("1");
        boton2.setText("2");
        boton3.setText("3");
        botonMas.setText("+");
        botonMasMenos.setText("±");
        boton0.setText("0");
        botonComa.setText(",");
        botonIgual.setText("=");

        botonC.setFont(new Font(null, Font.BOLD, 25));
        botonCE.setFont(new Font(null, Font.BOLD, 25));
        botonBorrar.setFont(new Font(null, Font.BOLD, 25));
        botonDividir.setFont(new Font(null, Font.BOLD, 25));
        boton7.setFont(new Font(null, Font.BOLD, 25));
        boton8.setFont(new Font(null, Font.BOLD, 25));
        boton9.setFont(new Font(null, Font.BOLD, 25));
        botonPor.setFont(new Font(null, Font.BOLD, 25));
        boton4.setFont(new Font(null, Font.BOLD, 25));
        boton5.setFont(new Font(null, Font.BOLD, 25));
        boton6.setFont(new Font(null, Font.BOLD, 25));
        botonMenos.setFont(new Font(null, Font.BOLD, 25));
        boton1.setFont(new Font(null, Font.BOLD, 25));
        boton2.setFont(new Font(null, Font.BOLD, 25));
        boton3.setFont(new Font(null, Font.BOLD, 25));
        botonMas.setFont(new Font(null, Font.BOLD, 25));
        botonMasMenos.setFont(new Font(null, Font.BOLD, 25));
        boton0.setFont(new Font(null, Font.BOLD, 25));
        botonComa.setFont(new Font(null, Font.BOLD, 25));
        botonIgual.setFont(new Font(null, Font.BOLD, 25));



        botonC.setBounds(15,150,75,50);
        botonCE.setBounds(95,150,75,50);
        botonBorrar.setBounds(175,150,75,50);
        botonDividir.setBounds(255,150,75,50);
        boton7.setBounds(15,210,75,50);
        boton8.setBounds(95,210,75,50);
        boton9.setBounds(175,210,75,50);
        botonPor.setBounds(255,210,75,50);
        boton4.setBounds(15,270,75,50);
        boton5.setBounds(95,270,75,50);
        boton6.setBounds(175,270,75,50);
        botonMenos.setBounds(255,270,75,50);
        boton1.setBounds(15,330,75,50);
        boton2.setBounds(95,330,75,50);
        boton3.setBounds(175,330,75,50);
        botonMas.setBounds(255,330,75,50);
        botonMasMenos.setBounds(15,390,75,50);
        boton0.setBounds(95,390,75,50);
        botonComa.setBounds(175,390,75,50);
        botonIgual.setBounds(255,390,75,50);


        panel.add(botonC);
        panel.add(botonCE);
        panel.add(botonBorrar);
        panel.add(botonDividir);
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        panel.add(botonPor);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(botonMenos);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(botonMas);
        panel.add(botonMasMenos);
        panel.add(boton0);
        panel.add(botonComa);
        panel.add(botonIgual);

     ActionListener escucha = new ActionListener() { //esta es la interface

      @Override
      public void actionPerformed(ActionEvent actionEvent) {  //Acciones

       if (actionEvent.getActionCommand().equals("boton0"))
        pantalla2 = pantalla2 +"0";
       if (actionEvent.getActionCommand().equals("boton1"))
        pantalla2 = pantalla2 +"1";
       if (actionEvent.getActionCommand().equals("boton2"))
        pantalla2 = pantalla2 +"2";
       if (actionEvent.getActionCommand().equals("boton3"))
        pantalla2 = pantalla2 +"3";
       if (actionEvent.getActionCommand().equals("boton4"))
        pantalla2 = pantalla2 +"4";
       if (actionEvent.getActionCommand().equals("boton5"))
        pantalla2 = pantalla2 +"5";
       if (actionEvent.getActionCommand().equals("boton6"))
        pantalla2 = pantalla2 +"6";
       if (actionEvent.getActionCommand().equals("boton7"))
        pantalla2 = pantalla2 +"7";
       if (actionEvent.getActionCommand().equals("boton8"))
        pantalla2 = pantalla2 +"8";
       if (actionEvent.getActionCommand().equals("boton9"))
        pantalla2 = pantalla2 +"9";
       if (actionEvent.getActionCommand().equals("botonComa"))
           pantalla2 = pantalla2 + ".";

       if (actionEvent.getActionCommand().equals("botonBorrar"))
        pantalla2 = funcionEnPantalla.funcionBorrarCaracter(pantalla2);
       if (actionEvent.getActionCommand().equals("botonCE"))
        pantalla2 = funcionEnPantalla.funcionBorrarLinea(pantalla2);
       if (actionEvent.getActionCommand().equals("botonC")){
        pantalla1 = funcionEnPantalla.funcionBorrarLinea(pantalla1);
        pantalla2 = funcionEnPantalla.funcionBorrarLinea(pantalla2);
       }

       if (actionEvent.getActionCommand().equals("botonMas") && pantalla2.length()!=0){
           if (pantalla1.length()==0){
               pantalla1 = pantalla2;
               pantalla2 = pantalla2.substring(0,0);
           }
           else {
               pantalla1 = String.valueOf(funcionCalculos.funcionSuma(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
               pantalla2 = funcionEnPantalla.funcionBorrarLinea(pantalla2);
           }
           ultimaAccion = "botonMas";
       }
       if (actionEvent.getActionCommand().equals("botonMenos") && pantalla2.length()!=0){
           if (pantalla1.length()==0){
               pantalla1 = pantalla2;
               pantalla2 = pantalla2.substring(0,0);
           }
           else {
               pantalla1 = String.valueOf(funcionCalculos.funcionResta(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
               pantalla2 = funcionEnPantalla.funcionBorrarLinea(pantalla2);
           }
           ultimaAccion = "botonMenos";
       }
       if (actionEvent.getActionCommand().equals("botonPor") && pantalla2.length()!=0){
           if (pantalla1.length()==0){
               pantalla1 = pantalla2;
               pantalla2 = pantalla2.substring(0,0);
           }
           else {
               pantalla1 = String.valueOf(funcionCalculos.funcionMultiplicacion(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
               pantalla2 = funcionEnPantalla.funcionBorrarLinea(pantalla2);
           }
           ultimaAccion = "botonPor";
       }
       if (actionEvent.getActionCommand().equals("botonDividir") && pantalla2.length()!=0){
           if (pantalla1.length()==0){
               pantalla1 = pantalla2;
               pantalla2 = pantalla2.substring(0,0);
           }
           else {
               pantalla1 = String.valueOf(funcionCalculos.funcionDivision(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
               pantalla2 = funcionEnPantalla.funcionBorrarLinea(pantalla2);
           }
           ultimaAccion = "botonDividir";
       }

       if (actionEvent.getActionCommand().equals("botonIgual") && pantalla1.length()!=0){
           switch(ultimaAccion){
               case "botonMas":
                   pantalla2 = String.valueOf(funcionCalculos.funcionSuma(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
                   pantalla1 = funcionEnPantalla.funcionBorrarLinea(pantalla1);
                   break;
               case "botonMenos":
                   pantalla2 = String.valueOf(funcionCalculos.funcionResta(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
                   pantalla1 = funcionEnPantalla.funcionBorrarLinea(pantalla1);
                   break;
               case "botonPor":
                   pantalla2 = String.valueOf(funcionCalculos.funcionMultiplicacion(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
                   pantalla1 = funcionEnPantalla.funcionBorrarLinea(pantalla1);
                   break;
               case "botonDividir":
                   pantalla2 = String.valueOf(funcionCalculos.funcionDivision(funcionEnPantalla.stringANumero(pantalla1), funcionEnPantalla.stringANumero(pantalla2)));
                   pantalla1 = funcionEnPantalla.funcionBorrarLinea(pantalla1);
                   break;
           }
       }
      if (actionEvent.getActionCommand().equals("botonMasMenos") && pantalla2.length()!=0){
          if(pantalla2.charAt(0)=='-'){
              pantalla2 = pantalla2.substring(1);
          }
          else {
              pantalla2 = "-" + pantalla2;
          }
      }


       //Para mostrar los numeros en pantalla
       display1.setText(pantalla1);
       display2.setText(pantalla2);

      }
     };
     boton0.addActionListener(escucha);
     boton1.addActionListener(escucha);
     boton2.addActionListener(escucha);
     boton3.addActionListener(escucha);
     boton4.addActionListener(escucha);
     boton5.addActionListener(escucha);
     boton6.addActionListener(escucha);
     boton7.addActionListener(escucha);
     boton8.addActionListener(escucha);
     boton9.addActionListener(escucha);
     botonComa.addActionListener(escucha);
     botonBorrar.addActionListener(escucha);
     botonCE.addActionListener(escucha);
     botonC.addActionListener(escucha);
     botonMas.addActionListener(escucha);
     botonMenos.addActionListener(escucha);
     botonPor.addActionListener(escucha);
     botonDividir.addActionListener(escucha);
     botonIgual.addActionListener(escucha);
     botonMasMenos.addActionListener(escucha);


     boton0.setActionCommand("boton0");
     boton1.setActionCommand("boton1");
     boton2.setActionCommand("boton2");
     boton3.setActionCommand("boton3");
     boton4.setActionCommand("boton4");
     boton5.setActionCommand("boton5");
     boton6.setActionCommand("boton6");
     boton7.setActionCommand("boton7");
     boton8.setActionCommand("boton8");
     boton9.setActionCommand("boton9");
     botonComa.setActionCommand("botonComa");
     botonBorrar.setActionCommand("botonBorrar");
     botonCE.setActionCommand("botonCE");
     botonC.setActionCommand("botonC");
     botonMas.setActionCommand("botonMas");
     botonMenos.setActionCommand("botonMenos");
     botonPor.setActionCommand("botonPor");
     botonDividir.setActionCommand("botonDividir");
     botonIgual.setActionCommand("botonIgual");
     botonMasMenos.setActionCommand("botonMasMenos");
    }
}
