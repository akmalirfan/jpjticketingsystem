package Business;


/**
 * @author iman
 * @version 1.0
 * @created 21-Apr-2016 09:44:40
 */
public class Ticket {
        private String ticketID;
        private String issuedTo;
	private String issuedate;
        private double amount;

	public Ticket(){

	}
        
        public Ticket(String id, String it, String date, double amt) {
            ticketID = id;
            issuedTo = it;
            issuedate = date;
            amount = amt;
        }
        
        public String getTicketID() {
            return ticketID;
        }
        
        public String getIssuedTo() {
            return issuedTo;
        }
        
        public String getIssueDate() {
            return issuedate;
        }
        
        public double getAmount() {
            return amount;
        }

	public void finalize() throws Throwable {

	}

}