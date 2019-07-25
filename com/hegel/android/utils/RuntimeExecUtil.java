package com.hegel.android.utils;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RuntimeExecUtil {
    private final static String TAG = RuntimeExecUtil.class.getSimpleName();

    public static void execCommand(String command) {
        Process process = null;
        String result = "";
        try {
            process = Runtime.getRuntime().exec(command);
            InputStreamReader mInputStreamReader = new InputStreamReader(process.getInputStream());
            BufferedReader mBufferedReader = new BufferedReader(mInputStreamReader);
            result = mBufferedReader.readLine();
            mBufferedReader.close();
            mInputStreamReader.close();
            process.waitFor();
            if (process.exitValue() != 0) {
                Log.e(TAG, "execCommand (" + command + ") fail.");
            } else {
                Log.d(TAG, "execCommand (" + command + ") success.");
            }
            Log.d(TAG, "execCommand result is: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void execCommandArray(String[] cmdArray) {
        Process process = null;
        String result = "";
        try {
            process = Runtime.getRuntime().exec(cmdArray);
            InputStreamReader mInputStreamReader = new InputStreamReader(process.getInputStream());
            BufferedReader mBufferedReader = new BufferedReader(mInputStreamReader);
            String line = null;
            while ((line = mBufferedReader.readLine()) != null) {
                result += line;
            }
            mBufferedReader.close();
            mInputStreamReader.close();
            process.waitFor();
            if (process.exitValue() != 0) {
                Log.e(TAG, "execCommandArray " + Arrays.toString(cmdArray) + " fail.");
            } else {
                Log.d(TAG, "execCommandArray " + Arrays.toString(cmdArray) + " success.");
            }
            Log.d(TAG, "execCommandArray result is: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
