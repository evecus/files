package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class u50 implements mr3 {
    public static u50 a(String str) {
        int length = str.length();
        return length != 0 ? length != 1 ? length != 2 ? new m50(str) : new p50(str.charAt(0), str.charAt(1)) : new o50(str.charAt(0)) : t50.J;
    }

    public static String d(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(char c) {
        return false;
    }

    public u50 c() {
        return new m50(this);
    }
}
