package defpackage;

import j$.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ro3 {
    public static final DateTimeFormatter a;
    public static final DateTimeFormatter b;

    static {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH:mm");
        ofPattern.getClass();
        a = ofPattern;
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        ofPattern2.getClass();
        b = ofPattern2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if (r12 >= 30) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bc, code lost:
    
        if (r12 <= 30) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.po3 r26, final defpackage.l13 r27, defpackage.fe0 r28, final int r29) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro3.a(po3, l13, fe0, int):void");
    }

    public static final boolean b(int i, int i2) {
        return ((i == 59 && i2 >= 30) || (i == 0 && i2 <= 30)) || ((i == 29 && i2 >= 30) || (i == 30 && i2 <= 30));
    }
}
