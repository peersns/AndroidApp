package com.example.peersns;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private Button _loginButton;
	private SharedPreferences dataStore;
    private OnClickListener _loginClickListener;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//dataStore = getSharedPreferences("peersns", MODE_PRIVATE);
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		Intent intent = new Intent(MainActivity.this, LoginHandlerActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
//
//	public void loginSave() {
//		_loginButton = (Button) findViewById(R.id.btn_login);
//		_loginClickListener = new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				String usernameValue;
//				String passwordValue;
//				//Extract Username and password based on the view id
//				EditText username = (EditText) findViewById(R.id.fld_username);
//				if (username != null) {
//					usernameValue = username.getText().toString();
//				} else {
//					//throw exception
//				}
//
//				EditText password = (EditText) findViewById(R.id.fld_pwd);
//				if (password != null) {
//					passwordValue = password.getText().toString();
//				} else {
//					//throw exception
//				}
//
//				// Save the username and password into the shared preference
//				//SharedPreferences prefs = getSharedPreferences("peersns", MODE_PRIVATE);
//				Editor editor = dataStore.edit();
//				editor.putString("username", usernameValue);
//				editor.putString("password", passwordValue);
//				editor.commit();
//				Log.d("Peersns", "username caught - " + dataStore.getString("username", null));
//				Log.d("Peersns", "password caught - " + dataStore.getString("password", null));
//
//				startThisActivity();
//			}
//		};
//		_loginButton.setOnClickListener(_loginClickListener);
//	}
//
//	private void startThisActivity() {
//		Intent intent = new Intent(MainActivity.this, FeedListActivity.class);
//		startActivity(intent);
//	}
//	/**
//	 * Check if the user is already logged in on the device
//	 * @return
//	 */
//	private boolean checkIfLoggedIn(){
//		SharedPreferences prefs = getSharedPreferences("peersns", MODE_PRIVATE);
//		return prefs.getString("username", null) != null && prefs.getString("pw", null)!= null;
//	}
}
