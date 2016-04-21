package Middleware;
import Business.*;


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
	public License getLicense(String IC){
		return null;
	}

	/**
	 * 
	 * @param plateID
	 */
	public Roadtax getRoadtax(String plateID){
		return null;
	}

	/**
	 * 
	 * @param IC
	 */
	public Ticket[] getTickets(String IC){
		return null;
	}

	/**
	 * 
	 * @param IC
	 */
	public Vehicle[] getVehicles(String IC){
		return null;
	}

	/**
	 * 
	 * @param license
	 */
	public void storeLicense(License license){

	}

	/**
	 * 
	 * @param roadtaxID
	 */
	public void updateRoadtax(String roadtaxID){

	}

	/**
	 * 
	 * @param ticketID
	 */
	public void updateTicket(String ticketID){

	}

}