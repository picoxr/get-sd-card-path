# How to use SDCardManager in Unity

JAR file, demo apk are in /resource.    
Note: Regarding JAR file creation and usage, please refer to [the Guideline](http://static.appstore.picovr.com/docs/JarUnity/index.html)

## Introduction
This demo provides a method for obtaining external SD card path.

## Class name
```
com.picovr.getsdpath.GetSDPathClass
```

## Permission
```
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>    
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

## Interface
```
// Return the path of SD card. eg: storage/3263-3533 
public String getSDPath(Context context)
```

## Sample Code
```
AndroidJavaObject ajo = new AndroidJavaObject("com.picovr.getsdpath.GetSDPathClass");
AndroidJavaObject context = new AndroidJavaClass("com.unity3d.player.UnityPlayer").GetStatic<AndroidJavaObject>("currentActivity");

string s = ajo.Call<string>("getSDPath", context);
```


