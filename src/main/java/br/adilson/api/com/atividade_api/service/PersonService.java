package br.adilson.api.com.atividade_api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.adilson.api.com.atividade_api.model.Person;

@Service
public class PersonService {

    private static final String RESULT2 = "result";
    private List<Person> listOfPersons = new ArrayList<>();

    PersonService() {
        listOfPersons.add(new Person("Saitama", "B", "7"));
        listOfPersons.add(new Person("Fubuki", "B", "1"));
        listOfPersons.add(new Person("Genos", "S", "14"));
        listOfPersons.add(new Person("Garou", "Monstro Humano", "Kaijin"));
    }

    public List<Person> findAll() {
        return this.listOfPersons;
    }

    public Person findOne(String name) {
        for (Person person : listOfPersons) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    public Map<String, String> insert(Person person) {
        Map<String, String> result = new HashMap<>();
        boolean isSuccess = listOfPersons.add(person);
        if (isSuccess) {
            result.put(RESULT2, "Personagem cadastrada com sucesso.");
        } else {
            result.put(RESULT2, "ERRO! Não foi possível cadastrar a personagem.");
        }
        return result;
    }

    public Map<String, String> edit(Person person) {
        Map<String, String> result = new HashMap<>();

        for (Person element : listOfPersons) {
            if (element.getName().equalsIgnoreCase(person.getName())) {
                int index = listOfPersons.indexOf(element);
                listOfPersons.set(index, person);
                result.put(RESULT2, "Personagem editada com sucesso.");
                return result;
            }
            result.put(RESULT2, "ERRO! Não foi possível editar a personagem.");
        }
        return result;
    }

    public Map<String, String> remove(String name) {
        Map<String, String> result = new HashMap<>();
        boolean isSuccess = listOfPersons.removeIf(person -> person.getName().equalsIgnoreCase(name));
        if (isSuccess) {
            result.put(RESULT2, "Personagem removida com sucesso.");
        } else {
            result.put(RESULT2, "ERRO! Não foi possível remover a personagem.");
        }
        return result;
    }
}
