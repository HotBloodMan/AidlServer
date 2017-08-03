package com.ljt.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

    private IPerson.Stub iPerson=new IPersonImpl();
    public MyService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return iPerson;
    }
}
