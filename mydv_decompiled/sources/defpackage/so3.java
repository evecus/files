package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class so3 {
    public static final so3 K;
    public static final so3 L;
    public static final so3 M;
    public static final /* synthetic */ so3[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final String J;

    static {
        so3 so3Var = new so3("AUTO_NEXT", "自动播放下一个", "auto_next", 0);
        K = so3Var;
        so3 so3Var2 = new so3("PAUSE", "暂停", "pause", 1);
        L = so3Var2;
        so3 so3Var3 = new so3("REPLAY", "重播", "replay", 2);
        M = so3Var3;
        so3[] so3VarArr = {so3Var, so3Var2, so3Var3};
        N = so3VarArr;
        O = new za1(so3VarArr);
    }

    public so3(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static so3 valueOf(String str) {
        return (so3) Enum.valueOf(so3.class, str);
    }

    public static so3[] values() {
        return (so3[]) N.clone();
    }
}
