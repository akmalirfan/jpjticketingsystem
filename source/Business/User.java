package Business;


/**
 * @author iman
 * @version 1.0
 * @created 21-Apr-2016 09:44:43
 */
public class User {

	private string blackliststatus;
	private string IC;
	private License license;
	private string name;
	private Ticket[] ticket;
	private Vehicle[] vehicle;
	public Vehicle m_Vehicle;
	public Ticket m_Ticket;
	public License m_License;

	public User(){

	}

	public void finalize() throws Throwable {

	}

	public string getBlacklistStatus(){
		return "";
	}

}