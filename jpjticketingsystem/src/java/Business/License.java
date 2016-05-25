package Business;

import Application.Document;


/**
 * @version 1.0
 * @created 21-Apr-2016 09:44:34
 */
public abstract class License implements Document {
	private String expiry;
	private String licenceType;
	private String licenseID;

	public License(){

	}
        
        public License(String id, String exp){
            licenseID = id;
            expiry = exp;
	}
        
        public License(String id, String lt, String exp){
            licenseID = id;
            licenceType = lt;
            expiry = exp;
	}
        
        @Override
        public String getDocID() {
            return licenseID;
        }
        
        @Override
        public String getDocType() {
            return "LICENSE";
        }
        
        public String getLicenseType() {
            return licenceType;
        }
        
        @Override
        public String getDocDate() {
            return expiry;
        }

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param IC
	 * @param name
	 * @param licenseType
	 */
	/*public License(String IC, String name, String licenseType){

	}*/

}