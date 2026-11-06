package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class md1 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public byte A;
    public final bl B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public byte v = 0;
    public byte w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public md1(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = (byte) 0;
        bl blVar = new bl(this, (byte) 4);
        this.B = blVar;
        jd1 jd1Var = new jd1(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new kd1(this));
        ofFloat.addUpdateListener(new ld1(this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.a0;
            e eVar = recyclerView2.V;
            if (eVar != null) {
                eVar.b("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.L();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.b0.remove(this);
            if (recyclerView3.c0 == this) {
                recyclerView3.c0 = null;
            }
            ArrayList arrayList2 = this.s.P0;
            if (arrayList2 != null) {
                arrayList2.remove(jd1Var);
            }
            this.s.removeCallbacks(blVar);
        }
        this.s = recyclerView;
        ArrayList arrayList3 = recyclerView.a0;
        e eVar2 = recyclerView.V;
        if (eVar2 != null) {
            eVar2.b("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.L();
        recyclerView.requestLayout();
        this.s.b0.add(this);
        RecyclerView recyclerView4 = this.s;
        ArrayList arrayList4 = recyclerView4.P0;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            recyclerView4.P0 = arrayList4;
        }
        arrayList4.add(jd1Var);
    }

    public static void a(Rect rect, View view) {
        ((z14) view.getLayoutParams()).a.getLayoutPosition();
        rect.set(0, 0, 0, 0);
    }

    public static int g(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean b(float f, float f2) {
        if (f2 < this.r - this.i) {
            return false;
        }
        int i = this.o;
        int i2 = this.n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean c(float f, float f2) {
        WeakHashMap weakHashMap = dr5.a;
        int layoutDirection = this.s.getLayoutDirection();
        int i = this.e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void d(Canvas canvas) {
        int i = this.q;
        RecyclerView recyclerView = this.s;
        if (i != recyclerView.getWidth() || this.r != recyclerView.getHeight()) {
            this.q = recyclerView.getWidth();
            this.r = recyclerView.getHeight();
            h(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i2 = this.q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.l;
                int i6 = this.k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f;
                int i9 = this.r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = dr5.a;
                if (recyclerView.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.u) {
                int i10 = this.r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.o;
                int i14 = this.n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.q;
                int i17 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean e(MotionEvent motionEvent) {
        byte b = this.v;
        if (b != 1) {
            return b == 2;
        }
        boolean c = c(motionEvent.getX(), motionEvent.getY());
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!c && !b2) {
            return false;
        }
        if (b2) {
            this.w = (byte) 1;
            this.p = (int) motionEvent.getX();
        } else if (c) {
            this.w = (byte) 2;
            this.m = (int) motionEvent.getY();
        }
        h(2);
        return true;
    }

    public final void f(MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean c = c(motionEvent.getX(), motionEvent.getY());
            boolean b = b(motionEvent.getX(), motionEvent.getY());
            if (c || b) {
                if (b) {
                    this.w = (byte) 1;
                    this.p = (int) motionEvent.getX();
                } else if (c) {
                    this.w = (byte) 2;
                    this.m = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            h(1);
            this.w = (byte) 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            i();
            byte b2 = this.w;
            RecyclerView recyclerView = this.s;
            int i = this.b;
            if (b2 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i;
                int i2 = this.q - i;
                iArr[1] = i2;
                float max = Math.max(i, Math.min(i2, x));
                if (Math.abs(this.o - max) >= 2.0f) {
                    int g = g(this.p, max, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.q);
                    if (g != 0) {
                        recyclerView.scrollBy(g, 0);
                    }
                    this.p = max;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i;
                int i3 = this.r - i;
                iArr2[1] = i3;
                float max2 = Math.max(i, Math.min(i3, y));
                if (Math.abs(this.l - max2) < 2.0f) {
                    return;
                }
                int g2 = g(this.m, max2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.r);
                if (g2 != 0) {
                    recyclerView.scrollBy(0, g2);
                }
                this.m = max2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        RecyclerView recyclerView = this.s;
        bl blVar = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            recyclerView.removeCallbacks(blVar);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            i();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(blVar);
            recyclerView.postDelayed(blVar, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(blVar);
            recyclerView.postDelayed(blVar, 1500L);
        }
        this.v = i;
    }

    public final void i() {
        byte b = this.A;
        ValueAnimator valueAnimator = this.z;
        if (b != 0) {
            if (b != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = (byte) 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
