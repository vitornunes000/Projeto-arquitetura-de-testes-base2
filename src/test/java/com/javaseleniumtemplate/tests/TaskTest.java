package com.javaseleniumtemplate.tests;
import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.TaskPage;
import com.javaseleniumtemplate.utils.Utils;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest extends TestBase {
    //OBJECTS
    TaskPage taskPage;

    //Tests
    @Test
    public void deletarTarefaCriada(){

        //Objects instances
        taskPage = new TaskPage();
       //Object utils = new Utils();
        LoginFlows loginFlows = new LoginFlows();

        //parameters
        String Resumo = "teste automatizado bliberebe";
        String descricao = "verificar se tarefa foi excluida";
        String Filtro = "teste automatizado blibere";
        String numeroTarefas = "0 - 0 / 0";
        String usuario = GlobalParameters.USUARIO;
        String senhaCorreta = GlobalParameters.SENHACORRETA;

        //LOGIN
        loginFlows.efetuarLogin(usuario,senhaCorreta);

        //Tests
        taskPage.clicarEmCriarTarefa();
        taskPage.clicarEmSelecionar();
        taskPage.preencherResumo(Resumo);
        taskPage.preencherDescricao(descricao);
        taskPage.clicarEmFinalizar();
        taskPage.clicarEmDeletar();
        taskPage.clicarEmConfirmar();
        taskPage.clicarEmVerTarefas();
        taskPage.preencherfiltro(Filtro);
        taskPage.clicarEmAplicarFiltro();
        taskPage.retornaNumeroDeTarefas();

        Assert.assertEquals(numeroTarefas,taskPage.retornaNumeroDeTarefas() );
    }
}
