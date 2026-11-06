package defpackage;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ck {
    public static Uri A(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean B(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean C(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }

    public static int D(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int E(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int F(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int G(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void H(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void I(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void J(int i, View view) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void K(int i, View view) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void L(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean M(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Person N(um3 um3Var) {
        Person.Builder name = new Person.Builder().setName(um3Var.a);
        IconCompat iconCompat = um3Var.b;
        Icon icon = null;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = k21.t0(iconCompat, null);
        }
        return name.setIcon(icon).setUri(um3Var.c).setKey(um3Var.d).setBot(um3Var.e).setImportant(um3Var.f).build();
    }

    public static void a(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        if (i2 < 0) {
            MenuItem add = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            add.setShowAsAction(2);
            add.setIcon(drawable);
            add.setOnMenuItemClickListener(new lf(context, textClassification, r0));
            return;
        }
        r0 = i2 != 0 ? (byte) 0 : (byte) 1;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem add2 = menu.add(R.id.textAssist, r0 != 0 ? 16908353 : 0, i, remoteAction.getTitle());
        add2.setShowAsAction(r0 == 0 ? 0 : 2);
        if (drawable != null) {
            add2.setIcon(drawable);
        }
        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: o65
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ck.b(remoteAction);
                return true;
            }
        });
    }

    public static final void b(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            z4.o(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static void c(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static final void d(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static Typeface e(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Typeface f(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static r93 h(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                fr2 e2 = fr2.e();
                String str = r93.b;
                String str2 = r93.b;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (e2.b <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        int[] iArr3 = wx5.y;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!dq.L0(i3, iArr)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e3) {
                    fr2 e4 = fr2.e();
                    String str4 = r93.b;
                    String str5 = r93.b;
                    String str6 = "Ignoring removing default capability '" + i3 + '\'';
                    if (e4.b <= 5) {
                        Log.w(str5, str6, e3);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new r93(build);
    }

    public static TextClassifier i(Context context, rh4 rh4Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int ordinal = rh4Var.ordinal();
        if (ordinal == 0) {
            str = "edittext";
        } else {
            if (ordinal != 1) {
                s83.v();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static um3 j(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            iconCompat = k21.r(icon);
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        um3 um3Var = new um3();
        um3Var.a = name;
        um3Var.b = iconCompat;
        um3Var.c = uri;
        um3Var.d = key;
        um3Var.e = isBot;
        um3Var.f = isImportant;
        return um3Var;
    }

    public static List k(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static final DisplayCutout l(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            hx.a.getClass();
            Log.w(gx.b, e);
            return null;
        }
    }

    public static String[] m(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long n(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor o(Context context) {
        return context.getMainExecutor();
    }

    public static Network p(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static String q() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int r(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String s(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int t(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int u(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int x(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params y(um umVar) {
        return umVar.getTextMetricsParams();
    }

    public static int z(Object obj) {
        return ((Icon) obj).getType();
    }
}
