package com.picovr.getsdpath;

import android.content.Context;
import android.util.Log;

public class GetSDPathClass {
    private static final String TAG = "GetSDPathClass";

    /**
     * @return The path of SD card. eg: storage/3263-3533 */
    public String getSDPath(Context context) {
        String path = Externalstoragedirectory.getSDdir(context);
        Log.e(TAG, "getSDPath: " + path);
        return path;
    }
}
