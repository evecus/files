package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class my implements oy {
    public final /* synthetic */ byte b;

    public /* synthetic */ my(byte b) {
        this.b = b;
    }

    @Override // defpackage.oy
    public final float a(float f, float f2, float f3) {
        switch (this.b) {
            case 0:
                oy.a.getClass();
                float f4 = f2 + f;
                if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
                    return 0.0f;
                }
                float f5 = f4 - f3;
                return Math.abs(f) < Math.abs(f5) ? f : f5;
            default:
                float abs = Math.abs((f2 + f) - f);
                float f6 = (0.3f * f3) - (0.0f * abs);
                float f7 = f3 - f6;
                if ((abs <= f3) && f7 < abs) {
                    f6 = f3 - abs;
                }
                return f - f6;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // defpackage.oy
    public final ku4 b() {
        switch (this.b) {
        }
        oy.a.getClass();
        return ny.b;
    }
}
