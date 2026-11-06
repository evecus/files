package com.github.mytv.dv;

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.PowerManager;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.Window;
import androidx.media3.common.C;
import com.github.mytv.dv.widget.WidgetRoutes;
import defpackage.ab4;
import defpackage.ad4;
import defpackage.aw5;
import defpackage.bw5;
import defpackage.cw5;
import defpackage.ep;
import defpackage.fl4;
import defpackage.fw4;
import defpackage.hu2;
import defpackage.j42;
import defpackage.jk3;
import defpackage.kr;
import defpackage.kx2;
import defpackage.lt2;
import defpackage.nk;
import defpackage.pt2;
import defpackage.r13;
import defpackage.ui4;
import defpackage.ut0;
import defpackage.v24;
import defpackage.zv5;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MainActivity extends nk {
    public static final lt2 Companion = new lt2();
    public static final v24 o0 = new v24("/video/(\\d+)");
    public static boolean p0;
    public hu2 j0;
    public kx2 m0;
    public final jk3 i0 = ad4.w(Boolean.FALSE);
    public final jk3 k0 = ad4.w(null);
    public final jk3 l0 = ad4.w(null);
    public final pt2 n0 = new pt2(this);

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String w(android.content.Intent r5) {
        /*
            java.lang.String r0 = "aweme_id"
            r1 = 0
            if (r5 == 0) goto L26
            java.lang.String r2 = r5.getStringExtra(r0)
            if (r2 == 0) goto L26
            java.lang.CharSequence r2 = defpackage.jx4.g0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L26
            r3 = 0
        L16:
            int r4 = r2.length()
            if (r3 >= r4) goto L2b
            char r4 = r2.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L28
        L26:
            r2 = r1
            goto L2b
        L28:
            int r3 = r3 + 1
            goto L16
        L2b:
            if (r2 == 0) goto L31
            r5.removeExtra(r0)
            return r2
        L31:
            if (r5 == 0) goto L53
            android.net.Uri r5 = r5.getData()
            if (r5 == 0) goto L53
            java.lang.String r5 = r5.getPath()
            if (r5 == 0) goto L53
            v24 r0 = com.github.mytv.dv.MainActivity.o0
            zv2 r5 = defpackage.v24.a(r0, r5)
            if (r5 == 0) goto L53
            java.util.List r5 = r5.a()
            r0 = 1
            java.lang.Object r5 = defpackage.o70.V0(r0, r5)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.MainActivity.w(android.content.Intent):java.lang.String");
    }

    @Override // defpackage.nk, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        context.getClass();
        fl4.Companion.getClass();
        float q = ut0.q(context.getSharedPreferences("douyin_auth", 0).getFloat("app_font_scale", 1.0f), 1.0f, 1.6f);
        if (q == 1.0f) {
            super.attachBaseContext(context);
            return;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.fontScale *= q;
        super.attachBaseContext(context.createConfigurationContext(configuration));
    }

    @Override // defpackage.nk, defpackage.hc0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        Integer num = (Integer) r13.e.get(Integer.valueOf(keyEvent.getKeyCode()));
        if (num == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(new KeyEvent(keyEvent.getDownTime(), keyEvent.getEventTime(), keyEvent.getAction(), num.intValue(), keyEvent.getRepeatCount(), keyEvent.getMetaState(), keyEvent.getDeviceId(), 0, keyEvent.getFlags()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        r5.run();
        r11 = getWindow();
        r11.getClass();
        r6.a(r11);
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        super.onCreate(r12);
        getWindow().setSoftInputMode(48);
        r11.k0.setValue(w(getIntent()));
        r12 = getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r12 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r3 = r12.getStringExtra(com.github.mytv.dv.widget.WidgetRoutes.EXTRA_ROUTE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e7, code lost:
    
        if (r3 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        r12.removeExtra(com.github.mytv.dv.widget.WidgetRoutes.EXTRA_ROUTE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        r11.l0.setValue(r3);
        getWindow().addFlags(128);
        r12 = new android.content.IntentFilter();
        r12.addAction("android.intent.action.SCREEN_OFF");
        r12.addAction("android.intent.action.SCREEN_ON");
        defpackage.z9.h(r11, r11.n0, r12, 4);
        r12 = defpackage.t34.a;
        r12 = getSharedPreferences("remote_config", 0);
        r12.getClass();
        defpackage.t34.i = r12;
        r12 = r12.getBoolean("license_agreed", false);
        r2 = defpackage.t34.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
    
        if (r2 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        r2 = r2.getInt("license_agreed_version", r12 ? 1 : 0);
        r5 = defpackage.t34.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        if (r5 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        r3 = r5.getInt("license_required_version", 1);
        r5 = defpackage.t34.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013d, code lost:
    
        if (r12 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
    
        if (r2 < r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r12 = java.lang.Boolean.valueOf(r12);
        r5.getClass();
        r5.i(null, r12);
        r11.m0 = new defpackage.kx2(r11);
        defpackage.p70.g0(defpackage.rt0.B(r11), null, null, new defpackage.mt2(r11, r11, r0), 3);
        defpackage.p70.g0(defpackage.rt0.B(r11), null, null, new defpackage.ft2(r11, r11, r1), 3);
        v(((java.lang.Boolean) r11.i0.getValue()).booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
    
        defpackage.jc0.a(r11, new defpackage.tc0(580265210, new defpackage.y1(r11, r4), true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x018d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018f, code lost:
    
        android.util.Log.e("MainActivity", "Fatal error in setContent", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0197, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0198, code lost:
    
        defpackage.j42.g0("prefs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019c, code lost:
    
        defpackage.j42.g0("prefs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ee, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nk, defpackage.ic0, defpackage.hc0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.nk, android.app.Activity
    public final void onDestroy() {
        kx2 kx2Var = this.m0;
        if (kx2Var != null) {
            kx2Var.a();
        }
        this.m0 = null;
        unregisterReceiver(this.n0);
        super.onDestroy();
    }

    @Override // defpackage.ic0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        this.k0.setValue(w(intent));
        String stringExtra = intent.getStringExtra(WidgetRoutes.EXTRA_ROUTE);
        if (stringExtra == null) {
            stringExtra = null;
        } else {
            intent.removeExtra(WidgetRoutes.EXTRA_ROUTE);
        }
        this.l0.setValue(stringExtra);
    }

    @Override // defpackage.ic0, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        hu2 hu2Var = this.j0;
        if (hu2Var != null) {
            fw4 fw4Var = hu2Var.H;
            Boolean valueOf = Boolean.valueOf(z);
            fw4Var.getClass();
            fw4Var.i(null, valueOf);
        }
    }

    @Override // defpackage.nk, android.app.Activity
    public final void onResume() {
        super.onResume();
        hu2 hu2Var = this.j0;
        if (hu2Var == null || !((Boolean) hu2Var.K.getValue()).booleanValue()) {
            return;
        }
        hu2 hu2Var2 = this.j0;
        if (hu2Var2 == null) {
            j42.g0("coordinator");
            throw null;
        }
        if (((Boolean) ((fw4) hu2Var2.I.I).getValue()).booleanValue()) {
            return;
        }
        hu2 hu2Var3 = this.j0;
        if (hu2Var3 == null) {
            j42.g0("coordinator");
            throw null;
        }
        jk3 jk3Var = hu2Var3.K;
        Boolean bool = Boolean.FALSE;
        jk3Var.setValue(bool);
        fw4 fw4Var = hu2Var3.N;
        fw4Var.getClass();
        fw4Var.i(null, bool);
    }

    @Override // defpackage.nk, android.app.Activity
    public final void onStart() {
        super.onStart();
        kx2 kx2Var = this.m0;
        if (kx2Var != null) {
            kx2Var.b(true);
        }
    }

    @Override // defpackage.nk, android.app.Activity
    public final void onStop() {
        kx2 kx2Var = this.m0;
        if (kx2Var != null) {
            kx2Var.b(false);
        }
        super.onStop();
    }

    @Override // defpackage.ic0, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (this.j0 == null) {
            return;
        }
        PowerManager powerManager = (PowerManager) getSystemService(PowerManager.class);
        if (powerManager != null && !powerManager.isInteractive()) {
            hu2 hu2Var = this.j0;
            if (hu2Var != null) {
                hu2Var.z();
                return;
            } else {
                j42.g0("coordinator");
                throw null;
            }
        }
        hu2 hu2Var2 = this.j0;
        if (hu2Var2 == null) {
            j42.g0("coordinator");
            throw null;
        }
        boolean booleanValue = ((Boolean) ((fw4) hu2Var2.h.i0.I).getValue()).booleanValue();
        hu2 hu2Var3 = this.j0;
        if (hu2Var3 == null) {
            j42.g0("coordinator");
            throw null;
        }
        ab4 ab4Var = (ab4) ((fw4) hu2Var3.M.I).getValue();
        if (!booleanValue || ab4Var == null) {
            hu2 hu2Var4 = this.j0;
            if (hu2Var4 != null) {
                hu2Var4.z();
                return;
            } else {
                j42.g0("coordinator");
                throw null;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return;
        }
        hu2 hu2Var5 = this.j0;
        if (hu2Var5 == null) {
            j42.g0("coordinator");
            throw null;
        }
        Float f = (Float) hu2Var5.J.getValue();
        hu2 hu2Var6 = this.j0;
        if (hu2Var6 == null) {
            j42.g0("coordinator");
            throw null;
        }
        if (((fw4) hu2Var6.M.I).getValue() == ab4.M) {
            f = null;
        }
        PictureInPictureParams.Builder aspectRatio = kr.b().setAspectRatio((f == null || f.floatValue() <= 0.0f) ? new Rational(16, 9) : new Rational((int) (ut0.q(f.floatValue(), 0.47f, 2.39f) * 1000.0f), 1000));
        ArrayList arrayList = new ArrayList();
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.github.mytv.dv.PIP_PAUSE").setPackage(getPackageName()), C.BUFFER_FLAG_NOT_DEPENDED_ON);
        kr.d();
        arrayList.add(kr.c(Icon.createWithResource(this, R.drawable.pip_pause), broadcast));
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 1, new Intent("com.github.mytv.dv.PIP_PLAY").setPackage(getPackageName()), C.BUFFER_FLAG_NOT_DEPENDED_ON);
        kr.d();
        arrayList.add(kr.e(Icon.createWithResource(this, R.drawable.pip_play), broadcast2));
        PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 2, new Intent("com.github.mytv.dv.PIP_NEXT").setPackage(getPackageName()), C.BUFFER_FLAG_NOT_DEPENDED_ON);
        kr.d();
        arrayList.add(kr.f(Icon.createWithResource(this, R.drawable.pip_next), broadcast3));
        PictureInPictureParams.Builder actions = aspectRatio.setActions(arrayList);
        if (i >= 31) {
            actions.setAutoEnterEnabled(true);
        }
        try {
            enterPictureInPictureMode(actions.build());
        } catch (Exception unused) {
            hu2 hu2Var7 = this.j0;
            if (hu2Var7 != null) {
                hu2Var7.z();
            } else {
                j42.g0("coordinator");
                throw null;
            }
        }
    }

    public final void v(boolean z) {
        Window window = getWindow();
        ep epVar = new ep(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        ui4 cw5Var = i >= 35 ? new cw5(window, epVar) : i >= 30 ? new bw5(window, epVar) : i >= 26 ? new aw5(window, epVar) : new zv5(window, epVar);
        if (!z) {
            cw5Var.k(1);
        } else {
            cw5Var.r();
            cw5Var.q();
        }
    }
}
