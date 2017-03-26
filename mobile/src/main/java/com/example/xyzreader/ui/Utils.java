package com.example.xyzreader.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Utility for shared prefs
 */

public class Utils {
    private static final String KEY_ARTICLE_ACTIVITY_LIST_FAB_TRIGGERED
          = "ArticleListActivityFabTriggered";

    private static final String KEY_ARTICLE_HIGHLIGHTED_STATE_PREFIX
          = "ArticleHighlightedStatePrefix";

    public static boolean getFabTriggered(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getBoolean(KEY_ARTICLE_ACTIVITY_LIST_FAB_TRIGGERED,false);
    }

    public static void setFabTriggered(Context context, boolean triggeredState) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(KEY_ARTICLE_ACTIVITY_LIST_FAB_TRIGGERED, triggeredState);
        editor.apply();
    }

    public static boolean getItemHighlightedState(Context context, Long itemId) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        String itemStringId = String.valueOf(itemId);
        String key = KEY_ARTICLE_HIGHLIGHTED_STATE_PREFIX + itemStringId;
        return prefs.getBoolean(key, false);
    }

    public static void switchItemHighlightedState(Context context, Long itemId) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        boolean currentState = getItemHighlightedState(context, itemId);
        boolean switchedStated = !currentState;
        SharedPreferences.Editor editor = prefs.edit();
        String itemStringId = String.valueOf(itemId);
        String key = KEY_ARTICLE_HIGHLIGHTED_STATE_PREFIX + itemStringId;
        editor.putBoolean(key, switchedStated);
        editor.apply();
    }
}
