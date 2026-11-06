package com.github.mytv.dv.model;

import defpackage.c72;
import defpackage.r7;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0 implements c72 {
    private final /* synthetic */ String[] names;

    public Aweme$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0(String[] strArr) {
        strArr.getClass();
        this.names = strArr;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return c72.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof c72) && Arrays.equals(names(), ((c72) obj).names());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return Arrays.hashCode(this.names) ^ 397397176;
    }

    @Override // defpackage.c72
    public final /* synthetic */ String[] names() {
        return this.names;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return r7.C("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(this.names), ")");
    }
}
