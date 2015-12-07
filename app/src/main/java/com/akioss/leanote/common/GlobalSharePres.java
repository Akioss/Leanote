package com.akioss.leanote.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/*****************************************************************************************************************
 * Author: liyi
 * Create Date: 15/12/2.
 * Package: com.akioss.leanote.common
 * Discription:
 * Version: 1.0
 * ---------------------------------------------------------------------------------------------------------------
 * Modified By:
 * Modified Date:
 * Why & What is modified :
 *****************************************************************************************************************/
@SuppressWarnings("unused")
public class GlobalSharePres {

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    public GlobalSharePres(Context context, String name) {
        mSharedPreferences = context.getSharedPreferences(name,
                Activity.MODE_PRIVATE);
    }

    /**
     * 加载一个String数据
     *
     * @param key 目标数据的key
     * @return 目标数据, 无则返回空字符串
     */
    public String loadString(String key) {
        return mSharedPreferences.getString(key, "");
    }

    /**
     * 加载一个int类型的数据
     *
     * @param key 目标数据的key
     * @return 目标数据, 无则返回-1
     */
    public int loadInt(String key) {
        return mSharedPreferences.getInt(key, -1);
    }

    /**
     * 加载一个long类型的数据
     *
     * @param key 目标数据的key
     * @return 目标数据, 无则返回-1
     */
    public long loadLong(String key) {
        return mSharedPreferences.getLong(key, -1);
    }

    /**
     * 加载一个boolean类型的数据
     *
     * @param key 目标数据的key
     * @return 目标数据, 无则返回false
     */
    public boolean loadBoolean(String key) {
        return mSharedPreferences.getBoolean(key, false);
    }

    /**
     * 加载一个float类型的数据
     *
     * @param key 目标数据的key
     * @return 目标数据, 无则返回-1
     */
    public float loadFloat(String key) {
        return mSharedPreferences.getFloat(key, -1);
    }

    /**
     * 以k-v形式保存一个String数据
     */
    public void saveString(String key, String value) {
        if (mEditor == null) {
            mEditor = mSharedPreferences.edit();
        }

        mEditor.putString(key, value);
        mEditor.apply();
    }

    /**
     * 以k-v保存一个int类型的数据
     */
    public void saveInt(String key, int value) {
        if (mEditor == null) {
            mEditor = mSharedPreferences.edit();
        }

        mEditor.putInt(key, value);
        mEditor.apply();
    }

    /**
     * 以k-v保存一个long类型的数据
     */
    public void saveLong(String key, long value) {
        if (mEditor == null) {
            mEditor = mSharedPreferences.edit();
        }

        mEditor.putLong(key, value);
        mEditor.apply();
    }

    /**
     * 以k-v保存一个boolean类型的数据
     */
    public void saveBoolean(String key, boolean value) {
        if (mEditor == null) {
            mEditor = mSharedPreferences.edit();
        }

        mEditor.putBoolean(key, value);
        mEditor.apply();
    }

    /**
     * 以k-v保存一个float类型的数据
     */
    public void saveFloat(String key, float value) {
        if (mEditor == null) {
            mEditor = mSharedPreferences.edit();
        }

        mEditor.putFloat(key, value);
        mEditor.apply();
    }

    /**
     * 清空数据
     */
    public void clear() {
        if (mEditor == null) {
            mEditor = mSharedPreferences.edit();
        }

        mEditor.clear();
        mEditor.apply();
    }

}
