package TinhDongGoi;

public class LoginPage {
    private String email;
    private String password;
    private String url;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        System.out.println("Open URL CRM");
        System.out.println("Save log");
        return url;
    }

    public String getUrlLoginAdmin(){
        return url + "/admin/authentication";
    }

    public String getUrlLoginCustomer(){
        return url + "/authentication/login";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void loginCRM() {
        System.out.println("Open URL: " +    getUrl());
        System.out.println("Enter Email: " + getEmail());
        System.out.println("Enter Password: " + getPassword());
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.setEmail("haltt0693@gmail.com");
        loginPage.setPassword("123456");
        loginPage.setUrl("https://anhtester.com");
        System.out.println(loginPage.getUrlLoginAdmin());
        loginPage.loginCRM();
    }
}
