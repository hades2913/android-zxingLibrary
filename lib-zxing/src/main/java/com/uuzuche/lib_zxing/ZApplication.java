package com.uuzuche.lib_zxing;

import android.app.Application;
import android.util.DisplayMetrics;

/**
 * Created by aaron on 16/8/9.
 */

public class ZApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化尺寸工具类
         */
        initDisplayOpinion();
    }

    private void initDisplayOpinion() {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        DisplayUtil.density = dm.density;
        DisplayUtil.densityDPI = dm.densityDpi;
        DisplayUtil.screenWidthPx = dm.widthPixels;
        DisplayUtil.screenhightPx = dm.heightPixels;
        DisplayUtil.screenWidthDip = DisplayUtil.px2dip(getApplicationContext(), dm.widthPixels);
        DisplayUtil.screenHightDip = DisplayUtil.px2dip(getApplicationContext(), dm.heightPixels);
    }
    public int startPosition=1;
    public void setStartPosition(int startPosition){
        this.startPosition=startPosition;    
    }
    public int getStartPosition(){
       return this.startPosition;
    }
    public int maxPosition=1;
    public void setMaxPosition(int maxPosition){
        this.maxPosition=maxPosition;
    }
    public int getMaxPosition(){
        return this.maxPosition;
    }
    public String parentActivity="USER";
    public void setParentActivity(String parentActivity){
        this.parentActivity=parentActivity;
    }
    public String getParentActivity(){
        return this.parentActivity;    
    }
}
