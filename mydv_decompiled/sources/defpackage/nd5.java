package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nd5 {
    public static final md5 Companion;
    public static final nd5 K;
    public static final nd5 L;
    public static final nd5 M;
    public static final /* synthetic */ nd5[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final String J;

    static {
        nd5 nd5Var = new nd5("AUTO", "自动", TtmlNode.TEXT_EMPHASIS_AUTO, 0);
        K = nd5Var;
        nd5 nd5Var2 = new nd5("PHONE_PORTRAIT", "手机竖屏", "phone_portrait", 1);
        L = nd5Var2;
        nd5 nd5Var3 = new nd5("TABLET_LANDSCAPE", "平板横屏", "tablet_landscape", 2);
        nd5 nd5Var4 = new nd5("TV_LANDSCAPE", "电视横屏", "tv_landscape", 3);
        M = nd5Var4;
        nd5[] nd5VarArr = {nd5Var, nd5Var2, nd5Var3, nd5Var4};
        N = nd5VarArr;
        O = new za1(nd5VarArr);
        Companion = new md5();
    }

    public nd5(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static nd5 valueOf(String str) {
        return (nd5) Enum.valueOf(nd5.class, str);
    }

    public static nd5[] values() {
        return (nd5[]) N.clone();
    }
}
