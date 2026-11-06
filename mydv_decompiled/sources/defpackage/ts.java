package defpackage;

import androidx.media3.common.util.Log;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ts implements Serializable, Cloneable {
    public o06 I;
    public final int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;

    public ts(int i, int i2, int i3, boolean z, boolean z2, o06 o06Var) {
        this.J = i;
        this.K = i2;
        this.L = i3;
        this.M = z;
        this.N = z2;
        this.I = o06Var;
    }

    public final int a() {
        return (!this.M || this.N) ? Log.LOG_LEVEL_OFF : this.K;
    }

    public final Object clone() {
        ts tsVar = new ts(this.J);
        tsVar.I = this.I;
        tsVar.K = this.K;
        tsVar.L = this.L;
        tsVar.M = this.M;
        tsVar.N = this.N;
        return tsVar;
    }

    public ts(int i) {
        this.J = i;
        this.M = false;
        this.N = false;
    }
}
