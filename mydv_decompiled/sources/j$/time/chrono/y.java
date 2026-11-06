package j$.time.chrono;

import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class y implements m, Serializable {
    public static final y d;
    public static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        y yVar = new y(-1, LocalDate.x(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, LocalDate.x(1912, 7, 30), "Taisho"), new y(1, LocalDate.x(1926, 12, 25), "Showa"), new y(2, LocalDate.x(1989, 1, 8), "Heisei"), new y(3, LocalDate.x(2019, 5, 1), "Reiwa")};
    }

    public y(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        if (r5.toEpochDay() < r0.toEpochDay()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r5.q(r0) < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.chrono.y q(j$.time.LocalDate r5) {
        /*
            j$.time.LocalDate r0 = j$.time.chrono.x.d
            boolean r1 = j$.time.d.b(r0)
            r2 = 1
            if (r1 == 0) goto L13
            r5.getClass()
            int r0 = r5.q(r0)
            if (r0 >= 0) goto L21
            goto L1f
        L13:
            long r3 = r5.toEpochDay()
            long r0 = r0.toEpochDay()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L3c
            j$.time.chrono.y[] r0 = j$.time.chrono.y.e
            int r0 = r0.length
            int r0 = r0 - r2
        L28:
            if (r0 < 0) goto L3a
            j$.time.chrono.y[] r1 = j$.time.chrono.y.e
            r1 = r1[r0]
            j$.time.LocalDate r2 = r1.b
            int r2 = r5.compareTo(r2)
            if (r2 < 0) goto L37
            return r1
        L37:
            int r0 = r0 + (-1)
            goto L28
        L3a:
            r5 = 0
            return r5
        L3c:
            j$.time.c r5 = new j$.time.c
            java.lang.String r0 = "JapaneseDate before Meiji 6 are not supported"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.y.q(j$.time.LocalDate):j$.time.chrono.y");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static y s(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        j$.time.h.d("Invalid era: ", i);
        return null;
    }

    private Object writeReplace() {
        return new e0((byte) 5, this);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean c(j$.time.temporal.p pVar) {
        return j$.time.a.u(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int d(j$.time.temporal.p pVar) {
        return j$.time.a.p(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return pVar == aVar ? v.c.m(aVar) : j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object i(j$.time.format.a aVar) {
        return j$.time.a.z(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long m(j$.time.temporal.p pVar) {
        return j$.time.a.r(this, pVar);
    }

    public final y r() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return s(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
