package defpackage;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileInstallReceiver;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ep implements bs1, l54, du3, hu4, ij, ai5 {
    public final /* synthetic */ byte I;
    public Object J;

    public ep(byte b) {
        this.I = b;
        Object obj = null;
        switch (b) {
            case 4:
                this.J = new st4(p70.n);
                break;
            case 5:
                this.J = new ConcurrentHashMap(16);
                break;
            case 10:
                ru2 ru2Var = new ru2();
                this.J = ru2Var;
                if (!ru2Var.J) {
                    if (ru2Var.K) {
                        kr3.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ru2Var.a();
                    ru2Var.K = true;
                    break;
                }
                break;
            case 13:
                this.J = new ArrayList(32);
                break;
            case 14:
                this.J = Build.VERSION.SDK_INT >= 28 ? new no3() : new j81((byte) 20);
                break;
            case 15:
                this.J = new bs2(obj);
                break;
            case 18:
                this.J = new Region();
                break;
            default:
                this.J = new AtomicReference(null);
                break;
        }
    }

    public void A() {
        tl1 tl1Var = ((ll1) this.J).K;
        if (tl1Var.r == null) {
            return;
        }
        tl1Var.y = false;
        tl1Var.z = false;
        tl1Var.E.getClass();
        Iterator it = tl1Var.c.o().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                zl1.c();
                return;
            }
        }
    }

    public s32 B(g12 g12Var, AndroidComposeView androidComposeView) {
        long c;
        boolean a;
        long mo25screenToLocalMKHz9U;
        bs2 bs2Var = (bs2) this.J;
        bs2 bs2Var2 = new bs2(((ArrayList) g12Var.w()).size());
        ArrayList arrayList = (ArrayList) g12Var.w();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tp3 tp3Var = (tp3) arrayList.get(i);
            sp3 sp3Var = (sp3) bs2Var.d(tp3Var.d());
            if (sp3Var == null) {
                a = false;
                c = tp3Var.m();
                mo25screenToLocalMKHz9U = tp3Var.g();
            } else {
                c = sp3Var.c();
                a = sp3Var.a();
                mo25screenToLocalMKHz9U = androidComposeView.mo25screenToLocalMKHz9U(sp3Var.b());
            }
            bs2Var2.g(tp3Var.d(), new rp3(tp3Var.d(), tp3Var.m(), tp3Var.g(), tp3Var.b(), tp3Var.i(), c, mo25screenToLocalMKHz9U, a, tp3Var.l(), tp3Var.c(), tp3Var.k(), tp3Var.j(), tp3Var.f(), tp3Var.e(), 0));
            if (tp3Var.b()) {
                bs2Var.g(tp3Var.d(), new sp3(tp3Var.m(), tp3Var.h(), tp3Var.b()));
            } else {
                bs2Var.h(tp3Var.d());
            }
        }
        return new s32(bs2Var2, g12Var);
    }

    public void C(float f, float f2, float f3, float f4) {
        ((ArrayList) this.J).add(new xk3(f, f2, f3, f4));
    }

    public void D(float f, float f2, float f3, float f4) {
        ((ArrayList) this.J).add(new fl3(f, f2, f3, f4));
    }

    public boolean E(wa2 wa2Var) {
        if (!wa2Var.K()) {
            q02.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((st4) this.J).remove(wa2Var);
    }

    public void F(long j, float f) {
        o10 q = ((pn) this.J).q();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        q.m(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        q.e(f);
        q.m(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public Object G(k20 k20Var, rm1 rm1Var) {
        aq4 aq4Var;
        mj4 mj4Var;
        if (((ss4) this.J) == null) {
            jr3.b("Called runAndWatch on a manager that has been disposed of");
        }
        ss4 ss4Var = (ss4) this.J;
        if ((ss4Var instanceof aq4) && (mj4Var = (aq4Var = (aq4) ss4Var).f) != null && !mj4Var.equals(k20Var)) {
            c33 c33Var = new c33();
            mj4 mj4Var2 = aq4Var.f;
            if (mj4Var2 == null) {
                jr3.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            o43 o43Var = aq4Var.d;
            if (o43Var == null) {
                Object obj = aq4Var.b;
                obj.getClass();
                c33Var.j(mj4Var2, obj);
            } else {
                Object[] objArr = o43Var.b;
                long[] jArr = o43Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    c33Var.j(mj4Var2, objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            c33Var.b();
            aq4Var.c();
            this.J = c33Var;
        }
        ss4 ss4Var2 = (ss4) this.J;
        ss4Var2.getClass();
        ns4 u = ws4.h().u(ss4Var2.e(k20Var));
        ss4Var2.a(k20Var);
        try {
            ns4 j2 = u.j();
            try {
                Object invoke = rm1Var.invoke();
                u.c();
                ss4Var2.b();
                return invoke;
            } finally {
                ns4.q(j2);
            }
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    public void H(float f, float f2, long j) {
        o10 q = ((pn) this.J).q();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        q.m(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        q.c(f, f2);
        q.m(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void I(v22 v22Var) {
        ((Region) this.J).set(v22Var.a, v22Var.b, v22Var.c, v22Var.d);
    }

    public void J() {
        View view;
        View view2 = (View) this.J;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new h(view, (byte) 21));
    }

    public void K(float f, float f2) {
        ((pn) this.J).q().m(f, f2);
    }

    public void L(float f) {
        ((ArrayList) this.J).add(new il3(f));
    }

    public void M(float f) {
        ((ArrayList) this.J).add(new hl3(f));
    }

    @Override // defpackage.xh5
    public boolean a() {
        return false;
    }

    @Override // defpackage.bs1
    public Object b(Object obj) {
        return (String) obj;
    }

    @Override // defpackage.du3
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.xh5
    public hj d(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return ((ts0) this.J).d(j, hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.du3
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.J).setResultCode(i);
    }

    @Override // defpackage.hu4
    public Iterator g(iu4 iu4Var, CharSequence charSequence) {
        return new gu4(this, iu4Var, charSequence, (byte) 0);
    }

    @Override // defpackage.ij
    public nf1 get(int i) {
        switch (this.I) {
            case 27:
                return ((vf1[]) this.J)[i];
            default:
                return (nf1) this.J;
        }
    }

    @Override // defpackage.xh5
    public hj i(long j, hj hjVar, hj hjVar2, hj hjVar3) {
        return ((ts0) this.J).i(j, hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public hj j(hj hjVar, hj hjVar2, hj hjVar3) {
        return ((ts0) this.J).j(hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.xh5
    public long k(hj hjVar, hj hjVar2, hj hjVar3) {
        return ((ts0) this.J).k(hjVar, hjVar2, hjVar3);
    }

    @Override // defpackage.bs1
    public Iterator l() {
        return ((List) this.J).iterator();
    }

    public void m(wa2 wa2Var) {
        if (!wa2Var.K()) {
            q02.b("DepthSortedSet.add called on an unattached node");
        }
        ((st4) this.J).add(wa2Var);
    }

    public void n(float f, float f2, float f3, float f4, boolean z) {
        ((ArrayList) this.J).add(new zk3(f, f2, 0.0f, false, z, f3, f4));
    }

    public void o(float f, float f2, float f3, float f4, int i) {
        ((pn) this.J).q().l(f, f2, f3, f4, i);
    }

    public void p() {
        ((ArrayList) this.J).add(rk3.c);
    }

    public void q(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.J).add(new sk3(f, f2, f3, f4, f5, f6));
    }

    public void r(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.J).add(new al3(f, f2, f3, f4, f5, f6));
    }

    public cw4 s() {
        c81 a = c81.a();
        if (a.c() == 1) {
            return new sx1(true);
        }
        jk3 w = ad4.w(Boolean.FALSE);
        a.h(new sr0(w, this));
        return w;
    }

    public void t() {
        View view = (View) this.J;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public String toString() {
        switch (this.I) {
            case 4:
                return ((st4) this.J).toString();
            case 25:
                return "<" + ((String) this.J) + '>';
            default:
                return super.toString();
        }
    }

    public void u(float f) {
        ((ArrayList) this.J).add(new tk3(f));
    }

    public void v(float f) {
        ((ArrayList) this.J).add(new bl3(f));
    }

    public void w(float f, float f2, float f3, float f4) {
        pn pnVar = (pn) this.J;
        o10 q = pnVar.q();
        float intBitsToFloat = Float.intBitsToFloat((int) (pnVar.H() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pnVar.H() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            p02.a("Width and height must be greater than or equal to zero");
        }
        pnVar.X(floatToRawIntBits);
        q.m(f, f2);
    }

    public void x(float f, float f2) {
        ((ArrayList) this.J).add(new uk3(f, f2));
    }

    public void y(float f, float f2) {
        ((ArrayList) this.J).add(new cl3(f, f2));
    }

    public void z(float f, float f2) {
        ((ArrayList) this.J).add(new vk3(f, f2));
    }

    public /* synthetic */ ep(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    public ep(float f, float f2, hj hjVar) {
        ij g73Var;
        this.I = (byte) 29;
        int[] iArr = yh5.a;
        if (hjVar == null && f == 1.0f && f2 == 1500.0f) {
            g73Var = us0.I;
        } else if (hjVar != null) {
            g73Var = new ep(hjVar, f, f2);
        } else {
            g73Var = new g73(f, f2);
        }
        this.J = new ts0(g73Var);
    }

    public /* synthetic */ ep(byte b, boolean z) {
        this.I = b;
    }

    public ep(iu0 iu0Var) {
        this.I = (byte) 23;
        this.J = new jf1(fu4.a, iu0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:1: B:14:0x0045->B:15:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ep(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 0
            r0.I = r2
            r0.<init>()
            int r3 = r1.length
            r4 = 1
            int r3 = r3 - r4
            dp[][] r5 = new defpackage.dp[r3][]
            r6 = r2
            r7 = r4
            r8 = r7
        L12:
            if (r6 >= r3) goto L69
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r4) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r4) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r4
            goto L2d
        L33:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r2 = r8.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            dp[] r11 = new defpackage.dp[r2]
            r12 = 0
        L45:
            if (r12 >= r2) goto L63
            int r16 = r12 * 2
            r17 = r12
            dp r12 = new dp
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L45
        L63:
            r5[r6] = r11
            r6 = r9
            r8 = r13
            r2 = 0
            goto L12
        L69:
            r0.J = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.<init>(int[], float[], float[][]):void");
    }

    public ep(View view) {
        this.I = (byte) 22;
        if (Build.VERSION.SDK_INT >= 30) {
            qt4 qt4Var = new qt4(view, (byte) 21);
            qt4Var.K = view;
            this.J = qt4Var;
            return;
        }
        this.J = new ep((Object) view, (byte) 21);
    }

    public ep(TextView textView) {
        this.I = (byte) 8;
        this.J = new e91(textView);
    }

    public ep(long[] jArr) {
        v33 v33Var;
        this.I = (byte) 20;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            v33Var = new v33(copyOf.length);
            int i = v33Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = v33Var.a;
                    if (jArr2.length < length) {
                        jArr2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        v33Var.a = jArr2;
                    }
                    int i2 = v33Var.b;
                    if (i != i2) {
                        dq.P0(copyOf.length + i, i, i2, jArr2, jArr2);
                    }
                    dq.P0(i, 0, copyOf.length, copyOf, jArr2);
                    v33Var.b += copyOf.length;
                }
            } else {
                dq2.J0("");
                throw null;
            }
        } else {
            v33Var = new v33();
        }
        this.J = v33Var;
    }

    public ep(hj hjVar, float f, float f2) {
        this.I = (byte) 27;
        int b = hjVar.b();
        vf1[] vf1VarArr = new vf1[b];
        for (int i = 0; i < b; i++) {
            vf1VarArr[i] = new vf1(f, f2, hjVar.a(i));
        }
        this.J = vf1VarArr;
    }
}
