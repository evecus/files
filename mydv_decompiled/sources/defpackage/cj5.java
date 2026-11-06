package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cj5 {
    public static final bj5 Companion;
    public static final cj5 K;
    public static final cj5 L;
    public static final /* synthetic */ cj5[] M;
    public static final /* synthetic */ za1 N;
    public final String I;
    public final String J;

    static {
        cj5 cj5Var = new cj5("AUTO", "自动", TtmlNode.TEXT_EMPHASIS_AUTO, 0);
        K = cj5Var;
        cj5 cj5Var2 = new cj5("H264", "优先 H.264", "h264", 1);
        L = cj5Var2;
        cj5[] cj5VarArr = {cj5Var, cj5Var2, new cj5("H265", "优先 H.265", "h265", 2)};
        M = cj5VarArr;
        N = new za1(cj5VarArr);
        Companion = new bj5();
    }

    public cj5(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static cj5 valueOf(String str) {
        return (cj5) Enum.valueOf(cj5.class, str);
    }

    public static cj5[] values() {
        return (cj5[]) M.clone();
    }
}
