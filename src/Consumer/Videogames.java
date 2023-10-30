package Consumer;

public class Videogames {
    private String name;
    private String gender;
    private int amount;

    public Videogames(String name, String gender, int amount) {
        this.name = name;
        this.gender = gender;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}