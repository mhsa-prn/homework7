package edu.shariaty.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button about, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about = (Button) findViewById(R.id.about);
        contact=(Button) findViewById(R.id.contact);

        //about button listener
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        //contact button listener
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContact();
            }
        });
    }

    //open about activity
    public void openAbout() {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);

    }

    //open contact activity
    public void openContact() {
        Intent intent = new Intent(this, contact.class);
        startActivity(intent);

    }
}


