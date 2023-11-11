package com.team71.receivesms;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

public class SmsSendListener extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (getResultCode()) {
            case Activity.RESULT_OK:
                // SMS was sent successfully
                Toast.makeText(context, "SEND_MESSAGE", Toast.LENGTH_SHORT);
                System.out.println("send");
                break;
            case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                // Generic failure
                System.out.println("failure");
                Toast.makeText(context, "Fail", Toast.LENGTH_SHORT);
                break;
            case SmsManager.RESULT_ERROR_NO_SERVICE:
                // No service
                Toast.makeText(context, "No Service", Toast.LENGTH_SHORT);
                System.out.println("No Service");
                break;
            case SmsManager.RESULT_ERROR_NULL_PDU:
                // Null PDU
                break;
            case SmsManager.RESULT_ERROR_RADIO_OFF:
                // Radio off
                break;
        }
    }
}
