package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//*[@id=\"login-form\"]/fieldset/input[2]");
    //By cookieButton = By.xpath("//*[@aria-label='dismiss cookie message']");
    By errorMessageLabel = By.xpath("//*[@id=\"main-container\"]/div/div/div/div/div[4]");

    By loginButton2 = By.xpath("//*[@id=\"login-form\"]/fieldset/input[3]");

    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }
    public void clicarEmLoginnew(){
        click(loginButton2);
    }

    /*public void clicarEmAceitarCookies(){
        click(cookieButton);
    }*/

    public String retornaMensagemErroLogin(){
        return getText(errorMessageLabel);
    }
}