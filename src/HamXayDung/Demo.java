package HamXayDung;

public class Demo {
    public String name;
    public String phone;


    public Demo() {
        name = "Nhung";
        phone = "768267";


    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.name);
        System.out.println(demo.phone);
    }
}
