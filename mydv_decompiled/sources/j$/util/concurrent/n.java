package j$.util.concurrent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public class n {
    public j[] a;
    public j b = null;
    public m c;
    public m d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public n(j[] jVarArr, int i, int i2, int i3) {
        this.a = jVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    public final j a() {
        j[] jVarArr;
        int length;
        int i;
        m mVar;
        j jVar = this.b;
        if (jVar != null) {
            jVar = jVar.d;
        }
        while (jVar == null) {
            if (this.f >= this.g || (jVarArr = this.a) == null || (length = jVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            j k = ConcurrentHashMap.k(jVarArr, i);
            if (k == null || k.a >= 0) {
                jVar = k;
            } else if (k instanceof f) {
                this.a = ((f) k).e;
                m mVar2 = this.d;
                if (mVar2 != null) {
                    this.d = mVar2.d;
                } else {
                    mVar2 = new m();
                }
                mVar2.c = jVarArr;
                mVar2.a = length;
                mVar2.b = i;
                mVar2.d = this.c;
                this.c = mVar2;
                jVar = null;
            } else {
                jVar = k instanceof o ? ((o) k).f : null;
            }
            if (this.c != null) {
                while (true) {
                    mVar = this.c;
                    if (mVar == null) {
                        break;
                    }
                    int i2 = this.e;
                    int i3 = mVar.a;
                    int i4 = i2 + i3;
                    this.e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.e = mVar.b;
                    this.a = mVar.c;
                    mVar.c = null;
                    m mVar3 = mVar.d;
                    mVar.d = this.d;
                    this.c = mVar3;
                    this.d = mVar;
                    length = i3;
                }
                if (mVar == null) {
                    int i5 = this.e + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i6 = this.f + 1;
                        this.f = i6;
                        this.e = i6;
                    }
                }
            } else {
                int i7 = i + this.h;
                this.e = i7;
                if (i7 >= length) {
                    int i8 = this.f + 1;
                    this.f = i8;
                    this.e = i8;
                }
            }
        }
        this.b = jVar;
        return jVar;
    }
}
