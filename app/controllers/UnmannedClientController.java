package controllers;


import javax.inject.Inject;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;


import models.Unmanned;
import play.mvc.Result;
import utils.ConstructResponseUtil;
import utils.ResponseMessage;
import play.mvc.Controller;
import play.mvc.Http;
import play.libs.Json;

public class UnmannedClientController extends Controller{
	private final Unmanned unmanned;
	@Inject
	public UnmannedClientController(Unmanned unmannedd) {
		this.unmanned = unmannedd;
	}
    public  Result unmannnedApi() {
    	System.out.println("in method......");
    
    	JsonNode indents = null;
    	try {
    		indents = unmanned.UnmannedAccess();
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	//return data;
		return ok(ConstructResponseUtil.createSuccessResponsev1(Json.toJson(indents),
				ResponseMessage.TOKEN_FETCH_SUCCESS, true));
    }
    

	public  Result getTare(String bound) {
    	JsonNode indents = null;
    	try {
    		indents = unmanned.GetTare(bound);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	//return data;
		return ok(ConstructResponseUtil.createSuccessResponsev1(Json.toJson(indents),
				ResponseMessage.GET_TARE_WEIGHT_SUCCESS, true));
    }
	
	public  Result getGross(String bound) {
    	JsonNode indents = null;
    	try {
    		indents = unmanned.getGross(bound);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	//return data;
		return ok(ConstructResponseUtil.createSuccessResponsev1(Json.toJson(indents),
				ResponseMessage.GET_GROSS_WEIGHT_SUCCESS, true));
    }
	
	public  Result getToken(String bound) {
    	System.out.println("Token...."+bound);
    	JsonNode indents = null;
    	try {
    		indents = unmanned.getToken(bound);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	//return data;
		return ok(ConstructResponseUtil.createSuccessResponsev1(Json.toJson(indents),
				ResponseMessage.TOKEN_FETCH_SUCCESS, true));
    }
	
	public  Result CreateToken() {
	    JsonNode json = request().body().asJson();
	    System.out.println("JSON......"+json);
    	JsonNode indents = null;
    	try {
    		indents = unmanned.CreateToken(json);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	//return data;
		return ok(ConstructResponseUtil.createSuccessResponsev1(Json.toJson(indents),
				ResponseMessage.TOKEN_FETCH_SUCCESS, true));
    }
	public  Result updateToken() {
		JsonNode json = request().body().asJson();
	    System.out.println("JSON......"+json);
    	JsonNode indents = null;
    	try {
    		indents = unmanned.updateToken(json);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	//return data;
		return ok(ConstructResponseUtil.createSuccessResponsev1(Json.toJson(indents),
				ResponseMessage.TOKEN_FETCH_SUCCESS, true));
    }
}
