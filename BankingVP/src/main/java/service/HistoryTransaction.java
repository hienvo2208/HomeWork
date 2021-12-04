package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HistoryTransaction {
    private String id;
    private String account;
    private LocalDate date;
    private String content;
    private long money;

    public HistoryTransaction(String account, String content, long money) {
        this.id = Util.generateId(5);
        this.account = account;
        this.date = LocalDate.now();
        this.content = content;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return id + " - " + returnDate(date) +" - " + content + " - " +account + " - " + money;
    }

    public String returnDate(LocalDate date){
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return myFormat.format(date);
    }
}
