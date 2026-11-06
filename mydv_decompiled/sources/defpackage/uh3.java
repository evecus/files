package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class uh3 implements sl3 {
    public final /* synthetic */ byte a;

    public /* synthetic */ uh3(byte b) {
        this.a = b;
    }

    @Override // defpackage.sl3
    public final Object a(rl3 rl3Var) {
        Object obj = null;
        switch (this.a) {
            case 0:
                try {
                    u0 s = u0.s(rl3Var.c);
                    if (s instanceof q0) {
                        return s;
                    }
                    if (s instanceof x0) {
                        return b06.m(s);
                    }
                    return null;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new h0("exception extracting EC named curve: " + e2.toString(), (byte) 3);
                }
            case 1:
                try {
                    byte[] bArr = rl3Var.c;
                    if (!(bArr instanceof y91) && bArr != null) {
                        Enumeration z = x0.x(bArr).z();
                        p8.m(z.nextElement());
                        r0.v(z.nextElement());
                    }
                    return new j81((byte) 18);
                } catch (Exception e3) {
                    b13.j("problem parsing ENCRYPTED PRIVATE KEY: ", e3);
                    return null;
                }
            case 2:
                try {
                    return new xh3(rl3Var.c);
                } catch (Exception e4) {
                    b13.j("problem parsing certrequest: ", e4);
                    return null;
                }
            case 3:
                try {
                    Object obj2 = rl3Var.c;
                    if (obj2 instanceof fi0) {
                        obj = (fi0) obj2;
                    } else if (obj2 != null) {
                        obj = new fi0(x0.x(obj2));
                    }
                } catch (Exception e5) {
                    b13.j("problem parsing PKCS7 object: ", e5);
                }
                return obj;
            case 4:
                boolean z2 = false;
                String str = null;
                for (ql3 ql3Var : rl3Var.b) {
                    String str2 = ql3Var.a;
                    String str3 = ql3Var.b;
                    if (str2.equals("Proc-Type") && str3.equals("4,ENCRYPTED")) {
                        z2 = true;
                    } else if (ql3Var.a.equals("DEK-Info")) {
                        str = str3;
                    }
                }
                byte[] bArr2 = rl3Var.c;
                if (z2 && (str == null || new StringTokenizer(str, ",").countTokens() != 2)) {
                    throw new h0("malformed PEM data: missing or invalid DEK-Info header", (byte) 3);
                }
                try {
                    if (z2) {
                        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                        stringTokenizer.nextToken();
                        et1.a(stringTokenizer.nextToken());
                        obj = new j81((byte) 14);
                    } else {
                        obj = qt3.m(bArr2);
                    }
                } catch (Exception e6) {
                    if (z2) {
                        throw new h0("exception decoding - please check password and data.", e6, (byte) 3);
                    }
                    b13.j("problem parsing PRIVATE KEY: ", e6);
                }
                return obj;
            case 5:
                try {
                    return zy4.m(rl3Var.c);
                } catch (Exception e7) {
                    b13.j("problem extracting key: ", e7);
                    return null;
                }
            case 6:
                try {
                    return new zy4(new p8(yh3.a, kn0.J), c04.m(rl3Var.c));
                } catch (IOException e8) {
                    throw e8;
                } catch (Exception e9) {
                    b13.j("problem extracting key: ", e9);
                    return null;
                }
            case 7:
                try {
                    return new tz5(rl3Var.c);
                } catch (IOException e10) {
                    throw e10;
                } catch (Exception e11) {
                    b13.j("problem parsing attribute cert: ", e11);
                    return null;
                }
            case 8:
                try {
                    return new uz5(rl3Var.c);
                } catch (Exception e12) {
                    b13.j("problem parsing cert: ", e12);
                    return null;
                }
            case 9:
                try {
                    return new vz5(rl3Var.c);
                } catch (Exception e13) {
                    b13.j("problem parsing cert: ", e13);
                    return null;
                }
            default:
                try {
                    return new l95(rl3Var.c);
                } catch (Exception e14) {
                    b13.j("problem parsing cert: ", e14);
                    return null;
                }
        }
    }
}
