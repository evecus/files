package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fb5 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final WorkDatabase_Impl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final sd e;
    public final String[] g;
    public final id3 h;
    public final g73 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public rm1 k = new yw4((byte) 8);
    public final LinkedHashMap f = new LinkedHashMap();

    public fb5(WorkDatabase_Impl workDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, sd sdVar) {
        String str;
        this.a = workDatabase_Impl;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = sdVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase3, sv2.E(lowerCase2, linkedHashMap3));
            }
        }
        this.h = new id3(this.g.length);
        this.i = new g73((byte) 2, this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jq3 r5, defpackage.gj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xa5
            if (r0 == 0) goto L13
            r0 = r6
            xa5 r0 = (defpackage.xa5) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            xa5 r0 = new xa5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.J
            int r6 = r0.L
            r1 = 2
            r2 = 1
            el0 r3 = defpackage.el0.I
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.I
            java.util.Set r5 = (java.util.Set) r5
            defpackage.mu0.V(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.I
            jq3 r5 = (defpackage.jq3) r5
            defpackage.mu0.V(r4)
            goto L53
        L3d:
            defpackage.mu0.V(r4)
            m45 r4 = new m45
            r6 = 7
            r4.<init>(r6)
            r0.I = r5
            r0.L = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r6, r4, r0)
            if (r4 != r3) goto L53
            goto L6a
        L53:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6b
            r0.I = r4
            r0.L = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.kb4.q(r5, r6, r0)
            if (r5 != r3) goto L6b
        L6a:
            return r3
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb5.a(jq3, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #0 {all -> 0x00c5, blocks: (B:13:0x0077, B:15:0x0082, B:20:0x00bf, B:58:0x0045, B:62:0x0051, B:66:0x0063), top: B:57:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.gj0 r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb5.b(gj0):java.lang.Object");
    }

    public final void c(rm1 rm1Var, rm1 rm1Var2) {
        rm1Var.getClass();
        rm1Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            rm1Var.invoke();
            dj0 dj0Var = this.a.a;
            fj0 fj0Var = null;
            if (dj0Var != null) {
                p70.g0(dj0Var, new zk0(zk0.I), null, new gu2((Object) this, (Object) rm1Var2, fj0Var, (byte) 23), 2);
            } else {
                j42.g0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (defpackage.kb4.q(r10, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (defpackage.kb4.q(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00db -> B:11:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.p95 r18, int r19, defpackage.gj0 r20) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb5.d(p95, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v4, types: [jq3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x007e -> B:10:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.p95 r8, int r9, defpackage.gj0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cb5
            if (r0 == 0) goto L13
            r0 = r10
            cb5 r0 = (defpackage.cb5) r0
            int r1 = r0.P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.P = r1
            goto L18
        L13:
            cb5 r0 = new cb5
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.N
            int r1 = r0.P
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            int r7 = r0.M
            int r8 = r0.L
            java.lang.String[] r9 = r0.K
            java.lang.String r1 = r0.J
            jq3 r3 = r0.I
            defpackage.mu0.V(r10)
            r10 = r9
            r9 = r3
            goto L81
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L38:
            defpackage.mu0.V(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.fb5.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4a:
            if (r8 >= r7) goto L83
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.hf1.t(r5, r4, r3)
            r0.I = r9
            r0.J = r1
            r0.K = r10
            r0.L = r8
            r0.M = r7
            r0.P = r2
            java.lang.Object r3 = defpackage.kb4.q(r9, r3, r0)
            el0 r4 = defpackage.el0.I
            if (r3 != r4) goto L81
            return r4
        L81:
            int r8 = r8 + r2
            goto L4a
        L83:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb5.e(p95, int, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.gj0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.db5
            if (r0 == 0) goto L13
            r0 = r6
            db5 r0 = (defpackage.db5) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            db5 r0 = new db5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            g12 r5 = r0.I
            defpackage.mu0.V(r6)     // Catch: java.lang.Throwable -> L28
            goto L51
        L28:
            r6 = move-exception
            goto L57
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L30:
            defpackage.mu0.V(r6)
            androidx.work.impl.WorkDatabase_Impl r6 = r5.a
            g12 r1 = r6.f
            boolean r4 = r1.j()
            if (r4 == 0) goto L5b
            ab5 r4 = new ab5     // Catch: java.lang.Throwable -> L55
            r4.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L55
            r0.I = r1     // Catch: java.lang.Throwable -> L55
            r0.L = r3     // Catch: java.lang.Throwable -> L55
            r5 = 0
            java.lang.Object r5 = r6.q(r5, r4, r0)     // Catch: java.lang.Throwable -> L55
            el0 r6 = defpackage.el0.I
            if (r5 != r6) goto L50
            return r6
        L50:
            r5 = r1
        L51:
            r5.X()
            goto L5b
        L55:
            r6 = move-exception
            r5 = r1
        L57:
            r5.X()
            throw r6
        L5b:
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb5.f(gj0):java.lang.Object");
    }
}
