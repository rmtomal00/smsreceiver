package com.team71.receivesms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        Object[] pdus = (Object[]) bundle.get("pdus");
        SmsMessage[] messages = new SmsMessage[pdus.length];
        for (int i = 0; i < pdus.length; i++) {
            messages[i] = SmsMessage.createFromPdu((byte[]) pdus[i]);
        }

        // Do something with the SMS message
        String sender = messages[0].getOriginatingAddress();
        String messageBody = messages[0].getMessageBody();
        System.out.println(sender + " " + messageBody);

        Toast.makeText(context, "Tomal " + "senderName: " + sender + " " + "messageBody " + messageBody, Toast.LENGTH_LONG).show();
    }

}
