package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.job.JobParameters;
import android.content.ClipData;
import android.content.Context;
import android.icu.text.DecimalFormatSymbols;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.Selection;
import android.text.Spannable;
import android.text.style.LocaleSpan;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class g7 {
    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static IntStream b(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.chars());
        return convert;
    }

    public static IntStream c(CharSequence charSequence) {
        IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        return convert;
    }

    public static Context d(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList e(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static DecimalFormatSymbols f(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static int g(wl wlVar, View view, int i, boolean z) {
        return wlVar.getMaxAvailableHeight(view, i, z);
    }

    public static String[] h(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] i(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static boolean j(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean k(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean l(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static LocaleList m(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static LocaleSpan n(tq2 tq2Var) {
        ArrayList arrayList = new ArrayList(p70.J(tq2Var, 10));
        Iterator it = tq2Var.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((sq2) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return b3.c(b3.b((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static void o(DragEvent dragEvent, ql qlVar, Activity activity) {
        hi0 hi0Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = qlVar.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        qlVar.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) qlVar.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                hi0Var = new gi0(clipData, 3);
            } else {
                ii0 ii0Var = new ii0();
                ii0Var.b = clipData;
                ii0Var.c = (byte) 3;
                hi0Var = ii0Var;
            }
            dr5.f(qlVar, hi0Var.build());
        } finally {
            qlVar.endBatchEdit();
        }
    }

    public static void p(Window.Callback callback, List list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }

    public static final void q(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static void r(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void s(EditorInfo editorInfo, tq2 tq2Var) {
        if (j42.c(tq2Var, tq2.K)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(p70.J(tq2Var, 10));
        Iterator it = tq2Var.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((sq2) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public static void t(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }

    public static void u(wf wfVar, tq2 tq2Var) {
        ArrayList arrayList = new ArrayList(p70.J(tq2Var, 10));
        Iterator it = tq2Var.I.iterator();
        while (it.hasNext()) {
            arrayList.add(((sq2) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        wfVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static void v(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
