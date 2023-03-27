import managers.WebDriverManager;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager=new WebDriverManager("CHROME");
        webDriverManager.getDriver().get("https://www.w3schools.com/");

        Thread.sleep(10000);
        webDriverManager.closeDriver();

    }
}
