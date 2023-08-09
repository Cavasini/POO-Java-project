package br.com.alura.audiomix.models;

public class Audio implements Classification{
    private String Title;
    private int durationInMinutes;
    private int views;
    private int likes;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void toLike(){
        this.likes ++;
    }

    public void toView(){
        this.views ++;
    }


    @Override
    public int getClassification() {
        double step = (double) this.likes / this.views;
        return  (int) Math.round(step * 10);


    }
}


