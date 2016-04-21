package Middleware;


/**
 * @author iman
 * @version 1.0
 * @created 21-Apr-2016 09:45:09
 */
public class mainDB {

	public mainDB(){

	}

	public void finalize() throws Throwable {

	}

	public Ticket[] getAllTickets(){
		return null;
	}

	public User[] getAllUsers(){
		return null;
	}

	public User[] getBlacklistedUsers(){
		return null;
	}

	/**
	 * 
	 * @param IC
	 */
	public License getLicense(string IC){
		return null;
	}

	/**
	 * 
	 * @param plateID
	 */
	public Roadtax getRoadtax(string plateID){
		return null;
	}

	/**
	 * 
	 * @param IC
	 */
	public Ticket[] getTickets(string IC){
		return null;
	}

	/**
	 * 
	 * @param IC
	 */
	public Vehicle[] getVehicles(string IC){
		return null;
	}

	/**
	 * 
	 * @param license
	 */
	public storeLicense(License license){

	}

	/**
	 * 
	 * @param roadtaxID
	 */
	public updateRoadtax(string roadtaxID){

	}

	/**
	 * 
	 * @param ticketID
	 */
	public updateTicket(string ticketID){

	}

}