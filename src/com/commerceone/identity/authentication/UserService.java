package com.commerceone.identity.authentication;

import com.commerceone.identity.Login;

public class UserService {
	
	
	public boolean isValid ( Login login) {
		//Acessar o repository 
		//storedUser = repository.findByLogin(login)		
		Login storedUser = new Login ("Bisso" , "CaracaMaluco"); 
		return login.equals( storedUser );
	}

}
