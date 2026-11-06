package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yp1 {
    public static final up1 d = new up1();
    public static final as3 e;
    public static yr3 f;
    public static final bs3 g;
    public final Context a;
    public final AppWidgetManager b;
    public final u05 c = new u05(new ce(this, (byte) 16));

    static {
        String str = "GlanceAppWidgetManager-" + up1.b();
        fh fhVar = fh.T;
        os0 os0Var = sx0.a;
        e = new as3(str, fhVar, i42.H(ur0.I.plus(ui4.b())));
        g = new bs3("list::Providers");
    }

    public yp1(Context context) {
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }

    public final Object a(k05 k05Var) {
        String packageName = this.a.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.b.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (j42.c(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((AppWidgetProviderInfo) obj2).provider.getClassName());
        }
        Object a = ((mp0) this.c.getValue()).a(new k((Object) o70.u1(arrayList2), (fj0) null, (byte) 7), k05Var);
        return a == el0.I ? a : wd5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.Class r7, defpackage.gj0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wp1
            if (r0 == 0) goto L13
            r0 = r8
            wp1 r0 = (defpackage.wp1) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            wp1 r0 = new wp1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.Class r7 = r0.I
            defpackage.mu0.V(r8)
            goto L3e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L2e:
            defpackage.mu0.V(r8)
            r0.I = r7
            r0.L = r3
            java.lang.Object r8 = r6.c(r0)
            el0 r0 = defpackage.el0.I
            if (r8 != r0) goto L3e
            return r0
        L3e:
            vp1 r8 = (defpackage.vp1) r8
            java.lang.String r7 = r7.getCanonicalName()
            if (r7 == 0) goto L8a
            java.util.Map r8 = r8.b
            java.lang.Object r7 = r8.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L53
            o91 r6 = defpackage.o91.I
            return r6
        L53:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            android.appwidget.AppWidgetManager r1 = r6.b
            int[] r0 = r1.getAppWidgetIds(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L76:
            if (r3 >= r2) goto L85
            r4 = r0[r3]
            lo r5 = new lo
            r5.<init>(r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L76
        L85:
            defpackage.u70.I0(r8, r1)
            goto L5c
        L89:
            return r8
        L8a:
            java.lang.String r6 = "no canonical provider name"
            defpackage.s83.t(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp1.b(java.lang.Class, gj0):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.gj0 r12) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp1.c(gj0):java.lang.Object");
    }

    public final Object d(gq1 gq1Var, rp1 rp1Var, r rVar) {
        d82[] d82VarArr = up1.a;
        d.getClass();
        String canonicalName = gq1Var.getClass().getCanonicalName();
        if (canonicalName == null) {
            s83.t("no receiver name");
            return null;
        }
        String canonicalName2 = rp1Var.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object a = ((mp0) this.c.getValue()).a(new q30(canonicalName, canonicalName2, null), rVar);
            return a == el0.I ? a : wd5.a;
        }
        s83.t("no provider name");
        return null;
    }
}
