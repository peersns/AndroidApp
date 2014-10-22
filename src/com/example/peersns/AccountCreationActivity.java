package com.example.peersns;

import com.example.peersns.models.UserAccount;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class AccountCreationActivity extends Activity {
	private Button _createAccountButton;
	private SharedPreferences dataStore;
    private OnClickListener _createAccountButtonListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		dataStore = getSharedPreferences("peersns", MODE_PRIVATE);
		//store this in preferences
//Parse.initialize here
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		accountCreation();
	}
	
	public void accountCreation() {
		_createAccountButton = (Button) findViewById(R.id.btn_create_account);
		//UserAccount userAccount;

		_createAccountButtonListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {

				} catch (InvalidParamException ipe) {
					//Take appropriate action
				}
				
				// Save the username and password into the shared preference
				//SharedPreferences prefs = getSharedPreferences("peersns", MODE_PRIVATE);
				Editor editor = dataStore.edit();
				
				editor.putString("username", usernameValue);
				editor.putString("password", passwordValue);
				editor.commit();


				startNextActivity();
			}
		};
		_createAccountButton.setOnClickListener(_createAccountButtonListener);
	}

	private void startNextActivity() {
		Intent intent = new Intent(AccountCreationActivity.this, HomeScreenActivity.class);
		startActivity(intent);
		finish();
	}
	/**
	 * Check if the user is already logged in on the device
	 * @return
	 */
	private boolean checkIfLoggedIn(){
		SharedPreferences prefs = getSharedPreferences("peersns", MODE_PRIVATE);
		return prefs.getString("username", null) != null && prefs.getString("pw", null)!= null;
	}
	
	private void createAccount() {
		//EditText username = (EditText) findViewById(R.id.fld_username);
		
		UserAccount userAccount = new UserAccount.UserAccountBuilder()
          .setFirstName(((EditText) findViewById(R.id.fld_firstName)).getText().toString())
          .setLastName(((EditText) findViewById(R.id.fld_lastName)).getText().toString())
          .setEmail(((EditText) findViewById(R.id.fld_email)).getText().toString())
          .setPassword(((EditText) findViewById(R.id.fld_password)).getText().toString())
          .setZip(new Integer(((EditText) findViewById(R.id.fld_zip)).getText().toString()))
        //  .setCity(((EditText) findViewById(R.id.fld_city)).getText().toString())
        //  .setPhone(new Integer(((EditText) findViewById(R.id.fld_phone)).getText().toString()))
        //  .setAddress(((EditText) findViewById(R.id.fld_address)).getText().toString())
        //  .setState(((EditText) findViewById(R.id.fld_state)).getText().toString())
        //  .setCountry(((EditText) findViewById(R.id.fld_country)).getText().toString())
          .build();								  //.setEmail((EditText) findViewById(R.id.fld_lastName))
		userAccount.saveInBackground();

	}
}
