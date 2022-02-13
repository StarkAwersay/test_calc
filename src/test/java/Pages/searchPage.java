package Pages;


import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Constants.constant.Urls.xpath;

public class searchPage extends PageFactory {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchbar;
    @FindBy(xpath = xpath + "/tr[1]/td[1]/div/div")
    private WebElement leftbracket;
    @FindBy(xpath = xpath + "/tr[4]/td[1]/div/div")
    private WebElement one;
    @FindBy(xpath = xpath + "/tr[5]/td[4]/div/div")
    private WebElement plus;
    @FindBy(xpath = xpath + "/tr[4]/td[2]/div/div")
    private WebElement two;
    @FindBy(xpath = xpath + "/tr[1]/td[2]/div/div")
    private WebElement rightbracket;
    @FindBy(xpath = xpath + "/tr[3]/td[4]/div/div")
    private WebElement multiply;
    @FindBy(xpath = xpath + "/tr[4]/td[3]/div/div")
    private WebElement three;
    @FindBy(xpath = xpath + "/tr[4]/td[4]/div/div")
    private WebElement minus;
    @FindBy(xpath = xpath + "/tr[3]/td[1]/div/div")
    private WebElement four;
    @FindBy(xpath = xpath + "/tr[5]/td[1]/div/div")
    private WebElement zero;
    @FindBy(xpath = xpath + "/tr[2]/td[4]/div/div")
    private WebElement division;
    @FindBy(xpath = xpath + "/tr[3]/td[2]/div/div")
    private WebElement five;
    @FindBy(xpath = xpath + "/tr[3]/td[3]/div/div")
    private WebElement six;
    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")
    private WebElement sinus;
    @FindBy(xpath = xpath + "/tr[5]/td[3]/div/div")
    private WebElement clickresult;
    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")
    public WebElement task;
    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[2]/div/div")
    public WebElement result;

    public searchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("На главной странице гугла ищется поисковая строка и вбивается 'Калькулятор' и нажимается ENTER")
    public void searchCalculator() {
        searchbar.click();
        searchbar.sendKeys("Калькулятор", Keys.ENTER);
    }

    @Step("Вбивается формуала:(1 + 2) × 3 - 40 ÷ 5 =")
    public void calcTestOne() {
        leftbracket.click();
        one.click();
        plus.click();
        two.click();
        rightbracket.click();
        multiply.click();
        three.click();
        minus.click();
        four.click();
        zero.click();
        division.click();
        five.click();
        clickresult.click();
    }

    @Step("Вбивается формула '6 ÷ 0 ='")
    public void calcTestTwo() {
        six.click();
        division.click();
        zero.click();
        clickresult.click();
    }

    @Step("Вбивается 'sin() ='")
    public void calcTestThree() {
        sinus.click();
        clickresult.click();
    }

}
