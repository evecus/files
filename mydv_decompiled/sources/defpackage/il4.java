package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class il4 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;

    public /* synthetic */ il4(t43 t43Var, byte b) {
        this.I = b;
        this.J = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        switch (b) {
            case 0:
                t43Var.setValue(Boolean.FALSE);
                return wd5Var;
            case 1:
                t43Var.setValue(null);
                return wd5Var;
            case 2:
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 3:
                t43Var.setValue(Boolean.FALSE);
                return wd5Var;
            case 4:
                t43Var.setValue(Boolean.FALSE);
                return wd5Var;
            case 5:
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 6:
                t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                return wd5Var;
            case 7:
                t43Var.setValue(Boolean.valueOf(!((Boolean) t43Var.getValue()).booleanValue()));
                return wd5Var;
            case 8:
                t43Var.setValue(Boolean.FALSE);
                return wd5Var;
            case 9:
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 10:
                t43Var.setValue(Boolean.FALSE);
                return wd5Var;
            case 11:
                ExoPlayer exoPlayer = (ExoPlayer) t43Var.getValue();
                long j = 0;
                if (exoPlayer != null) {
                    long currentPosition = exoPlayer.getCurrentPosition();
                    if (currentPosition >= 0) {
                        j = currentPosition;
                    }
                }
                return Long.valueOf(j);
            case 12:
                t43Var.setValue(Boolean.FALSE);
                return wd5Var;
            case 13:
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 14:
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 15:
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 16:
                return (String) t43Var.getValue();
            case 17:
                return (Long) t43Var.getValue();
            case 18:
                ta1 ta1Var = on5.a;
                return (String) t43Var.getValue();
            default:
                ta1 ta1Var2 = on5.a;
                return (Long) t43Var.getValue();
        }
    }
}
