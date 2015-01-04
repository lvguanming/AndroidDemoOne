package cn.lvgm.android.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import cn.lvgm.android.R;

public class Login extends Activity {

    private EditText usernameEditText; // 帐号编辑框
    private EditText passwordEditText; // 密码编辑框

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usernameEditText = (EditText)findViewById(R.id.login_user_edit);
        passwordEditText = (EditText)findViewById(R.id.login_passwd_edit);
    }


    public void login(View view) {
        if("abc".equals(usernameEditText.getText().toString()) && "123".equals(passwordEditText.getText().toString()))   //判断 帐号和密码
        {
            Intent intent = new Intent();
            intent.setClass(Login.this,LoadingActivity.class);
            startActivity(intent);
//            Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
        }
        else if("".equals(usernameEditText.getText().toString()) || "".equals(passwordEditText.getText().toString()))   //判断 帐号和密码
        {
            new AlertDialog.Builder(Login.this)
                    .setIcon(getResources().getDrawable(R.drawable.login_error_icon))
                    .setTitle(R.string.login_error_title)
                    .setMessage(R.string.login_error_message)
                    .create().show();
        }
        else{

            new AlertDialog.Builder(Login.this)
                    .setIcon(getResources().getDrawable(R.drawable.login_error_icon))
                    .setTitle(R.string.login_faild_title)
                    .setMessage(R.string.login_faild_message)
                    .create().show();
        }

        //登录按钮
    	/*
      	Intent intent = new Intent();
		intent.setClass(Login.this,Whatsnew.class);
		startActivity(intent);
		Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
		this.finish();*/
    }


    public void loginBack(View v) {     //标题栏 返回按钮
        this.finish();
    }
    public void forgetPassword(View v) {     //忘记密码按钮
        Uri uri = Uri.parse("http://3g.qq.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        //Intent intent = new Intent();
        //intent.setClass(Login.this,Whatsnew.class);
        //startActivity(intent);
    }

}
