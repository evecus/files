package defpackage;

import android.os.Trace;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadException;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ru implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ru(n84 n84Var, String str, rm1 rm1Var, u33 u33Var, v00 v00Var) {
        this.I = (byte) 3;
        this.J = str;
        this.M = rm1Var;
        this.K = u33Var;
        this.L = v00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        Object obj = this.L;
        Object obj2 = this.K;
        Object obj3 = this.M;
        Object obj4 = this.J;
        switch (b) {
            case 0:
                ((BasePreloadManager) obj4).lambda$onError$7((MediaItem) obj3, (mr3) obj2, (PreloadException) obj);
                return;
            case 1:
                ((BasePreloadManager) obj4).lambda$onError$5((MediaSource) obj3, (mr3) obj2, (PreloadException) obj);
                return;
            case 2:
                ((HlsInterstitialsAdsLoader) obj4).lambda$setWithAssetListResetAsync$3(obj3, (String) obj2, (v00) obj);
                return;
            case 3:
                String str = (String) obj4;
                rm1 rm1Var = (rm1) obj3;
                u33 u33Var = (u33) obj2;
                v00 v00Var = (v00) obj;
                boolean m = ui4.m();
                if (m) {
                    try {
                        Trace.beginSection(ui4.s(str));
                    } finally {
                        if (m) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    rm1Var.invoke();
                    dg3 dg3Var = uu2.L;
                    u33Var.a(dg3Var);
                    v00Var.a(dg3Var);
                } catch (Throwable th) {
                    u33Var.a(new cg3(th));
                    v00Var.b(th);
                }
                if (m) {
                    return;
                } else {
                    return;
                }
            default:
                List list = (List) obj4;
                nx5 nx5Var = (nx5) obj3;
                uf0 uf0Var = (uf0) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((na4) it.next()).d(nx5Var.a);
                }
                pa4.b(uf0Var, workDatabase, list);
                return;
        }
    }

    public /* synthetic */ ru(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.I = b;
        this.J = obj;
        this.M = obj2;
        this.K = obj3;
        this.L = obj4;
    }
}
