// Generated 12 mars 2007 23:20:24 by Hibernate Tools 3.2.0.b9
package fr.alliance.docalliance.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Pdf generated by hbm2java
 */
public class Pdf extends AbstractTO {
	
	public final static Integer TYPE_PAYE = new Integer(0);
	public final static Integer TYPE_NEWS_LETTER = new Integer(1);
	public final static Integer TYPE_AUTRES = new Integer(2);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8226887185069334490L;

	private int idPdf;
	private String nom;
	private String serveur;
	private String absolutPath;
	private Boolean send;
	private Integer section;
	private Set mails = new HashSet(0);

	public Pdf() {
		super();
	}


    public static int InterpreteTypeFile(String typeFile){
    	if(typeFile.equals("PAYE")){
    		return Pdf.TYPE_PAYE;
    	}
    	else{
    		if(typeFile.equals("NEWSLETTER")){
    			return Pdf.TYPE_NEWS_LETTER;
    		}
    		else{
    			return Pdf.TYPE_AUTRES;
    		}
    	}
    }
	
	public int getIdPdf() {
		return this.idPdf;
	}

	public void setIdPdf(int idPdf) {
		this.idPdf = idPdf;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getServeur() {
		return this.serveur;
	}

	public void setServeur(String serveur) {
		this.serveur = serveur;
	}

	public String getAbsolutPath() {
		return this.absolutPath;
	}

	public void setAbsolutPath(String absolutPath) {
		this.absolutPath = absolutPath;
	}

	public Boolean getSend() {
		return this.send;
	}

	public void setSend(Boolean send) {
		this.send = send;
	}

	public Integer getSection() {
		return this.section;
	}

	public void setSection(Integer section) {
		this.section = section;
	}

	public Set getMails() {
		return mails;
	}

	public void setMails(Set mails) {
		this.mails = mails;
	}
}