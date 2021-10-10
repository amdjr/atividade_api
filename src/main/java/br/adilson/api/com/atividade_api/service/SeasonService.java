package br.adilson.api.com.atividade_api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.adilson.api.com.atividade_api.model.Season;

@Service
public class SeasonService {

    private List<Season> listOfSeason = new ArrayList<>();

    SeasonService() {
        listOfSeason.add(new Season("1", "Ep: 1 ao 12", "4 de outubro de 2015", "20 de dezembro de 2015"));
        listOfSeason.add(new Season("2", "Ep: 13 ao 24", "9 de abril de 2019", "2 de julho de 2019"));
    }

    public List<Season> findAll() {
        return this.listOfSeason;
    }

    public Season findOne(String season) {
        for (Season Season : listOfSeason) {
            if (Season.getseasonId().equalsIgnoreCase(season)) {
                return Season;
            }
        }
        return null;
    }

    public Map<String, String> insert(Season season) {
        Map<String, String> result = new HashMap<>();
        boolean isSuccess = listOfSeason.add(season);
        if (isSuccess) {
            result.put("result", "Temporada cadastrada com sucesso!!!");
        } else {
            result.put("result", "Não foi possível cadastrar a Temporada!!!");
        }
        return result;
    }

    public Map<String, String> edit(Season season) {
        Map<String, String> result = new HashMap<>();

        for (Season element : listOfSeason) {
            if (element.getseasonId().equalsIgnoreCase(season.getseasonId())) {
                int index = listOfSeason.indexOf(element);
                listOfSeason.set(index, season);
                result.put("result", "Temporada editada com sucesso.");
                return result;
            }
            result.put("result", "Não foi possível editar a Temporada.");
        }
        return result;
    }

    public Map<String, String> remove(String seasonToRemove) {
        Map<String, String> result = new HashMap<>();
        boolean isSuccess = listOfSeason.removeIf(season -> season.getseasonId().equalsIgnoreCase(seasonToRemove));
        if (isSuccess) {
            result.put("result", "Temporada removida com sucesso!!!");
        } else {
            result.put("result", "Não foi possível remover a Temporada!!!");
        }
        return result;
    }
}
