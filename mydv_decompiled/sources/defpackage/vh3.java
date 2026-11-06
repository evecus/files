package defpackage;

import java.io.IOException;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class vh3 implements sl3 {
    public final j81 a;

    public vh3(j81 j81Var) {
        this.a = j81Var;
    }

    @Override // defpackage.sl3
    public final Object a(rl3 rl3Var) {
        boolean z = false;
        String str = null;
        for (ql3 ql3Var : rl3Var.b) {
            String str2 = ql3Var.a;
            String str3 = ql3Var.b;
            if (str2.equals("Proc-Type") && str3.equals("4,ENCRYPTED")) {
                z = true;
            } else if (ql3Var.a.equals("DEK-Info")) {
                str = str3;
            }
        }
        byte[] bArr = rl3Var.c;
        if (z && (str == null || new StringTokenizer(str, ",").countTokens() != 2)) {
            throw new h0("malformed PEM data: missing or invalid DEK-Info header", (byte) 3);
        }
        try {
            if (!z) {
                return this.a.p(bArr);
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            stringTokenizer.nextToken();
            et1.a(stringTokenizer.nextToken());
            return new j81((byte) 14);
        } catch (IOException e) {
            if (z) {
                throw new h0("exception decoding - please check password and data.", e, (byte) 3);
            }
            throw new h0(e.getMessage(), e, (byte) 3);
        } catch (RuntimeException e2) {
            if (z) {
                throw new h0("exception decoding - please check password and data.", e2, (byte) 3);
            }
            throw new h0(e2.getMessage(), e2, (byte) 3);
        }
    }
}
