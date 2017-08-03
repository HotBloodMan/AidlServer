package com.ljt.aidlserver;

import android.os.IBinder;
import android.os.RemoteException;

/**
 * Created by 1 on 2017/8/3.
 */

public class IPersonImpl extends IPerson.Stub {

    private int age;
    private String name;
    @Override
    public void setAge(int age) throws RemoteException {
        this.age=age;
    }
    @Override
    public void setName(String name) throws RemoteException {
        this.name=name;
    }
    @Override
    public String display() throws RemoteException {
        return "name="+name+";age="+age;
    }
}
