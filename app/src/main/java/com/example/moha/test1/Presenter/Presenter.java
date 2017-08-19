package com.example.moha.test1.Presenter;

import com.example.moha.test1.Interfaces.OnDatabaseAccessListener;
import com.example.moha.test1.Interfaces.OnResultFromPresenterListener;
import com.example.moha.test1.Interfaces.OnSubmitFromViewListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by MOHA on 17-Aug-17.
 */

public class Presenter implements OnDatabaseAccessListener,OnSubmitFromViewListener {

    //private DatabaseRepository database;
    private OnDatabaseAccessListener dbAccess;
    private DatabaseReference myRef;
    private OnResultFromPresenterListener onResultFromPresenterListener;

    public void setOnResultFromPresenterListener(OnResultFromPresenterListener onResultFromPresenterListener) {
        this.onResultFromPresenterListener = onResultFromPresenterListener;
    }




    public Presenter() {
       // this.database=new DatabaseRepository();
        //this.onResultFromPresenterListener=view;
        myRef = FirebaseDatabase.getInstance().getReference().child("message/update");
        myRef.addValueEventListener(this);
      //  this.dbAccess=dbAccess;

    }
    public void loadMsg(String s){
        //s=dbAccess.getMsg();
        onResultFromPresenterListener.showMsg(s);

    }

    @Override
    public void OnInsertMsg(String s) {

    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        String s=dataSnapshot.getValue(String.class);
        if(s!=null)
            this.loadMsg(s);




    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }


    @Override
    public void OnSubmitMsg(String s) {
        //System.out.println("midoshString: "+s);
       // this.database.OnInsertMsg(s);
       // s=database.msg;
        //this.view.showMsg(s);
        myRef.setValue(s);

    }



}
