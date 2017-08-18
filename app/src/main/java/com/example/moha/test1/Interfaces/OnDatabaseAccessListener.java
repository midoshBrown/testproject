package com.example.moha.test1.Interfaces;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by MOHA on 17-Aug-17.
 */

public interface OnDatabaseAccessListener extends ValueEventListener {

    void OnInsertMsg(String s);
    void onDataChange(DataSnapshot dataSnapshot);
    void onCancelled(DatabaseError databaseError);
   // String getMsg();
}
