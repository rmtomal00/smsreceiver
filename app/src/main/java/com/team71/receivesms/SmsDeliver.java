package com.team71.receivesms;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SmsDeliver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        switch (getResultCode()) {
            case Activity.RESULT_OK:
                // SMS was delivered successfully
                Toast.makeText(context, "Deliver", Toast.LENGTH_SHORT).show();
                break;
            case Activity.RESULT_CANCELED:
                // SMS delivery failed
                break;
        }
    }
}
