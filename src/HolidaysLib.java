import java.util.Objects;

public class HolidaysLib {
    private Holiday[] holidays;

    public HolidaysLib(Holiday[] holidays) {
        this.holidays = holidays;
    }

    public Holiday[] getHolidays() {
        return this.holidays;
    }

    public void getHoliday(String date) {
        for(int i =0; i< holidays.length; i++) {
            if(Objects.equals(holidays[i].getDate(), date)){
                System.out.println(holidays[i].getDate() + " => " + holidays[i].getName());
                return;
            }
        }

        System.out.println("Não existe feriado na data de " + date);
    }
}
