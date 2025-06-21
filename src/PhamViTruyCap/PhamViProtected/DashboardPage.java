package PhamViTruyCap.PhamViProtected;

import PhamViTruyCap.PhamViCommon.BasePage;

public class DashboardPage extends BasePage{

    public void getDriver(){
        System.out.println(driver);
    }
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
//        loginPage.inputEmail;
        System.out.println(loginPage.inputEmail);
        System.out.println(loginPage.inputPassword);


        BasePage basePage = new BasePage();
//        System.out.println(basePage.driver);


        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getDriver();


    }
}
