package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lq5 {
    public static final lq5 L;
    public static final lq5 M;
    public static final /* synthetic */ lq5[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final String J;
    public final String K;

    static {
        lq5 lq5Var = new lq5(0, "AUTO", "自动", TtmlNode.TEXT_EMPHASIS_AUTO, "自动");
        L = lq5Var;
        lq5 lq5Var2 = new lq5(1, "HIGHEST", "最高画质", "highest", "最高");
        M = lq5Var2;
        lq5[] lq5VarArr = {lq5Var, lq5Var2, new lq5(2, "HIGH", "高清 1080p", "1080p", "1080P"), new lq5(3, "MEDIUM", "标清 720p", "720p", "720P"), new lq5(4, "LOW", "流畅 540p", "480p", "540P")};
        N = lq5VarArr;
        O = new za1(lq5VarArr);
    }

    public lq5(int i, String str, String str2, String str3, String str4) {
        this.I = str2;
        this.J = str3;
        this.K = str4;
    }

    public static lq5 valueOf(String str) {
        return (lq5) Enum.valueOf(lq5.class, str);
    }

    public static lq5[] values() {
        return (lq5[]) N.clone();
    }
}
