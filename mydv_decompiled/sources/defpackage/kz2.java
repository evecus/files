package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class kz2 {
    public final byte a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public kz2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(hm1 hm1Var) {
        hm1Var.getClass();
        throw new ab3("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(o84 o84Var) {
        o84Var.getClass();
        if (!(o84Var instanceof oz4)) {
            throw new ab3("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((oz4) o84Var).I);
    }
}
