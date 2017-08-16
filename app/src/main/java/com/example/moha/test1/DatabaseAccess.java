package com.example.moha.test1;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by MOHA on 14-Aug-17.
 */

public class DatabaseAccess implements ValueEventListener {
    public RemoteModelPresenter rMP;
    public DatabaseReference myRef;
    private FirebaseDatabase database;
    private String path;
    public  Message msg;

    DatabaseAccess(String path,RemoteModelPresenter rMP ) {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference().child(path);
        myRef.addValueEventListener(this);
        this.rMP=rMP;


    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        // This method is called once with the initial value and again
        // whenever data at this location is updated.
        //String value = dataSnapshot.getValue(String.class);
        this.msg= dataSnapshot.getValue(Message.class);
        // rmMsg=value;
        System.out.println("Value is: " + msg.toString() );
        this.rMP.ModelforwordToPresenter(msg.length);

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        // Failed to read value
    }
}
