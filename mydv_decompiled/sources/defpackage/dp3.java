package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dp3 {
    public static final cp3 Companion;
    public static final dp3 K;
    public static final dp3 L;
    public static final dp3 M;
    public static final /* synthetic */ dp3[] N;
    public static final /* synthetic */ za1 O;
    public final String I;
    public final String J;

    static {
        dp3 dp3Var = new dp3("SURFACE_VIEW", "SurfaceView", "surface_view", 0);
        K = dp3Var;
        dp3 dp3Var2 = new dp3("TEXTURE_VIEW", "TextureView", "texture_view", 1);
        L = dp3Var2;
        dp3 dp3Var3 = new dp3("GL_SURFACE_VIEW", "GLSurfaceView", "gl_surface_view", 2);
        M = dp3Var3;
        dp3[] dp3VarArr = {dp3Var, dp3Var2, dp3Var3};
        N = dp3VarArr;
        O = new za1(dp3VarArr);
        Companion = new cp3();
    }

    public dp3(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static dp3 valueOf(String str) {
        return (dp3) Enum.valueOf(dp3.class, str);
    }

    public static dp3[] values() {
        return (dp3[]) N.clone();
    }
}
