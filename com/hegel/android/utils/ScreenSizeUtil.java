package com.hegel.android.utils;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;

public class ScreenSizeUtil {
    private final static String TAG = RuntimeExecUtil.class.getSimpleName();

    public static String getRectSize(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Rect outSize = new Rect();
        display.getRectSize(outSize);
        String info = "getRectSize:" + "\n"
                + "top = " + outSize.top + "\n"
                + "bottom = " + outSize.bottom + "\n"
                + "left = " + outSize.left + "\n"
                + "right = " + outSize.right + "\n"
                + "width = " + outSize.width() + "\n"
                + "height = " + outSize.height();
        return info;
    }

    public static String getMetrics(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        String info = "getMetrics:" + "\n"
                + "density = " + outMetrics.density + "\n"
                + "densityDpi = " + outMetrics.densityDpi + "\n"
                + "scaledDensity = " + outMetrics.scaledDensity + "\n"
                + "xdpi = " + outMetrics.xdpi + "\n"
                + "ydpi = " + outMetrics.ydpi + "\n"
                + "widthPixels = " + outMetrics.widthPixels + "\n"
                + "heightPixels = " + outMetrics.heightPixels;
        return info;
    }

    public static String getRealMetrics(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics realMetrics = new DisplayMetrics();
        display.getRealMetrics(realMetrics);
        String info = "getRealMetrics:" + "\n"
                + "density = " + realMetrics.density + "\n"
                + "densityDpi = " + realMetrics.densityDpi + "\n"
                + "scaledDensity = " + realMetrics.scaledDensity + "\n"
                + "xdpi = " + realMetrics.xdpi + "\n"
                + "ydpi = " + realMetrics.ydpi + "\n"
                + "widthPixels = " + realMetrics.widthPixels + "\n"
                + "heightPixels = " + realMetrics.heightPixels;
        return info;
    }

    public static String getSize(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point outPoint = new Point();
        display.getSize(outPoint);
        String info = "getSize:" + "\n"
                + "x = " + outPoint.x + "\n"
                + "y = " + outPoint.y;
        return info;
    }

    public static String getRealSize(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point realPoint = new Point();
        display.getRealSize(realPoint);
        String info = "getRealSize:" + "\n"
                + "x = " + realPoint.x + "\n"
                + "y = " + realPoint.y;
        return info;
    }

}
