package com.example.testlearn;

import android.content.Context;

public class ResourceComparer {
    boolean isEqual(Context context, int resId, String string){
        return context.getString(resId)==string;
    }
}
