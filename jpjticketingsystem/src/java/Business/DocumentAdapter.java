package Business;

/**
 *
 * @author Akmal Irfan
 */
public abstract class DocumentAdapter implements PoliceInterface {
    private final Ticket ticket;
    
    public DocumentAdapter(Ticket ticket) {
        this.ticket = ticket;
    }
    
    @Override
    public String getDocumentID() {
        return ticket.getTicketID();
    }
    
    @Override
    public String getDocumentDate() {
        return ticket.getIssueDate();
    }
    
    @Override
    public double getDocumentAmount() {
        return ticket.getAmount();
    }
}
