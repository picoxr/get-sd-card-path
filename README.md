# PicoVRSDCardManager在Unity中的使用方式

1.打开Unity，导入PicovrSDCardmanager_v2.6.0.unitypackage，打开Sphere场景。

2.新建Unity工程，把Demo中的Plugins->Android中的picovrSDCardmanager_v20170905.jar包，拷贝到Unity工程对应的目录下

3.修改主activity：android:name="com.picovr.externalstoragedirectory.SDCardManager"
![](https://github.com/PicoSupport/SDCardManager/blob/master/assets/01.png)

4.将PicoUnityActivity.cs脚本拷贝到Unity工程任意目录下。

5.调用Android接口，string s=""; PicoUnityActivity.CallObjectMethod<string>(ref
   s,"androidGetSDdir");

6.打包注意:Unity中PlayerSetting的BundleIdentifier要与Android工程保持一致。
