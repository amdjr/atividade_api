package br.adilson.api.com.atividade_api.model;

public class Person {

    private String name;
    private String heroClass;
    private String rank;

    public Person(String name, String heroClass, String rank) {
        this.name = name;
        this.heroClass = heroClass;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getheroClass() {
        return heroClass;
    }

    public void setheroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
