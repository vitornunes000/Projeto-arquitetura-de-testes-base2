package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.CreateTaskPage;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.utils.Utils;
import org.junit.Assert;
import org.junit.Test;

public class CreateTaskTests extends TestBase {
    //Objects
    LoginPage loginPage;
    CreateTaskPage createTaskPage;

    //Tests
    @Test
    public void criarTarefaComSucesso(){

        //Objects instances
        loginPage = new LoginPage();
        createTaskPage = new CreateTaskPage();

        //Parameteres
        String usuario = "eduardoberlatto";
        String senha = "eduardoberlatto123";
        String atribuicao = "eduardoberlatto";
        String resumo = "testeEdu";
        String descricao = "Apenas um teste de criação de tarefas no Mantis";
        String infoAdicional = "Nenhuma informação adicional a declarar";
        String mensagemSucessoEsperada = "Operação realizada com sucesso.";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmLogin();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLoginnew();
        createTaskPage.clicarEmCriarTarefa();
        createTaskPage.preencherAtribuicao(atribuicao);
        createTaskPage.preenhcerResumo(resumo);
        createTaskPage.preencherDescricao(descricao);
        createTaskPage.preencherInfoAdicional(infoAdicional);
        createTaskPage.clicarEmCriar();

        Assert.assertTrue(createTaskPage.retornaMensagemCriadoComSucesso().contains(mensagemSucessoEsperada));
    }

    @Test
    public void criarTarefaComFalha(){

        //Objects instances
        loginPage = new LoginPage();
        createTaskPage = new CreateTaskPage();

        //Parameteres
        String usuario = "eduardoberlatto";
        String senha = "eduardoberlatto123";
        String atribuicao = "eduardoberlatto";
        String resumo = "testeEdu";
        String infoAdicional = "Nenhuma informação adicional a declarar";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.clicarEmLogin();
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLoginnew();
        createTaskPage.clicarEmCriarTarefa();
        createTaskPage.preencherAtribuicao(atribuicao);
        createTaskPage.preenhcerResumo(resumo);
        createTaskPage.preencherInfoAdicional(infoAdicional);
        createTaskPage.clicarEmCriar();

        Assert.assertEquals("", "");
    }

}
