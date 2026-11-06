package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fu2 extends k05 implements hn1 {
    public String I;
    public hu2 J;
    public String K;
    public List L;
    public long M;
    public int N;
    public boolean O;
    public /* synthetic */ Object P;
    public final /* synthetic */ hu2 Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu2(hu2 hu2Var, String str, String str2, fj0 fj0Var) {
        super(2, fj0Var);
        this.Q = hu2Var;
        this.R = str;
        this.S = str2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        fu2 fu2Var = new fu2(this.Q, this.R, this.S, fj0Var);
        fu2Var.P = obj;
        return fu2Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((fu2) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00bc A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012b A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0070 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:6:0x0020, B:8:0x00a0, B:9:0x00b6, B:11:0x00bc, B:15:0x00cd, B:18:0x00fe, B:21:0x00d6, B:22:0x00da, B:24:0x00e0, B:31:0x0102, B:33:0x010d, B:36:0x0117, B:38:0x011d, B:41:0x012b, B:45:0x0059, B:47:0x005f, B:50:0x0066, B:51:0x006a, B:53:0x0070, B:59:0x0082, B:67:0x013e, B:68:0x0142, B:70:0x0148, B:74:0x015b, B:76:0x015f, B:78:0x016a, B:79:0x0171, B:81:0x0172, B:84:0x0189, B:97:0x0122, B:102:0x0040), top: B:2:0x0010 }] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x009d -> B:8:0x00a0). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
