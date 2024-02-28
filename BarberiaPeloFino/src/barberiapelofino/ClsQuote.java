package barberiapelofino;

public class ClsQuote {
   private int id_quote, id_barber, id_schedule;
   private boolean state;

    public ClsQuote() {
    }

    public ClsQuote(int id_quote, int id_barber, int id_schedule, boolean state) {
        this.id_quote = id_quote;
        this.id_barber = id_barber;
        this.id_schedule = id_schedule;
        this.state = state;
    }

    public int getId_quote() {
        return id_quote;
    }

    public void setId_quote(int id_quote) {
        this.id_quote = id_quote;
    }

    public int getId_barber() {
        return id_barber;
    }

    public void setId_barber(int id_barber) {
        this.id_barber = id_barber;
    }

    public int getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
