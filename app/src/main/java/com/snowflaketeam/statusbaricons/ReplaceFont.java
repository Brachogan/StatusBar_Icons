package com.snowflaketeam.statusbaricons;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by Mohammed on 7/11/2015.
 * to Replace the entire for of the App
 */
public class ReplaceFont {

    public static void setDefaultFont(Context context, String nameOfFontBeingReplace, String nameOfDesiredFont) {
        final Typeface typeface = Typeface.createFromAsset(context.getAssets(), nameOfDesiredFont);
        replaceFont(nameOfFontBeingReplace, typeface);

    }

    private static void replaceFont(String nameOfFontBeingReplace, final Typeface typeface) {
        try {
            final Field field = Typeface.class.getDeclaredField(nameOfFontBeingReplace);
            field.setAccessible(true);
            field.set(null, typeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}