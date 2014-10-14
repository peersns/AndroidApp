package com.example.peersns;

import com.tw.twowords.FeedListActivity;
import com.tw.twowords.MainActivity;
import com.tw.twowords.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
		if(checkIfLoggedIn()) {
			Intent intent = new Intent(MainActivity.this, HomeScreenActivity.class);
			startActivity(intent);
			finish();
		}
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_loginBtn = ( Button ) findViewById(R.id.btn_login);

		_loginBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//This is a comment which does no good to your code. Feel free to remove it after you copy paste.
				//When the button is clicked, the control will come to this method.
				//To demonstrate this, let us try changing the label of the Button from 'Login' to 'I am clicked'

				// _loginBtn.setText("I am Clicked");}
				EditText username = ( EditText ) findViewById(R.id.fld_username);
				String usernameValue = username.getText().toString();
				EditText pw = ( EditText ) findViewById(R.id.fld_pwd);
				String pwValue = pw.getText().toString();

				SharedPreferences prefs = getSharedPreferences("twowords", MODE_PRIVATE);
				Editor editor = prefs.edit();
				editor.putString("username",usernameValue);
				editor.putString("pw",pwValue);
				editor.commit();
				Log.d("Codelearn", "username caught - " + prefs.getString("username", null));
				Log.d("Codelearn", "pw caught - " + prefs.getString("pw", null));

				Intent intent = new Intent(MainActivity.this, FeedListActivity.class);
				startActivity(intent);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    /**
     * Check if the user is already logged in on the device
     * @return
     */
	private boolean checkIfLoggedIn(){
		SharedPreferences prefs = getSharedPreferences("peersns", MODE_PRIVATE);
		return prefs.getString("username", null) != null && prefs.getString("pw", null)!= null;
	}
}
