package sample.android.com.explicitintenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText etRollNumber, etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRollNumber = findViewById(R.id.numberId);
        etName = findViewById(R.id.nameId);
    }

    public void goSecondScreen(View view) {

        int roll = Integer.parseInt(etRollNumber.getText().toString());

        String name = etName.getText().toString();

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra("roll", roll);
        intent.putExtra("name", name);

        startActivity(intent);
    }
}
