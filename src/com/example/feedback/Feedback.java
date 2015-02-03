package com.example.feedback;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;

public class Feedback  {
	
	
	
	private EditText name;
	private EditText age;
	private EditText phno;
	private EditText feedbackbox;
	private RatingBar ratingbar1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);
		
		
		name = (EditText) findViewById(R.id.username);
		
		age = (EditText) findViewById(R.id.age);
		phno = (EditText) findViewById(R.id.phno);
		feedbackbox = (EditText) findViewById(R.id.feedbackbox);
		String un= getIntent().getExtras().getString("username");
		name.setText(un);
		
		
		
		
		
	}

	

}
