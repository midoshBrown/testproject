package com.example.moha.test1;

/**
 * Created by MOHA on 16-Aug-17.
 */

public class Presenter implements RemoteModelPresenter,RemotePresenterView {
    public RemotePresenterView rPV;

    public Presenter(RemotePresenterView rPV) {
        this.rPV=rPV;
        DatabaseAccess db=new DatabaseAccess("message",this);
    }

    @Override
    public void ModelforwordToPresenter(String s) {
        this.rPV.UpdateMyTextView(s);

    }

    @Override
    public void UpdateMyTextView(String s) {


    }
}
