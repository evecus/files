package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class y6 {
    public static final y6 DISTINCT;
    public static final y6 ORDERED;
    public static final y6 SHORT_CIRCUIT;
    public static final y6 SIZED;
    public static final y6 SORTED;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final /* synthetic */ y6[] v;
    public final Map a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    static {
        x6 x6Var = x6.SPLITERATOR;
        j$.util.p i2 = i(x6Var);
        x6 x6Var2 = x6.STREAM;
        i2.a(x6Var2);
        x6 x6Var3 = x6.OP;
        ((EnumMap) ((Map) i2.b)).put((EnumMap) x6Var3, (x6) 3);
        y6 y6Var = new y6("DISTINCT", 0, 0, i2);
        DISTINCT = y6Var;
        j$.util.p i3 = i(x6Var);
        i3.a(x6Var2);
        ((EnumMap) ((Map) i3.b)).put((EnumMap) x6Var3, (x6) 3);
        y6 y6Var2 = new y6("SORTED", 1, 1, i3);
        SORTED = y6Var2;
        j$.util.p i4 = i(x6Var);
        i4.a(x6Var2);
        ((EnumMap) ((Map) i4.b)).put((EnumMap) x6Var3, (x6) 3);
        x6 x6Var4 = x6.TERMINAL_OP;
        ((EnumMap) ((Map) i4.b)).put((EnumMap) x6Var4, (x6) 2);
        x6 x6Var5 = x6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) ((Map) i4.b)).put((EnumMap) x6Var5, (x6) 2);
        y6 y6Var3 = new y6("ORDERED", 2, 2, i4);
        ORDERED = y6Var3;
        j$.util.p i5 = i(x6Var);
        i5.a(x6Var2);
        ((EnumMap) ((Map) i5.b)).put((EnumMap) x6Var3, (x6) 2);
        y6 y6Var4 = new y6("SIZED", 3, 3, i5);
        SIZED = y6Var4;
        j$.util.p i6 = i(x6Var3);
        i6.a(x6Var4);
        int i7 = 0;
        y6 y6Var5 = new y6("SHORT_CIRCUIT", 4, 12, i6);
        SHORT_CIRCUIT = y6Var5;
        v = new y6[]{y6Var, y6Var2, y6Var3, y6Var4, y6Var5};
        f = e(x6Var);
        g = e(x6Var2);
        h = e(x6Var3);
        e(x6Var4);
        e(x6Var5);
        for (y6 y6Var6 : values()) {
            i7 |= y6Var6.e;
        }
        i = i7;
        int i8 = g;
        j = i8;
        int i9 = i8 << 1;
        k = i9;
        l = i8 | i9;
        y6 y6Var7 = DISTINCT;
        m = y6Var7.c;
        n = y6Var7.d;
        y6 y6Var8 = SORTED;
        o = y6Var8.c;
        p = y6Var8.d;
        y6 y6Var9 = ORDERED;
        q = y6Var9.c;
        r = y6Var9.d;
        y6 y6Var10 = SIZED;
        s = y6Var10.c;
        t = y6Var10.d;
        u = SHORT_CIRCUIT.c;
    }

    public y6(String str, int i2, int i3, j$.util.p pVar) {
        for (x6 x6Var : x6.values()) {
            Map.EL.b((java.util.Map) pVar.b, x6Var, 0);
        }
        this.a = (java.util.Map) pVar.b;
        int i4 = i3 * 2;
        this.b = i4;
        this.c = 1 << i4;
        this.d = 2 << i4;
        this.e = 3 << i4;
    }

    public static int d(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    public static int e(x6 x6Var) {
        int i2 = 0;
        for (y6 y6Var : values()) {
            i2 |= ((Integer) ((EnumMap) y6Var.a).get(x6Var)).intValue() << y6Var.b;
        }
        return i2;
    }

    public static int f(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }

    public static j$.util.p i(x6 x6Var) {
        j$.util.p pVar = new j$.util.p((byte) 9, new EnumMap(x6.class));
        pVar.a(x6Var);
        return pVar;
    }

    public static y6 valueOf(String str) {
        return (y6) Enum.valueOf(y6.class, str);
    }

    public static y6[] values() {
        return (y6[]) v.clone();
    }

    public final boolean h(int i2) {
        return (i2 & this.e) == this.c;
    }
}
