package br.com.fiap.andromeda.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/main")
public class SessionServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String username = req.getParameter("username"); 
	  req.setAttribute("username", username);
	  
	  RequestDispatcher dispacher = req.getRequestDispatcher("/abas/main.jsp");
      dispacher.forward(req, resp);
  }
}
