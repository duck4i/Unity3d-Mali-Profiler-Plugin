# Unity3d Plugin for Mali GPU Debugger

This is a simple one call Unit3D plugin that loads Mali GPU debugger library on supported devices.

No need for rooting your device, custom activities or AndroidManifest.xml modification.

### Usage

Just a simple C# call is all that is needed.

```cs

Plugins.MALI.MaliProfilerPlugin.Load();

```

### Get the plugin

Latest release: @TODO


#### Alternative: Custom activity

As an alternative, if you dont want modify your C# code (or already have a exported Android build) you can modify your AndroidManifest.xml and replace com.unity3d.player.UnityPlayerActivity with Mali plugin activity like in example bellow.

This will also load neccessary libary, just before the  Unity3D is started.


Replace:
```xml
<activity android:name="com.unity3d.player.UnityPlayerActivity" android:label="@string/app_name">
  	<intent-filter>
  		<action android:name="android.intent.action.MAIN" />
  		<category android:name="android.intent.category.LAUNCHER" />
  	</intent-filter>
	<meta-data android:name="unityplayer.UnityActivity" android:value="true" />
</activity>
```

With:

```xml
<activity android:name="com.mihailogazda.maliprofileplugin.MaliActivity" android:label="@string/app_name">
  	<intent-filter>
  		<action android:name="android.intent.action.MAIN" />
  		<category android:name="android.intent.category.LAUNCHER" />
  	</intent-filter>
	<meta-data android:name="unityplayer.UnityActivity" android:value="true" />
</activity>
```


