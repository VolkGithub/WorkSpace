package com.example.simple;

import org.xutils.x;

import android.app.Application;
import android.content.Context;

/**
 * For developer startup JPush SDK
 * 
 * 一般建议在自定义 Application 类里初始化。也可以在主 Activity 里。
 */
public class MyApplication extends Application {

	/** 对外提供整个应用生命周期的Context **/
	private static Context instance;
    @Override
    public void onCreate() {    	     
         super.onCreate();
         instance = this;
         x.Ext.init(this);
         x.Ext.setDebug(false); 
    }
    
    /**
	 * 对外提供Application Context
	 * 
	 * @return
	 */
    
    //上下文
	public static Context getContext() {
		return instance;
	}
}
