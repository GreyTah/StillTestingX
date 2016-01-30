package m.inschool1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class aMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_main);

        //Schedule button
        Button Schedule = (Button)findViewById(R.id.Schedule);
        Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSchedule = new Intent(aMainActivity.this, bScheduleActivity.class);
                startActivity(toSchedule);
            }
        });

        //Calendar button
        Button Calendar = (Button)findViewById(R.id.Calendar);
        Calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCalendar = new Intent(aMainActivity.this, cCalendarActivity.class);
                startActivity(toCalendar);
            }
        });

        //Faltas button
        Button Faltas = (Button)findViewById(R.id.Faltas);
        Faltas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFaltas = new Intent(aMainActivity.this, dFaltasActivity.class);
                startActivity(toFaltas);
            }
        });

        //Medias button
        Button Medias = (Button)findViewById(R.id.Medias);
        Medias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMedias = new Intent(aMainActivity.this, eMediasActivity.class);
                startActivity(toMedias);
            }
        });

        //Photos button
        Button Photos = (Button)findViewById(R.id.Photos);
        Photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPhotos = new Intent(aMainActivity.this, ePhotosActivity.class);
                startActivity(toPhotos);
            }
        });

        //Settings button
        Button Settings = (Button)findViewById(R.id.Settings);
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSettings = new Intent(aMainActivity.this, gSettingsActivity.class);
                startActivity(toSettings);
            }
        });


    }



}
