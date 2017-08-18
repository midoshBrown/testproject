package com.example.moha.test1.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by MOHA on 17-Aug-17.
 */

public class DatabaseRepository  {
    private DatabaseReference myRef;
    private FirebaseDatabase database;
    public String msg;
    //public ValueEventListener valueEventListener;
    public DatabaseRepository() {
        myRef = FirebaseDatabase.getInstance().getReference().child("message/update");
       // myRef = database.getReference().child("message").child("update");
       // myRef.addValueEventListener(valueEventListener);
    }


}
