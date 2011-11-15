// Generated 12 mars 2007 23:20:24 by Hibernate Tools 3.2.0.b9
package fr.alliance.docalliance.model;

/**
 * DestinatairesId generated by hbm2java
 */
public class DestinataireId extends AbstractTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3377301798136843787L;

	private int idAdresseMail;

	private int idMail;

	public DestinataireId() {
		super();
	}

	public int getIdAdresseMail() {
		return this.idAdresseMail;
	}

	public void setIdAdresseMail(int idAdresseMail) {
		this.idAdresseMail = idAdresseMail;
	}

	public int getIdMail() {
		return this.idMail;
	}

	public void setIdMail(int idMail) {
		this.idMail = idMail;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DestinataireId))
			return false;
		DestinataireId castOther = (DestinataireId) other;

		return (this.getIdAdresseMail() == castOther.getIdAdresseMail())
				&& (this.getIdMail() == castOther.getIdMail());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdAdresseMail();
		result = 37 * result + this.getIdMail();
		return result;
	}
}