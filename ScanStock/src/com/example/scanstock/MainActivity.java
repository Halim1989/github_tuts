package com.example.scanstock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends TracerActivity {

	private Button goSecondeAct;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		goSecondeAct = (Button) findViewById(R.id.button1);
	}

	public void goSecondAct(View v) {
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
}
