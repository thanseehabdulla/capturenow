package com.example.capturenow;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.IBinder;

import static com.example.capturenow.MainActivity.*;

public class LocationService extends Service {
    AppLocationService appLocationService;

    public LocationService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO do something useful
        fetchLocation();
        return Service.START_NOT_STICKY;
    }

    private void fetchLocation() {
//        Location gpsLocation = appLocationService
//                .getLocation(LocationManager.GPS_PROVIDER);

    }




    @Override
    public IBinder onBind(Intent intent) {
        //TODO for communication return IBinder implementation
        return null;
    }
}
