package defpackage;

import android.app.Activity;
import android.os.Binder;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lu5 extends fu5 {
    public static final String h = s24.a(lu5.class).c();
    public final WindowAreaComponent d;
    public boolean f;
    public bu5 e = bu5.b;
    public final HashMap g = new HashMap();

    public lu5(WindowAreaComponent windowAreaComponent) {
        this.d = windowAreaComponent;
    }

    public static jw5 c(WindowAreaComponent windowAreaComponent) {
        DisplayMetrics displayMetrics;
        try {
            displayMetrics = windowAreaComponent.getRearDisplayMetrics();
        } catch (ClassCastException unused) {
            displayMetrics = new DisplayMetrics();
        }
        displayMetrics.getClass();
        lw5.a.getClass();
        return new jw5(new fx(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels), displayMetrics.density);
    }

    @Override // defpackage.fu5
    public final zf1 a() {
        return new u00(new ku5(this, null));
    }

    @Override // defpackage.fu5
    public final void b(Binder binder, Activity activity, Executor executor, r41 r41Var) {
        activity.getClass();
        if (j42.c(binder.getInterfaceDescriptor(), "WINDOW_AREA_REAR_DISPLAY")) {
            d(activity, executor, r41Var);
        } else {
            executor.execute(new h(r41Var, (byte) 26));
        }
    }

    public final void d(Activity activity, Executor executor, r41 r41Var) {
        if (this.e != bu5.e) {
            new IllegalStateException("The WindowArea feature is currently not available to be entered");
            r41Var.c();
        } else {
            this.f = true;
            this.d.startRearDisplayPresentationSession(activity, new hu5(this, executor, r41Var, this.d));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r0 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        if (r6 != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r6 != 3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.window.extensions.area.ExtensionWindowAreaStatus r6) {
        /*
            r5 = this;
            int r6 = r6.getWindowAreaStatus()
            boolean r0 = r5.f
            int r1 = defpackage.zc1.a()
            r2 = 2
            r3 = 1
            r4 = 3
            if (r1 > r4) goto L1b
            if (r6 == 0) goto L2d
            if (r6 == r3) goto L18
            if (r6 == r2) goto L27
            if (r6 == r4) goto L24
            goto L2d
        L18:
            if (r0 == 0) goto L2a
            goto L24
        L1b:
            if (r6 == 0) goto L2d
            if (r6 == r3) goto L2a
            if (r6 == r2) goto L27
            if (r6 == r4) goto L24
            goto L2d
        L24:
            bu5 r6 = defpackage.bu5.f
            goto L2f
        L27:
            bu5 r6 = defpackage.bu5.e
            goto L2f
        L2a:
            bu5 r6 = defpackage.bu5.d
            goto L2f
        L2d:
            bu5 r6 = defpackage.bu5.c
        L2f:
            r5.e = r6
            androidx.window.extensions.area.WindowAreaComponent r6 = r5.d
            jw5 r6 = c(r6)
            ej1 r0 = defpackage.ej1.T
            bu5 r1 = r5.e
            r5.f(r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu5.e(androidx.window.extensions.area.ExtensionWindowAreaStatus):void");
    }

    public final void f(ej1 ej1Var, bu5 bu5Var, jw5 jw5Var) {
        HashMap hashMap = this.g;
        mu5 mu5Var = (mu5) hashMap.get("WINDOW_AREA_REAR_DISPLAY");
        bu5 bu5Var2 = bu5.c;
        if (bu5Var != bu5Var2) {
            if (mu5Var == null) {
                mu5Var = new mu5(jw5Var, er1.g(), this.d);
            }
            mu5Var.c.put(ej1Var, new cu5(ej1Var, bu5Var));
            mu5Var.a = jw5Var;
            hashMap.put("WINDOW_AREA_REAR_DISPLAY", mu5Var);
            return;
        }
        if (mu5Var != null) {
            HashMap hashMap2 = mu5Var.c;
            for (Object obj : hashMap2.values()) {
                obj.getClass();
                if (((cu5) obj).b != bu5Var2) {
                    hashMap2.put(ej1Var, new cu5(ej1Var, bu5Var));
                    return;
                }
            }
            hashMap.remove("WINDOW_AREA_REAR_DISPLAY");
        }
    }
}
