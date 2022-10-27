package com.javaseleniumtemplate.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//import org.apache.commons.io.FileUtils;
//import org.testng.ITestResult;

public class Utils {

    public static String getNowDate(String mask){
        DateFormat dateFormat = new SimpleDateFormat(mask);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFileContent(String filePath) {
        BufferedReader br=null;
        StringBuilder sb=null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }

            br.close();

        }  catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
    public static void main(String[] args){
        //cria uma string para todos os caracteres
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //criador de string aleatoria
        StringBuilder sb = new StringBuilder();

        // cria um objeto para a string aleatoria
        Random random = new Random();

        // especifica o tamanho da string
        int length = 7;
        for(int i =0; i < length; i++){
            //gerador randomico de indice
            int index = random.nextInt(alphabet.length());

            //
            char randomChar = alphabet.charAt(index);

            sb.append(randomChar);
            return sb.ToString();
        }

    }
}



