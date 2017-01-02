package edu.self.edu_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int clicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeLabel(View view) {
        TextView text = (TextView) findViewById(R.id.myText);

        this.clicked++;

        text.setText("Pushed:" + String.valueOf(this.clicked));
    }
}
