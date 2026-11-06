package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class g12 implements p84, u81, dr3, e22, ty4, kg3 {
    public static final int[] L = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ byte I;
    public Object J;
    public Object K;

    public g12(byte b) {
        this.I = b;
        switch (b) {
            case 15:
                this.J = new SparseIntArray();
                this.K = new SparseIntArray();
                break;
            case 19:
                ub5 ub5Var = p70.F;
                Float valueOf = Float.valueOf(0.0f);
                this.K = new cj(ub5Var, valueOf, (hj) ub5Var.a.invoke(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 25:
                this.J = new ContentValues();
                break;
            case 26:
                this.J = new LinkedHashMap();
                this.K = new LinkedHashMap();
                break;
            case 28:
                this.J = new Object();
                q33 q33Var = q22.a;
                this.K = new q33();
                break;
            case 29:
                this.J = new i84(128);
                this.K = new i84(256);
                break;
            default:
                this.J = new li5(true);
                this.K = new li5(true);
                break;
        }
    }

    public static boolean C(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public static g12 r(nk nkVar) {
        return new g12(nkVar, nkVar.f());
    }

    public static int y(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A() {
        ((SparseIntArray) this.J).clear();
    }

    public boolean B() {
        return !(((Number) ((cj) this.K).J.getValue()).floatValue() == 0.0f);
    }

    public boolean D() {
        boolean z;
        synchronized (this.J) {
            z = ((q33) this.K).e == 0;
        }
        return z;
    }

    public void E(AttributeSet attributeSet, int i) {
        switch (this.I) {
            case 1:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.J;
                pn N = pn.N(absSeekBar.getContext(), attributeSet, L, i);
                Drawable w = N.w(0);
                if (w != null) {
                    if (w instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) w;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable V = V(animationDrawable.getFrame(i2), true);
                            V.setLevel(10000);
                            animationDrawable2.addFrame(V, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        w = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(w);
                }
                Drawable w2 = N.w(1);
                if (w2 != null) {
                    absSeekBar.setProgressDrawable(V(w2, false));
                }
                N.T();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.J).getContext().obtainStyledAttributes(attributeSet, qz3.i, i, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    S(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public void F() {
        String str = (String) this.J;
        if (((FileChannel) this.K) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.K = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.K;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.K = null;
            zl1.i(r7.C("Unable to lock file: '", str, "'."), th);
        }
    }

    public int G(int i) {
        uw2 t = t();
        wa2 wa2Var = (wa2) this.J;
        return t.maxIntrinsicHeight(wa2Var.n0.d, wa2Var.n(), i);
    }

    public int H(int i) {
        uw2 t = t();
        wa2 wa2Var = (wa2) this.J;
        return t.maxIntrinsicWidth(wa2Var.n0.d, wa2Var.n(), i);
    }

    public int I(int i) {
        uw2 t = t();
        wa2 wa2Var = (wa2) this.J;
        return t.minIntrinsicHeight(wa2Var.n0.d, wa2Var.n(), i);
    }

    public int J(int i) {
        uw2 t = t();
        wa2 wa2Var = (wa2) this.J;
        return t.minIntrinsicWidth(wa2Var.n0.d, wa2Var.n(), i);
    }

    public void K(int i, int i2) {
        int[] iArr = (int[]) this.J;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        p(i3);
        int[] iArr2 = (int[]) this.J;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.J, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.K;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nv4 nv4Var = (nv4) ((ArrayList) this.K).get(size);
            int i4 = nv4Var.I;
            if (i4 >= i) {
                nv4Var.I = i4 + i2;
            }
        }
    }

    public void L(int i, int i2) {
        int[] iArr = (int[]) this.J;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        p(i3);
        int[] iArr2 = (int[]) this.J;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.J;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.K;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nv4 nv4Var = (nv4) ((ArrayList) this.K).get(size);
            int i4 = nv4Var.I;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.K).remove(size);
                } else {
                    nv4Var.I = i4 - i2;
                }
            }
        }
    }

    public boolean M(y6 y6Var, Menu menu) {
        return ((mc3) this.J).l(y6Var, menu);
    }

    public k81 N(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        uu2 uu2Var = (uu2) this.K;
        if (inputConnection == null) {
            inputConnection2 = null;
        } else {
            g12 g12Var = (g12) uu2Var.I;
            if (!(inputConnection instanceof k81)) {
                inputConnection = new k81((EditText) g12Var.J, inputConnection, editorInfo);
            }
            inputConnection2 = inputConnection;
        }
        return (k81) inputConnection2;
    }

    public void O(y6 y6Var) {
        mc3 mc3Var = (mc3) this.J;
        ((ActionMode.Callback) mc3Var.b).onDestroyActionMode(mc3Var.c(y6Var));
        kl klVar = (kl) this.K;
        if (klVar.d0 != null) {
            klVar.T.getDecorView().removeCallbacks(klVar.e0);
        }
        if (klVar.c0 != null) {
            zr5 zr5Var = klVar.f0;
            if (zr5Var != null) {
                zr5Var.b();
            }
            zr5 a = dr5.a(klVar.c0);
            a.a(0.0f);
            klVar.f0 = a;
            a.d(new al(this, (byte) 2));
        }
        klVar.b0 = null;
        ViewGroup viewGroup = klVar.h0;
        WeakHashMap weakHashMap = dr5.a;
        viewGroup.requestApplyInsets();
        klVar.H();
    }

    public boolean P(y6 y6Var, Menu menu) {
        ViewGroup viewGroup = ((kl) this.K).h0;
        WeakHashMap weakHashMap = dr5.a;
        viewGroup.requestApplyInsets();
        mc3 mc3Var = (mc3) this.J;
        ActionMode.Callback callback = (ActionMode.Callback) mc3Var.b;
        jz4 c = mc3Var.c(y6Var);
        oo4 oo4Var = (oo4) mc3Var.d;
        Menu menu2 = (Menu) oo4Var.get(menu);
        if (menu2 == null) {
            menu2 = new zy2((Context) mc3Var.a, (sx2) menu);
            oo4Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(c, menu2);
    }

    public void Q(ck1 ck1Var) {
        ob1 ob1Var = (ob1) this.K;
        g73 g73Var = (g73) this.J;
        int i = ck1Var.b;
        if (i == 0) {
            ob1Var.execute(new wn1(g73Var, ck1Var.a, (byte) 6));
        } else {
            ob1Var.execute(new z00(g73Var, i));
        }
    }

    public void R(dy4 dy4Var) {
        int i;
        q33 q33Var = (q33) this.K;
        int[] iArr = q33Var.b;
        Object[] objArr = q33Var.c;
        long[] jArr = q33Var.a;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        int i8 = iArr[i7];
                        vx4 vx4Var = (vx4) objArr[i7];
                        wx4 wx4Var = vx4Var.c;
                        g12 g12Var = vx4Var.e;
                        int ordinal = wx4Var.ordinal();
                        if (ordinal != 0) {
                            byte b = 20;
                            fj0 fj0Var = null;
                            i = i4;
                            if (ordinal == i2) {
                                vx4Var.c = wx4.M;
                                dl0 coroutineScope = dy4Var.getCoroutineScope();
                                rv4 rv4Var = vx4Var.d;
                                if (rv4Var != null) {
                                    rv4Var.e(null);
                                }
                                vx4Var.d = p70.g0(coroutineScope, null, null, new gu2(g12Var, vx4Var, fj0Var, b), 3);
                            } else if (ordinal == 3) {
                                dl0 coroutineScope2 = dy4Var.getCoroutineScope();
                                rv4 rv4Var2 = vx4Var.d;
                                if (rv4Var2 != null) {
                                    rv4Var2.e(null);
                                }
                                vx4Var.d = p70.g0(coroutineScope2, null, null, new gu2(g12Var, vx4Var, fj0Var, b), 3);
                            }
                        } else {
                            i = i4;
                            vx4Var.c = wx4.N;
                        }
                    } else {
                        i = i4;
                    }
                    j >>= i;
                    i6++;
                    i4 = i;
                    i2 = 2;
                }
                if (i5 != i4) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            }
            i3++;
            i2 = 2;
        }
    }

    public void S(boolean z) {
        g91 g91Var = (g91) ((g12) ((uu2) this.K).I).K;
        if (g91Var.K != z) {
            if (g91Var.J != null) {
                c81 a = c81.a();
                f91 f91Var = g91Var.J;
                a.getClass();
                sv2.q(f91Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(f91Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            g91Var.K = z;
            if (z) {
                g91.a(g91Var.I, c81.a().c());
            }
        }
    }

    public void T() {
        this.K = null;
    }

    public void U() {
        rv4 rv4Var = (rv4) this.J;
        hj hjVar = null;
        if (rv4Var != null) {
            rv4Var.e(null);
        }
        this.K = new cj(p70.F, Float.valueOf(0.0f), hjVar, 60);
    }

    public Drawable V(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.K) == null) {
                this.K = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = V(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public float W(int i) {
        synchronized (this.J) {
            vx4 vx4Var = (vx4) ((q33) this.K).b(i);
            float f = 0.0f;
            if (vx4Var == null) {
                return 0.0f;
            }
            if (vx4Var.c != wx4.M) {
                f = ((Number) vx4Var.b.d()).floatValue();
            }
            return f;
        }
    }

    public void X() {
        synchronized (this) {
            ((AtomicInteger) this.J).decrementAndGet();
            if (((AtomicInteger) this.J).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void Y(uw2 uw2Var) {
        ((jk3) this.K).setValue(uw2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Z(float f, iu0 iu0Var, dl0 dl0Var) {
        if (f <= iu0Var.P(1.0f)) {
            return;
        }
        ns4 i = o63.i();
        fj0 fj0Var = null;
        Object[] objArr = 0;
        tm1 e = i != null ? i.e() : null;
        ns4 j = o63.j(i);
        try {
            float floatValue = ((Number) ((cj) this.K).J.getValue()).floatValue();
            rv4 rv4Var = (rv4) this.J;
            if (rv4Var != null) {
                rv4Var.e(null);
            }
            cj cjVar = (cj) this.K;
            if (cjVar.N) {
                this.K = o7.o(cjVar, floatValue - f, 0.0f, 30);
            } else {
                this.K = new cj(p70.F, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.J = p70.g0(dl0Var, null, null, new h40((Object) this, fj0Var, (byte) 11), 3);
            o63.o(i, j, e);
        } catch (Throwable th) {
            o63.o(i, j, e);
            throw th;
        }
    }

    @Override // defpackage.dr3
    public er3 a(er3 er3Var) {
        j16 j16Var;
        v51 v51Var = (v51) this.J;
        cf1 cf1Var = er3Var instanceof cf1 ? (cf1) er3Var : null;
        BigInteger bigInteger = v51Var.d;
        int j = bigInteger == null ? v51Var.j() + 1 : bigInteger.bitLength();
        int i = j > 250 ? 6 : 5;
        int i2 = 1 << i;
        if (cf1Var != null && (j16Var = cf1Var.b) != null && j16Var.A() >= i2) {
            return cf1Var;
        }
        int i3 = ((j + i) - 1) / i;
        g61[] g61VarArr = new g61[i + 1];
        g61VarArr[0] = (g61) this.K;
        for (int i4 = 1; i4 < i; i4++) {
            g61VarArr[i4] = g61VarArr[i4 - 1].o(i3);
        }
        g61 g61Var = g61VarArr[0];
        g61 g61Var2 = g61VarArr[1];
        switch (g61Var.f) {
            case 0:
                if (!g61Var2.i()) {
                    g61Var = g61Var.a(g61Var2.k());
                    break;
                }
                break;
            default:
                if (!g61Var2.i()) {
                    g61Var = g61Var.a(g61Var2.k());
                    break;
                }
                break;
        }
        g61VarArr[i] = g61Var;
        v51Var.m(g61VarArr);
        g61[] g61VarArr2 = new g61[i2];
        g61VarArr2[0] = g61VarArr[0];
        for (int i5 = i - 1; i5 >= 0; i5--) {
            g61 g61Var3 = g61VarArr[i5];
            int i6 = 1 << i5;
            for (int i7 = i6; i7 < i2; i7 += i6 << 1) {
                g61VarArr2[i7] = g61VarArr2[i7 - i6].a(g61Var3);
            }
        }
        v51Var.m(g61VarArr2);
        cf1 cf1Var2 = new cf1();
        cf1Var2.a = null;
        cf1Var2.b = null;
        cf1Var2.c = -1;
        cf1Var2.b = v51Var.b(g61VarArr2, i2);
        cf1Var2.a = g61VarArr[i];
        cf1Var2.c = i;
        return cf1Var2;
    }

    @Override // defpackage.ty4
    public uy4 apply() {
        return ((kb2) this.J).e(this.K);
    }

    @Override // defpackage.u81
    public Object b() {
        return (je5) this.J;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:49:0x00b6, B:50:0x00b9, B:51:0x00d1), top: B:47:0x00b4 }] */
    @Override // defpackage.p84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.o84 c(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g12.c(java.lang.String):o84");
    }

    @Override // defpackage.kg3
    public List d(Integer num) {
        List d = ((kg3) this.J).d(null);
        wr4 wr4Var = (wr4) this.K;
        int i = wr4Var.v;
        return i < 0 ? d : o70.f1(a5.o(wr4Var, num, i, Integer.valueOf(wr4Var.F(i, wr4Var.b))), d);
    }

    @Override // defpackage.ty4
    public boolean e(eq0 eq0Var) {
        return true;
    }

    @Override // defpackage.kg3
    public boolean f() {
        return ((kg3) this.J).f();
    }

    public d55 g(List list) {
        c71 c71Var;
        Exception e;
        c71 c71Var2;
        try {
            int size = list.size();
            int i = 0;
            c71Var = null;
            while (i < size) {
                try {
                    c71Var2 = (c71) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    c71Var2.a((d71) this.K);
                    i++;
                    c71Var = c71Var2;
                } catch (Exception e3) {
                    e = e3;
                    c71Var = c71Var2;
                    StringBuilder sb = new StringBuilder();
                    int d = ((d71) this.K).a.d();
                    d65 c = ((d71) this.K).c();
                    d71 d71Var = (d71) this.K;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + d + ", composition=" + c + ", selection=" + d65.h(ui4.c(d71Var.b, d71Var.c)) + "):");
                    sb.append('\n');
                    o70.Y0(list, sb, new v1(c71Var, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            d71 d71Var2 = (d71) this.K;
            d71Var2.getClass();
            oj ojVar = new oj(d71Var2.a.toString());
            d71 d71Var3 = (d71) this.K;
            long c2 = ui4.c(d71Var3.b, d71Var3.c);
            d65 d65Var = d65.g(((d55) this.J).b) ? null : new d65(c2);
            d55 d55Var = new d55(ojVar, d65Var != null ? d65Var.a : ui4.c(d65.e(c2), d65.f(c2)), ((d71) this.K).c());
            this.J = d55Var;
            return d55Var;
        } catch (Exception e4) {
            c71Var = null;
            e = e4;
        }
    }

    @Override // defpackage.u81
    public boolean h(CharSequence charSequence, int i, int i2, ec5 ec5Var) {
        if ((ec5Var.c & 4) > 0) {
            return true;
        }
        if (((je5) this.J) == null) {
            this.J = new je5(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((jp) this.K).getClass();
        ((je5) this.J).setSpan(new fc5(ec5Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.ty4
    public boolean i() {
        return true;
    }

    public boolean j() {
        synchronized (this) {
            if (((AtomicBoolean) this.K).get()) {
                return false;
            }
            ((AtomicInteger) this.J).incrementAndGet();
            return true;
        }
    }

    public ys3 k() {
        ((ContentValues) this.J).put("type", "TYPE_PREVIEW");
        if (TextUtils.isEmpty(((ContentValues) this.J).getAsString("display_name"))) {
            zy.i("Need channel name. Use method setDisplayName(String) to set it.");
            return null;
        }
        if (TextUtils.isEmpty(((ContentValues) this.J).getAsString("app_link_intent_uri"))) {
            zy.i("Need app link intent uri for channel. Use method setAppLinkIntent or setAppLinkIntentUri to set it.");
            return null;
        }
        ys3 ys3Var = new ys3();
        ys3Var.a = (ContentValues) this.J;
        ys3Var.b = null;
        Uri uri = (Uri) this.K;
        ys3Var.c = uri;
        ys3Var.d = (ys3Var.b == null && uri == null) ? false : true;
        return ys3Var;
    }

    public void l() {
        synchronized (this.J) {
            q33 q33Var = (q33) this.K;
            long[] jArr = q33Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = q33Var.b[i4];
                                vx4 vx4Var = (vx4) q33Var.c[i4];
                                if (vx4Var.c != wx4.M && !((Boolean) vx4Var.b.d.getValue()).booleanValue()) {
                                    q33Var.h(i4);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public void m() {
        int[] iArr = (int[]) this.J;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.K = null;
    }

    public void n() {
        synchronized (this) {
            try {
                n43 n43Var = (n43) this.J;
                if (n43Var != null) {
                    n43Var.a();
                }
                this.K = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(String str, PrintWriter printWriter) {
        cu4 cu4Var = ((eq2) this.K).b;
        if (cu4Var.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (cu4Var.e() <= 0) {
                return;
            }
            if (cu4Var.f(0) != null) {
                zl1.c();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cu4Var.c(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public void p(int i) {
        int[] iArr = (int[]) this.J;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.J = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.J = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.J;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public InputMethodManager q() {
        return (InputMethodManager) ((uc2) this.K).getValue();
    }

    public KeyListener s(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        if (keyListener instanceof n81) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new n81(keyListener);
    }

    public uw2 t() {
        return (uw2) ((jk3) this.K).getValue();
    }

    @Override // defpackage.e22
    public a22 toInstant() {
        throw new b22(((String) this.J) + " when parsing an Instant from \"" + eu5.u0(64, (String) this.K) + '\"');
    }

    public String toString() {
        int lastIndexOf;
        switch (this.I) {
            case 20:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                nk nkVar = (nk) this.J;
                String simpleName = nkVar.getClass().getSimpleName();
                if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = nkVar.getClass().getName()).lastIndexOf(46)) > 0) {
                    simpleName = simpleName.substring(lastIndexOf + 1);
                }
                sb.append(simpleName);
                sb.append('{');
                sb.append(Integer.toHexString(System.identityHashCode(nkVar)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public bx2 u() {
        return (bx2) this.K;
    }

    public MotionEvent v() {
        return (MotionEvent) this.K;
    }

    public List w() {
        return (ArrayList) this.J;
    }

    public List x() {
        return (List) this.J;
    }

    public long z() {
        long j;
        int i;
        synchronized (this.J) {
            q33 q33Var = (q33) this.K;
            int[] iArr = q33Var.b;
            Object[] objArr = q33Var.c;
            long[] jArr = q33Var.a;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                vx4 vx4Var = (vx4) objArr[i6];
                                i = i3;
                                if (vx4Var.c == wx4.M || ((Boolean) vx4Var.b.d.getValue()).booleanValue()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return j;
    }

    @Override // defpackage.ty4, defpackage.l10
    public void cancel() {
    }

    public /* synthetic */ g12(Object obj, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = obj2;
    }

    public /* synthetic */ g12(byte b, boolean z) {
        this.I = b;
    }

    public g12(wa2 wa2Var, uw2 uw2Var) {
        this.I = (byte) 17;
        this.J = wa2Var;
        this.K = ad4.w(uw2Var);
    }

    public g12(String str) {
        this.I = (byte) 12;
        this.J = str.concat(".lck");
    }

    public g12(xa xaVar) {
        this.I = (byte) 7;
        this.J = new AtomicInteger(0);
        this.K = new AtomicBoolean(false);
    }

    public g12(nk nkVar, vr5 vr5Var) {
        this.I = (byte) 20;
        this.J = nkVar;
        vr5Var.getClass();
        ul0 ul0Var = ul0.b;
        ul0Var.getClass();
        ts0 ts0Var = new ts0(vr5Var, eq2.c, ul0Var);
        k60 a = s24.a(eq2.class);
        String b = a.b();
        if (b != null) {
            this.K = (eq2) ts0Var.p(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        } else {
            s83.t("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public g12(AbsSeekBar absSeekBar) {
        this.I = (byte) 1;
        this.J = absSeekBar;
    }

    public g12(EditText editText, byte b) {
        this.I = b;
        switch (b) {
            case 10:
                this.J = editText;
                g91 g91Var = new g91(editText);
                this.K = g91Var;
                editText.addTextChangedListener(g91Var);
                if (h81.b == null) {
                    synchronized (h81.a) {
                        try {
                            if (h81.b == null) {
                                h81 h81Var = new h81();
                                try {
                                    h81.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, h81.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                h81.b = h81Var;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(h81.b);
                return;
            default:
                this.J = editText;
                uu2 uu2Var = new uu2();
                uu2Var.I = new g12(editText, (byte) 10);
                this.K = uu2Var;
                return;
        }
    }

    public g12(w64 w64Var, p84 p84Var) {
        this.I = (byte) 5;
        p84Var.getClass();
        this.K = w64Var;
        this.J = p84Var;
    }

    public g12(View view) {
        this.I = (byte) 0;
        this.J = view;
        this.K = ut0.K(dh2.J, new ce(this, (byte) 20));
    }

    public g12(ArrayList arrayList, ArrayList arrayList2) {
        this.I = (byte) 14;
        int size = arrayList.size();
        this.J = new int[size];
        this.K = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.J)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.K)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public g12(int i, int i2) {
        this.I = (byte) 14;
        this.J = new int[]{i, i2};
        this.K = new float[]{0.0f, 1.0f};
    }

    public g12(int i, int i2, int i3) {
        this.I = (byte) 14;
        this.J = new int[]{i, i2, i3};
        this.K = new float[]{0.0f, 0.5f, 1.0f};
    }

    public g12(kl klVar, mc3 mc3Var) {
        this.I = (byte) 3;
        this.K = klVar;
        this.J = mc3Var;
    }
}
