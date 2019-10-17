package models;


import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.ImplementedBy;

import models.UnmannedDAO;

@ImplementedBy(UnmannedDAO.class)
public interface Unmanned {
	
	public JsonNode UnmannedAccess();

	public JsonNode GetTare(String bound);
 
	public JsonNode getGross(String bound);

	public JsonNode getToken(String bound);

	
	public JsonNode CreateToken(JsonNode json);

	public JsonNode updateToken(JsonNode json);

	
}
