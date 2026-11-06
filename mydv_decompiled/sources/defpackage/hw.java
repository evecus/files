package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hw extends c80 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hw(long r4, int r6) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L16
            defpackage.iw.d()
            int r0 = defpackage.qb.i0(r4)
            android.graphics.BlendMode r1 = defpackage.z9.i(r6)
            android.graphics.BlendModeColorFilter r0 = defpackage.iw.a(r0, r1)
            goto L23
        L16:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r1 = defpackage.qb.i0(r4)
            android.graphics.PorterDuff$Mode r2 = defpackage.z9.j(r6)
            r0.<init>(r1, r2)
        L23:
            r3.<init>(r0)
            r3.b = r4
            r3.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.<init>(long, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw)) {
            return false;
        }
        hw hwVar = (hw) obj;
        long j = hwVar.b;
        int i = x70.h;
        return zc5.a(this.b, j) && this.c == hwVar.c;
    }

    public final int hashCode() {
        int i = x70.h;
        return (i82.Q(this.b) * 31) + this.c;
    }

    public final String toString() {
        return hf1.x("BlendModeColorFilter(color=", x70.i(this.b), ", blendMode=", gw.a(this.c), ")");
    }
}
