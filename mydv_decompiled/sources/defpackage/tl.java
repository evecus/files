package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tl {
    public int a;
    public Object b;
    public Object c;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (r9 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tl(defpackage.u22 r13, defpackage.mu0 r14) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl.<init>(u22, mu0):void");
    }

    public void a(int i, ge2 ge2Var) {
        if (i < 0) {
            t02.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        x32 x32Var = new x32(this.a, i, ge2Var);
        this.a += i;
        ((b53) this.b).c(x32Var);
    }

    public void b() {
        e85 e85Var;
        ImageView imageView = (ImageView) this.b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            h41.a(drawable);
        }
        if (drawable == null || (e85Var = (e85) this.c) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = nl.b;
        z44.o(drawable, e85Var, drawableState);
    }

    public x32 c(int i) {
        if (i < 0 || i >= this.a) {
            t02.e("Index " + i + ", size " + this.a);
        }
        x32 x32Var = (x32) this.c;
        if (x32Var != null) {
            int i2 = x32Var.a;
            if (i < x32Var.b + i2 && i2 <= i) {
                return x32Var;
            }
        }
        b53 b53Var = (b53) this.b;
        x32 x32Var2 = (x32) b53Var.I[vt0.f(i, b53Var)];
        this.c = x32Var2;
        return x32Var2;
    }

    public int d(Object obj) {
        a43 a43Var = (a43) this.b;
        int d = a43Var.d(obj);
        if (d >= 0) {
            return a43Var.c[d];
        }
        return -1;
    }

    public Object e(int i) {
        Object[] objArr = (Object[]) this.c;
        int i2 = i - this.a;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.b;
        int i9 = this.a;
        int i10 = i9 + 3;
        this.a = i10;
        int length = jArr.length;
        if (length <= i10) {
            int max = Math.max(length * 2, i10);
            this.b = Arrays.copyOf(jArr, max);
            this.c = Arrays.copyOf((long[]) this.c, max);
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i9] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i9 + 1] = (i4 << 32) | (4294967295L & i5);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, AnalyticsListener.EVENT_DRM_KEYS_LOADED) << 50) | (i11 << 25) | (i & 33554431);
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            q02.b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            q02.b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = n14.b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (Math.min((i9 - i7) / 3, AnalyticsListener.EVENT_DRM_KEYS_LOADED) << 50);
        return i9;
    }

    public void g(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.b;
        Context context = imageView.getContext();
        int[] iArr = qz3.f;
        pn N = pn.N(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) N.b;
        dr5.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) N.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = j42.C(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                h41.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                e21.N(imageView, N.t(2));
            }
            if (typedArray.hasValue(3)) {
                e21.O(imageView, h41.b(typedArray.getInt(3, -1), null));
            }
            N.T();
        } catch (Throwable th) {
            N.T();
            throw th;
        }
    }

    public void h(long j, int i, int i2, int i3) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & AnalyticsListener.EVENT_DRM_KEYS_LOADED) > 0) {
            int i5 = n14.b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.b;
            long[] jArr2 = (long[]) this.c;
            int i7 = this.a;
            jArr2[0] = (j & (-1125899873288193L)) | ((i & 33554431) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & AnalyticsListener.EVENT_DRM_KEYS_LOADED;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = ((((int) j6) + i3) & 4294967295L) | ((((int) (j6 >> 32)) + i2) << 32);
                        jArr[i15] = ((((int) j7) + i3) & 4294967295L) | ((((int) (j7 >> 32)) + i2) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & AnalyticsListener.EVENT_DRM_KEYS_LOADED) > 0) {
                            int i16 = n14.b;
                            jArr2[i8] = (j5 & j2) | (((i10 + 3) & i14) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    i6 = i14;
                    c3 = c;
                    c2 = c4;
                    j3 = j2;
                }
                i6 = i6;
                c3 = c3;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public tl(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public tl() {
        this.b = new b53(new x32[16]);
    }
}
