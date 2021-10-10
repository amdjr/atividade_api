package br.adilson.api.com.atividade_api.model;

public class Season {

    private String seasonId;
    private String episodes;
    private String startDate;
    private String endDate;

    public Season(String seasonId, String episodes, String startDate, String endDate) {
        this.seasonId = seasonId;
        this.episodes = episodes;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getseasonId() {
        return seasonId;
    }

    public void setseasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getepisodes() {
        return episodes;
    }

    public void setepisodes(String episodes) {
        this.episodes = episodes;
    }

    public String getstartDate() {
        return startDate;
    }

    public void setstartDate(String startDate) {
        this.startDate = startDate;
    }
}
