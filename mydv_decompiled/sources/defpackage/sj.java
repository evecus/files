package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sj {
    public static final sj I;
    public static final sj J;
    public static final sj K;
    public static final sj L;
    public static final sj M;
    public static final sj N;
    public static final sj O;
    public static final /* synthetic */ sj[] P;

    static {
        sj sjVar = new sj("Paragraph", 0);
        I = sjVar;
        sj sjVar2 = new sj("Span", 1);
        J = sjVar2;
        sj sjVar3 = new sj("VerbatimTts", 2);
        K = sjVar3;
        sj sjVar4 = new sj("Url", 3);
        L = sjVar4;
        sj sjVar5 = new sj("Link", 4);
        M = sjVar5;
        sj sjVar6 = new sj("Clickable", 5);
        N = sjVar6;
        sj sjVar7 = new sj("String", 6);
        O = sjVar7;
        P = new sj[]{sjVar, sjVar2, sjVar3, sjVar4, sjVar5, sjVar6, sjVar7};
    }

    public static sj valueOf(String str) {
        return (sj) Enum.valueOf(sj.class, str);
    }

    public static sj[] values() {
        return (sj[]) P.clone();
    }
}
