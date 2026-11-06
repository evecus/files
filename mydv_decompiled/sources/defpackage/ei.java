package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ei extends d4 {
    public final ObjectAnimator d;
    public final boolean e;

    public ei(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        fi fiVar = new fi();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        fiVar.b = numberOfFrames2;
        int[] iArr = fiVar.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            fiVar.a = iArr;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr[i4] = duration;
            i3 += duration;
        }
        fiVar.c = i3;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(fiVar.c);
        ofInt.setInterpolator(fiVar);
        this.e = z2;
        this.d = ofInt;
    }

    @Override // defpackage.d4
    public final void H() {
        this.d.reverse();
    }

    @Override // defpackage.d4
    public final void K() {
        this.d.start();
    }

    @Override // defpackage.d4
    public final void L() {
        this.d.cancel();
    }

    @Override // defpackage.d4
    public final boolean j() {
        return this.e;
    }
}
