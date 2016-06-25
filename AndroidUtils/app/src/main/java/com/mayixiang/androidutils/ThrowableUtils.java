package com.mayixiang.androidutils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by mayixiang on 16/6/25.
 */
public class ThrowableUtils {

    public static String throwableToString(Throwable t) {
        if (t == null)
            return null;

        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
