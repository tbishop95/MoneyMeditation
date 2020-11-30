package com.example.moneymeditaion2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.moneymeditaion2.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Profile extends AppCompatActivity {
    TextView fullName, email, dob;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        fullName = findViewById(R.id.userName);
        email = findViewById(R.id.userEmail);
        dob = findViewById(R.id.userDOB);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        userId = fAuth.getCurrentUser().getUid();

        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                email.setText(documentSnapshot.getString("Email"));
                fullName.setText(documentSnapshot.getString("Name"));
                dob.setText(documentSnapshot.getString("DOB"));
            }
        });


    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut(); //logout current user
        startActivity(new Intent(getApplicationContext(), com.example.moneymeditaion2.MainActivity.class));
    }

    public void menu(View view) {
        startActivity(new Intent(getApplicationContext(),LessonsActivity.class));
        finish();
    }
}