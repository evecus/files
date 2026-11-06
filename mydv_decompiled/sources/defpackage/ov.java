package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ov extends uy {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ov(Context context, mc3 mc3Var, byte b) {
        super(context, mc3Var);
        this.g = b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r9.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // defpackage.pg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r9 = this;
            byte r0 = r9.g
            java.lang.String r1 = "status"
            java.lang.String r2 = "getInitialState - null intent received"
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r4 = -1
            r5 = 0
            android.content.Context r6 = r9.b
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L86;
                case 1: goto L4c;
                default: goto L11;
            }
        L11:
            android.content.IntentFilter r9 = r9.e()
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 == 0) goto L47
            java.lang.String r0 = r9.getAction()
            if (r0 != 0) goto L22
            goto L47
        L22:
            java.lang.String r9 = r9.getAction()
            if (r9 == 0) goto L46
            int r0 = r9.hashCode()
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L40
            r1 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r0 == r1) goto L37
            goto L46
        L37:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L47
            goto L46
        L40:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r9 = r9.equals(r0)
        L46:
            r7 = r8
        L47:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L4c:
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r3)
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 != 0) goto L63
            fr2 r9 = defpackage.fr2.e()
            java.lang.String r0 = defpackage.qv.a
            r9.c(r0, r2)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L85
        L63:
            int r0 = r9.getIntExtra(r1, r4)
            java.lang.String r1 = "level"
            int r1 = r9.getIntExtra(r1, r4)
            java.lang.String r2 = "scale"
            int r9 = r9.getIntExtra(r2, r4)
            float r1 = (float) r1
            float r9 = (float) r9
            float r1 = r1 / r9
            if (r0 == r7) goto L81
            r9 = 1041865114(0x3e19999a, float:0.15)
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L80
            goto L81
        L80:
            r7 = r8
        L81:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        L85:
            return r9
        L86:
            android.content.IntentFilter r9 = new android.content.IntentFilter
            r9.<init>(r3)
            android.content.Intent r9 = r6.registerReceiver(r5, r9)
            if (r9 != 0) goto L9d
            fr2 r9 = defpackage.fr2.e()
            java.lang.String r0 = defpackage.pv.a
            r9.c(r0, r2)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto Lad
        L9d:
            int r9 = r9.getIntExtra(r1, r4)
            r0 = 2
            if (r9 == r0) goto La9
            r0 = 5
            if (r9 != r0) goto La8
            goto La9
        La8:
            r7 = r8
        La9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        Lad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov.a():java.lang.Object");
    }

    @Override // defpackage.uy
    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.uy
    public final void f(Intent intent) {
        switch (this.g) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    fr2.e().a(pv.a, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                b(Boolean.FALSE);
                                break;
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                b(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                b(Boolean.TRUE);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 1:
                if (intent.getAction() != null) {
                    fr2.e().a(qv.a, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode = action2.hashCode();
                        if (hashCode == -1980154005) {
                            if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                b(Boolean.TRUE);
                                break;
                            }
                        } else if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                            b(Boolean.FALSE);
                            break;
                        }
                    }
                }
                break;
            default:
                if (intent.getAction() != null) {
                    fr2.e().a(xw4.a, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int hashCode2 = action3.hashCode();
                        if (hashCode2 == -1181163412) {
                            if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                b(Boolean.FALSE);
                                break;
                            }
                        } else if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            b(Boolean.TRUE);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
