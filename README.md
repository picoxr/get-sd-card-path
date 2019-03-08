# How to use SDCardManager in Unity

Note: Regarding JAR file creation and usage, please refer to [the Guideline](https://github.com/picoxr/support/blob/master/How%20to%20Use%20JAR%20file%20in%20Unity%20project%20on%20Pico%20Device.docx)

## Introduction
this project provides two methods for obtaining SD card path.

## Class name
```
android: name = "com.Picovr.Externalstoragedirectory.SDCardManager"
```

## Permission
```
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
```

## Interface
```
String getSDdir(Context mContext)<br>
String getPath() (if the methon above, you can try this)
```
