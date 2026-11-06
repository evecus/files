package defpackage;

import j$.util.DesugarCollections;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class wh3 extends tl3 {
    public final HashMap J;

    public wh3(StringReader stringReader) {
        super(stringReader);
        HashMap hashMap = new HashMap();
        this.J = hashMap;
        byte b = 2;
        hashMap.put("CERTIFICATE REQUEST", new uh3(b));
        hashMap.put("NEW CERTIFICATE REQUEST", new uh3(b));
        byte b2 = 9;
        hashMap.put("CERTIFICATE", new uh3(b2));
        hashMap.put("TRUSTED CERTIFICATE", new uh3((byte) 10));
        hashMap.put("X509 CERTIFICATE", new uh3(b2));
        hashMap.put("X509 CRL", new uh3((byte) 8));
        byte b3 = 3;
        hashMap.put("PKCS7", new uh3(b3));
        hashMap.put("CMS", new uh3(b3));
        hashMap.put("ATTRIBUTE CERTIFICATE", new uh3((byte) 7));
        hashMap.put("EC PARAMETERS", new uh3((byte) 0));
        hashMap.put("PUBLIC KEY", new uh3((byte) 5));
        hashMap.put("RSA PUBLIC KEY", new uh3((byte) 6));
        hashMap.put("RSA PRIVATE KEY", new vh3(new j81((byte) 17)));
        hashMap.put("DSA PRIVATE KEY", new vh3(new j81((byte) 15)));
        hashMap.put("EC PRIVATE KEY", new vh3(new j81((byte) 16)));
        hashMap.put("ENCRYPTED PRIVATE KEY", new uh3((byte) 1));
        hashMap.put("PRIVATE KEY", new uh3((byte) 4));
    }

    public final Object readObject() {
        String readLine;
        rl3 rl3Var;
        String trim;
        int indexOf;
        String readLine2;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith("-----BEGIN "));
        if (readLine == null || (indexOf = (trim = readLine.substring(11).trim()).indexOf(45)) <= 0 || !trim.endsWith("-----") || trim.length() - indexOf != 5) {
            rl3Var = null;
        } else {
            String substring = trim.substring(0, indexOf);
            String C = r7.C("-----END ", substring, "-----");
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList arrayList = new ArrayList();
            while (true) {
                readLine2 = readLine();
                if (readLine2 == null) {
                    break;
                }
                int indexOf2 = readLine2.indexOf(58);
                if (indexOf2 >= 0) {
                    String substring2 = readLine2.substring(0, indexOf2);
                    String trim2 = readLine2.substring(indexOf2 + 1).trim();
                    ql3 ql3Var = new ql3();
                    ql3Var.a = substring2;
                    ql3Var.b = trim2;
                    arrayList.add(ql3Var);
                } else {
                    if (System.getProperty("org.bouncycastle.pemreader.lax", "false").equalsIgnoreCase("true")) {
                        String trim3 = readLine2.trim();
                        if (!trim3.equals(readLine2)) {
                            Level level = Level.WARNING;
                            Logger logger = tl3.I;
                            if (logger.isLoggable(level)) {
                                logger.log(level, "PEM object contains whitespaces on -----END line", (Throwable) new Exception("trace"));
                            }
                        }
                        readLine2 = trim3;
                    }
                    if (readLine2.indexOf(C) == 0) {
                        break;
                    }
                    stringBuffer.append(readLine2.trim());
                }
            }
            if (readLine2 == null) {
                zl1.g(C.concat(" not found"));
                return null;
            }
            try {
                byte[] a = zt.a(stringBuffer.toString());
                rl3Var = new rl3();
                rl3Var.a = substring;
                rl3Var.b = DesugarCollections.unmodifiableList(arrayList);
                rl3Var.c = a;
            } catch (vp0 e) {
                throw k21.Z("malformed PEM data: " + e.getMessage(), e);
            }
        }
        if (rl3Var == null) {
            return null;
        }
        String str = rl3Var.a;
        Object obj = this.J.get(str);
        if (obj != null) {
            return ((sl3) obj).a(rl3Var);
        }
        zl1.g(hf1.w("unrecognised object: ", str));
        return null;
    }
}
