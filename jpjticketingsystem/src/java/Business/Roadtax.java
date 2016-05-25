package Business;

import Application.Document;


/**
 * @version 1.0
 * @created 21-Apr-2016 09:44:38
 */
public abstract class Roadtax implements Document {
	private String expiry;
	private String roadtaxID;

	public Roadtax(){

	}
        
        public Roadtax(String id, String date){
            roadtaxID = id;
            expiry = date;
	}
        
        @Override
        public String getDocID() {
            return roadtaxID;
        }
        
        @Override
        public String getDocType() {
            return "ROADTAX";
        }
        
        @Override
        public String getDocDate() {
            return expiry;
        }

	public void finalize() throws Throwable {

	}

}