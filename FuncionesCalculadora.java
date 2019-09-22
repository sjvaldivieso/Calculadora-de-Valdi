public class FuncionesCalculadora {
 private double resultado;


   public double funcionSuma (double numDisp1 , double numDisp2){
    resultado = numDisp1 + numDisp2;
    return resultado;
   }

    public double funcionResta(double numDisp1 , double numDisp2){
    resultado = numDisp1 - numDisp2;
    return resultado;
    }

    public double funcionMultiplicacion(double numDisp1 , double numDisp2){
    resultado = numDisp1 * numDisp2;
    return resultado;
    }

    public double funcionDivision(double numDisp1 , double numDisp2){
    resultado = numDisp1 / numDisp2;
    return resultado;
    }
}
