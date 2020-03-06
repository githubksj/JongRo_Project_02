package com.study.kim.project_02

class X_PreferenceMgr {
    //    private var context: Context
//    private var prefName: String
    private var likeNo: String = ""
    private var dislikeNo: String = ""

    //    val PREF_LIKE_COUNT = "likeNo"
//    val PREF_DISLIKE_COUNT = "dislikeNo"
    enum class PrefName {
        Test
    }

    companion object {

        var mapPreferMgr = HashMap<String, X_PreferenceMgr>()

        fun getInstance(likeNo: String, dislikeNo: String): X_PreferenceMgr {
            var preferUtil: X_PreferenceMgr?
            preferUtil = mapPreferMgr[String.toString()]
            if (preferUtil == null) {
                preferUtil = X_PreferenceMgr(likeNo, dislikeNo)
            }
            return preferUtil
        }
    }

    constructor(likeNo: String, dislikeNo: String) {
        this.likeNo = likeNo
        this.dislikeNo = dislikeNo
    }
}
/*
    fun getString(key: String): String {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getString(key, "")
    }

    fun getString(key: String, value: String): String? {
        try {
            return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getString(key, value)
        } catch (e: Exception) {

            return value
        }
    }

    fun setString(key: String, value: String): Boolean {
        var string = value
        if (string.isNullOrEmpty()) string = ""
        var pref: SharedPreferences?
        pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val editor = pref!!.edit()
        editor.putString(key, string)
        return editor.commit()
    }

    fun getInt(key: String): Int {

        try {
            return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getInt(key, 0)
        } catch (e: Exception) {
            return 0
        }
    }

    fun setInt(key: String, value: Int): Boolean {

        var pref: SharedPreferences?
        pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val editor = pref!!.edit()
        editor.putInt(key, value)
        return editor.commit()
    }

    fun getLong(key: String): Long {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getLong(key, 0.toLong())
    }

    fun setLong(key: String, value: Long): Boolean {

        var pref: SharedPreferences
        pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putLong(key, value)
        return editor.commit()
    }

    fun getFloat(key: String): Float {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getFloat(key, 0.0f)
    }

    fun setFloat(key: String, value: Float): Boolean {

        var pref: SharedPreferences
        pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putFloat(key, value)
        return editor.commit()
    }

    fun getBoolean(key: String): Boolean {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getBoolean(key, false)
    }

    fun getBoolean(key: String, defValue: Boolean): Boolean {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getBoolean(key, defValue)
    }

    fun setBoolean(key: String, value: Boolean): Boolean {

        var pref: SharedPreferences
        pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean(key, value)
        return editor.commit()
    }

    fun getEditor(): SharedPreferences.Editor? {
        var prefEditor: SharedPreferences.Editor? = null

        val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        if (pref != null) {
            prefEditor = pref.edit()
        }

        return prefEditor
    }

    fun setStringArrayPref(key: String, values: ArrayList<String>): Boolean {

        var pref: SharedPreferences?
        pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
        var editor = pref.edit()
        var a = JSONArray()
        for (i in 0 until values.size) {
            a.put(values[i])
        }
        if (!values.isEmpty()) {
            editor.putString(key, a.toString())
        } else {
            editor.putString(key, null)
        }
        return editor.commit()
    }

    var prefs = PreferenceManager.getDefaultSharedPreferences(context)
    var editor = prefs.edit()
    var a = JSONArray()
    for (i in 0 until values.size) {
        a.put(values[i])
    }
    if (!values.isEmpty()) {
        editor.putString(key, a.toString())
    } else {
        editor.putString(key, null)
    }
    editor.apply()
     }

    fun getStringArrayPref(key: String): ArrayList<String> {
        val json = context.getSharedPreferences(prefName, Context.MODE_PRIVATE).getString(key, "")
        val urls = ArrayList<String>()
        if (json != null) {
            try {
                val a = JSONArray(json)
                for (i in 0 until a.length()) {
                    val url = a.optString(i)
                    urls.add(url)
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }

        }
        return urls

        fun reset() {
            var pref: SharedPreferences
            pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            val editor = pref.edit()
            editor.clear()
            editor.commit()
        }

    }
}
*/