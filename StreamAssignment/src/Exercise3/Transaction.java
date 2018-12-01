package Exercise3;

public class Transaction {
Trader Trader;
int year;
int value;
public Transaction(Exercise3.Trader trader, int year, int value) {
	super();
	Trader = trader;
	this.year = year;
	this.value = value;
}
public Trader getTrader() {
	return Trader;
}
public void setTrader(Trader trader) {
	Trader = trader;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}

}
