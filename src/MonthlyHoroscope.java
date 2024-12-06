public class MonthlyHoroscope extends Horoscope {
    public void fetchFromAPI(String sign) {
        // if API was working, this would be uncommented amd would call the API to get the monthly horoscope

        // HoroscopeAPI api = new HoroscopeAPI();
        // api.fetchHoroscope(sign, "monthly", this);

        setMessage(Horoscope.randomMessage(sign, 30)); // Assuming 30 represents the monthly period
    }
}
