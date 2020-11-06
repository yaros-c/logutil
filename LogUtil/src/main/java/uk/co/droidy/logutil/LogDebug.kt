package uk.co.droidy.logutil

import android.util.Log

const val TAG = "appl"

object LogDebug {

    fun logd(message: String) {
        Log.d(TAG, message)
    }

}