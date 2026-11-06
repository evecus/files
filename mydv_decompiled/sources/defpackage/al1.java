package defpackage;

import coil3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class al1 extends ke1 {
    private final ke1 delegate;

    public al1(ke1 ke1Var) {
        ke1Var.getClass();
        this.delegate = ke1Var;
    }

    @Override // defpackage.ke1
    public eq4 appendingSink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        return this.delegate.appendingSink(onPathParameter(ok3Var, "appendingSink", UtilsKt.SCHEME_FILE), z);
    }

    @Override // defpackage.ke1
    public void atomicMove(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        this.delegate.atomicMove(onPathParameter(ok3Var, "atomicMove", "source"), onPathParameter(ok3Var2, "atomicMove", "target"));
    }

    @Override // defpackage.ke1
    public ok3 canonicalize(ok3 ok3Var) {
        ok3Var.getClass();
        return onPathResult(this.delegate.canonicalize(onPathParameter(ok3Var, "canonicalize", "path")), "canonicalize");
    }

    @Override // defpackage.ke1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // defpackage.ke1
    public void createDirectory(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        this.delegate.createDirectory(onPathParameter(ok3Var, "createDirectory", "dir"), z);
    }

    @Override // defpackage.ke1
    public void createSymlink(ok3 ok3Var, ok3 ok3Var2) {
        ok3Var.getClass();
        ok3Var2.getClass();
        this.delegate.createSymlink(onPathParameter(ok3Var, "createSymlink", "source"), onPathParameter(ok3Var2, "createSymlink", "target"));
    }

    public final ke1 delegate() {
        return this.delegate;
    }

    @Override // defpackage.ke1
    public void delete(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        this.delegate.delete(onPathParameter(ok3Var, "delete", "path"), z);
    }

    @Override // defpackage.ke1
    public List<ok3> list(ok3 ok3Var) {
        ok3Var.getClass();
        List list = this.delegate.list(onPathParameter(ok3Var, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((ok3) it.next(), "list"));
        }
        t70.G0(arrayList);
        return arrayList;
    }

    @Override // defpackage.ke1
    public List<ok3> listOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        List listOrNull = this.delegate.listOrNull(onPathParameter(ok3Var, "listOrNull", "dir"));
        if (listOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((ok3) it.next(), "listOrNull"));
        }
        t70.G0(arrayList);
        return arrayList;
    }

    @Override // defpackage.ke1
    public oj4 listRecursively(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        oj4 listRecursively = this.delegate.listRecursively(onPathParameter(ok3Var, "listRecursively", "dir"), z);
        v1 v1Var = new v1((Object) this, (byte) 22);
        listRecursively.getClass();
        return new ep1(listRecursively, v1Var);
    }

    @Override // defpackage.ke1
    public he1 metadataOrNull(ok3 ok3Var) {
        ok3Var.getClass();
        he1 metadataOrNull = this.delegate.metadataOrNull(onPathParameter(ok3Var, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        ok3 ok3Var2 = metadataOrNull.c;
        if (ok3Var2 == null) {
            return metadataOrNull;
        }
        ok3 onPathResult = onPathResult(ok3Var2, "metadataOrNull");
        boolean z = metadataOrNull.a;
        boolean z2 = metadataOrNull.b;
        Long l = metadataOrNull.d;
        Long l2 = metadataOrNull.e;
        Long l3 = metadataOrNull.f;
        Long l4 = metadataOrNull.g;
        Map map = metadataOrNull.h;
        map.getClass();
        return new he1(z, z2, onPathResult, l, l2, l3, l4, map);
    }

    public ok3 onPathParameter(ok3 ok3Var, String str, String str2) {
        ok3Var.getClass();
        str.getClass();
        str2.getClass();
        return ok3Var;
    }

    public ok3 onPathResult(ok3 ok3Var, String str) {
        ok3Var.getClass();
        str.getClass();
        return ok3Var;
    }

    @Override // defpackage.ke1
    public ge1 openReadOnly(ok3 ok3Var) {
        ok3Var.getClass();
        return this.delegate.openReadOnly(onPathParameter(ok3Var, "openReadOnly", UtilsKt.SCHEME_FILE));
    }

    @Override // defpackage.ke1
    public ge1 openReadWrite(ok3 ok3Var, boolean z, boolean z2) {
        ok3Var.getClass();
        return this.delegate.openReadWrite(onPathParameter(ok3Var, "openReadWrite", UtilsKt.SCHEME_FILE), z, z2);
    }

    @Override // defpackage.ke1
    public eq4 sink(ok3 ok3Var, boolean z) {
        ok3Var.getClass();
        return this.delegate.sink(onPathParameter(ok3Var, "sink", UtilsKt.SCHEME_FILE), z);
    }

    @Override // defpackage.ke1
    public ut4 source(ok3 ok3Var) {
        ok3Var.getClass();
        return this.delegate.source(onPathParameter(ok3Var, "source", UtilsKt.SCHEME_FILE));
    }

    public String toString() {
        return s24.a(getClass()).c() + '(' + this.delegate + ')';
    }
}
