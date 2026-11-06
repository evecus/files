package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class t implements m {
    public static final t BCE;
    public static final t CE;
    public static final /* synthetic */ t[] a;

    static {
        t tVar = new t("BCE", 0);
        BCE = tVar;
        t tVar2 = new t("CE", 1);
        CE = tVar2;
        a = new t[]{tVar, tVar2};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) a.clone();
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
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return ordinal();
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
}
