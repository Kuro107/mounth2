public class Food {
    private String name;
    private int hungry;
    private  int thirsty;

    public Food(String name, byte hungry, byte thirsty) {
        this.name = name;
        this.hungry = hungry;
        this.thirsty = thirsty;
    }

    public String getName() {
        return name;
    }

    public int getHungry() {
        return hungry;
    }

    public int getThirsty() {
        return thirsty;
    }

}