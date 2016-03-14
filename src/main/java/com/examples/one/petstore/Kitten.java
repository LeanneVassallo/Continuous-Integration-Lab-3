package src.main.java.com.examples.one.petstore;

/**
 * Created by Bobby on 14-Mar-16.
 */
public class Kitten {
    int id;
    String name;
    String[] breed = {"Persian", "Siamese", "Bengal"};
    Boolean sensitiveToFeeding;

    public Kitten()
    {
        this.id = 0;
        this.name = "";
        this.breed = null;
    }
    
    public Kitten(int id, String name, String[] breed)
    {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String[] breed) {
        this.breed = breed;
    }

    public void setSensitiveToFeeding(Boolean sensitiveToFeeding) {
        this.sensitiveToFeeding = sensitiveToFeeding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getBreed() {
        return breed;
    }

    public Boolean getSensitiveToFeeding() {
        return sensitiveToFeeding;
    }

}
