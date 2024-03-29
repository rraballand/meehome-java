package Ajax.COURRIER.COURRIER_ES.GESTION.AR;

import Ajax.COURRIER.COURRIER_ES.GESTION.ONGLET.Onglet_Courrier_Gestion;
import Models.COURRIER.COURRIER_ES.CourriersDAO;
import Models.TOOLS.Ajaxmodels.TOOLS_HTML;
import Models.TOOLS.Controleur.MegaControleur;
import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.http.*;

//RABALLAND Romain v3.0

public class GetARGestionCourrier extends MegaControleur {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        try {
            
            CourriersDAO courrier = null;
            courrier = creerObjet(request,courrier);
            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            Onglet_Courrier_Gestion.getOnglet(request,out,"AR","GestionSaveAR");
            
            out.println("<div id=save>");
            out.println("</div>"); //FIN save
            
            TOOLS_HTML.getMessage(out,"h2","<br><br>Demande d'accus� de reception :");
            
            if(courrier.TestAccuseReceptionLettre() == 1)
                out.println("<td><input type='checkbox' value='1' name='box' checked></td>");
            else
                out.println("<td><input type='checkbox' value='1' name='box'></td>");
            
            out.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ServletException ex) {
            ex.printStackTrace();
        }
        
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
