package barberiapelofino;
import java.time.LocalDate;

public class ClsSchedules {
    private int Schedules;
    private LocalDate start_date;
    private LocalDate end_date;

    public ClsSchedules() {
    }

    public ClsSchedules(int Schedules, LocalDate start_date, LocalDate end_date) {
        this.Schedules = Schedules;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getSchedules() {
        return Schedules;
    }

    public void setSchedules(int Schedules) {
        this.Schedules = Schedules;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
}
