package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class re5 extends ue5 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re5(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // defpackage.ue5
    public final boolean a(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (we5.h) {
                    if (we5.f(j, obj) == 0) {
                    }
                } else if (we5.g(j, obj) == 0) {
                }
                break;
            default:
                if (we5.h) {
                    if (we5.f(j, obj) == 0) {
                    }
                } else if (we5.g(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ue5
    public final byte b(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!we5.h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!we5.h) {
                    break;
                } else {
                    break;
                }
        }
        return we5.g(j, obj);
    }

    @Override // defpackage.ue5
    public final double c(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.ue5
    public final float d(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.ue5
    public final void e(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!we5.h) {
                    we5.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    we5.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!we5.h) {
                    we5.m(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    we5.l(obj, j, z ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // defpackage.ue5
    public final void f(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!we5.h) {
                    we5.m(obj, j, b);
                    break;
                } else {
                    we5.l(obj, j, b);
                    break;
                }
            default:
                if (!we5.h) {
                    we5.m(obj, j, b);
                    break;
                } else {
                    we5.l(obj, j, b);
                    break;
                }
        }
    }

    @Override // defpackage.ue5
    public final void g(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.ue5
    public final void h(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }
}
