package com.example;

import java.util.List;

public interface IFiline {
    int getKittens();

    List<String> getFood(String animalKind) throws Exception;
}
