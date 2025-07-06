package TinhDaHinh;

public class Calculator {
    public double tinhTong(double a, double b) {
        return a + b;
    }

    public double tinhTong(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.tinhTong(10, 40.35));
        System.out.println(calculator.tinhTong(23,45,58));
    }
}
