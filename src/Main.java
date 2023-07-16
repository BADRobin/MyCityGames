import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> cities = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        fillCities();
        gameLoop();
    }
    private static void gameLoop(){
        while (true){
            String input = scanner.nextLine();
            if (input.equals("exit")){
                System.out.println("Дякую за гру!");
                System.exit(0);
            }
           char lastChar =  input.charAt(input.length() - 1);
            for (String city: cities){
                char firstChar = city.charAt(0);
                if (Character.toLowerCase(lastChar) == Character.toLowerCase(firstChar)){
                    System.out.println("Моє місто: " + city);
                    break;
                }
            }
        }
    }
    public static void fillCities() {
        cities.add("Київ");
        cities.add("Одеса");
        cities.add("Миколаїв");
        cities.add("Вінниця");
        cities.add("Ялта");
        cities.add("Алчевськ");
        cities.add("Житомир");
        cities.add("Львів");
        cities.add("Рівне");
   }
}