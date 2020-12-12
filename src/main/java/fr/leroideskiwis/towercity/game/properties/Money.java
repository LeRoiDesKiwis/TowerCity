package fr.leroideskiwis.towercity.game.properties;

public class Money {

    private int money;

    public Money(int money) {
        this.money = money;
    }

    public void credit(Money money){
        this.money += money.money;
    }

    public void debit(Money money){
        this.money -= money.money;
    }

    public boolean canDebit(Money money){
        return money.money >= this.money;
    }

    @Override
    public String toString() {
        return Integer.toString(money);
    }
}
