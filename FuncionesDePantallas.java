public class FuncionesDePantallas {

    private double numeroConvertido;

    public String funcionBorrarLinea(String stringABorrar) {//Borra la linea donde se esta trabajando
        stringABorrar = stringABorrar.substring(0, 0);
        return stringABorrar;
    }

    public String funcionBorrarCaracter(String stringABorrarCaracter){//Borra el ultimo caracter ingresado
        if(stringABorrarCaracter.length() != 0) {
            stringABorrarCaracter = stringABorrarCaracter.substring(0, stringABorrarCaracter.length() - 1);
        }
        return stringABorrarCaracter;
    }

    public double stringANumero(String stringAConvertir){
        numeroConvertido = Double.parseDouble(stringAConvertir);
        return numeroConvertido;
    }

}
