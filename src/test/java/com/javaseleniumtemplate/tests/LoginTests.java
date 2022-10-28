package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginEmailInvalido(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = "vitoroliveira";
        String senha = "123456";
        String mensagemErroEsperada = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos";

        //Test
        //loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmLogin();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLoginnew();

        Assert.assertTrue(loginPage.retornaMensagemErroLogin().contains(mensagemErroEsperada));
    }
    @Test
    public void efetuarLoginComSucesso(){

        //Objects instances
        loginPage = new LoginPage();

        //Parameteres
        String usuario = GlobalParameters.USUARIO;
        String senha = GlobalParameters.SENHACORRETA;
        String confirmaçãoLogin = "vitoroliveira";

        //Test
        //loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmLogin();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLoginnew();

        Assert.assertTrue(loginPage.retornaNomeContaUsuario().equals(confirmaçãoLogin));
}}
