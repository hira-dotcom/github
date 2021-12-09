package com;

import android.content.Context;
import android.widget.Toast;

public class testerClass {
    private static void testerexample(Context c,String msg){
        Toast.makeText(c, "this msg from library"+msg, Toast.LENGTH_SHORT).show();
    }
}
