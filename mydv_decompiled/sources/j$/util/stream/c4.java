package j$.util.stream;

import j$.util.Spliterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class c4 extends v3 {
    public final /* synthetic */ byte h;

    public /* synthetic */ c4(byte b) {
        this.h = b;
    }

    @Override // j$.util.stream.v3
    public final q4 X() {
        switch (this.h) {
            case 0:
                return new u4();
            case 1:
                return new s4();
            case 2:
                return new v4();
            default:
                return new t4();
        }
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final Object a(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.a(aVar, spliterator);
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final Object b(a aVar, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 1:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!y6.SIZED.h(aVar.f)) {
                    break;
                } else {
                    break;
                }
        }
        return (Long) super.b(aVar, spliterator);
    }

    @Override // j$.util.stream.v3, j$.util.stream.e8
    public final int f() {
        switch (this.h) {
        }
        return y6.r;
    }
}
