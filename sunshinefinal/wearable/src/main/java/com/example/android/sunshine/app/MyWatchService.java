package com.example.android.sunshine.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyWatchService extends Service {
    public MyWatchService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

        //i thought that i needed this looking at the lesson/tutorial but so far it seems that i
        //might not. be prepared to delete this file
    }
}
