package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairRegisterPage {

    //Step1:Tell us about yourself
    public static final Target FIRST_NAME= Target.the("where do we write to first name").located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("where do we write to last name").located(By.id("lastName"));
    public static final Target EMAIL= Target.the("where do we write to email").located(By.id("email"));
    public static final Target MONTH= Target.the("where do we select to month").located(By.xpath("//option[contains(text(),'Sep')]"));
    public static final Target DAY= Target.the("where do we select to day").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[2]/select[1]/option[28]"));
    public static final Target YEAR= Target.the("where do we select to year").located(By.xpath("//option[contains(text(),'1996')]"));
    public static final Target NEXT_LOCATION= Target.the("where do we select to next:location").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));

    //Step2: Add your address
    public static final Target CITY= Target.the("where do we write to city").located(By.id("city"));
    public static final Target POSTAL_CODE= Target.the("where do we write to Postal code").located(By.id("zip"));
    public static final Target COUNTRY= Target.the("where do we write to Country").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/span[2]"));
    public static final Target NEXT_DEVICES= Target.the("where do we select to next:devices").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));

    //Step3 : Tell us about your devices
    public static final Target COMPUTER = Target.the("where do we select your computer").located(By.xpath("//span[contains(text(),'Windows')]"));
    public static final Target VERSION = Target.the("where do we select version").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/span[2]"));
    public static final Target LANGUAGE = Target.the("Where do we select language").located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/span[2]"));
    public static final Target NEXT_LAST_STEP= Target.the("where do we select to next:last step").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

    //Step 4: The last step
    public static final Target PASSWORD= Target.the("where do we write to password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD= Target.the("where do we write to confirm password").located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USE=Target.the("where do we select to terms of use").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
    public static final Target PRIVACY= Target.the("where do we write to select privacy y security").located(By.xpath("//body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
    public static final Target COMPLETE_SETUP= Target.the("where do we select to complete setup").located(By.id("laddaBtn"));
    public static final Target WELCOME=Target.the("Extract the name").located(By.xpath("//body[1]/ui-view[1]/unauthenticated-container[1]/div[1]/div[1]/div[1]/ui-view[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));


}
