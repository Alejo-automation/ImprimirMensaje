package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {

    public static final Target TXT_FIRST_NAME = Target.the("Enter the information first name")
            .locatedBy("//input[@placeholder='First Name']");

    public static final Target TXT_LAST_NAME = Target.the("Enter the information last name")
            .locatedBy("//input[@placeholder='Last Name']");
//comentario
//comentariodos
    public static final Target TXT_EMAIL = Target.the("Enter the information email")
            .locatedBy("//input[@placeholder='name@example.com']");

    public static final Target SELECT_GENDER = Target.the("Enter the information gender")
            .locatedBy("//div[@class='custom-control custom-radio custom-control-inline'][1]");

    public static final Target TXT_NUMBER = Target.the("Enter information number")
            .locatedBy("//input[@placeholder='Mobile Number']");

    public static final Target BTN_BIRTH = Target.the("Enter information birth")
            .locatedBy("//input[@id='dateOfBirthInput']");

    public static final Target BTN_BIRTH_DAY = Target.the("Enter information birth day")
            .locatedBy("//div[@class='react-datepicker__day react-datepicker__day--011']");

    public static final Target BTN_SUBJECT = Target.the("Click option subject")
            .locatedBy("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']");

    public static final Target TXT_SUBJECTS = Target.the("Enter information subjects")
            .locatedBy("//div[@class='subjects-auto-complete__control subjects-auto-complete__control--is-focused subjects-auto-complete__control--menu-is-open css-1pahdxg-control']");

    //public static final Target SELECT_HOBBIES = Target.the("Enter information hobbies")
      //      .locatedBy("//input[@id='hobbies-checkbox-3']");

    //public static final Target SELECT_FILE = Target.the("Select file")
      //      .locatedBy("//input[@id='uploadPicture']");

    //public static final Target TXT_CURRENT_ADDRESS = Target.the("Enter information Current Address")
      //      .locatedBy("//textarea[@placeholder='Current Address']");

    //public static final Target SELECT_STATE = Target.the("Select information state")
      //      .locatedBy("//div[@class=' css-1hwfws3']");

    //public static final Target SELECT_ONLY_STATE = Target.the("Select only state")
      //      .locatedBy("//div[@class=' css-1uccc91-singleValue']");



}
