package app.command;

public class Command {
    private String date;
    private String currency;

    public Command(String date, String currency) {
        this.date = date;
        this.currency = currency;
    }

    public String getComamnd() {
        return "http://api.nbp.pl/api/exchangerates/rates/A/" + currency + "/" + date + "/today/";
    }
}
