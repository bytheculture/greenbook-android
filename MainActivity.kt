package com.example.greenbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    EditText emailAddress = (EditText)findViewById(R.id.emailAddressEntry);
    EditText password = (EditText)findViewById(R.id.passwordEntrytext);
    Button facebook = (Button)findViewById(R.id.facebookbtn);
    Button google = (Button)findViewById(R.id.googlebtn)

    public void login( View view) {
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            //Opens Page
        }

        else{
            //Doesn't open Page
        }

        facebook.setOnClickListener(new View.onClickListener()){
            public void onClick(View v){
                callbackManager = CallbackManager.Factory.create();
                loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                    }
                }
                        google.setOnClickListener(new View.onClickListener()){
                    public void onClick(View v){
                        callbackManager = CallbackManager.Factory.create();
                        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
                            @Override
                            public void onSuccess(LoginResult loginResult) {
                                // App code
                            }

                            @Override
                            public void onCancel() {
                                // App code
                            }

                            @Override
                            public void onError(FacebookException exception) {
                            }
                        }
            }
        }
    }


}
