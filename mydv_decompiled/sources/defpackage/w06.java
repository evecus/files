package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class w06 extends ObjectInputStream {
    public static final HashSet K;
    public static final HashMap L;
    public final Class I;
    public boolean J;

    static {
        HashSet hashSet = new HashSet();
        K = hashSet;
        HashMap hashMap = new HashMap();
        L = hashMap;
        hashSet.add("java.util.TreeMap");
        hashSet.add("java.lang.Integer");
        hashSet.add("java.lang.Number");
        hashSet.add("org.bouncycastle.crypto.signers.xmss.BDS");
        hashSet.add("java.util.ArrayList");
        hashSet.add("org.bouncycastle.crypto.signers.xmss.XMSSNode");
        hashSet.add("[B");
        hashSet.add("java.util.LinkedList");
        hashSet.add("java.util.Stack");
        hashSet.add("java.util.Vector");
        hashSet.add("[Ljava.lang.Object;");
        hashSet.add("org.bouncycastle.crypto.signers.xmss.BDSTreeHash");
        hashMap.put("org.bouncycastle.pqc.crypto.xmss.BDS", qs.class);
        hashMap.put("org.bouncycastle.pqc.crypto.xmss.BDSStateMap", ss.class);
        hashMap.put("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash", ts.class);
        hashMap.put("org.bouncycastle.pqc.crypto.xmss.XMSSNode", o06.class);
    }

    public w06(Class cls, ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.J = false;
        this.I = cls;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class cls = (Class) L.get(objectStreamClass.getName());
        String name = cls != null ? cls.getName() : objectStreamClass.getName();
        if (this.J) {
            if (!K.contains(name)) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else {
            if (!name.equals(this.I.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.J = true;
        }
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }
}
