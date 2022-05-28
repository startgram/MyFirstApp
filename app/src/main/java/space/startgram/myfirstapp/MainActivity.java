package space.startgram.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button eventOne;
    Button eventTwo;
    Button eventThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventOne = findViewById(R.id.btnOne);
        eventTwo = findViewById(R.id.btnTwo);
        eventThree = findViewById(R.id.btnThree);

        //Event One
        eventOne.setOnClickListener(view -> {
            Intent intent = new Intent(this, EventOneActivity.class);
            startActivity(intent);
        });


    }
}