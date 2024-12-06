public class Zodiac {
    // this is where the logic of finding the users zodiac sign is handled, which stores and returns their zodiac sign
    private String name;

    public Zodiac(String name) {
        this.name = name;
    }

    public static Zodiac findSign(String bday) {
        String[] parts = bday.split("/");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return new Zodiac("Aries");
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return new Zodiac("Taurus");
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return new Zodiac("Gemini");
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return new Zodiac("Cancer");
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return new Zodiac("Leo");
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return new Zodiac("Virgo");
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return new Zodiac("Libra");
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return new Zodiac("Scorpio");
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return new Zodiac("Sagittarius");
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return new Zodiac("Capricorn");
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return new Zodiac("Aquarius");
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return new Zodiac("Pisces");

        return new Zodiac("Unknown");
    }

    public String getName() {
        return name;
    }
}
