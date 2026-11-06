package defpackage;

import android.graphics.Bitmap;
import com.materialkolor.ktx.ImageBitmapKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pi0 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Bitmap J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi0(Bitmap bitmap, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = bitmap;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Bitmap bitmap = this.J;
        switch (b) {
            case 0:
                return new pi0(bitmap, fj0Var, (byte) 0);
            default:
                return new pi0(bitmap, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((pi0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        switch (this.I) {
            case 0:
                mu0.V(obj);
                return ImageBitmapKt.themeColorOrNull$default(new dd(this.J), false, 0, 3, null);
            default:
                mu0.V(obj);
                qu4 qu4Var = qu4.a;
                Bitmap bitmap = this.J;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int[] iArr = new int[width * height];
                bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                int[] iArr2 = new int[144];
                int i = 0;
                while (true) {
                    char c = 16;
                    if (i >= 16) {
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, 9, 16, Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        return new dd(createBitmap);
                    }
                    int i2 = (i * height) / 16;
                    int i3 = i + 1;
                    int max = Math.max(i2 + 1, (i3 * height) / 16);
                    int i4 = 0;
                    for (int i5 = 9; i4 < i5; i5 = 9) {
                        int i6 = (i4 * width) / i5;
                        int i7 = i4 + 1;
                        int max2 = Math.max(i6 + 1, (i7 * width) / i5);
                        int min = Math.min(max, height);
                        long j = 0;
                        int i8 = i2;
                        long j2 = 0;
                        long j3 = 0;
                        int i9 = 0;
                        while (i8 < min) {
                            int i10 = i8 * width;
                            char c2 = c;
                            int i11 = i6;
                            for (int min2 = Math.min(max2, width); i11 < min2; min2 = min2) {
                                int i12 = i;
                                int i13 = iArr[i10 + i11];
                                j += (i13 >> 16) & 255;
                                j2 += (i13 >> 8) & 255;
                                j3 += i13 & 255;
                                i9++;
                                i11++;
                                i8 = i8;
                                i = i12;
                            }
                            i8++;
                            c = c2;
                        }
                        int i14 = i;
                        char c3 = c;
                        if (i9 == 0) {
                            i9 = 1;
                        }
                        int i15 = (i14 * 9) + i4;
                        long j4 = i9;
                        iArr2[i15] = (((int) (j2 / j4)) << 8) | (((int) (j / j4)) << 16) | (-16777216) | ((int) (j3 / j4));
                        c = c3;
                        i4 = i7;
                        i = i14;
                    }
                    i = i3;
                }
        }
    }
}
