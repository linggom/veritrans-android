package com.midtrans.sdk.corekit.utilities;

import android.content.Context;

import com.midtrans.sdk.corekit.base.callback.MidtransCallback;

public class Validation {

    private static final String TAG = "Validation";

    public static <T> Boolean isValidForNetworkCall(Context context, MidtransCallback<T> callback) {
        if (context == null) {
            Logger.error(TAG, Constants.MESSAGE_ERROR_MISSING_CONTEXT);
        }

        if (callback == null) {
            Logger.error(TAG, Constants.MESSAGE_ERROR_CALLBACK_UNIMPLEMENTED);
            return false;
        }

        if (!isNetworkAvailable(context)) {
            callback.onFailed(new Throwable(Constants.MESSAGE_ERROR_FAILED_TO_CONNECT_TO_SERVER));
            return false;
        } else {
            return true;
        }
    }

    /**
     * Open utils for checking network status
     *
     * @return boolean based on network status
     */
    public static boolean isNetworkAvailable(Context context) {
        return NetworkHelper.isNetworkAvailable(context);
    }
}