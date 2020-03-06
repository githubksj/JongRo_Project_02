package com.study.kim.project_02

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences (context: Context){

    private val defaultInt = 0

    private val instances: SharedPreferences by lazy{
        context.getSharedPreferences("pref", Context.MODE_PRIVATE)
    }

    // sharedPreferences를 셋팅(저장)하는 함수.
    public fun setInt(key: String, value: Int){
        instances.edit().putInt(key, value).apply()
    }

    // sharedPreferences를 얻어오는 함수.
    public fun getInt(key: String) : Int{
        return instances.getInt(key, defaultInt)
    }

    // sharedPreferences를 지우는 함수.
    public fun clearInt(){
        instances.edit().clear().apply()
    }
}