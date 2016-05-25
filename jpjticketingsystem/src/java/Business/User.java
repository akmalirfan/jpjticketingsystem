package Business;


/**
 * @author iman
 * @version 1.0
 * @created 21-Apr-2016 09:44:43
 */
public class User {

	private String blackliststatus;
	private String IC;
	private License license;
	private String name;
	//private Ticket[] ticket;
	//private Vehicle[] vehicle;
	//public Vehicle m_Vehicle;
	//public Ticket m_Ticket;
	public License m_License;

	public User(){
            
	}
        
        public User(String ic, String n, License l, String bl){
            IC = ic;
            name = n;
            license = l;
            blackliststatus = bl;
	}

	public void finalize() throws Throwable {

	}

	public String getBlacklistStatus(){
		return "";
	}

}