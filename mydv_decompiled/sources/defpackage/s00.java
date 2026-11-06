package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class s00 implements s72, Serializable {
    public static final Object NO_RECEIVER = r00.I;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient s72 reflected;
    private final String signature;

    public s00(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.s72
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.s72
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public s72 compute() {
        s72 s72Var = this.reflected;
        if (s72Var != null) {
            return s72Var;
        }
        s72 computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public s72 computeReflected() {
        s24.a.getClass();
        return this;
    }

    public GenericDeclaration findJavaDeclaration() {
        return c21.s(getOwner(), getSignature());
    }

    @Override // defpackage.r72
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public u72 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return s24.a(cls);
        }
        s24.a.getClass();
        return new bi3(cls);
    }

    @Override // defpackage.s72
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract s72 getReflected();

    @Override // defpackage.s72
    public e82 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.s72
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.s72
    public f82 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.s72
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.s72
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.s72
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
