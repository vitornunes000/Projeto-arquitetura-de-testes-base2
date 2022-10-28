package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CreateTaskPage extends PageBase {
    //Mapping
    By CreateTaskField = By.xpath("//*[@id=\"navbar-container\"]/div[2]/ul/li[1]/div/a");
    By assignField = By.id("handler_id");
    By summaryField = By.id("summary");
    By descriptionField = By.id("description");
    By addInfoField = By.id("additional_info");
    By createButton = By.xpath("//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input");
    By successMessageLabel = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div/div[2]");
    By attentionMessageLabel = By.partialLinkText("Preencha este campo");

    public void clicarEmCriarTarefa(){click(CreateTaskField);}
    public void preencherAtribuicao(String atribuicao){
        sendKeys(assignField, atribuicao);
    }
    public void preenhcerResumo(String resumo){
        sendKeys(summaryField, resumo);
    }
    public void preencherDescricao(String descricao){
        sendKeys(descriptionField, descricao);
    }
    public void preencherInfoAdicional(String infoAdicional){
        sendKeys(addInfoField, infoAdicional);
    }
    public void clicarEmCriar(){
        click(createButton);
    }
    public String retornaMensagemCriadoComSucesso(){
        return getText(successMessageLabel);
    }
}
