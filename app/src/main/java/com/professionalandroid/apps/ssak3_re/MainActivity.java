package com.professionalandroid.apps.ssak3_re;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    ImageButton Ibutton;
    Button Sbutton;
    Button Cbutton;
    Button Mbutton;
    Button email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("on","onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Ibutton = (ImageButton)findViewById(R.id.Information);
        Ibutton.setOnClickListener(this);
        Sbutton = (Button)findViewById(R.id.Search);
        Sbutton.setOnClickListener(this);
        Cbutton = (Button)findViewById(R.id.Calender);
        Cbutton.setOnClickListener(this);
        Mbutton = (Button)findViewById(R.id.Memo);
        Mbutton.setOnClickListener(this);
        email = (Button)findViewById(R.id.suggestion);
        email.setOnClickListener(this);






    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("on","onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("on","onCreate");
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("on","onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("on","onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("on","onPausee");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Information : Intent Iintent = new Intent(MainActivity.this, Information.class); startActivity(Iintent); break;
            case R.id.Search : Intent Sintent = new Intent(MainActivity.this, Search.class); startActivity(Sintent);break;
            case R.id.Calender : Intent Cintent = new Intent(MainActivity.this, Calender.class); startActivity(Cintent);break;
            case R.id.Memo : Intent Mintent = new Intent(MainActivity.this, Memo.class); startActivity(Mintent);break;


        }
        if(v.getId() ==R.id.suggestion ) {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.setType("plain/text");
            String[] address = {"SSAK3_RE_Team@address.com"};
            email.putExtra(Intent.EXTRA_EMAIL, address);
            email.putExtra(Intent.EXTRA_SUBJECT, "문의 제목");
            email.putExtra(Intent.EXTRA_TEXT, "문의 내용과 관련 없는 욕설을 할 경우 사용에 제한이 있습니다.");
            startActivity(email);
        }
    }
}