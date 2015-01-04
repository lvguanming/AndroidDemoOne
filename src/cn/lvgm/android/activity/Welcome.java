package cn.lvgm.android.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import cn.lvgm.android.R;

public class Welcome extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }

    public void welcomeRegister(View view){
        Intent intent = new Intent();
        intent.setClass(Welcome.this, MainView.class);
        startActivity(intent);
    }

    public void welcomeLogin(View view){
        Intent intent = new Intent();
        intent.setClass(Welcome.this, Login.class);
        startActivity(intent);
    }

}
