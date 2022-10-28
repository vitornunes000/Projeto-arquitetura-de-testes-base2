package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.CreateTaskPage;

public class CreateTaskFlows {
    //Objects and constructor
    CreateTaskPage createTaskPage;

    public CreateTaskFlows(){
        //Page and Steps Objects
        createTaskPage = new CreateTaskPage();
    }

    //Flows
    public void criarTarefa(String atribuicao, String resumo, String descricao, String infoAdicional){
        createTaskPage.clicarEmCriarTarefa();
        createTaskPage.preencherAtribuicao(atribuicao);
        createTaskPage.preenhcerResumo(resumo);
        createTaskPage.preencherDescricao(descricao);
        createTaskPage.preencherInfoAdicional(infoAdicional);
        createTaskPage.clicarEmCriar();
    }
}
