package br.com.alura.audiomix;

import br.com.alura.audiomix.models.Audio;
import br.com.alura.audiomix.models.Music;
import br.com.alura.audiomix.models.Podcast;
import br.com.alura.audiomix.models.SetClassification;

public class Principal {
    public static void main(String[] args) {
        Podcast lawrence = new Podcast();
        lawrence.setTitle("Lawrence");
        lawrence.setHost("idk");
        for(int i = 0; i<20;i++){
            lawrence.toView();
        }
        for(int i = 0; i <10; i++){
            lawrence.toLike();
        }

        SetClassification classi = new SetClassification();
        classi.rank(lawrence);


        Music flower =new Music();
        flower.setTitle("Flower Boy");
        flower.setAlbum("Call if you get lost");

        Music earthquake =new Music();
        earthquake.setTitle("earthquake");
        earthquake.setAlbum("Call if you get lost");


        System.out.println(lawrence.getTitle());
        System.out.println(earthquake.getTitle());
        System.out.println(flower.getTitle());

    }
}
