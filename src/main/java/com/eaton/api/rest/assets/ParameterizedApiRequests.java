package com.eaton.api.rest.assets;

import org.json.JSONObject;

import com.eaton.api.rest.common.ApiCallHelper;

import io.restassured.response.ExtractableResponse;

public class ParameterizedApiRequests {
	
	// ***************************************************** //
	// *************     POST REQUESTS      **************** //
	// ***************************************************** //
	
	/**
	 * @param path : the endpoint
	 * @param body : the payload for the API
	 * @param id : incase the API has an ID pararmeter in URI
	 * @return Extractable Api Response
	 */
	public static ExtractableResponse<?> postwithPathParamAndBody(String path, JSONObject body, String id){
		return ApiCallHelper.post(path, body, id);
	}
	
	/**
	 * @param path : the endpoint
	 * @param body : the payload for the API
	 * @return Extractable Api Response
	 */
	public static ExtractableResponse<?> postWithPathAndBody(String path, JSONObject body){
		return ApiCallHelper.post(path, body);
	}
	
	/**
	 * @param path : the endpoint
	 * @param body : null (no body in this post request)
	 * @return Extractable Api Response
	 */
	public static ExtractableResponse<?> postWithPathandNoBody(String path){
		return ApiCallHelper.post(path, null);
	}
	// ***************************************************** //
	// ***************************************************** //
	
	
}
