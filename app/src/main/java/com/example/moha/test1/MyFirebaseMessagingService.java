package com.example.moha.test1;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by MOHA on 12-Aug-17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public MyFirebaseMessagingService() {

    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
           // Log.d("midosh1", "Message data payload: " + remoteMessage.getData());
            System.out.println("midosh1 " + remoteMessage.getData().get("new"));
           // MainActivity.rmMsg =remoteMessage.getData().get("new");


        }

        // Check if message contains a notification payload.
        if (remoteMessage.getNotification() != null) {
           // Log.d("midosh2", "Message Notification Body: " + remoteMessage.getNotification().getBody());
            System.out.println("midosh2 " + remoteMessage.getNotification().getBody());
        }
    }



    @Override
    public void onDeletedMessages() {
        super.onDeletedMessages();
    }
}
