package com.example.dell.firebaseandroidpoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        textView = (TextView) findViewById(R.id.textview_sample);
        mref = new Firebase("https://fir-poc-cf52a.firebaseio.com/conditions");
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String data = dataSnapshot.getValue(String.class);
                textView.setText(data);


            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
