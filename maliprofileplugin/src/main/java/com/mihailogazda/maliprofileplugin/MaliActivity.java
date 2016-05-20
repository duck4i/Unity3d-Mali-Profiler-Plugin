package com.mihailogazda.maliprofileplugin;

import com.unity3d.player.UnityPlayerNativeActivity;
import android.util.Log;
import android.os.Bundle;

/**
 * Custom activity that loads the plugin first
 * so profiling is available on start.
 */
public class MaliActivity extends UnityPlayerNativeActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        //  Load libraries
        MaliPlugin.Load();

        super.onCreate(savedInstanceState);
    }
}
