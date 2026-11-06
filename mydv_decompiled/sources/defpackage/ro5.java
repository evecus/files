package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.R;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class ro5 {
    public static final boolean a = qx4.t(Build.MANUFACTURER, "TPV", true);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r96, final boolean r97, androidx.media3.exoplayer.ExoPlayer r98, boolean r99, boolean r100, final defpackage.dp3 r101, defpackage.pq5 r102, float r103, long r104, int r106, int r107, final okhttp3.OkHttpClient r108, final defpackage.rm1 r109, final defpackage.tm1 r110, java.lang.Object r111, final defpackage.tm1 r112, final defpackage.tm1 r113, final defpackage.tm1 r114, final defpackage.rm1 r115, final defpackage.tm1 r116, defpackage.hn1 r117, boolean r118, final defpackage.tm1 r119, defpackage.rm1 r120, defpackage.tm1 r121, defpackage.l13 r122, defpackage.fe0 r123, final int r124, final int r125, final int r126, final int r127) {
        /*
            Method dump skipped, instructions count: 3065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro5.a(java.lang.String, boolean, androidx.media3.exoplayer.ExoPlayer, boolean, boolean, dp3, pq5, float, long, int, int, okhttp3.OkHttpClient, rm1, tm1, java.lang.Object, tm1, tm1, tm1, rm1, tm1, hn1, boolean, tm1, rm1, tm1, l13, fe0, int, int, int, int):void");
    }

    public static final void b(fp3 fp3Var, t43 t43Var, int i, int i2, float f) {
        AspectRatioFrameLayout aspectRatioFrameLayout;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float f2 = (i * f) / i2;
        PlayerView playerView = fp3Var.a;
        if (playerView == null || (aspectRatioFrameLayout = (AspectRatioFrameLayout) playerView.findViewById(R.id.exo_content_frame)) == null) {
            return;
        }
        Float f3 = (Float) t43Var.getValue();
        if (f3 == null || f3.floatValue() != f2) {
            aspectRatioFrameLayout.setAspectRatio(f2);
            t43Var.setValue(Float.valueOf(f2));
        }
    }

    public static final void c(fp3 fp3Var, t43 t43Var, int i, int i2, boolean z) {
        SurfaceHolder holder;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        PlayerView playerView = fp3Var.a;
        View videoSurfaceView = playerView != null ? playerView.getVideoSurfaceView() : null;
        SurfaceView surfaceView = videoSurfaceView instanceof SurfaceView ? (SurfaceView) videoSurfaceView : null;
        if (surfaceView == null || (holder = surfaceView.getHolder()) == null) {
            return;
        }
        gb5 gb5Var = new gb5(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        if (j42.c((gb5) t43Var.getValue(), gb5Var)) {
            return;
        }
        if (z) {
            holder.setFixedSize((i + 63) & (-64), i2);
        } else {
            holder.setSizeFromLayout();
        }
        t43Var.setValue(gb5Var);
    }

    public static final void d(t43 t43Var, ExoPlayer exoPlayer, String str, String str2) {
        if (((Boolean) t43Var.getValue()).booleanValue()) {
            return;
        }
        t43Var.setValue(Boolean.TRUE);
        exoPlayer.setVolume(1.0f);
        Log.d("VideoPlayer", "首帧音频解锁(" + str2 + "): url=" + jx4.f0(60, str));
    }

    public static final void e(t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4) {
        if (((Boolean) t43Var.getValue()).booleanValue()) {
            return;
        }
        t43Var.setValue(Boolean.TRUE);
        tm1 tm1Var = (tm1) t43Var3.getValue();
        if (tm1Var != null) {
            tm1Var.invoke(t43Var2.getValue());
        }
        rm1 rm1Var = (rm1) t43Var4.getValue();
        if (rm1Var != null) {
            rm1Var.invoke();
        }
    }

    public static final ExoPlayer f(Context context, OkHttpClient okHttpClient) {
        rs2 rs2Var = new rs2(ks5.b);
        ks5.a = rs2Var;
        rs2Var.b(ks5.b);
        ExoPlayer.Builder renderersFactory = new ExoPlayer.Builder(context.getApplicationContext()).setRenderersFactory(new po5(new v05(new rs2[]{rs2Var}), context.getApplicationContext()));
        renderersFactory.getClass();
        if (okHttpClient != null) {
            renderersFactory.setMediaSourceFactory(new DefaultMediaSourceFactory(sn5.a.b(context, okHttpClient)));
        }
        ExoPlayer build = renderersFactory.build();
        build.setRepeatMode(0);
        build.setPlayWhenReady(false);
        return build;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0098 -> B:10:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(androidx.media3.exoplayer.ExoPlayer r17, java.lang.String r18, long r19, defpackage.gj0 r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof defpackage.qo5
            if (r1 == 0) goto L15
            r1 = r0
            qo5 r1 = (defpackage.qo5) r1
            int r2 = r1.N
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.N = r2
            goto L1a
        L15:
            qo5 r1 = new qo5
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.M
            int r2 = r1.N
            r3 = 16
            r5 = 0
            r7 = 0
            wd5 r8 = defpackage.wd5.a
            r9 = 1
            if (r2 == 0) goto L40
            if (r2 != r9) goto L3a
            long r10 = r1.L
            long r12 = r1.K
            java.lang.String r2 = r1.J
            androidx.media3.exoplayer.ExoPlayer r7 = r1.I
            defpackage.mu0.V(r0)
            r0 = r2
            r15 = r12
            r12 = r1
            r1 = r15
            goto L9b
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r7
        L40:
            defpackage.mu0.V(r0)
            boolean r0 = defpackage.jx4.L(r18)
            if (r0 == 0) goto L4b
            goto Lc2
        L4b:
            androidx.media3.common.MediaItem r0 = r17.getCurrentMediaItem()
            if (r0 == 0) goto L5d
            androidx.media3.common.MediaItem$LocalConfiguration r0 = r0.localConfiguration
            if (r0 == 0) goto L5d
            android.net.Uri r0 = r0.uri
            if (r0 == 0) goto L5d
            java.lang.String r7 = r0.toString()
        L5d:
            r0 = r18
            boolean r2 = defpackage.j42.c(r7, r0)
            if (r2 == 0) goto L6c
            int r2 = r17.getPlaybackState()
            if (r2 == r9) goto L6c
            goto Lc2
        L6c:
            r2 = 0
            r7 = r17
            r7.setPlayWhenReady(r2)
            r7.pause()
            r10 = r1
            r11 = r5
            r1 = r19
        L79:
            boolean r13 = r7.isPlaying()
            if (r13 == 0) goto La0
            r13 = 500(0x1f4, double:2.47E-321)
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto La0
            r10.I = r7
            r10.J = r0
            r10.K = r1
            r10.L = r11
            r10.N = r9
            java.lang.Object r13 = defpackage.rt0.n(r3, r10)
            el0 r14 = defpackage.el0.I
            if (r13 != r14) goto L98
            return r14
        L98:
            r15 = r11
            r12 = r10
            r10 = r15
        L9b:
            long r10 = r10 + r3
            r15 = r10
            r10 = r12
            r11 = r15
            goto L79
        La0:
            r3 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = defpackage.jx4.f0(r3, r0)
            java.lang.String r4 = "动画期间准备视频(只下载不解码): "
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "VideoPlayer"
            android.util.Log.d(r4, r3)
            androidx.media3.common.MediaItem r0 = androidx.media3.common.MediaItem.fromUri(r0)
            r7.setMediaItem(r0)
            r7.prepare()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lc2
            r7.seekTo(r1)
        Lc2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro5.g(androidx.media3.exoplayer.ExoPlayer, java.lang.String, long, gj0):java.lang.Object");
    }

    public static final ExoPlayer h(OkHttpClient okHttpClient, fe0 fe0Var) {
        ExoPlayer exoPlayer;
        go1 go1Var = (go1) fe0Var;
        Context context = (Context) go1Var.k(rb.b);
        boolean g = go1Var.g(context.getApplicationContext()) | go1Var.g(okHttpClient);
        Object Q = go1Var.Q();
        jp jpVar = de0.a;
        Object obj = Q;
        if (g || Q == jpVar) {
            int identityHashCode = System.identityHashCode(okHttpClient);
            ExoPlayer exoPlayer2 = wi4.c;
            if (exoPlayer2 != null) {
                Integer num = wi4.d;
                if (num != null && num.intValue() == identityHashCode) {
                    Log.d("VideoPlayer", "复用全局共享播放器, 当前引用数: " + wi4.b);
                    exoPlayer2.setVolume(1.0f);
                    exoPlayer = exoPlayer2;
                    go1Var.o0(exoPlayer);
                    obj = exoPlayer;
                } else {
                    exoPlayer2.release();
                }
            }
            Log.d("VideoPlayer", "创建全局共享播放器");
            ExoPlayer f = f(context, okHttpClient);
            wi4.c = f;
            wi4.d = Integer.valueOf(identityHashCode);
            exoPlayer = f;
            go1Var.o0(exoPlayer);
            obj = exoPlayer;
        }
        ExoPlayer exoPlayer3 = (ExoPlayer) obj;
        boolean i = go1Var.i(exoPlayer3) | go1Var.i(okHttpClient);
        Object Q2 = go1Var.Q();
        if (i || Q2 == jpVar) {
            Q2 = new m1(exoPlayer3, okHttpClient, (byte) 25);
            go1Var.o0(Q2);
        }
        mw2.e(exoPlayer3, (tm1) Q2, go1Var);
        return exoPlayer3;
    }
}
