package br.adilson.api.com.atividade_api.model;

public class Episodie {

    private String epId;
    private String title;

    public Episodie(String epId, String title) {
        this.epId = epId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

}
