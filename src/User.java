public class User {
    // this is where the name, birthday, and zodiac sign of the user is stored and returned 
    private String name;
    private String birthday; // MM/DD
    private Zodiac sign;

    public User(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.sign = Zodiac.findSign(birthday);
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public Zodiac getSign() {
        return sign;
    }
}
