package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Form implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Brian").into(FormPage.TXT_FIRST_NAME));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Enter.theValue("Corredor").into(FormPage.TXT_LAST_NAME));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Enter.theValue("briancorredor@mail.com").into(FormPage.TXT_EMAIL));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Click.on(FormPage.SELECT_GENDER));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Enter.theValue("3144760124").into(FormPage.TXT_NUMBER));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Click.on(FormPage.BTN_BIRTH));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Click.on(FormPage.BTN_BIRTH_DAY));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Click.on(FormPage.BTN_SUBJECT));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        actor.attemptsTo(Enter.theValue("Hin").into(FormPage.TXT_SUBJECTS));
        try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        //actor.attemptsTo(Click.on(FormPage.SELECT_HOBBIES));
        //try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        //actor.attemptsTo(Enter.theValue("Testing current Address Neighborhood Colombia ").into(FormPage.TXT_CURRENT_ADDRESS));
        //try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        //actor.attemptsTo(Click.on(FormPage.SELECT_STATE));
        //try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}

        //actor.attemptsTo((Click.on(FormPage.SELECT_ONLY_STATE)));
        //try {Thread.sleep(1000);} catch (InterruptedException e){e.printStackTrace();}



    }
    public static Form enter(){
        return Tasks.instrumented(Form.class);
    }
}
