using UnityEngine;
using System.Collections;

public class ExampleScene : MonoBehaviour
{

	// Use this for initialization
	void Start()
	{
		//	Load
		Debug.Log("Loading MALI plugin");
		Plugins.MALI.MaliProfilerPlugin.Load();
	}

	// Update is called once per frame
	void Update()
	{

	}
}
