package com.shankar.library.Tools;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import java.util.Objects;

public class Keyboard {

    public static void hideKeyboard(Activity activity)
    {
        try {
            InputMethodManager imm = (InputMethodManager) activity.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            //imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
            assert imm != null;
            //imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY,0);
            imm.hideSoftInputFromWindow(Objects.requireNonNull(activity.getCurrentFocus()).getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void showKeyboard(Activity activity)
//    {
//        try {
//            InputMethodManager imm = (InputMethodManager) activity.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//            assert imm != null;
//            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
