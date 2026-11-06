package defpackage;

import androidx.media3.common.SimpleBasePlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class po4 implements gz4 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ SimpleBasePlayer.State J;

    public /* synthetic */ po4(SimpleBasePlayer.State state, byte b) {
        this.I = b;
        this.J = state;
    }

    @Override // defpackage.gz4
    public final Object get() {
        SimpleBasePlayer.State lambda$unmute$18;
        SimpleBasePlayer.State lambda$mute$17;
        SimpleBasePlayer.State lambda$setVideoSurface$19;
        SimpleBasePlayer.State lambda$increaseDeviceVolume$27;
        SimpleBasePlayer.State lambda$decreaseDeviceVolume$28;
        SimpleBasePlayer.State lambda$release$13;
        SimpleBasePlayer.State lambda$clearVideoOutput$23;
        SimpleBasePlayer.State lambda$increaseDeviceVolume$26;
        SimpleBasePlayer.State lambda$prepare$7;
        SimpleBasePlayer.State lambda$decreaseDeviceVolume$29;
        byte b = this.I;
        SimpleBasePlayer.State state = this.J;
        switch (b) {
            case 0:
                lambda$unmute$18 = SimpleBasePlayer.lambda$unmute$18(state);
                return lambda$unmute$18;
            case 1:
                lambda$mute$17 = SimpleBasePlayer.lambda$mute$17(state);
                return lambda$mute$17;
            case 2:
                lambda$setVideoSurface$19 = SimpleBasePlayer.lambda$setVideoSurface$19(state);
                return lambda$setVideoSurface$19;
            case 3:
                lambda$increaseDeviceVolume$27 = SimpleBasePlayer.lambda$increaseDeviceVolume$27(state);
                return lambda$increaseDeviceVolume$27;
            case 4:
                lambda$decreaseDeviceVolume$28 = SimpleBasePlayer.lambda$decreaseDeviceVolume$28(state);
                return lambda$decreaseDeviceVolume$28;
            case 5:
                lambda$release$13 = SimpleBasePlayer.lambda$release$13(state);
                return lambda$release$13;
            case 6:
                lambda$clearVideoOutput$23 = SimpleBasePlayer.lambda$clearVideoOutput$23(state);
                return lambda$clearVideoOutput$23;
            case 7:
                lambda$increaseDeviceVolume$26 = SimpleBasePlayer.lambda$increaseDeviceVolume$26(state);
                return lambda$increaseDeviceVolume$26;
            case 8:
                lambda$prepare$7 = SimpleBasePlayer.lambda$prepare$7(state);
                return lambda$prepare$7;
            default:
                lambda$decreaseDeviceVolume$29 = SimpleBasePlayer.lambda$decreaseDeviceVolume$29(state);
                return lambda$decreaseDeviceVolume$29;
        }
    }
}
