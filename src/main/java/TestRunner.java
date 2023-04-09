import managers.WebDriverManager;


public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager=new WebDriverManager("CHROME");


Thread.sleep(10000);
webDriverManager.getDriver().close();
    }
}
