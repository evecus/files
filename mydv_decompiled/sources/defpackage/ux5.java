package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import com.github.mytv.dv.MyApplication;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ux5 {
    public static ux5 k;
    public static ux5 l;
    public static final Object m;
    public final Context a;
    public final uf0 b;
    public final WorkDatabase c;
    public final c25 d;
    public final List e;
    public final yt3 f;
    public final pw1 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final zw j;

    static {
        fr2.h("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [int[], java.io.Serializable, java.lang.Object] */
    public ux5(Context context, final uf0 uf0Var, c25 c25Var, final WorkDatabase workDatabase, final List list, yt3 yt3Var, zw zwVar) {
        byte b = 0;
        Context applicationContext = context.getApplicationContext();
        uj3 uj3Var = null;
        if (Build.VERSION.SDK_INT >= 24 && g7.j(applicationContext)) {
            zy.i("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        fr2 fr2Var = new fr2((byte) 0, 4);
        synchronized (fr2.c) {
            try {
                if (fr2.d == null) {
                    fr2.d = fr2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = c25Var;
        this.c = workDatabase;
        this.f = yt3Var;
        this.j = zwVar;
        this.b = uf0Var;
        this.e = list;
        mc3 mc3Var = (mc3) c25Var;
        vk0 vk0Var = (vk0) mc3Var.b;
        vk0Var.getClass();
        dj0 H = i42.H(vk0Var);
        this.g = new pw1(workDatabase);
        final vj4 vj4Var = (vj4) mc3Var.a;
        String str = pa4.a;
        yt3Var.a(new nb1() { // from class: oa4
            @Override // defpackage.nb1
            public final void b(nx5 nx5Var, boolean z) {
                vj4Var.execute(new ru((Object) list, (Object) nx5Var, (Object) uf0Var, (Object) workDatabase, (byte) 4));
            }
        });
        ((vj4) mc3Var.a).execute(new wk1(applicationContext, this));
        String str2 = td5.a;
        if (wt3.a(applicationContext, uf0Var)) {
            a74 a74Var = workDatabase.w().a;
            ny5 ny5Var = new ny5(b);
            e52 f = a74Var.f();
            byte b2 = 1;
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            fb5 fb5Var = f.b;
            fb5Var.getClass();
            rk4 rk4Var = new rk4();
            for (String str3 : strArr) {
                LinkedHashMap linkedHashMap = fb5Var.c;
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Set set = (Set) linkedHashMap.get(lowerCase);
                if (set != null) {
                    rk4Var.addAll(set);
                } else {
                    rk4Var.add(str3);
                }
            }
            String[] strArr2 = (String[]) rk4Var.d().toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            int i = 0;
            while (true) {
                if (i >= length) {
                    uj3Var = new uj3(strArr2, iArr);
                    break;
                }
                String str4 = strArr2[i];
                LinkedHashMap linkedHashMap2 = fb5Var.f;
                String lowerCase2 = str4.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) linkedHashMap2.get(lowerCase2);
                if (num == null) {
                    s83.t("There is no table with name ".concat(str4));
                    break;
                } else {
                    iArr[i] = num.intValue();
                    i++;
                }
            }
            String[] strArr3 = (String[]) uj3Var.I;
            ?? r5 = (int[]) uj3Var.J;
            strArr3.getClass();
            r5.getClass();
            fj0 fj0Var = null;
            p70.g0(H, null, null, new h40((Object) new ig1(o7.p(vt0.g(new ig1(new lh1(vt0.g(new w84(new f31((Object) fb5Var, (Serializable) r5, (Object) strArr3, fj0Var, (byte) 5), (byte) 0), -1), a74Var, ny5Var), new sd5(4, null), b2), -1)), new t53(applicationContext, fj0Var, (byte) 2), (byte) 3), fj0Var, (byte) 6), 3);
        }
    }

    public static ux5 d() {
        synchronized (m) {
            try {
                ux5 ux5Var = k;
                if (ux5Var != null) {
                    return ux5Var;
                }
                return l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ux5 e(Context context) {
        ux5 d;
        synchronized (m) {
            try {
                d = d();
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof tf0)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    ((MyApplication) ((tf0) applicationContext)).getClass();
                    f(applicationContext, new uf0(new n84((byte) 24)));
                    d = e(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
        r1 = defpackage.ux5.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r1 = defpackage.wx5.g(r3, r4);
        defpackage.ux5.l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        defpackage.ux5.k = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.content.Context r3, defpackage.uf0 r4) {
        /*
            java.lang.Object r0 = defpackage.ux5.m
            monitor-enter(r0)
            ux5 r1 = defpackage.ux5.k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            ux5 r2 = defpackage.ux5.l     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2a
        L16:
            if (r1 != 0) goto L28
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            ux5 r1 = defpackage.ux5.l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            ux5 r1 = defpackage.wx5.g(r3, r4)     // Catch: java.lang.Throwable -> L14
            defpackage.ux5.l = r1     // Catch: java.lang.Throwable -> L14
        L26:
            defpackage.ux5.k = r1     // Catch: java.lang.Throwable -> L14
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux5.f(android.content.Context, uf0):void");
    }

    public final uu2 a(String str) {
        str.getClass();
        n84 n84Var = this.b.g;
        String concat = "CancelWorkByName_".concat(str);
        vj4 vj4Var = (vj4) ((mc3) this.d).a;
        vj4Var.getClass();
        return il2.P(n84Var, concat, vj4Var, new ka(str, this, (byte) 8));
    }

    public final void b(gy5 gy5Var) {
        gy5Var.getClass();
        List j0 = p70.j0(gy5Var);
        if (j0.isEmpty()) {
            s83.t("enqueue needs at least one WorkRequest.");
        } else {
            new gx5(this, null, ac1.J, j0, 0).a();
        }
    }

    public final uu2 c(String str, ac1 ac1Var, ye3 ye3Var) {
        str.getClass();
        ye3Var.getClass();
        return new gx5(this, str, ac1Var, p70.j0(ye3Var), 0).a();
    }

    public final void g() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        n84 n84Var = this.b.g;
        iy3 iy3Var = new iy3(this, (byte) 22);
        boolean m2 = ui4.m();
        if (m2) {
            try {
                Trace.beginSection(ui4.s("ReschedulingWork"));
            } finally {
                if (m2) {
                    Trace.endSection();
                }
            }
        }
        iy3Var.invoke();
    }
}
