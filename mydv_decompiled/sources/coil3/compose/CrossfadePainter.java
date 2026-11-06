package coil3.compose;

import defpackage.c80;
import defpackage.ep;
import defpackage.er0;
import defpackage.fq4;
import defpackage.gk3;
import defpackage.n75;
import defpackage.ni0;
import defpackage.o75;
import defpackage.q75;
import defpackage.rj3;
import defpackage.rt0;
import defpackage.s33;
import defpackage.su0;
import defpackage.t41;
import defpackage.ut0;
import defpackage.y31;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CrossfadePainter extends rj3 {
    public static final int $stable = 0;
    private c80 colorFilter;
    private final ni0 contentScale;
    private final long duration;
    private final rj3 end;
    private final boolean fadeStart;
    private final long intrinsicSize;
    private final s33 invalidateTick$delegate;
    private boolean isDone;
    private float maxAlpha;
    private final boolean preferEndFirstIntrinsicSize;
    private final boolean preferExactIntrinsicSize;
    private rj3 start;
    private n75 startTime;
    private final q75 timeSource;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CrossfadePainter(defpackage.rj3 r14, defpackage.rj3 r15, defpackage.ni0 r16, long r17, defpackage.q75 r19, boolean r20, boolean r21, boolean r22, int r23, defpackage.er0 r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 4
            if (r1 == 0) goto La
            jp r1 = defpackage.li0.b
            r5 = r1
            goto Lc
        La:
            r5 = r16
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L1c
            jp r1 = defpackage.t41.J
            r1 = 200(0xc8, float:2.8E-43)
            x41 r2 = defpackage.x41.MILLISECONDS
            long r1 = defpackage.sp0.n0(r1, r2)
            r6 = r1
            goto L1e
        L1c:
            r6 = r17
        L1e:
            r1 = r0 & 16
            if (r1 == 0) goto L26
            q8 r1 = defpackage.q8.C0
            r8 = r1
            goto L28
        L26:
            r8 = r19
        L28:
            r1 = r0 & 32
            if (r1 == 0) goto L2f
            r1 = 1
            r9 = r1
            goto L31
        L2f:
            r9 = r20
        L31:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L38
            r10 = r2
            goto L3a
        L38:
            r10 = r21
        L3a:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L40
            r11 = r2
            goto L42
        L40:
            r11 = r22
        L42:
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.CrossfadePainter.<init>(rj3, rj3, ni0, long, q75, boolean, boolean, boolean, int, er0):void");
    }

    /* renamed from: computeDrawSize-x8L_9b0, reason: not valid java name */
    private final long m50computeDrawSizex8L_9b0(long j, long j2) {
        return (j == 9205357640488583168L || fq4.c(j) || j2 == 9205357640488583168L || fq4.c(j2)) ? j2 : rt0.J(j, this.contentScale.a(j, j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r4 != false) goto L28;
     */
    /* renamed from: computeIntrinsicSize-xjbvk4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m51computeIntrinsicSizexjbvk4A(defpackage.rj3 r9, defpackage.rj3 r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L9
            long r2 = r9.mo43getIntrinsicSizeNHjbRc()
            goto La
        L9:
            r2 = r0
        La:
            if (r10 == 0) goto L10
            long r0 = r10.mo43getIntrinsicSizeNHjbRc()
        L10:
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L1d
            r4 = r6
            goto L1e
        L1d:
            r4 = r5
        L1e:
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 == 0) goto L23
            r5 = r6
        L23:
            boolean r6 = r8.preferEndFirstIntrinsicSize
            if (r6 == 0) goto L2d
            if (r5 == 0) goto L2a
            goto L71
        L2a:
            if (r4 == 0) goto L2d
            goto L6e
        L2d:
            if (r4 == 0) goto L68
            if (r5 == 0) goto L68
            r8 = 32
            long r9 = r2 >> r8
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r4 = r0 >> r8
            int r10 = (int) r4
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r9 = java.lang.Math.max(r9, r10)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r10 = (int) r2
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r10 = java.lang.Math.max(r10, r0)
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r0 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r0 = r0 << r8
            long r9 = r9 & r4
            long r9 = r9 | r0
            return r9
        L68:
            boolean r8 = r8.preferExactIntrinsicSize
            if (r8 == 0) goto L72
            if (r4 == 0) goto L6f
        L6e:
            return r2
        L6f:
            if (r5 == 0) goto L72
        L71:
            return r0
        L72:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.CrossfadePainter.m51computeIntrinsicSizexjbvk4A(rj3, rj3):long");
    }

    private final void drawPainter(y31 y31Var, rj3 rj3Var, float f) {
        if (rj3Var == null || f <= 0.0f) {
            return;
        }
        long c = y31Var.c();
        long m50computeDrawSizex8L_9b0 = m50computeDrawSizex8L_9b0(rj3Var.mo43getIntrinsicSizeNHjbRc(), c);
        if (c == 9205357640488583168L || fq4.c(c)) {
            rj3Var.m367drawx_KDEd0(y31Var, m50computeDrawSizex8L_9b0, f, this.colorFilter);
            return;
        }
        float intBitsToFloat = (Float.intBitsToFloat((int) (c >> 32)) - Float.intBitsToFloat((int) (m50computeDrawSizex8L_9b0 >> 32))) / 2.0f;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (c & 4294967295L)) - Float.intBitsToFloat((int) (m50computeDrawSizex8L_9b0 & 4294967295L))) / 2.0f;
        ((ep) y31Var.S().b).w(intBitsToFloat, intBitsToFloat2, intBitsToFloat, intBitsToFloat2);
        try {
            rj3Var.m367drawx_KDEd0(y31Var, m50computeDrawSizex8L_9b0, f, this.colorFilter);
        } finally {
            float f2 = -intBitsToFloat;
            float f3 = -intBitsToFloat2;
            ((ep) y31Var.S().b).w(f2, f3, f2, f3);
        }
    }

    private final int getInvalidateTick() {
        return ((gk3) this.invalidateTick$delegate).h();
    }

    private final void setInvalidateTick(int i) {
        ((gk3) this.invalidateTick$delegate).i(i);
    }

    @Override // defpackage.rj3
    public boolean applyAlpha(float f) {
        this.maxAlpha = f;
        return true;
    }

    @Override // defpackage.rj3
    public boolean applyColorFilter(c80 c80Var) {
        this.colorFilter = c80Var;
        return true;
    }

    public final ni0 getContentScale() {
        return this.contentScale;
    }

    /* renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m52getDurationUwyO8pc() {
        return this.duration;
    }

    public final rj3 getEnd() {
        return this.end;
    }

    public final boolean getFadeStart() {
        return this.fadeStart;
    }

    @Override // defpackage.rj3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo43getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public final boolean getPreferEndFirstIntrinsicSize() {
        return this.preferEndFirstIntrinsicSize;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    public final rj3 getStart() {
        return this.start;
    }

    public final q75 getTimeSource() {
        return this.timeSource;
    }

    @Override // defpackage.rj3
    public void onDraw(y31 y31Var) {
        if (this.isDone) {
            drawPainter(y31Var, this.end, this.maxAlpha);
            return;
        }
        n75 n75Var = this.startTime;
        if (n75Var == null) {
            n75Var = this.timeSource.a();
            this.startTime = n75Var;
        }
        float d = t41.d(o75.a(((o75) n75Var).I)) / t41.d(this.duration);
        float q = ut0.q(d, 0.0f, 1.0f);
        float f = this.maxAlpha;
        float f2 = q * f;
        if (this.fadeStart) {
            f -= f2;
        }
        this.isDone = d >= 1.0f;
        drawPainter(y31Var, this.start, f);
        drawPainter(y31Var, this.end, f2);
        if (this.isDone) {
            this.start = null;
        } else {
            setInvalidateTick(getInvalidateTick() + 1);
        }
    }

    public /* synthetic */ CrossfadePainter(rj3 rj3Var, rj3 rj3Var2, ni0 ni0Var, long j, q75 q75Var, boolean z, boolean z2, boolean z3, er0 er0Var) {
        this(rj3Var, rj3Var2, ni0Var, j, q75Var, z, z2, z3);
    }

    private CrossfadePainter(rj3 rj3Var, rj3 rj3Var2, ni0 ni0Var, long j, q75 q75Var, boolean z, boolean z2, boolean z3) {
        this.end = rj3Var2;
        this.contentScale = ni0Var;
        this.duration = j;
        this.timeSource = q75Var;
        this.fadeStart = z;
        this.preferExactIntrinsicSize = z2;
        this.preferEndFirstIntrinsicSize = z3;
        this.invalidateTick$delegate = new gk3(0);
        this.maxAlpha = 1.0f;
        this.start = rj3Var;
        this.intrinsicSize = m51computeIntrinsicSizexjbvk4A(rj3Var, rj3Var2);
    }

    @su0
    public /* synthetic */ CrossfadePainter(rj3 rj3Var, rj3 rj3Var2, ni0 ni0Var, long j, q75 q75Var, boolean z, boolean z2, er0 er0Var) {
        this(rj3Var, rj3Var2, ni0Var, j, q75Var, z, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CrossfadePainter(defpackage.rj3 r11, defpackage.rj3 r12, defpackage.ni0 r13, long r14, defpackage.q75 r16, boolean r17, boolean r18, int r19, defpackage.er0 r20) {
        /*
            r10 = this;
            r0 = r19 & 4
            if (r0 == 0) goto L6
            jp r13 = defpackage.li0.b
        L6:
            r3 = r13
            r13 = r19 & 8
            if (r13 == 0) goto L17
            jp r13 = defpackage.t41.J
            r13 = 200(0xc8, float:2.8E-43)
            x41 r0 = defpackage.x41.MILLISECONDS
            long r0 = defpackage.sp0.n0(r13, r0)
            r4 = r0
            goto L18
        L17:
            r4 = r14
        L18:
            r13 = r19 & 16
            if (r13 == 0) goto L20
            q8 r13 = defpackage.q8.C0
            r6 = r13
            goto L22
        L20:
            r6 = r16
        L22:
            r13 = r19 & 32
            if (r13 == 0) goto L29
            r13 = 1
            r7 = r13
            goto L2b
        L29:
            r7 = r17
        L2b:
            r13 = r19 & 64
            if (r13 == 0) goto L32
            r13 = 0
            r8 = r13
            goto L34
        L32:
            r8 = r18
        L34:
            r9 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.CrossfadePainter.<init>(rj3, rj3, ni0, long, q75, boolean, boolean, int, er0):void");
    }

    private CrossfadePainter(rj3 rj3Var, rj3 rj3Var2, ni0 ni0Var, long j, q75 q75Var, boolean z, boolean z2) {
        this(rj3Var, rj3Var2, ni0Var, j, q75Var, z, z2, false, 128, null);
    }
}
