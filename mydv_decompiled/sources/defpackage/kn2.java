package defpackage;

import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kn2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ kn2(t43 t43Var, t43 t43Var2, byte b) {
        this.I = b;
        this.J = t43Var;
        this.K = t43Var2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        t43 t43Var2 = this.J;
        switch (b) {
            case 0:
                ((ay0) obj).getClass();
                ExoPlayer exoPlayer = (ExoPlayer) t43Var2.getValue();
                if (exoPlayer == null) {
                    return new me((byte) 2);
                }
                Tracks currentTracks = exoPlayer.getCurrentTracks();
                currentTracks.getClass();
                un2.e(t43Var, currentTracks);
                qn2 qn2Var = new qn2(t43Var);
                exoPlayer.addListener(qn2Var);
                return new ow0(exoPlayer, qn2Var, (byte) 3);
            case 1:
                String str = (String) obj;
                str.getClass();
                t43Var2.setValue(str);
                qm4.m(t43Var, false);
                return wd5Var;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                t43Var2.setValue(str2);
                qm4.m(t43Var, false);
                return wd5Var;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                t43Var2.setValue(str3);
                qm4.m(t43Var, false);
                return wd5Var;
            case 4:
                lq5 lq5Var = (lq5) obj;
                lq5Var.getClass();
                t43Var2.setValue(lq5Var);
                t43Var.setValue(Boolean.TRUE);
                return wd5Var;
            case 5:
                oi1 oi1Var = (oi1) obj;
                oi1Var.getClass();
                t43Var2.setValue(Boolean.valueOf(oi1Var.b()));
                t43Var.setValue(Boolean.valueOf(oi1Var.a()));
                return wd5Var;
            case 6:
                ((ay0) obj).getClass();
                ExoPlayer exoPlayer2 = (ExoPlayer) t43Var2.getValue();
                if (exoPlayer2 == null) {
                    t43Var.setValue(null);
                    return new me((byte) 3);
                }
                Tracks currentTracks2 = exoPlayer2.getCurrentTracks();
                currentTracks2.getClass();
                on5.j0(t43Var, currentTracks2);
                tm5 tm5Var = new tm5(t43Var);
                exoPlayer2.addListener(tm5Var);
                return new ow0(exoPlayer2, tm5Var, (byte) 7);
            default:
                oi1 oi1Var2 = (oi1) obj;
                oi1Var2.getClass();
                t43Var2.setValue(Boolean.valueOf(oi1Var2.b()));
                if (!oi1Var2.b()) {
                    t43Var.setValue(Boolean.FALSE);
                }
                return wd5Var;
        }
    }
}
