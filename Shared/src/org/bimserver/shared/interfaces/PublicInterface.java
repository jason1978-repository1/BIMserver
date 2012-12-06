package org.bimserver.shared.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.bimserver.shared.exceptions.ServerException;
import org.bimserver.shared.exceptions.UserException;

public interface PublicInterface {

	@WebMethod(action = "setToken")
	void setToken(
		@WebParam(name = "token", partName = "setToken.token") String token) throws ServerException, UserException;
	
	@WebMethod(action = "getCurrentToken")
	String getCurrentToken() throws ServerException, UserException;
}