package com.yyx.frame2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.yyx.framing.frame4.SwitchButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SwitchButton switchButton = (SwitchButton) findViewById(R.id.switch_button);
		SwitchButton switchButton1 = (SwitchButton) findViewById(R.id.switchButton);
		SwitchButton switchButton2 = (SwitchButton) findViewById(R.id.switchButton1);
		SwitchButton switchButton3 = (SwitchButton) findViewById(R.id.switchButton2);
		SwitchButton switchButton4 = (SwitchButton) findViewById(R.id.switchButton3);

		switchButton.setChecked(true);
		switchButton.isChecked();
		switchButton.toggle();     //switch state
		switchButton.toggle(false);//switch without animation
		switchButton.setShadowEffect(true);//disable shadow effect
		switchButton.setEnabled(false);//disable button
		switchButton.setEnableEffect(false);//disable the switch animation
		switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(SwitchButton view, boolean isChecked) {
				//TODO do your job
			}
		});
		switchButton1.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(SwitchButton view, boolean isChecked) {
				//TODO do your job
				if(isChecked==true){
					startActivity(new Intent(MainActivity.this, com.yyx.frame2.sample.MainActivity.class));
				}
			}
		});
		switchButton2.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(SwitchButton view, boolean isChecked) {
				//TODO do your job
				if(isChecked==true){
					startActivity(new Intent(MainActivity.this, com.yyx.frame2.buttonstyle.MainActivity.class));
				}
			}
		});
		switchButton3.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(SwitchButton view, boolean isChecked) {
				//TODO do your job
				if(isChecked==true){
					startActivity(new Intent(MainActivity.this, com.yyx.frame2.example.MainActivity.class));
				}
			}
		});
		switchButton4.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(SwitchButton view, boolean isChecked) {
				//TODO do your job
				if(isChecked==true){
					startActivity(new Intent(MainActivity.this, com.yyx.frame2.discrollview.MainActivity.class));
				}
			}
		});
	}
}
