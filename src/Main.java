import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // this is just where the basic console questions and everything is created and users response is taken in
        System.out.println("Welcome to the Astrology Zone!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String userName = scanner.nextLine();

        System.out.print("Enter your birthday (MM/DD): ");
        String bday = scanner.nextLine();

        User astroUser = new User(userName, bday);
        System.out.println("Hey " + astroUser.getName() + "! Your zodiac sign is " + astroUser.getSign().getName());

        System.out.println("Wanna see your daily or monthly horoscope?");
        System.out.println("1. Daily");
        System.out.println("2. Monthly");
        System.out.print("Choose one (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            DailyHoroscope dailyHoroscope = new DailyHoroscope();
            dailyHoroscope.fetchFromAPI(astroUser.getSign().getName());
            System.out.println("Your Daily Horoscope: " + dailyHoroscope.getMessage());
        } else if (choice == 2) {
            MonthlyHoroscope monthlyHoroscope = new MonthlyHoroscope();
            monthlyHoroscope.fetchFromAPI(astroUser.getSign().getName());
            System.out.println("Your Monthly Horoscope: " + monthlyHoroscope.getMessage());
        } else {
            System.out.println("Oops, invalid choice. Try again!");
            scanner.close();
        }
    }
}
