package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class f7 extends z9 {
    public static void l(nk nkVar) {
        nkVar.finishAffinity();
    }

    public static void m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new h(activity, (byte) 1));
        }
    }

    public static void n(nk nkVar, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                s83.t(hf1.z(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        nkVar.requestPermissions(strArr, i);
    }

    public static void o(nk nkVar, Intent intent, int i, Bundle bundle) {
        nkVar.startActivityForResult(intent, i, bundle);
    }

    public static void p(nk nkVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, Bundle bundle) {
        nkVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, 0, bundle);
    }
}
