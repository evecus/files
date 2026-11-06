package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class je2 implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public je2(ExoPlayer exoPlayer, OkHttpClient okHttpClient) {
        this.a = (byte) 4;
        this.b = exoPlayer;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ke2) obj).d = null;
                break;
            case 1:
                bf2 bf2Var = (bf2) obj;
                u92 u92Var = bf2Var.c;
                if (u92Var != null) {
                    u92Var.a = false;
                }
                bf2Var.c = null;
                break;
            case 2:
                we2 we2Var = (we2) obj;
                we2Var.f = true;
                we2Var.d = 0;
                we2Var.c();
                break;
            case 3:
                ((jh4) obj).r(null);
                break;
            default:
                Log.d("VideoPlayer", "回收共享播放器");
                ((ExoPlayer) obj).getClass();
                break;
        }
    }

    public /* synthetic */ je2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
