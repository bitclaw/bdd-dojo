package edu;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {

    {
        System.setProperty("webdriver.chrome.driver", "/home/bitclaw/chrome-driver/chromedriver");
        WebDriverRunner.setWebDriver(new ChromeDriver());
    }

    @Given("^game loaded$")
    public void game_loaded() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @cucumber.api.java.en.Then("^I see the game title \"([^\"]*)\"$")
    public void I_see_the_game_title(String gameTitle) throws Throwable {
        // Express the Regexp above with the code you wish you had
        $(By.id("mortal-kombat")).shouldHave(text(gameTitle));
    }

    @And("^I see a button with text \"([^\"]*)\"$")
    public void I_see_a_button_with_text(String buttonText) throws Throwable {
        $(By.id("mortal-kombat-button")).shouldHave(value(buttonText));
    }

    @When("^click on \"([^\"]*)\" button$")
    public void click_on_button(String buttonValue) throws Throwable {
        $(By.cssSelector("#mortal-kombat-button")).click();
    }

//    @Given("^ingreso al juego$")
//    public void ingreso_al_juego() throws Throwable {
//        Selenide.open("http://localhost:4567/");
//    }
//
//    @Then("^veo el mensaje \"([^\"]*)\"$")
//    public void veo_el_mensaje(String message) throws Throwable {
//        $(By.id("welcome")).shouldHave(text(message));
//    }
//
//    @Then("^inicia el juego con este mensaje \"([^\"]*)\"$")
//    public void inicia_el_juego_con_este_mensaje(String message) throws Throwable {
//        $(By.id("welcome")).shouldHave(text(message));
//    }
}
