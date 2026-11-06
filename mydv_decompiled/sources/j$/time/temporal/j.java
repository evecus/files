package j$.time.temporal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
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
public final class j implements p {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;
    public static final /* synthetic */ j[] d;
    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient int c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        d = new j[]{jVar, jVar2, jVar3};
    }

    public j(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j) {
        this.a = str2;
        this.b = s.e((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }

    @Override // j$.time.temporal.p
    public final boolean d(m mVar) {
        return mVar.c(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final s e(m mVar) {
        if (mVar.c(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final long f(m mVar) {
        return mVar.m(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.p
    public final l h(l lVar, long j) {
        if (this.b.d(j)) {
            return lVar.a(j$.time.a.X(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final s range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
