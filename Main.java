public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        country.name = "Kyrgyzstan";
        country.population = 7000000;
        country.system = "presidential system";
        country.vvp = "123000 mil $";
        System.out.println(country.name + " " +country.population + " " + country.system + " " + country.vvp);
    }
}
