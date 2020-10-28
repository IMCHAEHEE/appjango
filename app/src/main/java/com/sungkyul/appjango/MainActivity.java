package com.sungkyul.appjango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ACTIVITY_LC", "onCreate 호출됨");
        Toast.makeText(getApplicationContext(),"onCreate 호출됨",Toast.LENGTH_SHORT).show();

        Button button = (Button) findViewById(R.id.setting);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SettingsActivity.class);
                intent.putExtra("message", "반갑습니다.");
                startActivity(intent);
            }
        });
    }

}