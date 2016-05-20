package com.mihailogazda.maliprofileplugin;

import com.unity3d.player.UnityPlayer;
import android.util.Log;

/**
 * Loader for MaliPlugin
 */
public class MaliPlugin
{
    /*
     *  Loads Mali Debugger Library on device
     */
    public static void Load()
    {
        try
        {
            System.loadLibrary("MGD");
            Log.i("[ MGD ]", "libMGD.so was loaded successfully");
        }
        catch( UnsatisfiedLinkError e)
        {
            Log.i("[ MGD ]", "libMGD.so not loaded.");
        }
    }
}
