package com.esimtek.weaklock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/7/14 0014.
 */

public class BootCompleteReceiver extends BroadcastReceiver {

    private String TAG = getClass().getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Log.d(TAG, "receive the broadcast of BOOT COMPLETED!");
            Intent bootIntent = new Intent(context, WakeLockService.class);
            context.startService(bootIntent);
        }
    }
}
