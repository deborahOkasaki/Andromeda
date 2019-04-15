package com.andromeda.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andromeda.entity.Comodo;
import com.andromeda.entity.Residencia;
import com.andromeda.service.ManagementService;

@WebServlet(value = "/main")
public class SessionServlet extends HttpServlet{
	private ManagementService service = new ManagementService();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		//Get user info and res list from login
		req.getSession().getAttribute("user");
		req.getSession().getAttribute("res");
		req.getSession().getAttribute("com");
		
		//Get update info during the session
		req.setAttribute("listRes", service.retrieveRes());
		req.getAttribute("listRes");
		
		req.setAttribute("listCom", service.retrieveCom());
		req.getAttribute("listCom");
		
		req.getRequestDispatcher("/abas/main.jsp").forward(req, res);
	}
}
