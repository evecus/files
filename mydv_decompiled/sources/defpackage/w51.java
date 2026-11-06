package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.TsExtractor;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class w51 implements n51 {
    public final v51 f;
    public final byte[] g;
    public final g61 h;
    public final BigInteger i;
    public final BigInteger j;

    public w51(v51 v51Var, g61 g61Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        if (v51Var == null) {
            zy.m("curve");
            throw null;
        }
        if (bigInteger == null) {
            zy.m("n");
            throw null;
        }
        this.f = v51Var;
        if (g61Var == null) {
            zy.m("Point cannot be null");
            throw null;
        }
        if (!v51Var.g(g61Var.a)) {
            s83.t("Point must be on the same curve");
            throw null;
        }
        g61 l = v51Var.l(g61Var).l();
        if (l.i()) {
            s83.t("Point at infinity");
            throw null;
        }
        if (!l.h(false, true)) {
            s83.t("Point not on curve");
            throw null;
        }
        this.h = l;
        this.i = bigInteger;
        this.j = bigInteger2;
        this.g = g4.s(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w51)) {
            return false;
        }
        w51 w51Var = (w51) obj;
        return this.f.g(w51Var.f) && this.h.c(w51Var.h) && this.i.equals(w51Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((this.f.hashCode() ^ AnalyticsListener.EVENT_PLAYER_RELEASED) * TsExtractor.TS_STREAM_TYPE_AIT) ^ this.h.hashCode()) * TsExtractor.TS_STREAM_TYPE_AIT);
    }

    public w51(b06 b06Var) {
        this(b06Var.J.I, b06Var.K.m(), b06Var.L, b06Var.M, g4.s(b06Var.J.J));
    }
}
