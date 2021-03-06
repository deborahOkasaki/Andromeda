package com.andromeda.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.andromeda.entity.Comodo;
import com.andromeda.entity.Residencia;
import com.andromeda.service.ManagementService;

@WebServlet(value = "/deleteRes")
public class DeleteResServlet extends HttpServlet{
	private ManagementService resService = new ManagementService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		resService.deleteRes(new Residencia(Integer.parseInt(req.getParameter("delete"))));
		res.sendRedirect("/main");
	}
}
