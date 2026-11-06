package j$.time.format;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class l implements f {
    public final f a;
    public final int b;
    public final char c;

    public l(f fVar, int i, char c) {
        this.a = fVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.f
    public final boolean d(u uVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.d(uVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
