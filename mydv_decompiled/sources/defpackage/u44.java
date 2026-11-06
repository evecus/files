package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u44 extends ke1 {
    public static final ok3 L;
    public final ClassLoader I;
    public final ke1 J;
    public final u05 K;

    static {
        String str = ok3.J;
        L = o63.f("/");
    }

    public u44(ClassLoader classLoader) {
        ke1 ke1Var = ke1.SYSTEM;
        ke1Var.getClass();
        this.I = classLoader;
        this.J = ke1Var;
        this.K = new u05(new eq(this, (byte) 27));
    }

    public static String e(ok3 ok3Var) {
        ok3 ok3Var2 = L;
        return ok3Var2.e(ok3Var, true).d(ok3Var2).I.s();
    }

    @Override // defpackage.ke1
    public final eq4 appendingSink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.ke1
    public final void atomicMove(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.ke1
    public final ok3 canonicalize(ok3 ok3Var) {
        ok3Var.getClass();
        return L.e(ok3Var, true);
    }

    @Override // defpackage.ke1
    public final void createSymlink(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.ke1
    public final void delete(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.ke1
    public final List list(ok3 ok3Var) {
        ok3Var.getClass();
        String e = e(ok3Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (uj3 uj3Var : (List) this.K.getValue()) {
            ke1 ke1Var = (ke1) uj3Var.I;
            ok3 ok3Var2 = (ok3) uj3Var.J;
            try {
                List list = ke1Var.list(ok3Var2.f(e));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (vt0.F((ok3) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(vt0.S((ok3) obj2, ok3Var2));
                }
                u70.I0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return o70.r1(linkedHashSet);
        }
        throw new FileNotFoundException(r7.y(ok3Var, "file not found: "));
    }

    @Override // defpackage.ke1
    public final List listOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        String e = e(ok3Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.K.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            uj3 uj3Var = (uj3) it.next();
            ke1 ke1Var = (ke1) uj3Var.I;
            ok3 ok3Var2 = (ok3) uj3Var.J;
            List listOrNull = ke1Var.listOrNull(ok3Var2.f(e));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (vt0.F((ok3) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(p70.J(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(vt0.S((ok3) obj2, ok3Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                u70.I0(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return o70.r1(linkedHashSet);
        }
        return null;
    }

    @Override // defpackage.ke1
    public final he1 metadataOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        if (!vt0.F(ok3Var)) {
            return null;
        }
        String e = e(ok3Var);
        for (uj3 uj3Var : (List) this.K.getValue()) {
            he1 metadataOrNull = ((ke1) uj3Var.I).metadataOrNull(((ok3) uj3Var.J).f(e));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    @Override // defpackage.ke1
    public final ge1 openReadOnly(ok3 ok3Var) {
        ok3Var.getClass();
        if (!vt0.F(ok3Var)) {
            throw new FileNotFoundException(r7.y(ok3Var, "file not found: "));
        }
        String e = e(ok3Var);
        Iterator it = ((List) this.K.getValue()).iterator();
        while (it.hasNext()) {
            uj3 uj3Var = (uj3) it.next();
            try {
                return ((ke1) uj3Var.I).openReadOnly(((ok3) uj3Var.J).f(e));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(r7.y(ok3Var, "file not found: "));
    }

    @Override // defpackage.ke1
    public final ge1 openReadWrite(ok3 ok3Var, boolean z, boolean z2) {
        ok3Var.getClass();
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.ke1
    public final eq4 sink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.ke1
    public final ut4 source(ok3 ok3Var) {
        ok3Var.getClass();
        if (!vt0.F(ok3Var)) {
            throw new FileNotFoundException(r7.y(ok3Var, "file not found: "));
        }
        ok3 ok3Var2 = L;
        ok3Var2.getClass();
        URL resource = this.I.getResource(f.a(ok3Var2, ok3Var, false).d(ok3Var2).I.s());
        if (resource == null) {
            throw new FileNotFoundException(r7.y(ok3Var, "file not found: "));
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        inputStream.getClass();
        return sp0.e0(inputStream);
    }
}
