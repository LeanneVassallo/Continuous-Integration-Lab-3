package com.examples.one.petstore;
public class Puppy {

    int id;
    String name;
    String[] breed = {"Labrador", "Doberman", "Pitbull"};
    Boolean loudBark;
    Boolean friendlyWithChildren;

    public Puppy (int id, String name, String breed []){
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public String[] getBreed() {
        return breed;
    }

    public void setBreed(String[] breed) {
        this.breed = breed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Boolean getLoudBark() {
        return loudBark;
    }

    public void setLoudBark(Boolean loudBark) {
        this.loudBark = loudBark;
    }

    public Boolean getFriendlyWithChildren() {
        return friendlyWithChildren;
    }

    public void setFriendlyWithChildren(Boolean friendlyWithChildren) {
        this.friendlyWithChildren = friendlyWithChildren;
    }
}
