public class Main implements IArithmeticsDiff, IArithmeticsAdd, IArithmeticDiv, IAritmeticsMult {
  
    public static void main(String[] args)  {
        System.out.println("EEIAPany Matixz Developer");
        System.out.println("Leherguargin Operations");
        System.out.println("Matix97 Tester");
        System.out.println("Wivor Developer");
        System.out.println("Matixz Developer");
    }

    @Override
    public double multiplication(double A, double B) {
        return A*B;
    }
  
    @Override
    public double division(double A, double B) {
        return A/B;
    }
    //cokolwiek gdzieindziej 1
    @Override
    public double addition(double A, double B) {
        return A+B;
    }  
  
    @Override
    public double difference(double A, double B) {
        return A-B;
    }
}
