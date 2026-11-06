package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class m50 extends u50 {
    public final /* synthetic */ byte I = 0;
    public final Object J;

    public m50(String str) {
        char[] charArray = str.toString().toCharArray();
        this.J = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        switch (this.I) {
        }
        return b(((Character) obj).charValue());
    }

    @Override // defpackage.u50
    public final boolean b(char c) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return Arrays.binarySearch((char[]) obj, c) >= 0;
            default:
                return !((u50) obj).b(c);
        }
    }

    @Override // defpackage.u50
    public u50 c() {
        switch (this.I) {
            case 1:
                return (u50) this.J;
            default:
                return super.c();
        }
    }

    public final String toString() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(u50.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((u50) obj) + ".negate()";
        }
    }

    public m50(u50 u50Var) {
        this.J = u50Var;
    }
}
