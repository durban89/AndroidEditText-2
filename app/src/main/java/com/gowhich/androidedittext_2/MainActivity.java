package com.gowhich.androidedittext_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) this.findViewById(R.id.edit1);
        button = (Button) this.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = editText.getText().toString();
                if(val == null || val.trim().equals("")){
                    editText.setError("请输入内容");
                    return;
                }
            }
        });
    }
}
