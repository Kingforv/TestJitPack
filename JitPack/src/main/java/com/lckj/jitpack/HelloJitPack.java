package com.lckj.jitpack;

import android.content.Context;
import android.widget.Toast;

public class HelloJitPack {

    /**
     * @author King
     * @param context 上下文
     * */
    public static void hello(Context context){
        Toast.makeText(context, "你好", Toast.LENGTH_SHORT).show();
    }
}
