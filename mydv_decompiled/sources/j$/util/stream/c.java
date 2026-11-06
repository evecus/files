package j$.util.stream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public abstract class c {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public c(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            j$.time.h.i("Illegal Capacity: ", i);
            throw null;
        }
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        return i == 0 ? this.b : this.d[i] + this.b;
    }

    public c() {
        this.a = 4;
    }
}
