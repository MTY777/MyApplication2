package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText et_gmail, et_password;
    private TextView tv_vhod, tv_zaregi, tv_vypol, tv_zpassword, tv_nagats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.ic_btnd);
        et_gmail = findViewById(R.id.email_text);
        et_password = findViewById(R.id.tablegg);
        tv_nagats = findViewById(R.id.ic_textti);
        tv_vhod = findViewById(R.id.ic_vhod);
        tv_vypol = findViewById(R.id.ic_texxxt);
        tv_zaregi = findViewById(R.id.ic_regi);
        tv_zpassword = findViewById(R.id.ic_textview);

        et_gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_gmail.getText().toString().isEmpty()){
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }else{
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_password.getText().toString().isEmpty()){
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                }else{
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_gmail.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")){
                    btn.setVisibility(view.GONE);
                    et_gmail.setVisibility(view.GONE);
                    et_password.setVisibility(view.GONE);
                    tv_nagats.setVisibility(view.GONE);
                    tv_vhod.setVisibility(view.GONE);
                    tv_vypol.setVisibility(view.GONE);
                    tv_zpassword.setVisibility(view.GONE);
                    tv_zaregi.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно вошли",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }


}