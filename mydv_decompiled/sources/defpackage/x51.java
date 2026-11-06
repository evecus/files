package defpackage;

/* loaded from: classes2.dex */
public abstract class x51 extends e41 {
    public e41 B0() {
        int J = J();
        if ((J & 1) == 0) {
            zy.i("Half-trace only defined for odd m");
            return null;
        }
        int i = (J + 1) >>> 1;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        e41 e41Var = this;
        int i2 = 1;
        while (numberOfLeadingZeros > 0) {
            e41Var = e41Var.s0(i2 << 1).k(e41Var);
            numberOfLeadingZeros--;
            i2 = i >>> numberOfLeadingZeros;
            if ((i2 & 1) != 0) {
                e41Var = e41Var.s0(2).k(this);
            }
        }
        return e41Var;
    }

    public boolean C0() {
        return this instanceof wf4;
    }

    public int D0() {
        int J = J();
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(J);
        e41 e41Var = this;
        int i = 1;
        while (numberOfLeadingZeros > 0) {
            e41Var = e41Var.s0(i).k(e41Var);
            numberOfLeadingZeros--;
            i = J >>> numberOfLeadingZeros;
            if ((i & 1) != 0) {
                e41Var = e41Var.q0().k(this);
            }
        }
        if (e41Var.T()) {
            return 0;
        }
        if (e41Var.S()) {
            return 1;
        }
        zy.i("Internal error in trace calculation");
        return 0;
    }
}
