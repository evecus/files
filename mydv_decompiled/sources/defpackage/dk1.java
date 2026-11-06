package defpackage;

import androidx.media3.exoplayer.Renderer;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class dk1 {
    public static final ss2 a = new ss2(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final oo4 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l44());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new oo4(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((xj1) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ck1 b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            ss2 r0 = defpackage.dk1.a
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = defpackage.ui4.s(r1)
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.a(r8)     // Catch: java.lang.Throwable -> Lc3
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lc3
            if (r1 == 0) goto L1c
            ck1 r8 = new ck1     // Catch: java.lang.Throwable -> Lc3
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.endSection()
            return r8
        L1c:
            ee0 r10 = defpackage.wj1.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb9 java.lang.Throwable -> Lc3
            java.lang.Object r1 = r10.b     // Catch: java.lang.Throwable -> Lc3
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lc3
            boolean r10 = r10.a     // Catch: java.lang.Throwable -> Lc3
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L31
            if (r10 == r2) goto L2f
        L2d:
            r10 = r3
            goto L52
        L2f:
            r10 = -2
            goto L52
        L31:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc3
            sk1[] r10 = (defpackage.sk1[]) r10     // Catch: java.lang.Throwable -> Lc3
            if (r10 == 0) goto L51
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lc3
            if (r5 != 0) goto L3d
            goto L51
        L3d:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lc3
            r6 = r4
        L3f:
            if (r6 >= r5) goto L4f
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lc3
            int r7 = r7.f     // Catch: java.lang.Throwable -> Lc3
            if (r7 == 0) goto L4c
            if (r7 >= 0) goto L4a
            goto L2d
        L4a:
            r10 = r7
            goto L52
        L4c:
            int r6 = r6 + 1
            goto L3f
        L4f:
            r10 = r4
            goto L52
        L51:
            r10 = r2
        L52:
            if (r10 == 0) goto L5d
            ck1 r8 = new ck1     // Catch: java.lang.Throwable -> Lc3
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.endSection()
            return r8
        L5d:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lc3
            if (r10 <= r2) goto L83
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc3
            r2 = 29
            if (r10 < r2) goto L83
            ad4 r10 = defpackage.wb5.a     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r10 = defpackage.ui4.s(r10)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> Lc3
            ad4 r10 = defpackage.wb5.a     // Catch: java.lang.Throwable -> L7e
            android.graphics.Typeface r9 = r10.i(r9, r1, r11)     // Catch: java.lang.Throwable -> L7e
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc3
            goto L9d
        L7e:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc3
            throw r8     // Catch: java.lang.Throwable -> Lc3
        L83:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc3
            sk1[] r10 = (defpackage.sk1[]) r10     // Catch: java.lang.Throwable -> Lc3
            ad4 r1 = defpackage.wb5.a     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r1 = defpackage.ui4.s(r1)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lc3
            ad4 r1 = defpackage.wb5.a     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r9 = r1.h(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc3
        L9d:
            if (r9 == 0) goto Lab
            r0.b(r8, r9)     // Catch: java.lang.Throwable -> Lc3
            ck1 r8 = new ck1     // Catch: java.lang.Throwable -> Lc3
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.endSection()
            return r8
        Lab:
            ck1 r8 = new ck1     // Catch: java.lang.Throwable -> Lc3
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.endSection()
            return r8
        Lb4:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc3
            throw r8     // Catch: java.lang.Throwable -> Lc3
        Lb9:
            ck1 r8 = new ck1     // Catch: java.lang.Throwable -> Lc3
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc3
            android.os.Trace.endSection()
            return r8
        Lc3:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk1.b(java.lang.String, android.content.Context, java.util.List, int):ck1");
    }
}
