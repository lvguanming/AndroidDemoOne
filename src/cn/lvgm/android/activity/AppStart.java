package cn.lvgm.android.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import cn.lvgm.android.R;

public class AppStart extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.appstart);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		//        WindowManager.LayoutParams.FLAG_FULLSCREEN);   //全屏显示
		//Toast.makeText(getApplicationContext(), "孩子！好好背诵！", Toast.LENGTH_LONG).show();
		//overridePendingTransition(R.anim.hyperspace_in, R.anim.hyperspace_out);

		new Handler().postDelayed(new Runnable(){
			@Override
			public void run(){
				Intent intent = new Intent (AppStart.this,Welcome.class);
				startActivity(intent);
				AppStart.this.finish();
			}
		}, 2000);
	}
}