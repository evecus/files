package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mc3 implements db3, c25 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: Removed duplicated region for block: B:131:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mc3(defpackage.ib3 r23) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc3.<init>(ib3):void");
    }

    public void a(eb3 eb3Var) {
        IconCompat a = eb3Var.a();
        boolean z = eb3Var.d;
        Bundle bundle = eb3Var.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(a != null ? k21.t0(a, null) : null, eb3Var.g, eb3Var.h);
        u34[] u34VarArr = eb3Var.c;
        if (u34VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[u34VarArr.length];
            if (u34VarArr.length > 0) {
                u34 u34Var = u34VarArr[0];
                throw null;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            g7.r(builder, z);
        }
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i >= 28) {
            ck.L(builder);
        }
        if (i >= 29) {
            io.s(builder);
        }
        if (i >= 31) {
            ub.t(builder);
        }
        if (i >= 37) {
            cb.a(builder);
            cb.c(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", eb3Var.e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.b).addAction(builder.build());
    }

    public void b(wv4 wv4Var) {
        Runnable runnable;
        wv4Var.getClass();
        synchronized (this.c) {
            runnable = (Runnable) ((LinkedHashMap) this.d).remove(wv4Var);
        }
        if (runnable != null) {
            ((Handler) ((uu2) this.a).I).removeCallbacks(runnable);
        }
    }

    public jz4 c(y6 y6Var) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jz4 jz4Var = (jz4) arrayList.get(i);
            if (jz4Var != null && jz4Var.b == y6Var) {
                return jz4Var;
            }
        }
        jz4 jz4Var2 = new jz4((Context) this.a, y6Var);
        arrayList.add(jz4Var2);
        return jz4Var2;
    }

    public int d() {
        iz2 iz2Var = (iz2) this.a;
        int a = iz2Var.a(4);
        if (a != 0) {
            return iz2Var.b.getInt(a + iz2Var.a);
        }
        return 0;
    }

    public g73 e(byte[] bArr) {
        byte[] bArr2 = bArr;
        z82 z82Var = (z82) this.b;
        yz yzVar = (yz) this.a;
        int i = yzVar.b;
        int i2 = yzVar.c;
        byte[][] bArr3 = new byte[i2][];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[i];
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[i];
        int i3 = 0;
        while (i3 < i2) {
            dq2.a0(bArr2, i3, 20);
            if (i3 < 0 || i3 >= i2) {
                s83.t("index out of bounds");
                return null;
            }
            long j = i3;
            byte[] bArr8 = bArr4;
            int i4 = 56;
            bArr8[24] = (byte) (j >>> 56);
            int i5 = 1;
            while (i5 < 8) {
                i4 -= 8;
                bArr8[24 + i5] = (byte) (j >>> i4);
                i5++;
                z82Var = z82Var;
                bArr6 = bArr6;
            }
            z82 z82Var2 = z82Var;
            byte[] bArr9 = bArr6;
            bArr4 = bArr8;
            int i6 = 24;
            int i7 = 1;
            z82Var2.a(3, (byte[]) this.c, bArr4, bArr5, 0);
            z82 z82Var3 = z82Var2;
            byte[] bArr10 = (byte[]) this.d;
            byte[] bArr11 = new byte[i];
            byte[] bArr12 = bArr5;
            int i8 = 0;
            while (i8 != 15) {
                dq2.a0(bArr2, i8, i6);
                byte[] bArr13 = bArr11;
                dq2.a0(bArr2, 0, 28);
                z82 z82Var4 = z82Var3;
                int i9 = i8;
                int i10 = i6;
                int i11 = i7;
                int i12 = i3;
                byte[] bArr14 = bArr10;
                byte[] bArr15 = bArr9;
                z82Var4.a(3, bArr14, bArr2, bArr15, 0);
                dq2.a0(bArr2, i11, 28);
                byte[] bArr16 = bArr7;
                z82Var4.a(3, bArr14, bArr2, bArr16, 0);
                for (int i13 = 0; i13 < i; i13++) {
                    bArr16[i13] = (byte) (bArr16[i13] ^ bArr12[i13]);
                }
                z82Var3 = z82Var4;
                z82Var3.a(0, bArr15, bArr16, bArr13, 0);
                i8 = i9 + 1;
                bArr7 = bArr16;
                bArr10 = bArr14;
                i7 = i11;
                bArr9 = bArr15;
                i3 = i12;
                bArr11 = bArr13;
                bArr12 = bArr11;
                i6 = i10;
                bArr2 = bArr;
            }
            int i14 = i3;
            bArr3[i14] = bArr11;
            i3 = i14 + 1;
            z82Var = z82Var3;
            bArr6 = bArr9;
            bArr2 = bArr;
        }
        return new g73((Object) bArr3, (byte) 18);
    }

    public hj f(hj hjVar, hj hjVar2) {
        mc3 mc3Var = this;
        hj hjVar3 = (hj) mc3Var.d;
        if (hjVar3 == null) {
            hjVar3 = hjVar.c();
            mc3Var.d = hjVar3;
        }
        int b = hjVar3.b();
        int i = 0;
        while (true) {
            hj hjVar4 = (hj) mc3Var.d;
            if (i >= b) {
                if (hjVar4 != null) {
                    return hjVar4;
                }
                j42.g0("targetVector");
                throw null;
            }
            if (hjVar4 == null) {
                j42.g0("targetVector");
                throw null;
            }
            ep epVar = (ep) mc3Var.a;
            float a = hjVar.a(i);
            float a2 = hjVar2.a(i);
            jf1 jf1Var = (jf1) epVar.J;
            float f = jf1Var.b;
            float f2 = jf1Var.a;
            float[] fArr = xc.a;
            double a3 = xc.a(a2, f2 * f);
            double d = kf1.a;
            float f3 = f2 * f;
            hjVar4.e((Math.signum(a2) * ((float) (Math.exp((d / (d - 1.0d)) * a3) * f3))) + a, i);
            i++;
            mc3Var = this;
            b = b;
        }
    }

    public hj g(long j, hj hjVar, hj hjVar2) {
        hj hjVar3 = (hj) this.c;
        if (hjVar3 == null) {
            hjVar3 = hjVar.c();
            this.c = hjVar3;
        }
        int b = hjVar3.b();
        int i = 0;
        while (true) {
            hj hjVar4 = (hj) this.c;
            if (i >= b) {
                if (hjVar4 != null) {
                    return hjVar4;
                }
                j42.g0("velocityVector");
                throw null;
            }
            if (hjVar4 == null) {
                j42.g0("velocityVector");
                throw null;
            }
            ep epVar = (ep) this.a;
            hjVar.getClass();
            long j2 = j / 1000000;
            if1 a = ((jf1) epVar.J).a(hjVar2.a(i));
            long j3 = a.c;
            hjVar4.e((((Math.signum(a.a) * xc.b(j3 > 0 ? j2 / j3 : 1.0f).b) * a.b) / j3) * 1000.0f, i);
            i++;
        }
    }

    public byte[] h(byte[] bArr, byte[] bArr2) {
        dq2.a0(bArr2, 0, 20);
        dq2.a0(bArr2, 0, 24);
        dq2.a0(bArr2, 0, 28);
        z82 z82Var = (z82) this.b;
        byte[] bArr3 = new byte[z82Var.b];
        z82Var.a(3, bArr, bArr2, bArr3, 0);
        return bArr3;
    }

    public void i(byte[] bArr, byte[] bArr2) {
        int i = ((yz) this.a).b;
        ry5.n("secretKeySeed", i, bArr);
        ry5.n("publicSeed", i, bArr2);
        byte[] bArr3 = (byte[]) this.c;
        System.arraycopy(bArr, 0, bArr3, 0, bArr3.length);
        byte[] bArr4 = (byte[]) this.d;
        System.arraycopy(bArr2, 0, bArr4, 0, bArr4.length);
    }

    public void j(lp4 lp4Var) {
        Object d = ((iz) this.c).d(lp4Var);
        if (d instanceof y40) {
            Throwable th = ((y40) d).a;
            if (th != null) {
                throw th;
            }
            throw new b70("Channel was closed normally");
        }
        if (d instanceof z40) {
            zy.i("Check failed.");
        } else if (((AtomicInteger) this.d).getAndIncrement() == 0) {
            p70.g0((dl0) this.a, null, null, new jd(this, null, (byte) 8), 3);
        }
    }

    public boolean k(y6 y6Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(c(y6Var), new oy2((Context) this.a, (nz4) menuItem));
    }

    public boolean l(y6 y6Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        jz4 c = c(y6Var);
        oo4 oo4Var = (oo4) this.d;
        Menu menu2 = (Menu) oo4Var.get(menu);
        if (menu2 == null) {
            menu2 = new zy2((Context) this.a, (sx2) menu);
            oo4Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(c, menu2);
    }

    public void m(wv4 wv4Var) {
        wv4Var.getClass();
        h8 h8Var = new h8(this, wv4Var, (byte) 29);
        synchronized (this.c) {
        }
        ((Handler) ((uu2) this.a).I).postDelayed(h8Var, 5400000L);
    }

    public mc3(uu2 uu2Var, v05 v05Var) {
        this.a = uu2Var;
        this.b = v05Var;
        this.c = new Object();
        this.d = new LinkedHashMap();
    }

    public mc3(dl0 dl0Var, am0 am0Var, jd jdVar) {
        this.a = dl0Var;
        this.b = jdVar;
        this.c = qb.g(Log.LOG_LEVEL_OFF, 6, null);
        this.d = new AtomicInteger(0);
        v52 v52Var = (v52) dl0Var.getCoroutineContext().get(q8.r0);
        if (v52Var == null) {
            return;
        }
        v52Var.Q(new x31(am0Var, this, (byte) 2));
    }

    public mc3(ExecutorService executorService) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new ob1(this, (byte) 2);
        vj4 vj4Var = new vj4(executorService);
        this.a = vj4Var;
        this.b = rt0.u(vj4Var);
    }

    public mc3(yz yzVar) {
        this.a = yzVar;
        int i = yzVar.b;
        this.b = new z82((q0) yzVar.d, i);
        this.c = new byte[i];
        this.d = new byte[i];
    }

    public mc3(Typeface typeface, iz2 iz2Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = iz2Var;
        this.c = new jz2(1024);
        int a = iz2Var.a(6);
        if (a != 0) {
            int i5 = a + iz2Var.a;
            i = iz2Var.b.getInt(iz2Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int a2 = iz2Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + iz2Var.a;
            i2 = iz2Var.b.getInt(iz2Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            ec5 ec5Var = new ec5(this, i7);
            hz2 b = ec5Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? b.b.getInt(a3 + b.a) : 0, (char[]) this.b, i7 * 2);
            hz2 b2 = ec5Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = b2.b.getInt(b2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            sv2.o("invalid metadata codepoint length", i3 > 0);
            jz2 jz2Var = (jz2) this.c;
            hz2 b3 = ec5Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = b3.b.getInt(b3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            jz2Var.a(ec5Var, 0, i4 - 1);
        }
    }

    public mc3(ep epVar) {
        this.a = epVar;
    }

    public mc3(Context context, ActionMode.Callback callback) {
        this.a = context;
        this.b = callback;
        this.c = new ArrayList();
        this.d = new oo4(0);
    }
}
