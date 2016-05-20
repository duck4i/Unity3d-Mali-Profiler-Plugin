using UnityEngine;
using System.Collections;

namespace Plugins.MALI
{
	/// <summary>
	/// Mali profiler plugin class
	/// </summary>
	public static class MaliProfilerPlugin
	{
		/// <summary>
		/// Loads Mali Profiler Library 
		/// </summary>
		public static void Load()
		{
#if UNITY_ANDROID
			using (var pluginClass = new AndroidJavaClass("com.mihailogazda.maliprofileplugin.MaliPlugin"))
			{
				pluginClass.CallStatic("Load");
			}
#else
			Debug.Log("Cannot load Mali profiler on non-android platforms.");
#endif
		}
	}

}