package com.udacity.gradle.builditbigger.test;

import android.test.AndroidTestCase;
import android.util.Log;

import com.udacity.gradle.builditbigger.MyAsyncTask;

/**
 * Created by 1 on 23.07.2018.
 */

public class NotNullResponseTest  extends AndroidTestCase {

    private static final String TAG = "NotNullResponseTest";

    @SuppressWarnings("unchecked")
    public void runTest() {
        String result = null;
        MyAsyncTask endpointsAsyncTask = new MyAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(TAG, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
