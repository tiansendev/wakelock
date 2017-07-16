package com.esimtek.weaklock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/7/14 0014.
 */

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, intent.getAction(), Toast.LENGTH_LONG).show();
        Log.e("TAG_TIANSEN", "action--->" + intent.getAction());
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Log.w("TAG_TIANSEN","receive the broadcast of BOOT COMPLETED!");
            Intent bootIntent = new Intent(context, BootReceiver.class);
            context.startService(bootIntent);
        }

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            Log.w("TAG_TIANSEN","receive the broadcast of SCREEN OFF!");
            Intent bootIntent = new Intent(context, BootReceiver.class);
            context.startService(bootIntent);
        }

        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            Log.w("TAG_TIANSEN","receive the broadcast of SCREEN ON!");
            Intent bootIntent = new Intent(context, BootReceiver.class);
            context.startService(bootIntent);
        }
    }
}
