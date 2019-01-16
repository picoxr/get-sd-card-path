# How to use SDCardManager in Unity

Note: Regarding JAR file creation and usage, please refer to [the Guideline](https://github.com/PicoSupport/PicoSupport/blob/master/How_to_use_JAR_file_in_Unity_project_on_Pico_device.docx)

## Introduction
this project provides two methods for obtaining SD card path.

## Class name
android: name = "com.Picovr.Externalstoragedirectory.SDCardManager"

## Permission
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

## Interface
String getSDdir(Context mContext)
String getPath() (if the methon above, you can try this)
