package barberiapelofino;

public class ClsCustomers extends ClsUsers{
    private int id_quote;

    public ClsCustomers() {
    }

    public ClsCustomers(int id_quote) {
        this.id_quote = id_quote;
    }

    public ClsCustomers(int id_quote, int id, String username, String password, String first_name, String last_name, String email, String phone, boolean state) {
        super(id, username, password, first_name, last_name, email, phone, state);
        this.id_quote = id_quote;
    }

    public int getId_quote() {
        return id_quote;
    }

    public void setId_quote(int id_quote) {
        this.id_quote = id_quote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
