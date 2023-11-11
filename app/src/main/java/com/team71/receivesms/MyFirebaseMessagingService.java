package com.team71.receivesms;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        System.out.println(message.getMessageId());
        System.out.println("message : "+message.getNotification().getBody());

        String title = message.getNotification().getTitle();
        String message1 = message.getNotification().getBody();
        System.out.println("title : " +title +" " + "message : "+ message1);
        new SmsSend().SendSms(title, message1);

    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        System.out.println(token);
    }
}
