public class Main implements IArithmeticsDiff, IArithmeticsAdd, IArithmeticDiv, IAritmeticsMult {
  
    public static void main(String[] args)  {
        System.out.println("EEIAPany Matixz Developer");
        System.out.println("Leherguargin Operations");
        System.out.println("Matix97 Tester");
        System.out.println("Wivor Developer");
        System.out.println("Matixz Developer");
    }

    @Override//copment1
    public double multiplication(double A, double B) {
        return A*B;
    }
  
    @Override//comment2
    public double division(double A, double B) {
        return A/B;
    }

    @Override
    public double addition(double A, double B) {
        return A+B;
    }  
  //comment3
    @Override
    public double difference(double A, double B) {
        return A-B;
    }
}
