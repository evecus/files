package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class k24 implements Runnable {
    public int I;
    public int J;
    public OverScroller K;
    public Interpolator L;
    public boolean M;
    public boolean N;
    public final /* synthetic */ RecyclerView O;

    public k24(RecyclerView recyclerView) {
        this.O = recyclerView;
        q14 q14Var = RecyclerView.m1;
        this.L = q14Var;
        this.M = false;
        this.N = false;
        this.K = new OverScroller(recyclerView.getContext(), q14Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.O;
        recyclerView.setScrollState(2);
        this.J = 0;
        this.I = 0;
        Interpolator interpolator = this.L;
        q14 q14Var = RecyclerView.m1;
        if (interpolator != q14Var) {
            this.L = q14Var;
            this.K = new OverScroller(recyclerView.getContext(), q14Var);
        }
        this.K.fling(0, 0, i, i2, Integer.MIN_VALUE, Log.LOG_LEVEL_OFF, Integer.MIN_VALUE, Log.LOG_LEVEL_OFF);
        if (this.M) {
            this.N = true;
            return;
        }
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = dr5.a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.O;
        int[] iArr = recyclerView.Z0;
        if (recyclerView.V == null) {
            recyclerView.removeCallbacks(this);
            this.K.abortAnimation();
            return;
        }
        this.N = false;
        this.M = true;
        recyclerView.k();
        OverScroller overScroller = this.K;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.I;
            int i6 = currY - this.J;
            this.I = currX;
            this.J = currY;
            int j = RecyclerView.j(i5, recyclerView.s0, recyclerView.u0, recyclerView.getWidth());
            int j2 = RecyclerView.j(i6, recyclerView.t0, recyclerView.v0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.Z0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.p(j, j2, 1, iArr2, null)) {
                j -= iArr[0];
                j2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.i(j, j2);
            }
            if (recyclerView.U != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Z(j, j2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                recyclerView.V.getClass();
                i = j - i7;
                i3 = i7;
                i2 = j2 - i8;
                i4 = i8;
            } else {
                i = j;
                i2 = j2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.a0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.Z0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.q(i3, i4, i, i2, null, 1, iArr3);
            int i9 = i - iArr[0];
            int i10 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.r(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i9 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i10 != 0));
            recyclerView.V.getClass();
            if (z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i11 = i9 < 0 ? -currVelocity : i9 > 0 ? currVelocity : 0;
                    if (i10 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i10 <= 0) {
                        currVelocity = 0;
                    }
                    if (i11 < 0) {
                        recyclerView.t();
                        if (recyclerView.s0.isFinished()) {
                            recyclerView.s0.onAbsorb(-i11);
                        }
                    } else if (i11 > 0) {
                        recyclerView.u();
                        if (recyclerView.u0.isFinished()) {
                            recyclerView.u0.onAbsorb(i11);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.v();
                        if (recyclerView.t0.isFinished()) {
                            recyclerView.t0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.s();
                        if (recyclerView.v0.isFinished()) {
                            recyclerView.v0.onAbsorb(currVelocity);
                        }
                    }
                    if (i11 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = dr5.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.k1) {
                    mo1 mo1Var = recyclerView.M0;
                    int[] iArr4 = (int[]) mo1Var.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    mo1Var.c = 0;
                }
            } else {
                if (this.M) {
                    this.N = true;
                } else {
                    recyclerView.removeCallbacks(this);
                    WeakHashMap weakHashMap2 = dr5.a;
                    recyclerView.postOnAnimation(this);
                }
                a aVar = recyclerView.L0;
                if (aVar != null) {
                    aVar.b(recyclerView, i3, i4);
                }
            }
        }
        recyclerView.V.getClass();
        this.M = false;
        if (!this.N) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap3 = dr5.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
