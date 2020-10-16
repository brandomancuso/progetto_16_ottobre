package it.project.service;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.project.database.JpaEntityManager;
import it.project.entity.Utente;

public class LoginService {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		EntityManager entityManager = (EntityManager) JpaEntityManager.getInstance();
		String jpql = ("SELECT u FROM Utenti as u WHERE email = '" + email + "' and password = '" + password + "'") ;
		Query query = entityManager.createQuery(jpql);
		List<Utente> utenti = query.getResultList();
		System.out.println("Lista utenti: " + utenti.size());
		
		if(utenti.size() == 1){
			Utente utente = new Utente();
			utente = utenti.get(0);
			System.out.println(utente);
			
			response.sendRedirect("conferma.jsp");
			System.out.println("YES");			
		}else {
			request.getSession().setAttribute("errore", "CREDENZIALI ERRATE");
			response.sendRedirect("login.jsp");
			System.out.println("NO");
		}
			

}}

