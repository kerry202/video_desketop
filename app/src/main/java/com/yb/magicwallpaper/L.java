package com.yb.magicwallpaper;

import android.util.Log;

/**
 * @author yangbo
 * @date 2018/2/26
 *
 */
public class L {

    private static final String sTag = "WallPaper";

    public static void d(String msg, Object... params) {

        Log.d(sTag, String.format(msg, params));

    }

}
