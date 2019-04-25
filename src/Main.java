public class Main implements IArithmeticsDiff{

    public static void main(String[] args)  {
        System.out.println("EEIAPany Matixz Developer");
        System.out.println("EEIAPany Wivor Developer");
        System.out.println("Matixz Developer");
    }

    // Multiplication
    @Override
    public double multiplication(double A, double B) {
        return A*B;
    }

    // Division
    @Override
    public double division(double A, double B) {
        return A/B;
    }

    // Addition
    @Override
    public double addition(double A, double B) {
        return A+B;
    }  
  
    @Override
    public double difference(double A, double B) {
        return A-B;
    }
}
