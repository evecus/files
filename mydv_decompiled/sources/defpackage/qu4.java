package defpackage;

import android.util.LruCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qu4 {
    public static final qu4 a = new qu4();
    public static final LruCache b = new LruCache(64);
    public static int c;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r7 == r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(coil3.ImageLoader r8, android.content.Context r9, java.lang.String r10, defpackage.gj0 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.pu4
            if (r0 == 0) goto L13
            r0 = r11
            pu4 r0 = (defpackage.pu4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            pu4 r0 = new pu4
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r7 = r0.J
            int r11 = r0.L
            android.util.LruCache r1 = defpackage.qu4.b
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            el0 r6 = defpackage.el0.I
            if (r11 == 0) goto L3c
            if (r11 == r3) goto L36
            if (r11 != r2) goto L30
            java.lang.String r8 = r0.I
            defpackage.mu0.V(r7)
            goto L95
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r5
        L36:
            java.lang.String r10 = r0.I
            defpackage.mu0.V(r7)
            goto L6a
        L3c:
            defpackage.mu0.V(r7)
            java.lang.Object r7 = r1.get(r10)
            tw1 r7 = (defpackage.tw1) r7
            if (r7 == 0) goto L48
            return r7
        L48:
            coil3.request.ImageRequest$Builder r7 = new coil3.request.ImageRequest$Builder
            r7.<init>(r9)
            coil3.request.ImageRequest$Builder r7 = r7.data(r10)
            r9 = 112(0x70, float:1.57E-43)
            coil3.request.ImageRequest$Builder r7 = r7.size(r9)
            coil3.request.ImageRequest$Builder r7 = coil3.request.ImageRequests_androidKt.allowHardware(r7, r4)
            coil3.request.ImageRequest r7 = r7.build()
            r0.I = r10
            r0.L = r3
            java.lang.Object r7 = r8.execute(r7, r0)
            if (r7 != r6) goto L6a
            goto L93
        L6a:
            boolean r8 = r7 instanceof coil3.request.SuccessResult
            if (r8 == 0) goto L71
            coil3.request.SuccessResult r7 = (coil3.request.SuccessResult) r7
            goto L72
        L71:
            r7 = r5
        L72:
            if (r7 == 0) goto L9b
            coil3.Image r7 = r7.getImage()
            if (r7 == 0) goto L9b
            r8 = 3
            android.graphics.Bitmap r7 = coil3.Image_androidKt.toBitmap$default(r7, r4, r4, r8, r5)
            if (r7 != 0) goto L82
            goto L9b
        L82:
            os0 r8 = defpackage.sx0.a
            pi0 r9 = new pi0
            r9.<init>(r7, r5, r3)
            r0.I = r10
            r0.L = r2
            java.lang.Object r7 = defpackage.p70.D0(r8, r9, r0)
            if (r7 != r6) goto L94
        L93:
            return r6
        L94:
            r8 = r10
        L95:
            tw1 r7 = (defpackage.tw1) r7
            r1.put(r8, r7)
            return r7
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu4.a(coil3.ImageLoader, android.content.Context, java.lang.String, gj0):java.lang.Object");
    }
}
