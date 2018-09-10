package sample.android.com.explicitintenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView  tvName, tvRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvName = findViewById(R.id.tvNameId);
        tvRoll = findViewById(R.id.tvRollId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){

            String name = bundle.getString("name");
            int roll = bundle.getInt("roll");


            tvName.setText(name);
            tvRoll.setText(roll + "");

        }

    }
}
