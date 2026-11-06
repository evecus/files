package j$.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class y extends x implements j$.time.temporal.m, j$.time.temporal.n, Comparable {
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 4);
    public static final ConcurrentHashMap e = new ConcurrentHashMap(16, 4);
    public static final y f = x(0);
    public static final y g = x(-64800);
    public static final y h = x(64800);
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;

    public y(int i) {
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            StringBuilder sb2 = new StringBuilder(i < 0 ? "-" : "+");
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            sb2.append(i3 < 10 ? ":0" : ":");
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 < 10 ? ":0" : ":");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.c = sb;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.y v(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.a(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.y.e
            java.lang.Object r0 = r0.get(r7)
            j$.time.y r0 = (j$.time.y) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = y(r7, r2, r3)
            int r1 = y(r7, r6, r2)
            int r2 = y(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = y(r7, r2, r3)
            int r1 = y(r7, r1, r3)
            int r2 = y(r7, r4, r3)
            goto L85
        L50:
            int r0 = y(r7, r2, r3)
            int r1 = y(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = y(r7, r2, r3)
            int r1 = y(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = y(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.y r7 = w(r7, r0, r1)
            return r7
        La8:
            j$.time.y r7 = w(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.y.v(java.lang.String):j$.time.y");
    }

    public static y w(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            h.e("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18");
            return null;
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            h.e("Zone offset minutes not in valid range: value ", i2, " is not in the range -59 to 59");
            return null;
        }
        if (i3 < -59 || i3 > 59) {
            h.e("Zone offset seconds not in valid range: value ", i3, " is not in the range -59 to 59");
            return null;
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return x((i2 * 60) + (i * 3600) + i3);
    }

    private Object writeReplace() {
        return new s((byte) 8, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y x(int i) {
        if (i < -64800 || i > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 != 0) {
            return new y(i);
        }
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = d;
        y yVar = (y) concurrentHashMap.get(valueOf);
        if (yVar != null) {
            return yVar;
        }
        concurrentHashMap.putIfAbsent(valueOf, new y(i));
        y yVar2 = (y) concurrentHashMap.get(valueOf);
        e.putIfAbsent(yVar2.c, yVar2);
        return yVar2;
    }

    public static int y(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    public static y z(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? x(dataInput.readInt()) : x(readByte * 900);
    }

    public final void A(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // j$.time.temporal.m
    public final boolean c(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((y) obj).b - this.b;
    }

    @Override // j$.time.temporal.m
    public final int d(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        return j$.time.temporal.q.d(this, pVar).a(m(pVar), pVar);
    }

    @Override // j$.time.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.b == ((y) obj).b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.s f(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.x
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.l h(j$.time.temporal.l lVar) {
        return lVar.a(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.x
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final Object i(j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.q.d || aVar == j$.time.temporal.q.e) ? this : j$.time.temporal.q.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final long m(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", pVar));
        }
        return pVar.f(this);
    }

    @Override // j$.time.x
    public final j$.time.zone.f q() {
        return new j$.time.zone.f(this);
    }

    @Override // j$.time.x
    public final String toString() {
        return this.c;
    }

    @Override // j$.time.x
    public final void u(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        A(dataOutput);
    }
}
