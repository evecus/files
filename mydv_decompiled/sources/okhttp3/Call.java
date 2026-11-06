package okhttp3;

import defpackage.rm1;
import defpackage.t72;
import defpackage.u75;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Call extends Cloneable {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        Call newCall(Request request);
    }

    void addEventListener(EventListener eventListener);

    void cancel();

    /* renamed from: clone */
    Call mo355clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    <T> T tag(Class<? extends T> cls);

    <T> T tag(Class<T> cls, rm1 rm1Var);

    <T> T tag(t72 t72Var);

    <T> T tag(t72 t72Var, rm1 rm1Var);

    u75 timeout();
}
