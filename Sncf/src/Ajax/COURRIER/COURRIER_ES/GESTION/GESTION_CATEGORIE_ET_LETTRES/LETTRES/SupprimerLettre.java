package Ajax.COURRIER.COURRIER_ES.GESTION.GESTION_CATEGORIE_ET_LETTRES.LETTRES;

import Models.COURRIER.COURRIER_ES.CourriersDAO;
import Models.TOOLS.Ajaxmodels.OBJETS.ButtonDAO;
import Models.TOOLS.Ajaxmodels.TOOLS_HTML;
import Models.TOOLS.Controleur.MegaControleur;
import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

//RABALLAND Romain v3.0

public class SupprimerLettre extends MegaControleur {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {

            CourriersDAO courrier = null;
            courrier = creerObjet(request, courrier);
            
            courrier.Delete(request.getParameter("code"),"codeLettre","lettres");
            retourVue(request,response,"/GestionCategorieAjout");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        out.close();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
