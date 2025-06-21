package PhamViTruyCap.PhamViPrivate;

public class Employees {
    private String name = "Truc Phuong";
    private int age = 30;

    private void getInfo() {
        System.out.println(name);
        System.out.println(age);
    }

    private void getAge() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.getInfo();
        employees.getAge();
    }
}
