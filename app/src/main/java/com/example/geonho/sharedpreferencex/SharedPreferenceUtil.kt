package com.example.geonho.sharedpreferencex

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceUtil {

    fun getData(context : Context, key : String) : String { //요건 저장한걸 불러오는 부분
        //sharedPreference 객체를 가져와서
        var sharedPreferences : SharedPreferences = context.getSharedPreferences("test",Context.MODE_PRIVATE)
        return sharedPreferences.getString(key,"")
        // key에 해당되는 스트링 값을 찾아서 바로 리턴
        //defValue = 키에 해당되는 값이 없을 경우 리턴 값
    }

    fun saveData(context: Context, key : String, value : String) { // 요건 저장하는 부분
        var sharedPreferences : SharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE)
        //해당 SharedPreference 객체를 수정하기 위해서 SharedPreferences.Editor 객체를 소환!
        var editor : SharedPreferences.Editor = sharedPreferences.edit()
        //에디터에다가 키 밸류 넣어서 스트링 put함
        editor.putString(key, value)
        //마지막으로 변경사항을 적용
        editor.commit()
    }

    fun deleteData(context : Context, key : String) { //요건 삭제하는건데 이번 예제에서는 귀찮아서 안쓸거야
        //SharedPreferences 객체를 가져오는 부분
        var sharedPreferences : SharedPreferences = context.getSharedPreferences("test", Context.MODE_PRIVATE)
        //마찬가지로 수정을 위해 SharedPreferences.Editor 객체를 가져옴
        var editor : SharedPreferences.Editor = sharedPreferences.edit()
        //key에 해당되는 값을 삭제
        editor.remove(key)
        //변경사항을 적용
        editor.commit()
    }
}