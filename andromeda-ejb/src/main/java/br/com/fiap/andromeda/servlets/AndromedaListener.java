package br.com.fiap.andromeda.servlets;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class AndromedaListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent se) {
		try {
			InitialContext ic = new InitialContext();
			
			se.getSession().setAttribute("userService", ic.lookup("java:module/UserService"));
		} catch(NamingException e) {
			e.printStackTrace();
		}
	}
	public void sessionDestroyed(HttpSessionEvent se) {
		
	}
}
