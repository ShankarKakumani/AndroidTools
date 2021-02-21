package com.shankar.library.Tools;

import android.app.Activity;
import android.view.View;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class SnackBar extends AppCompatActivity {


    public static void basicSnack(Activity activity, String msg) {

        View parent_view = activity.findViewById(android.R.id.content);

        Snackbar snackbar = Snackbar.make(parent_view, Objects.requireNonNull(msg), 2000);

        snackbar.show();
    }

    public static void snackButton(Activity activity, String msg, String buttonText, @ColorRes int buttonTextColor) {

        View parent_view = activity.findViewById(android.R.id.content);

        Snackbar snackbar = Snackbar.make(parent_view, Objects.requireNonNull(msg), 2000)
                .setActionTextColor(activity.getResources().getColor(buttonTextColor))
                .setAction(buttonText, view -> {
                });
        snackbar.show();
    }

}
