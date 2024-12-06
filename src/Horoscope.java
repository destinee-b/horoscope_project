import java.util.List;
import java.util.Random;

// this is where the horoscope message is stored and a random message is generated based on the pool of messages i have, this wouldn't be needed if the API was working, i broke the messages up for each sign so theres a few each one can cycle through, i thought about doing one giant pool but i thought it would be more fun to have a few for each sign that was unique to each

public class Horoscope {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    // this is the pool of all the hardcoded messages, i used a switch statement to determine which sign the user is and then based on the type of horoscope they want, daily or monthly, it will return a random message from the pool, that way its different and unique each time. 
    public static String randomMessage(String sign, int type) {
        List<String> pool = switch (sign.toLowerCase()) {
            case "aries" -> type == 1
                ? List.of("Bold moves bring big results today.", "Stay confident; you've got this.", "Go big today!")
                : List.of("This is your month for growth.", "Challenges will sharpen your skills.", "Go after your goals with focus.");
            case "taurus" -> type == 1
                ? List.of("Patience is key today.", "Stay grounded and steady.", "A small effort will yield big rewards.")
                : List.of("Plan ahead this month for smooth sailing.", "This month is great for personal connections.", "Invest in yourself.");
            case "gemini" -> type == 1
                ? List.of("Your words carry weight today.", "Be open to new ideas and perspectives.", "A great conversation will spark inspiration.")
                : List.of("This month is all about communication.", "Your social calendar will be full!", "Focus on personal growth through meaningful connections.");
            case "cancer" -> type == 1
                ? List.of("Trust your instincts today.", "A family member may need your support.", "Take time to recharge emotionally.")
                : List.of("This is a reflective month for you.", "Strengthen bonds with loved ones.", "Home improvements will bring comfort.");
            case "leo" -> type == 1
                ? List.of("Step into the spotlight today!", "Show off your skills; people are watching.", "A burst of creativity will energize you.")
                : List.of("This month is about shining bright.", "Opportunities for leadership will come your way.", "Focus on self-expression and creativity.");
            case "virgo" -> type == 1
                ? List.of("Organize your thoughts and tasks today.", "A detailed approach will pay off.", "Helping others will bring you joy.")
                : List.of("This is your month to get things done.", "Focus on health and routines.", "Efficiency will bring success in all areas.");
            case "libra" -> type == 1
                ? List.of("Balance is key today; avoid extremes.", "A close friend will appreciate your advice.", "Focus on harmony in your relationships.")
                : List.of("This month brings new connections.", "Find balance between work and play.", "Partnerships will thrive under your attention.");
            case "scorpio" -> type == 1
                ? List.of("Embrace change; it will lead to growth.", "Your intuition is spot-on today.", "A mystery will capture your interest.")
                : List.of("This is a transformative month for you.", "Dive deep into your passions.", "Personal growth will be a key theme.");
            case "sagittarius" -> type == 1
                ? List.of("Adventure is calling; answer it!", "Be open to learning something new today.", "A bold move will lead to excitement.")
                : List.of("This month is all about exploration.", "Travel or new hobbies will bring joy.", "Expand your horizons and embrace curiosity.");
            case "capricorn" -> type == 1
                ? List.of("Focus on your long-term goals today.", "Hard work will pay off.", "Stay disciplined; success is within reach.")
                : List.of("This is your month for career growth.", "Opportunities for advancement will appear.", "Stick to your plans, and you'll thrive.");
            case "aquarius" -> type == 1
                ? List.of("Think outside the box today.", "Your creativity will impress others.", "Be a leader in your community.")
                : List.of("This month is about innovation.", "Your ideas will gain recognition.", "Focus on collaboration to achieve big results.");
            case "pisces" -> type == 1
                ? List.of("Let your imagination guide you today.", "Take time to reflect on your dreams.", "Creativity will lead to solutions.")
                : List.of("This is a month for introspection.", "Focus on your emotional well-being.", "Artistic pursuits will bring fulfillment.");
            default -> List.of("Oops, no horoscope available for your sign!");
        };
    
        Random random = new Random();
        return pool.get(random.nextInt(pool.size()));
    }
    
}    
