package com.example.feedback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Feedback extends Login {
	
	private EditText name;
	private EditText age;
	private EditText phno;
	private EditText feedbackbox;
	private CheckBox check;
	private RatingBar ratingbar1;
	private Button send;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);
		
		name = (EditText) findViewById(R.id.name);
		age = (EditText) findViewById(R.id.age);
		phno = (EditText) findViewById(R.id.phno);
		feedbackbox = (EditText) findViewById(R.id.feedbackbox);
		String un= getIntent().getExtras().getString("username").toString();
		name.setText(un);
		Log.e("Login",un);
		check= (CheckBox) findViewById(R.id.checkfeedback);
		feedbackbox.setEnabled(false);
		feedbackbox.setInputType(InputType.TYPE_NULL);
		feedbackbox.setFocusable(false);
		send = (Button) findViewById(R.id.send);
		
		OnCheckedChangeListener listener = new OnCheckedChangeListener() {

			@Override
		       public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
				
				if(isChecked)
				{
					feedbackbox.setEnabled(true);
					feedbackbox.setInputType(InputType.TYPE_CLASS_TEXT);
					feedbackbox.setFocusable(true);
				}
				else
				{
					feedbackbox.setEnabled(false);
					feedbackbox.setInputType(InputType.TYPE_NULL);
					feedbackbox.setFocusable(false);
				}
			}	
			
		};	
		check.setOnCheckedChangeListener(listener);
		
		OnClickListener listener2 = new OnClickListener() {

			@Override
			public void onClick(View x) {
				
				Intent exit = new Intent(getApplicationContext(),Exit.class);
				exit.putExtra("name",(name.getText().toString()));
				exit.putExtra("age",(age.getText().toString()));
				exit.putExtra("num",(phno.getText().toString()));
				exit.putExtra("feedback",(feedbackbox.getText().toString()));
				exit.putExtra("rating",(name.getText().toString()));
				startActivity(exit);
						
						//Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
						//startActivity(i); 
				
			
			}	
			
		};	
		
		
	}

	

}
