# PicoVRSDCardManager在Unity中的使用方式

1.新建Unity工程，把Demo中的Plugins->Android中的picovrSDCardmanager_v20170905.jar包，拷贝到Unity工程对应的目录下

2.修改主activity：android:name="com.picovr.externalstoragedirectory.SDCardManager"

3.将PicoUnityActivity.cs脚本拷贝到Unity工程任意目录下。

4.调用Android接口，string s=""; PicoUnityActivity.CallObjectMethod<string>(ref
   s,"androidGetSDdir");

5.打包注意:Unity中PlayerSetting的BundleIdentifier要与Android工程保持一致。
