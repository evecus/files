package defpackage;

import android.app.Application;
import android.content.Context;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class no4 {
    public static final ko4 Companion = new ko4();
    public final Context a;
    public final ExecutorService b;
    public final qb1 c;
    public volatile boolean d;
    public volatile QuickJSContext e;

    public no4(Application application) {
        this.a = application.getApplicationContext();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new g((byte) 1));
        this.b = newSingleThreadExecutor;
        newSingleThreadExecutor.getClass();
        this.c = new qb1(newSingleThreadExecutor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        if (r9 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r24, java.lang.String r25, java.lang.String r26, defpackage.gj0 r27) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no4.a(java.lang.String, java.lang.String, java.lang.String, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gj0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.mo4
            if (r0 == 0) goto L13
            r0 = r6
            mo4 r0 = (defpackage.mo4) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            mo4 r0 = new mo4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.I
            el0 r1 = defpackage.el0.I
            int r2 = r0.K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.mu0.V(r6)
            goto L4a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L2e:
            defpackage.mu0.V(r6)
            boolean r6 = r5.d
            if (r6 == 0) goto L38
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L38:
            h40 r6 = new h40
            r2 = 21
            r6.<init>(r5, r3, r2)
            r0.K = r4
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r6 = defpackage.qi4.n(r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L53
            boolean r5 = r6.booleanValue()
            goto L54
        L53:
            r5 = 0
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no4.b(gj0):java.lang.Object");
    }
}
