
/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/3/2018
 * This is a card Class that is used by bank classes which is then used by ATMSystem
 *
 */
public class Card {
String id;
int cash;
String date;
String pw;
	
/**
 * This constructor creates a new card when the paramater are filled
 * @param id
 * @param cash
 * @param pw 
 * @param date
 *
 *
 */
public Card(String id, int cash, String date, String pw)	
{
		
	this.id = id; 	
	this.cash = cash;	
	this.date = date;		
	this.pw = pw;

	
}

/**
 * @return id
 */
public String getId() {
	return id;
}

/**
 * sets id to a new id
 */
public void setId(String id) {
	this.id = id;
}

/**
 * @return cash
 */
public int getCash() {
	return cash;
}

/**
 * sets cash to a new cash value
 */
public void setCash(int cash) {
	this.cash = cash;
}

/**
 * @return date
 */
public String getDate() {
	return date;
}

/**
 * sets date to a new date
 */
public void setDate(String date) {
	this.date = date;
}

/**
 * @return  pw
 */
public String getPw() {
	return pw;
}
/**
 * sets pw to a new pw
 */
public void setPw(String pw) {
	this.pw = pw;
}



}
