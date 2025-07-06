package TinhKeThua;

public class Students extends Persons {


    public Students(String name, int age, float height) {
        super("Hale", 14, 158.5F);

    }

    public void showInfo(){
        getInfo();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Students students = new Students("ha", 78, 258);
        students.getInfo();
    }

}
