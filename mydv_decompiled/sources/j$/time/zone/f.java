package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.chrono.s;
import j$.time.l;
import j$.time.temporal.n;
import j$.time.y;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final y[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final y[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public f(long[] jArr, y[] yVarArr, long[] jArr2, y[] yVarArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = yVarArr;
        this.c = jArr2;
        this.e = yVarArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                y yVar = yVarArr2[i2];
                int i3 = i2 + 1;
                y yVar2 = yVarArr2[i3];
                LocalDateTime u = LocalDateTime.u(jArr2[i2], 0, yVar);
                if (yVar2.b > yVar.b) {
                    arrayList.add(u);
                    arrayList.add(u.w(yVar2.b - yVar.b));
                } else {
                    arrayList.add(u.w(r3 - r4));
                    arrayList.add(u);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.d.b > bVar.c.b) {
            if (localDateTime.s(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.s(bVar.b.w(bVar.d.b - bVar.c.b))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.s(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.s(bVar.b.w(bVar.d.b - bVar.c.b))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public static int c(long j2, y yVar) {
        return LocalDate.ofEpochDay(j$.time.a.V(j2 + yVar.b, 86400L)).a;
    }

    public static y h(int i2) {
        return y.x(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        LocalDate r;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) this.h.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        final byte b = 0;
        final byte b2 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate x = LocalDate.x(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.i(0L);
            long A = j$.time.a.A(new LocalDateTime(x, LocalTime.h[0]), this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(A * 1000);
            long j4 = 31968000 + A;
            while (A < j4) {
                long j5 = A + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - A > j2) {
                        long V = j$.time.a.V(j5 + A, 2L);
                        if (this.g.getOffset(V * j6) == offset) {
                            A = V;
                        } else {
                            j5 = V;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(A * j6) == offset) {
                        A = j5;
                    }
                    y h = h(offset);
                    int offset2 = this.g.getOffset(A * j6);
                    y h2 = h(offset2);
                    if (c(A, h2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(A, h, h2);
                    }
                    offset = offset2;
                } else {
                    A = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i3 = 0;
        while (i3 < eVarArr.length) {
            e eVar = eVarArr[i3];
            byte b3 = eVar.b;
            l lVar = eVar.a;
            if (b3 < 0) {
                long j7 = i2;
                int r2 = lVar.r(s.c.isLeapYear(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.i(j7);
                j$.time.temporal.a.DAY_OF_MONTH.i(r2);
                r = LocalDate.r(i2, lVar.getValue(), r2);
                j$.time.e eVar2 = eVar.c;
                if (eVar2 != null) {
                    final int value = eVar2.getValue();
                    r = r.e(new n() { // from class: j$.time.temporal.o
                        @Override // j$.time.temporal.n
                        public final l h(l lVar2) {
                            byte b4 = b2;
                            int i4 = value;
                            switch (b4) {
                                case 0:
                                    int d = lVar2.d(a.DAY_OF_WEEK);
                                    if (d == i4) {
                                        return lVar2;
                                    }
                                    return lVar2.b(d - i4 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int d2 = lVar2.d(a.DAY_OF_WEEK);
                                    if (d2 == i4) {
                                        return lVar2;
                                    }
                                    return lVar2.l(i4 - d2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
                            }
                        }
                    });
                }
            } else {
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.i(i2);
                j$.time.temporal.a.DAY_OF_MONTH.i(b3);
                r = LocalDate.r(i2, lVar.getValue(), b3);
                j$.time.e eVar3 = eVar.c;
                if (eVar3 != null) {
                    final int value2 = eVar3.getValue();
                    r = r.e(new n() { // from class: j$.time.temporal.o
                        @Override // j$.time.temporal.n
                        public final l h(l lVar2) {
                            byte b4 = b;
                            int i4 = value2;
                            switch (b4) {
                                case 0:
                                    int d = lVar2.d(a.DAY_OF_WEEK);
                                    if (d == i4) {
                                        return lVar2;
                                    }
                                    return lVar2.b(d - i4 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int d2 = lVar2.d(a.DAY_OF_WEEK);
                                    if (d2 == i4) {
                                        return lVar2;
                                    }
                                    return lVar2.l(i4 - d2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
                            }
                        }
                    });
                }
            }
            if (eVar.e) {
                r = r.z(1L);
            }
            LocalDateTime t = LocalDateTime.t(r, eVar.d);
            d dVar = eVar.f;
            y yVar = eVar.g;
            y yVar2 = eVar.h;
            int i4 = c.a[dVar.ordinal()];
            if (i4 == 1) {
                t = t.w(yVar2.b - y.f.b);
            } else if (i4 == 2) {
                t = t.w(yVar2.b - yVar.b);
            }
            bVarArr3[i3] = new b(t, eVar.h, eVar.i);
            i3++;
            b = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final y d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long j2 = instant.a;
        if (this.f.length <= 0 || j2 <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, j2);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return this.e[binarySearch + 1];
        }
        b[] b = b(c(j2, this.e[r8.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < b.length; i2++) {
            bVar = b[i2];
            if (j2 < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r9.q(r0) > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
    
        if (r9.b.B() <= r0.b.B()) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r9) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (!(e instanceof b)) {
            return Collections.singletonList((y) e);
        }
        b bVar = (b) e;
        y yVar = bVar.d;
        int i2 = yVar.b;
        y yVar2 = bVar.c;
        if (i2 > yVar2.b) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {yVar2, yVar};
        ArrayList arrayList = new ArrayList(2);
        for (int i3 = 0; i3 < 2; i3++) {
            arrayList.add(Objects.requireNonNull(objArr[i3]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean g(Instant instant) {
        y yVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            yVar = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            yVar = this.b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.a, instant.a);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            yVar = this.b[binarySearch + 1];
        }
        return !yVar.equals(d(instant));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) ^ ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e));
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r3.length - 1] + "]";
    }

    public f(y yVar) {
        y[] yVarArr = {yVar};
        this.b = yVarArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = yVarArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        y[] yVarArr = {h(timeZone.getRawOffset())};
        this.b = yVarArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = yVarArr;
        this.f = j;
        this.g = timeZone;
    }
}
