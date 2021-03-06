package com.eaton.easdr.api.assertionStatements;

public class Assertion {

	// ******************* STATUS LINE ************************ //
	public static final String ALL_OK_LINE = "HTTP/1.1 200 OK";
	public static final String NOT_FOUND_LINE = "HTTP/1.1 404 Not Found";
	public static final String BAD_REQUEST_LINE = "HTTP/1.1 400 Bad Request";
	public static final String UNAUTHORIZED_LINE = "HTTP/1.1 401 Unauthorized";
	// ******************************************************** //

	// ********************** P1 ASSERTIONS STATEMENTS ***************** //
	// ***************************************************************** //
	public final String P1_BLANK_CLIENT = "The ClientId field is required.";
	public final String P1_BLANK_SECRET = "The secret field is required";
	public final String P1_INVALID_UUID = "The field 'ClientId' is not a valid uuid.";
	public final String P1_INVALID_ID_SECRET_COMB = "Authorization has been denied for this request. Invalid clientId and clientSecret combination.";

	public static String invalidAccount(String accountID) {
		return ("Service account " + accountID + " not found in Mongo for environment ADOPTER1001");
	}
	// ***************************************************************** //
	// ***************************************************************** //
}
