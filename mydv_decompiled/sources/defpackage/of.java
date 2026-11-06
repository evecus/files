package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.view.ActionMode;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class of implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ of(Object obj, Object obj2, Object obj3, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
        this.L = obj3;
    }

    private final void a() {
        boolean z;
        yt3 yt3Var = (yt3) this.J;
        y00 y00Var = (y00) this.K;
        dz5 dz5Var = (dz5) this.L;
        yt3Var.getClass();
        try {
            z = ((Boolean) y00Var.J.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        synchronized (yt3Var.k) {
            try {
                nx5 B = hc4.B(dz5Var.a);
                String str = B.a;
                if (yt3Var.d(str) == dz5Var) {
                    yt3Var.b(str);
                }
                fr2.e().a(yt3.l, yt3.class.getSimpleName() + " " + str + " executed; reschedule = " + z);
                ArrayList arrayList = yt3Var.j;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((nb1) obj).b(B, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.I) {
            case 0:
                qf qfVar = (qf) this.J;
                mf mfVar = (mf) this.K;
                nf nfVar = (nf) this.L;
                ActionMode startActionMode = qfVar.a.startActionMode(new xf1(mfVar), 1);
                qfVar.h = startActionMode;
                if (startActionMode == null) {
                    nfVar.close();
                    return;
                }
                return;
            case 1:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$1((AudioTrack) this.J, (Handler) this.K, (ListenerSet) this.L);
                return;
            case 2:
                ((BasePreloadManager) this.J).lambda$onMediaSourceUpdated$9((MediaItem) this.K, (MediaSource) this.L);
                return;
            case 3:
                ((BasePreloadManager) this.J).lambda$onCompleted$3((MediaItem) this.K, (mr3) this.L);
                return;
            case 4:
                WorkDatabase workDatabase = (WorkDatabase) this.J;
                String str = (String) this.K;
                ux5 ux5Var = (ux5) this.L;
                oy5 w = workDatabase.w();
                w.getClass();
                str.getClass();
                Iterator it = ((List) g4.V(w.a, true, false, new pu0(str, (byte) 14))).iterator();
                while (it.hasNext()) {
                    d4.k(ux5Var, (String) it.next());
                }
                return;
            case 5:
                ((DrmSessionEventListener.EventDispatcher) this.J).lambda$drmSessionManagerError$2((DrmSessionEventListener) this.K, (Exception) this.L);
                return;
            case 6:
                ((DrmSessionEventListener.EventDispatcher) this.J).lambda$drmKeysLoaded$1((DrmSessionEventListener) this.K, (KeyRequestInfo) this.L);
                return;
            case 7:
                a();
                return;
            case 8:
                ((ServerSideAdInsertionMediaSource) this.J).lambda$setAdPlaybackStates$0((Timeline) this.K, (iy1) this.L);
                return;
            case 9:
                Util.lambda$transformFutureAsync$2((fl2) this.J, (al4) this.K, (mq) this.L);
                return;
            case 10:
                Util.lambda$postOrRunWithCompletion$0((al4) this.J, (Runnable) this.K, this.L);
                return;
            default:
                v05 v05Var = (v05) this.J;
                wv4 wv4Var = (wv4) this.K;
                x81 x81Var = (x81) this.L;
                final yt3 yt3Var = (yt3) v05Var.a;
                yt3Var.getClass();
                nx5 nx5Var = wv4Var.a;
                final String str2 = nx5Var.a;
                final ArrayList arrayList = new ArrayList();
                ky5 ky5Var = (ky5) yt3Var.e.n(new Callable() { // from class: xt3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WorkDatabase workDatabase2 = yt3.this.e;
                        qy5 x = workDatabase2.x();
                        x.getClass();
                        String str3 = str2;
                        str3.getClass();
                        arrayList.addAll((List) g4.V(x.a, true, false, new pu0(str3, (byte) 22)));
                        return workDatabase2.w().e(str3);
                    }
                });
                if (ky5Var == null) {
                    fr2.e().i(yt3.l, "Didn't find WorkSpec for id " + nx5Var);
                    yt3Var.h(nx5Var);
                    return;
                }
                synchronized (yt3Var.k) {
                    try {
                        if (yt3Var.f(str2)) {
                            Set set = (Set) yt3Var.h.get(str2);
                            if (((wv4) set.iterator().next()).a.b == nx5Var.b) {
                                set.add(wv4Var);
                                fr2.e().a(yt3.l, "Work " + nx5Var + " is already enqueued for processing");
                            } else {
                                yt3Var.h(nx5Var);
                            }
                            return;
                        }
                        if (ky5Var.t != nx5Var.b) {
                            yt3Var.h(nx5Var);
                            return;
                        }
                        ie2 ie2Var = new ie2(yt3Var.b, yt3Var.c, yt3Var.d, yt3Var, yt3Var.e, ky5Var, arrayList);
                        if (x81Var != null) {
                            ie2Var.h = x81Var;
                        }
                        dz5 dz5Var = new dz5(ie2Var);
                        y00 O = il2.O(((vk0) dz5Var.e.b).plus(vt0.b()), new bz5(dz5Var, null, b));
                        O.J.a((ob1) yt3Var.d.d, new of(yt3Var, O, dz5Var, (byte) 7));
                        yt3Var.g.put(str2, dz5Var);
                        HashSet hashSet = new HashSet();
                        hashSet.add(wv4Var);
                        yt3Var.h.put(str2, hashSet);
                        fr2.e().a(yt3.l, yt3.class.getSimpleName() + ": processing " + nx5Var);
                        return;
                    } finally {
                    }
                }
        }
    }
}
