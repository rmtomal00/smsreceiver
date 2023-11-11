package com.team71.receivesms;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

public class SmsSend {

    private Context context;


    public void SendSms(String number, String msgBody){
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(number, null, msgBody, null, null);
        System.out.println("send");
    }
}
