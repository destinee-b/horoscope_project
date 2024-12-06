public class DailyHoroscope extends Horoscope {
    public void fetchFromAPI(String sign) {
        // if API was working, this would be uncommented amd would call the API to get the daily horoscope

        // HoroscopeAPI api = new HoroscopeAPI();
        // api.fetchHoroscope(sign, "today", this);

        setMessage(Horoscope.randomMessage(sign, 1)); // assuming 1 represents "daily"
    }
}
