package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioProfile;
import android.util.CloseGuard;
import android.view.SurfaceView;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.audio.AudioOutput;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.chunk.BundledChunkExtractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements ListenerSet.Event, BundledChunkExtractor.ManifestFormatMerger, l10, DebugViewProvider, Consumer {
    public final /* synthetic */ byte I;

    public /* synthetic */ j0(byte b) {
        this.I = b;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile c(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ CloseGuard d(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue e(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalArgumentException("encoding error in getInstance: " + ((Object) obj.toString()));
    }

    public static /* synthetic */ void i(Object obj, Exception exc) {
        throw new t0("IOException converting stream to byte array: " + obj, exc);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new h0(str + obj, (byte) 0);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj;
        switch (this.I) {
            case 28:
                eventDispatcher.drmKeysRemoved();
                break;
            default:
                eventDispatcher.drmKeysRestored();
                break;
        }
    }

    @Override // androidx.media3.common.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.I) {
            case 11:
                ((AudioOutput.Listener) obj).onReleased();
                break;
            case 12:
                ((AudioOutput.Listener) obj).onOffloadDataRequest();
                break;
            case 13:
                ((AudioOutput.Listener) obj).onOffloadPresentationEnded();
                break;
            default:
                ((AudioOutputProvider.Listener) obj).onFormatSupportChanged();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.ManifestFormatMerger
    public Format merge(Format format, Format format2) {
        return format2 != null ? format.withManifestFormatInfo(format2) : format;
    }

    @Override // defpackage.l10
    public void cancel() {
    }
}
