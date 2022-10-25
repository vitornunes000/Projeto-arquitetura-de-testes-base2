package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class TaskPage extends PageBase {
    //MAPPING
    By TaskCreatefield = By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[1]/div/a");
    By resumeField = By.id("summary");
    By descriptionField = By.id("description");
    By createNewField = By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input");
    By deleteTaskField = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div/div[2]/div[2]/div/table/tfoot/tr/td/div/div[10]/form/fieldset/input[4]");
    By deleteTaskConfirm = By.xpath("//*[@id=\"action-group-div\"]/form/div/div[2]/div[2]/input");
    By viewTasks = By.xpath("//*[@id=\"sidebar\"]/ul/li[2]/a/i");
    By filterField = By.id("filter-search-txt"); //escrever o nome da tarefa
    By filterAplyfield = By.xpath("//*[@id=\"filters_form_open\"]/div[2]/div/div/input[2]");//clicar
    By counterTaskfield = By.xpath("//*[@id=\"bug_action\"]/div/div[1]/h4/span");//clicar

    //ACTIONS
    public void clicarEmCriarTarefa(){
        click(TaskCreatefield);
    }
    public void preencherResumo(String Resumo){
        sendKeys(resumeField, Resumo);
    }
    public void preencherDescricao(String descricao){
        sendKeys(descriptionField, descricao);
    }
    public void clicarEmFinalizar(){
        click(createNewField);
    }
    public void clicarEmDeletar(){
        click(deleteTaskField);
    }
    public void clicarEmConfirmar(){
        click(deleteTaskConfirm);
    }
    public void clicarEmVerTarefas(){
        click(viewTasks);
    }
    public void preencherfiltro(String Filtro){
        sendKeys(filterField, Filtro);
    }
    public void clicarEmAplicarFiltro(){
        click(filterAplyfield);
    }
    public String retornaNumeroDeTarefas(){
        return getText(counterTaskfield);
    }
}
