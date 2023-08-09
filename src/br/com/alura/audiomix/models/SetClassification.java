package br.com.alura.audiomix.models;

public class SetClassification {
    public void rank(Classification audio){
        if (audio.getClassification() >=8){
            System.out.println( "Está entre os favoritos do momento!");
        }
        else if (audio.getClassification() >= 5){
            System.out.println("Está fazendo sucesso");
        }
        else {
            System.out.println("lixo");
        }
    }
}
