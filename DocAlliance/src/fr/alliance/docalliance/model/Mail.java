// Generated 12 mars 2007 23:20:24 by Hibernate Tools 3.2.0.b9
package fr.alliance.docalliance.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Mail generated by hbm2java
 */
public class Mail extends AbstractTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7464828304189757262L;

	private int idMail;
	private AdresseMail adresseMail;
	private Pdf pdf;
	private String sujet;
	private String contenu;
	private Date dateExpedition;
	private Set destinataires = new HashSet(0);

	public Mail() {
		super();
	}

	public int getIdMail() {
		return this.idMail;
	}

	public void setIdMail(int idMail) {
		this.idMail = idMail;
	}

	public String getSujet() {
		return this.sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDateExpedition() {
		return this.dateExpedition;
	}

	public void setDateExpedition(Date dateExpedition) {
		this.dateExpedition = dateExpedition;
	}

	public AdresseMail getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(AdresseMail adresseMail) {
		this.adresseMail = adresseMail;
	}

	public Set getDestinataires() {
		return destinataires;
	}

	public void setDestinataires(Set destinataires) {
		this.destinataires = destinataires;
	}

	public Pdf getPdf() {
		return pdf;
	}

	public void setPdf(Pdf pdf) {
		this.pdf = pdf;
	}
}