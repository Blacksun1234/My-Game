package com.example.ecous.mygame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements SurfaceHolder.Callback { //

    public GameView(Context context){
        super(context); // pass the super class using that context
        getHolder().addCallback(this); //don't know what this is, ask later to Gary
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int herght){ // no surface to change in this app, so there is nothing in surfaceHolder
    }

    public void surfaceCreated(SurfaceHolder holder){ // creates the surface
        Canvas canvas = holder.lockCanvas(); // calls the canvas and get from the holder and lock it so no one else can write to this
        canvas.drawColor(Color.WHITE); // draw on the canvas a white surface
        Paint paint = new Paint(); // creates a new paint object
        paint.setColor(Color.rgb(250,0,0)); // set the color of the paint object in red
        canvas.drawRect(100,100,200,200,paint); // draw a rectangle on the canvas, this rectangle is using the painting object so it is red
        holder.unlockCanvasAndPost(canvas); // unlock the canvas and post it on the screen
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder){ // no surface to destroy in this app, so there is nothing in surfaceDestroyed
    }
}
