package com.eaton.easdr.api.assertionStatements;

public class assertionStatements {

		// ********************** P1 ASSERTIONS STATEMENTS ***************** //
		// ***************************************************************** //
		final String P1_BLANK_CLIENT = "The ClientId field is required.";
		final String P1_BLANK_SECRET = "The secret field is required";
		final String P1_INVALID_UUID = "The field 'ClientId' is not a valid uuid.";
		final String P1_INVALID_ID_SECRET_COMB = "Authorization has been denied for this request. Invalid clientId and clientSecret combination.";
		public static String invalidAccount(String accountID) {
			return ("Service account " + accountID + " not found in Mongo for environment ADOPTER1001");
		}
		// ***************************************************************** //
		// ***************************************************************** //
}
