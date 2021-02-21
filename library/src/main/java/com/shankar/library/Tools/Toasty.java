package com.shankar.library.Tools;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorRes;
import androidx.cardview.widget.CardView;

import com.shankar.library.R;

public class Toasty {


    private static Toast toast;


    public static void basicToast(Activity act, String msg)
    {
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(msg);
        toast.show();
    }

    public static void successToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.successColor));

        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void errorToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.errorColor));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void failureToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.errorColor));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void infoToast(Activity act , String msg)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_info);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(R.color.infoColor));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

    public static void customToast(Activity act , String msg , int drawable , @ColorRes int color)
    {
        View custom_view = act.getLayoutInflater().inflate(R.layout.toast_layout, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(msg);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(drawable);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(act.getResources().getColor(color));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(act);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(custom_view);
        toast.show();
    }

}
