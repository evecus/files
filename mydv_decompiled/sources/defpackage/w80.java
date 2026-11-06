package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class w80 {
    public static final n84 a = new n84("alpha", 0.0f, 1.0f);

    public static final void a(String str) {
        mk2 K = p70.K();
        for (int i = 0; i < str.length(); i++) {
            K.add(new n84(String.valueOf(str.charAt(i)), 0.0f, 1.0f));
        }
        K.add(a);
        p70.D(K);
    }
}
