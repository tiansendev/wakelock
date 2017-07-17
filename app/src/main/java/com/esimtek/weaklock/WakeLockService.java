package com.esimtek.weaklock;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.annotation.Nullable;
import android.util.Log;

import static android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;

/**
 * Created by Administrator on 2017/7/14 0014.
 */

public class WakeLockService extends Service {

    private String TAG = getClass().getSimpleName();

    private PowerManager.WakeLock mCpuWakeLock;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.w(TAG, "Service onCreate!");
        acquireWakeLock();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.w(TAG, "Service onStartCommand!");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        releaseWakeLock();
    }

    private void releaseWakeLock() {
        if (null != mCpuWakeLock) {
            mCpuWakeLock.release();
            mCpuWakeLock = null;
        }
    }

    private void acquireWakeLock() {
        if (mCpuWakeLock == null) {
            PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
            mCpuWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, TAG);
            if(mCpuWakeLock !=null) {
                mCpuWakeLock.acquire();
            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
