package com.shankar.library.Tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorRes;
import androidx.cardview.widget.CardView;

import com.shankar.library.R;

public class Toasty {


    private static Toast toast;

    public static void basicToast(Context context, String msg)
    {
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setText(msg);
        toast.show();
    }

    public static void successToast(Context context , String msg)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_layout, null, false);

        ((TextView) view.findViewById(R.id.message)).setText(msg);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.successColor));

        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

    public static void errorToast(Context context , String msg)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_layout, null, false);
        ((TextView) view.findViewById(R.id.message)).setText(msg);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error);
        ((CardView) view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.errorColor));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

    public static void failureToast(Context context , String msg)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_layout, null, false);
        ((TextView) view.findViewById(R.id.message)).setText(msg);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_success);
        ((CardView) view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.errorColor));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

    public static void infoToast(Context context , String msg)
    {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_layout, null, false);
        ((TextView) view.findViewById(R.id.message)).setText(msg);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_info);
        ((CardView) view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(R.color.infoColor));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

    public static void customToast(Context context , String msg , int drawable , @ColorRes int color)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toast_layout, null, false);
        ((TextView) view.findViewById(R.id.message)).setText(msg);
        ((ImageView) view.findViewById(R.id.icon)).setImageResource(drawable);
        ((CardView) view.findViewById(R.id.parent_view)).setCardBackgroundColor(context.getResources().getColor(color));
        if(toast != null)
        {
            toast.cancel();
        }
        toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

}
