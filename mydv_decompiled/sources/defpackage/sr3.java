package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class sr3 implements mr3 {
    public static final or3 I;
    public static final /* synthetic */ sr3[] J;

    static {
        or3 or3Var = new or3();
        I = or3Var;
        J = new sr3[]{or3Var, new sr3() { // from class: pr3
            @Override // defpackage.mr3
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new sr3() { // from class: qr3
            @Override // defpackage.mr3
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new sr3() { // from class: rr3
            @Override // defpackage.mr3
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static sr3 valueOf(String str) {
        return (sr3) Enum.valueOf(sr3.class, str);
    }

    public static sr3[] values() {
        return (sr3[]) J.clone();
    }
}
