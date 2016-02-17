package edu.fje.daw2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javaBeans.Dado;
import javaBeans.Persona;

@WebServlet(urlPatterns = {"/creaPersona"})
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String ruta ="/vista.jsp";
        HttpSession session = request.getSession();
        
//        Persona p = new Persona();
//        p.setNom(request.getParameter("nom"));
//        //if (p.getNom().equals("")) ruta = "/error.jsp";
//        session.setAttribute("p", p);
//        RequestDispatcher rd= request.getRequestDispatcher(ruta);
//        rd.forward(request, resp);
        

        
        
        //Dado dado2 = new Dado();
        //dado2.getNumero();
        //dado2.setNumero(Integer.parseInt(req.getParameter("numero")));
        //session.setAttribute("dado2", dado2);
        RequestDispatcher rd= request.getRequestDispatcher(ruta);
        rd.forward(request, resp);
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
      String ruta ="/vista.jsp";
      HttpSession session = request.getSession();

//      Jugador j = new Jugador();
//      j.setNom(req.getParameter("nom"));
//      session.setAttribute("jugador", j);
//      RequestDispatcher rd= req.getRequestDispatcher(ruta);
//      rd.forward(req, res);
      
       Dado dado1 = new Dado();
       dado1.getNumero();
       session.setAttribute("numero", dado1);
       RequestDispatcher rd= request.getRequestDispatcher(ruta);
       rd.forward(request, response);
    //id = req.getParameter("realname");
    //password = req.getParameter("mypassword");
}
}
