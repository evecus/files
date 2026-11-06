package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e72 implements SerialDescriptor {
    public static final e72 b = new e72();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ gk2 a;

    public e72() {
        fx4 fx4Var = fx4.a;
        u62 u62Var = u62.a;
        SerialDescriptor descriptor = fx4Var.getDescriptor();
        SerialDescriptor descriptor2 = u62Var.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.a = new gk2("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final qi4 e() {
        return sx4.f;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        this.a.h(i);
        return o91.I;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        this.a.j(i);
        return false;
    }
}
