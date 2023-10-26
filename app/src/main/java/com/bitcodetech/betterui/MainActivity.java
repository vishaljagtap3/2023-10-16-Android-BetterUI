package com.bitcodetech.betterui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    private ImageView imgLogo;
    private TextView txtWelcomeMessage;
    private EditText edtWelcomeMessage;
    private Button btnSetMessage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        imgLogo = findViewById(R.id.imgLogo);
        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);
        edtWelcomeMessage = findViewById(R.id.edtWelcomeMessage);
        btnSetMessage = findViewById(R.id.btnSetMessage);

        btnSetMessage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txtWelcomeMessage.setText(edtWelcomeMessage.getText().toString());
                    }
                }
        );

    }
}
