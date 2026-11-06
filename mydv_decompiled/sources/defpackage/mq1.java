package defpackage;

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mq1 extends r92 implements rm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mq1(Object obj, byte b) {
        super(0);
        this.J = b;
        this.K = obj;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        switch (this.J) {
            case 0:
                return ((rm1) this.K).invoke();
            case 1:
                return ((rm1) this.K).invoke();
            case 2:
                return ((rm1) this.K).invoke();
            case 3:
                File file = (File) ((rm1) this.K).invoke();
                file.getClass();
                String name = file.getName();
                name.getClass();
                if (jx4.b0('.', name, "").equals("preferences_pb")) {
                    return file;
                }
                zy.g(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            default:
                File file2 = (File) ((yp4) this.K).a.invoke();
                String absolutePath = file2.getAbsolutePath();
                synchronized (yp4.k) {
                    LinkedHashSet linkedHashSet = yp4.j;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file2 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return file2;
        }
    }
}
