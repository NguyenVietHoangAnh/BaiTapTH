package vn.edu.csc.example4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {

    EditText edtMessage;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        edtMessage = findViewById(R.id.edtMessage);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main11Activity.this, edtMessage.getText()+"", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
