package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a32 {
    public int a;
    public Object b;

    public a32(int i) {
        if (i > 0) {
            this.b = new Object[i];
        } else {
            s83.t("The max pool size must be > 0");
            throw null;
        }
    }

    public Object a() {
        Object[] objArr = (Object[]) this.b;
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.a--;
        return obj;
    }

    public int b(int i) {
        int i2 = this.a - 1;
        return i2 >= 0 ? ((int[]) this.b)[i2] : i;
    }

    public int c() {
        int[] iArr = (int[]) this.b;
        int i = this.a - 1;
        this.a = i;
        return iArr[i];
    }

    public void d(int i) {
        int[] iArr = (int[]) this.b;
        if (this.a >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.b = iArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public void e(Object obj) {
        Object[] objArr = (Object[]) this.b;
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                zy.i("Already in the pool!");
                return;
            }
        }
        int i3 = this.a;
        if (i3 < objArr.length) {
            objArr[i3] = obj;
            this.a = i3 + 1;
        }
    }

    public a32() {
        this.b = new int[10];
    }
}
