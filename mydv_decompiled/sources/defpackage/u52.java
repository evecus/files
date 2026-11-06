package defpackage;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class u52 {
    public static final HashMap b;
    public final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(f06.j, "ECDSA");
        hashMap.put(yh3.a, "RSA");
        hashMap.put(f06.H, "DSA");
    }

    public u52() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.putAll(b);
    }

    public final KeyFactory a(p8 p8Var) {
        q0 q0Var = p8Var.I;
        String str = (String) this.a.get(q0Var);
        if (str == null) {
            str = q0Var.y();
        }
        try {
            return KeyFactory.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            if (str.equals("ECDSA")) {
                return KeyFactory.getInstance("EC");
            }
            throw e;
        }
    }

    public final KeyPair b(th3 th3Var) {
        qt3 qt3Var = th3Var.b;
        try {
            KeyFactory a = a(qt3Var.J);
            return new KeyPair(a.generatePublic(new X509EncodedKeySpec(th3Var.a.l())), a.generatePrivate(new PKCS8EncodedKeySpec(qt3Var.l())));
        } catch (Exception e) {
            throw new h0("unable to convert key pair: " + e.getMessage(), e, (byte) 3);
        }
    }

    public final PrivateKey c(qt3 qt3Var) {
        try {
            return a(qt3Var.J).generatePrivate(new PKCS8EncodedKeySpec(qt3Var.l()));
        } catch (Exception e) {
            throw new h0("unable to convert key pair: " + e.getMessage(), e, (byte) 3);
        }
    }
}
