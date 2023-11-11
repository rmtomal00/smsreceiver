package com.team71.receivesms;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class WhatsappReceiver extends BroadcastReceiver {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("com.whatsapp.NOTIFICATION")){
            Notification notification = intent.getParcelableExtra(Notification.EXTRA_TEXT);

            // Extract the notification data from the notification object
            System.out.println(notification);
        }
    }
}
