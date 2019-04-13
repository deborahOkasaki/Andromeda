package br.com.fiap.andromeda.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.andromeda.ejb.UserService;
import br.com.fiap.andromeda.entity.Usuario;

@WebServlet(value = "/index")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  RequestDispatcher dispacher = req.getRequestDispatcher("/abas/main.jsp");
      dispacher.forward(req, resp);
  }
  
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  //req.setAttribute("username", req.getParameter("username"));
	  
	  UserService userService = (UserService) req.getSession().getAttribute("userService");
	  String username = req.getParameter("username");
	  String password = req.getParameter("password");
	  
	  
	  boolean isUserValid = userService.autenticate(username, password);
	  if(isUserValid == true) {
		  res.sendRedirect("/andromeda-ejb/main");
//		  req.setAttribute("username", username);
//		  RequestDispatcher dispatcher = req.getRequestDispatcher("/abas/main.jsp");
//	      dispatcher.forward(req, resp);
	  } else {
		  req.setAttribute("erro", "Usuário ou senha inválidos! Tente novamente.");
		  RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
	      dispatcher.forward(req, res);
	  }
  }
}
