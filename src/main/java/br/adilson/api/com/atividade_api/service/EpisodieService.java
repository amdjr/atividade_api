package br.adilson.api.com.atividade_api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.adilson.api.com.atividade_api.model.Episodie;

@Service
public class EpisodieService {

    private static final String RESULT2 = "result";
    private List<Episodie> listOfEpisodies = new ArrayList<>();

    EpisodieService() {
        listOfEpisodies.add(new Episodie("1", "Homem Mais Forte"));
        listOfEpisodies.add(new Episodie("2", "Ciborgue Solitário"));
        listOfEpisodies.add(new Episodie("3", "Cientista Obsessivo"));
        listOfEpisodies.add(new Episodie("4", "Ninja Moderno"));
        listOfEpisodies.add(new Episodie("5", "Mestre Definitivo"));
        listOfEpisodies.add(new Episodie("6", "Cidade Aterrorizante"));
        listOfEpisodies.add(new Episodie("7", "Discípulo Supremo"));
        listOfEpisodies.add(new Episodie("8", "Rei do Mar Profundo"));
        listOfEpisodies.add(new Episodie("9", "Justiça Irredutível"));
        listOfEpisodies.add(new Episodie("10", "Perigo Sem Igual"));
        listOfEpisodies.add(new Episodie("11", "Dominador do Universo"));
        listOfEpisodies.add(new Episodie("12", "Herói Mais Forte"));

        listOfEpisodies.add(new Episodie("13", "Retorno do Herói"));
        listOfEpisodies.add(new Episodie("14", "Criatura-Humana"));
        listOfEpisodies.add(new Episodie("15", "Começa a Caçada"));
        listOfEpisodies.add(new Episodie("16", "Bastão de Metal"));
        listOfEpisodies.add(new Episodie("17", "Torneio de Artes Marciais"));
        listOfEpisodies.add(new Episodie("18", "Insurreição das Criaturas"));
        listOfEpisodies.add(new Episodie("19", "Heróis Classe S"));
        listOfEpisodies.add(new Episodie("20", "Contra-ataque dos Fortes"));
        listOfEpisodies.add(new Episodie("21", "Dilema Supremo"));
        listOfEpisodies.add(new Episodie("22", "Rede Cercante da Justiça"));
        listOfEpisodies.add(new Episodie("23", "Dignidade de Cada Um"));
        listOfEpisodies.add(new Episodie("24", "Arrumando a Bagunça do Discípulo"));
    }

    public List<Episodie> findAll() {
        return this.listOfEpisodies;
    }

    public Episodie findOne(String name) {

        for (Episodie episodie : listOfEpisodies) {
            if ((episodie.getEpId().equals(name))) {
                return episodie;
            }
        }
        return null;
    }

    public Map<String, String> insert(Episodie episodie) {
        Map<String, String> result = new HashMap<>();
        boolean isSuccess = listOfEpisodies.add(episodie);
        if (isSuccess) {
            result.put(RESULT2, "Episódio adicionado com sucesso.");
        } else {
            result.put(RESULT2, "ERRO! Não foi possível adicionar o episódio.");
        }
        return result;

    }

    public Map<String, String> edit(Episodie episodie) {
        Map<String, String> result = new HashMap<>();

        for (Episodie element : listOfEpisodies) {
            if (element.getEpId().equalsIgnoreCase(episodie.getEpId())) {
                int index = listOfEpisodies.indexOf(element);
                listOfEpisodies.set(index, episodie);
                result.put(RESULT2, "Episódio editado com sucesso.");
                return result;
            }
            result.put(RESULT2, "ERRO! Não foi possível editar o Episódio.");
        }
        return result;
    }

    public Map<String, String> remove(String epToRemove) {
        Map<String, String> result = new HashMap<>();
        boolean isSuccess = listOfEpisodies.removeIf(season -> season.getEpId().equalsIgnoreCase(epToRemove));
        if (isSuccess) {
            result.put(RESULT2, "Episódio removido com sucesso.");
        } else {
            result.put(RESULT2, "ERRO! Não foi possível remover o Episódio.");
        }
        return result;
    }
}
