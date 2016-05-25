package Application;
import Business.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;


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
        
        public static Ticket getTicket(String ic){
            try {
                String host = "jdbc:derby://localhost:1527/jpjticketingsystem";
                String uName = "app";
                String uPass = "a12dp0060";
                Connection con = DriverManager.getConnection(host, uName, uPass);

                Statement stmt = con.createStatement();
                String SQL = "SELECT * FROM TICKET WHERE DRIVER='" + ic + "'";
                ResultSet rs = stmt.executeQuery(SQL);

                rs.next();
                String id = rs.getString("ticketID");
                String it = rs.getString("driver");
                String date = rs.getString("issuedate");
                double amount = Double.parseDouble(rs.getString("amount"));

                return new Ticket(id, it, date, amount);
            } catch(SQLException err) {
                System.out.println(err.getMessage());
            }
            
            return null;
	}
        
	public Ticket[] getAllTickets(){
		return null;
	}
        
        public User getUser(String ic){
            try {
                String host = "jdbc:derby://localhost:1527/jpjticketingsystem";
                String uName = "app";
                String uPass = "a12dp0060";
                Connection con = DriverManager.getConnection(host, uName, uPass);

                Statement stmt = con.createStatement();
                String SQL = "SELECT * FROM DRIVER WHERE IC='" + ic + "'";
                ResultSet rs = stmt.executeQuery(SQL);

                rs.next();
                String name = rs.getString("name");
                String licenseID = rs.getString("license");
                License license = getLicense(licenseID);
                String blackliststatus = rs.getString("blackliststatus");

                return new User(ic, name, license, blackliststatus);
            } catch(SQLException err) {
                System.out.println(err.getMessage());
            }
            
            return null;
	}
        
	public User[] getAllUsers(){
		return null;
	}

	public static User[] getBlacklistedUsers(HttpServletResponse response) throws ServletException, IOException {
            User[] users = new User[10];
            
            try {
                String host = "jdbc:derby://localhost:1527/jpjticketingsystem";
                String uName = "app";
                String uPass = "a12dp0060";
                Connection con = DriverManager.getConnection(host, uName, uPass);
                
                Statement stmt = con.createStatement();
                String SQL = "SELECT * FROM DRIVER WHERE BLACKLISTSTATUS='BLACKLISTED'";
                ResultSet rs = stmt.executeQuery(SQL);
                
                try (PrintWriter out = response.getWriter()) {
                    out.println("<table>");
                    int i = 0;
                    while (rs.next()) {
                        String ic = rs.getString("IC");
                        String name = rs.getString("name");
                        String licenseID = rs.getString("license");
                        License license = getLicense(licenseID);
                        String blackliststatus = rs.getString("blackliststatus");
                        
                        out.println("<tr>");
                        out.println("<td>" + ic + "</td>");
                        out.println("<td>" + name + "</td>");
                        out.println("<td>" + license.getLicenseType() + "</td>");
                        out.println("<td>" + blackliststatus + "</td>");
                        out.println("</tr>");
                        
                        users[i] = new User(ic, name, license, blackliststatus);
                        i++;
                    }
                    out.println("</table>");
                    
                    return users;
                }
            } catch(SQLException err) {
                System.out.println(err.getMessage());
            }
            
            return null;
	}

	public static License getLicense(String id) {
            try {
                String host = "jdbc:derby://localhost:1527/jpjticketingsystem";
                String uName = "app";
                String uPass = "a12dp0060";
                Connection con = DriverManager.getConnection(host, uName, uPass);
                
                Statement stmt = con.createStatement();
                String SQL = "SELECT * FROM LICENSE WHERE licenseID='" + id + "'";
                ResultSet rs = stmt.executeQuery(SQL);
                
                rs.next();
                String licenseID = rs.getString("licenseID");
                String licenseType = rs.getString("licenseType");
                String expiry = rs.getString("expiry");
                
                return new License(licenseID, licenseType, expiry) {};
            } catch(SQLException err) {
                System.out.println(err.getMessage());
            }
            
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
        
        public void createDocument(Document doc) {
            String id = doc.getDocID();
            String doctype = doc.getDocType();
            String date = doc.getDocDate();
            
            try {
                String host = "jdbc:derby://localhost:1527/jpjticketingsystem";
                String uName = "app";
                String uPass = "a12dp0060";
                Connection con = DriverManager.getConnection(host, uName, uPass);
                
                Statement stmt = con.createStatement();
                String SQL = "INSERT INTO " + doctype + " (" + doctype + "ID, EXPIRY) VALUES ('" + id + "','" + date + "')";
                stmt.execute(SQL);
            } catch(SQLException err) {
                System.out.println(err.getMessage());
            }
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