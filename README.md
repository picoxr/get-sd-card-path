<p align="right"><a href="https://github.com/PicoSupport/PicoSupport" target="_blank"> <img src="https://github.com/PicoSupport/PicoSupport/blob/master/Assets/home.png" width="20"/> </a></p>

# How the PicoVRSDCardManager is used in Unity

Note: Regarding java package creation and usege, please refer to [the Guideline](https://github.com/PicoSupport/PicoSupport/blob/master/Call%20And%20Export%20Jar.docx)

1. Open Unity, import picovrsdcardmanager_v2.6.0.unitypackage, and open Sphere scene.

2. Create a new Unity project and copy the picovrsdcardmanager_v20170905.jar package in assets into the plugins-> Android directory of Unity project

3. Modify the main activity: the android: name = "com. Picovr. Externalstoragedirectory. SDCardManager"
![](https://github.com/PicoSupport/SDCardManager/blob/master/assets/01.png)

4. Copy the script of picounityactivity.cs into any directory of the Unity project.

5. Call Android interface, string s="";(ref. PicoUnityActivity CallObjectMethod < string >
S, "androidGetSDdir");

6. Package note: the BundleIdentifier of PlayerSetting in Unity should be consistent with the Android project.
