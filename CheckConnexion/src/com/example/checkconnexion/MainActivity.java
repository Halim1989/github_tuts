package com.example.checkconnexion;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends ActionBarActivity {

	private WifiManager wifiManager;
	private Switch wifiStatus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wifiStatus = (Switch) findViewById(R.id.wifiStatus);
		wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);

	}

	@Override
	protected void onResume() {
		super.onResume();
		wifiStatus.setChecked(wifiManager.isWifiEnabled());
	}

	public void changeConnexionStatus(View v) {
		wifiStatus.setChecked(!wifiManager.isWifiEnabled());
		wifiManager.setWifiEnabled(!wifiManager.isWifiEnabled());

	}

}
