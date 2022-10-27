package com.javaseleniumtemplate.tests;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.TaskPage;
import com.javaseleniumtemplate.utils.Utils;
import org.junit.Assert;
import org.junit.Test;

public class TaskTest extends TaskPage {
    //OBJECTS
    TaskPage taskPage;

    //Tests
    @Test
    public void deletarTarefaCriada(){

        //Objects instances
        taskPage = new TaskPage();
        Object utils = new Utils();

        //parameters
        String Resumo = utils.toString()
        String descricao = "verificar se tarefa foi excluida";
        String Filtro = "teste automatizado";
        String numeroTarefas = " 0 - 0 / 0";

        //Tests
        taskPage.clicarEmCriarTarefa();
        taskPage.preencherResumo(Resumo);
        taskPage.preencherDescricao(descricao);
        taskPage.clicarEmFinalizar();
        taskPage.clicarEmDeletar();
        taskPage.clicarEmConfirmar();
        taskPage.clicarEmVerTarefas();
        taskPage.preencherfiltro(Filtro);
        taskPage.clicarEmAplicarFiltro();
        taskPage.retornaNumeroDeTarefas();

        Assert.assertTrue(taskPage.retornaNumeroDeTarefas().contains(numeroTarefas));
    }
}
