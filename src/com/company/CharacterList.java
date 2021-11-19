package com.company;

import java.util.ArrayList;

// Create a controller that will allow us to stock our characters
public class CharacterList {

    //Create an ArrayList Characters
    private ArrayList Character;

    // Let the constructor be a new ArrayList of our Characters
    public CharacterList() {
        this.Character = new ArrayList();
    }

    // Save our characters when asked by adding him to the ArrayList
    public void saveCharacter(Character Character) {
        this.Character.add(Character);
    }

    // When we want to get our ArrayList, ask to get it by returning it
    public ArrayList getCharacters() {
        return this.Character;
    }


}
