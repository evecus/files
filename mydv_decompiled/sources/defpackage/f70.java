package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class f70 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f70(java.io.File r3, java.io.File r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            if (r4 == 0) goto L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = " -> "
            r3.<init>(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L1c:
            java.lang.String r3 = ": "
            java.lang.String r3 = r3.concat(r5)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f70.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    public f70(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public f70(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
