package TinhDaHinh;

public class WebUI {


    public static void clickElement(String element){
        System.out.println("Click on element: " + element);
    }

    public static void setText(String text){
        System.out.println("Enter text = "+ text);
    }

    public static void setText(String text, int timeout){
        System.out.println("Timeout wait for input visible = " + timeout);
        System.out.println("Enter text = "+ text);
    }

    public static void setText(String text, String keyboard){
        System.out.println("Enter text = "+ text);
        System.out.println("Keyboard = "+ keyboard);
    }
}
