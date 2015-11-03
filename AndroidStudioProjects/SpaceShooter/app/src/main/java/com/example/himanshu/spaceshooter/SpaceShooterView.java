package com.example.himanshu.spaceshooter;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by himanshu on 30/9/15.
 */
public class SpaceShooterView  extends SurfaceView implements SurfaceHolder.Callback{

    public SpaceShooterView(Context context) {
        super(context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
