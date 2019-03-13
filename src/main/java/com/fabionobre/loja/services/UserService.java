package com.fabionobre.loja.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.fabionobre.loja.security.UserSS;

// Recupera usuário logado
public class UserService {
	
	public static UserSS authenticated() {
		try {
			// Retornar usuário logado
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
