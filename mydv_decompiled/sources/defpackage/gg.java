package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gg {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Object e;

    public gg(XmlResourceParser xmlResourceParser) {
        this.c = xmlResourceParser;
        this.a = 0;
        g73 g73Var = new g73((byte) 3, false);
        g73Var.J = new float[64];
        this.e = g73Var;
    }

    public void a(byte[] bArr, int i, boolean z) {
        int length = bArr.length - i;
        xw0 xw0Var = (xw0) this.e;
        if (length < xw0Var.d()) {
            s83.t("target length is less than digest size.");
            return;
        }
        byte[] bArr2 = (byte[]) this.c;
        xw0Var.update(bArr2, 0, bArr2.length);
        xw0Var.b((byte) (this.a >>> 24));
        xw0Var.b((byte) (this.a >>> 16));
        xw0Var.b((byte) (this.a >>> 8));
        xw0Var.b((byte) this.a);
        xw0Var.b((byte) (this.b >>> 8));
        xw0Var.b((byte) this.b);
        xw0Var.b((byte) -1);
        byte[] bArr3 = (byte[]) this.d;
        xw0Var.update(bArr3, 0, bArr3.length);
        xw0Var.a(i, bArr);
        if (z) {
            this.b++;
        }
    }

    public float b(TypedArray typedArray, String str, int i, float f) {
        float J = hc4.J(typedArray, (XmlPullParser) this.c, str, i, f);
        c(typedArray.getChangingConfigurations());
        return J;
    }

    public void c(int i) {
        this.a = i | this.a;
    }

    public gg(byte[] bArr, byte[] bArr2, xw0 xw0Var) {
        this.c = bArr;
        this.d = bArr2;
        this.e = xw0Var;
    }
}
