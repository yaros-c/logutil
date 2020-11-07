package uk.co.droidy.errorutil

import android.util.Log

const val TAG = "appl"

object LogError {

    fun loge(message: String) {
        Log.e(TAG, message)
    }

}