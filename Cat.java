public class Cat {
    private String name;
    private int satiety;
    private int maxSatiety;
    private int minSatiety;
    private int thirsty;
    private int maxThirsty;
    private int minThirsty;

    public Cat(String name, int satiety, int thirsty){
        this.name = name;
        this.satiety = satiety;
        this.thirsty = thirsty;
        this.maxSatiety = 100;
        this.maxThirsty = 100;
        this.minSatiety = 20;
        this.minThirsty = 30;
    }
}
