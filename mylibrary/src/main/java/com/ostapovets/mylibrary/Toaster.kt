package com.ostapovets.mylibrary

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        /**
         * Shows [Toast] with duration [Toast.LENGTH_SHORT]
         * @param context
         * @param text - text to be show
         */
        fun showToast(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        }
    }
}