package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v90 {
    public static final u90 Companion;
    public static final v90 K;
    public static final /* synthetic */ v90[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final String J;

    static {
        v90 v90Var = new v90("AUTO", "自动", TtmlNode.TEXT_EMPHASIS_AUTO, 0);
        K = v90Var;
        v90[] v90VarArr = {v90Var, new v90("OFF", "关", "off", 1)};
        L = v90VarArr;
        M = new za1(v90VarArr);
        Companion = new u90();
    }

    public v90(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static v90 valueOf(String str) {
        return (v90) Enum.valueOf(v90.class, str);
    }

    public static v90[] values() {
        return (v90[]) L.clone();
    }
}
