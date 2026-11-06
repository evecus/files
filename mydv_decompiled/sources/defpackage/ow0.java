package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ow0 implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ow0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((p63) obj2).P.j.b((kw0) obj);
                break;
            case 1:
                ((g02) obj2).a.k((e02) obj);
                break;
            case 2:
                ((vi2) obj2).k().b((pi2) obj);
                break;
            case 3:
                ((ExoPlayer) obj2).removeListener((qn2) obj);
                break;
            case 4:
                t43 t43Var = (t43) obj2;
                vs3 vs3Var = (vs3) t43Var.getValue();
                if (vs3Var != null) {
                    us3 us3Var = new us3(vs3Var);
                    t33 t33Var = (t33) obj;
                    if (t33Var != null) {
                        t33Var.b(us3Var);
                    }
                    t43Var.setValue(null);
                    break;
                }
                break;
            case 5:
                ((y55) obj2).c.remove((tm1) obj);
                break;
            case 6:
                ((ea5) obj2).j.remove((ba5) obj);
                break;
            case 7:
                ((ExoPlayer) obj2).removeListener((tm5) obj);
                break;
            default:
                ((ExoPlayer) obj2).removeListener((ko5) obj);
                break;
        }
    }
}
