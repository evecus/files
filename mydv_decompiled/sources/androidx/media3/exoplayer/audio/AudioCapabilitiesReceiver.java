package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.x24;
import defpackage.z1;
import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AudioCapabilitiesReceiver {
    private AudioAttributes audioAttributes;
    private AudioCapabilities audioCapabilities;
    private final AudioDeviceCallback audioDeviceCallback;
    private final Context context;
    private final ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final Handler handler;
    private final BroadcastReceiver hdmiAudioPlugBroadcastReceiver;
    private final Listener listener;
    private boolean registered;
    private AudioDeviceInfo routedDevice;
    private SpatializerWrapper spatializer;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class AudioDeviceCallback extends android.media.AudioDeviceCallback {
        private AudioDeviceCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (Util.contains(audioDeviceInfoArr, AudioCapabilitiesReceiver.this.routedDevice)) {
                AudioCapabilitiesReceiver.this.routedDevice = null;
            }
            AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        private final ContentResolver resolver;
        private final Uri settingUri;

        public ExternalSurroundSoundSettingObserver(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AudioCapabilitiesReceiver.this.updateCurrentAudioCapabilities();
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            List spatializerChannelMasks = AudioCapabilitiesReceiver.this.getSpatializerChannelMasks();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(context, intent, audioCapabilitiesReceiver.audioAttributes, AudioCapabilitiesReceiver.this.routedDevice, spatializerChannelMasks));
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, Listener listener, AudioAttributes audioAttributes, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        listener.getClass();
        this.listener = listener;
        this.audioAttributes = audioAttributes;
        this.routedDevice = audioDeviceInfo;
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.handler = createHandlerForCurrentOrMainLooper;
        this.audioDeviceCallback = new AudioDeviceCallback();
        this.hdmiAudioPlugBroadcastReceiver = new HdmiAudioPlugBroadcastReceiver();
        Uri externalSurroundSoundGlobalSettingUri = AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new ExternalSurroundSoundSettingObserver(createHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Integer> getSpatializerChannelMasks() {
        SpatializerWrapper spatializerWrapper;
        if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
            return spatializerWrapper.getSpatializedChannelMasks();
        }
        ay1 ay1Var = dy1.J;
        return x24.M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentAudioCapabilities() {
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, this.routedDevice, getSpatializerChannelMasks()));
    }

    public void overrideCapabilities(AudioCapabilities audioCapabilities) {
        onNewAudioCapabilities(audioCapabilities);
    }

    public AudioCapabilities register() {
        if (this.registered) {
            AudioCapabilities audioCapabilities = this.audioCapabilities;
            audioCapabilities.getClass();
            return audioCapabilities;
        }
        this.registered = true;
        ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.register();
        }
        AudioManagerCompat.getAudioManager(this.context).registerAudioDeviceCallback(this.audioDeviceCallback, this.handler);
        if (Build.VERSION.SDK_INT >= 32 && this.spatializer == null) {
            this.spatializer = new SpatializerWrapper(this.context, new z1(this, (byte) 3), Boolean.valueOf(Util.isTv(this.context)));
        }
        AudioCapabilities capabilitiesInternal = AudioCapabilities.getCapabilitiesInternal(this.context, this.context.registerReceiver(this.hdmiAudioPlugBroadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler), this.audioAttributes, this.routedDevice, getSpatializerChannelMasks());
        this.audioCapabilities = capabilitiesInternal;
        return capabilitiesInternal;
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (Objects.equals(audioAttributes, this.audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, audioAttributes, this.routedDevice, getSpatializerChannelMasks()));
    }

    public void setRoutedDevice(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.routedDevice)) {
            return;
        }
        this.routedDevice = audioDeviceInfo;
        onNewAudioCapabilities(AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, audioDeviceInfo, getSpatializerChannelMasks()));
    }

    public void unregister() {
        SpatializerWrapper spatializerWrapper;
        if (this.registered) {
            this.audioCapabilities = null;
            AudioManagerCompat.getAudioManager(this.context).unregisterAudioDeviceCallback(this.audioDeviceCallback);
            if (Build.VERSION.SDK_INT >= 32 && (spatializerWrapper = this.spatializer) != null) {
                spatializerWrapper.release();
                this.spatializer = null;
            }
            this.context.unregisterReceiver(this.hdmiAudioPlugBroadcastReceiver);
            ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
            if (externalSurroundSoundSettingObserver != null) {
                externalSurroundSoundSettingObserver.unregister();
            }
            this.registered = false;
        }
    }

    @Deprecated
    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        this(context, listener, AudioAttributes.DEFAULT, null);
    }
}
